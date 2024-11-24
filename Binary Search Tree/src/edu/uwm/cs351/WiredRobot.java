package edu.uwm.cs351;

import java.util.Comparator;
import java.util.function.Consumer;

import edu.uwm.cs351.util.Cell;

public class WiredRobot implements Robot {
	private static Consumer<String> reporter = (s) -> System.out.println("Invariant error: "+ s);
	
	private static boolean report(String error) {
		reporter.accept(error);
		return false;
	}
	
	public static class FunctionalPart extends Part {
		public FunctionalPart() {
			super("W");
		}
		
		// the following fields are mutable:
		String function;
		FunctionalPart left, right, parent;
		
		/**
		 * Return the function of this part.
		 * @return string of this part, null if this part not in a robot
		 */
		public String getFunction() {
			return function;
		}
		
		/**
		 * Return the next part in this robot.
		 * This is valid only if the part is in a robot.
		 * @return the next part, possibly null
		 * @exception IllegalStateException if this part is not a part of a robot
		 */
		public FunctionalPart getNext() {			
		    if (this.function == null) throw new IllegalStateException("This part is not a part of a robot");
		    
		    if (this.right != null) {  //  Move down to the leftmost child of the right subtree 
		        FunctionalPart next = this.right; // This loop iterates down the left children because in a BST, the next higher value
		        while (next.left != null) {  // of a node is the leftmost node of its right subtree
		            next = next.left;
		        }
		     // Return the leftmost node, which is the next part in the sorted order
		        return next;
		    }
		    // climb up the tree to find the next part
			// If the current part is the right child of its parent, we keep going up.
		    FunctionalPart current = this;					
		    FunctionalPart parent = this.parent;
		    while (parent != null && current == parent.right) {
		        current = parent;
		        parent = parent.parent;
		    }
		 // Once we can't go up anymore or the current part isn't a right child
		 // the parent is the next bigger part we were looking for
		    return parent; 
		}
	}
	
	private FunctionalPart root;
	private Comparator<FunctionalPart> comparator; // null = don't care
	
	/**
	 * Compare two parts according to our purposes.
	 * We use the supplied comparator except when it 
	 * says it doesn't care, in which case, we use the (unique) id to 
	 * distinguish two parts, older first.
	 * @param p1 first part, must not be null
	 * @param p2 second part, must not be null
	 * @return comparison, only 0 if p1 and p2 are the same
	 */
	private int compare(FunctionalPart p1, FunctionalPart p2) {
		if (comparator != null) {
			int c= comparator.compare(p1, p2);
			if (c != 0) return c;
		}
		return p1.getId() - p2.getId();
	}
	
	/**
	 * Check a tree of parts within bounds.
	 * The subtree must be properly ordered, and every part
	 * must have a non-null function assigned.
	 * @param r root of subtree to check, may be null
	 * @param lo lower bound (exclusive) of all parts in subtree.  
	 *   If null, then no lower bound
	 * @param hi upper bound (exclusive) of all parts in subtree.
	 *   If null, then no upper bound
	 * @param p parent of the current root
	 * @return whether the subtree checks out OK.
	 * If false is returned, then exactly one report has been generated.
	 */
	private boolean checkInRange(FunctionalPart r, FunctionalPart lo, FunctionalPart hi, FunctionalPart p) {

	    if (r == null) return true; // A null node is always within range.
	    if (r.function == null) return report("Has null function: " + r);

	    // Check bounds -- r must be greater than lo and less than hi
		if (lo != null && compare(lo, r) >= 0) return report("Out of lo bound: " + r + " <= " + lo);
		
		if (hi != null && compare(r,hi) >= 0) return report("Out of hi bound: " + r + " >= " + hi);

	    // Check that the parent pointer of r is correctly set to the correct Parent
	    if (r.parent != p) {
	        return report("Incorrect parent pointer for: " + r + "; Expected parent: " + p + ", but found: " + r.parent);
	    }

	    // Recursive checks for the left and right subtrees
	    // For the left subtree, r becomes the new hi bound, and for the right subtree, r becomes the new lo bound
	    // r is also passed as the parent for both subtrees
	    return checkInRange(r.left, lo, r, r) && checkInRange(r.right, r, hi, r);
	}

	
	private boolean wellFormed() {
		return checkInRange(root, null, null, null);
	}
	
	private WiredRobot(boolean ignore) {} // do not change this constructor

	/**
	 * Create a wired robot without parts
	 * and no order.
	 */
	public WiredRobot() {
		this(null);
	}
	
	/**
	 * Create a wired robot without parts
	 * with the given order 
	 * @param comp order to use, if null, then unordered
	 */
	public WiredRobot(Comparator<FunctionalPart> comp) {
		comparator = comp;
		assert wellFormed() : "Invariant not established by constructor";
	}
	
	/**
	 * Return the first part in this robot.
	 * @return the first part, null if this robot is empty
	 */
	public FunctionalPart getFirst() {
		assert wellFormed() : "invariant broken in getFirst";
		FunctionalPart r = root;
		while (r != null && r.left != null) {
			r = r.left;
		}	
		return r;
	}
	
	/**
	 * Return the 0-based index part from the subtree given that
	 * matches the given function.  The mutable inex should be decremented
	 * for every part we find that matches, so that if we find a match
	 * when it is zero we return that one.  Once we find the result, we stop
	 * looking (and stop decrementing).  If there is no such functional part,
	 * this method returns null.
	 * @param r subtree to examine, may be null
	 * @param function kind of part to look for, null means any part
	 * @param mutableIndex index to look for (0-based); decremented whenever a matching
	 *   part is encountered in in-order traversal until the desired index.  
	 * @return 0-based matching part, may be null
	 */
	private static FunctionalPart getHelper(FunctionalPart r, String function, Cell<Integer> mutableIndex) {
		if (r == null) return r;
		FunctionalPart result = getHelper(r.left, function, mutableIndex);
		if (result != null) return result;
		if (function == null ||function.equals(r.function)) {
			int index = mutableIndex.get();
			if (index == 0) return r;
			mutableIndex.set(index-1);
		}
		return getHelper(r.right, function, mutableIndex);
	}
	
	private FunctionalPart insertPart(FunctionalPart r, FunctionalPart n, FunctionalPart p) {
	    if (r == null) {
	        n.parent = p; // Set the parent of the newly inserted node
	        return n;
	    }
	    if (compare(n, r) < 0) {
	        r.left = insertPart(r.left, n, r); // r becomes the parent for its left subtree
	    } else {
	        r.right = insertPart(r.right, n, r); // r becomes the parent for its right subtree
	    }    
	    return r;
	}

	@Override // required
	public boolean addPart(String function, Part part) {
	    assert wellFormed(): "invariant broke before add";
	    if (function == null || part == null) throw new NullPointerException();
	    if(!(part instanceof FunctionalPart)) throw new IllegalArgumentException("parameter part must be a Functional Part");
	    FunctionalPart n = (FunctionalPart)part;
	    if (n.function != null) throw new IllegalArgumentException("part is already in a robot");
	    n.function = function;
	    root = insertPart(root, n, null);
	    assert wellFormed(): "invariant broke by add";
	    return true;
	}

	/**
	 * 
	 * Removes a specific part from the tree
	 * 
	 * @param p, the specific part to be removed 
	 * @return boolean whether the part was removed or not 
	 */
	public boolean remove(Part p) {
	    assert wellFormed() : "Invariant broken before remove";
	    if (!(p instanceof FunctionalPart)) return false; // Only functional parts can be removed
	    
	    FunctionalPart part = (FunctionalPart) p;
	    
	    // Check if the part is in the robot first
	    if (part.function == null || !isPartOfRobot(root, part)) return false; // Part not in the robot or already removed

	    // Proceed with removal
	    root = removeHelper(root, part);
	    
	    // Now that we've confirmed the part was successfully removed, set function to null
	    part.function = null;
	    part.left = null;
	    part.right = null;
	    
	    assert wellFormed() : "Invariant broken after remove";
	    return true;
	}


	@Override // required
	public Part removePart(String function) {
	    assert wellFormed() : "Invariant broken before removePart";
	    FunctionalPart toRemove = (FunctionalPart) getPart(function, 0);
	    if (toRemove == null) return null; // No part matches the function or already removed
	    
	    // Ensure the part is actually part of the robot before removal
	    if (!isPartOfRobot(root, toRemove)) return null;
	    
	    root = removeHelper(root, toRemove);
	    toRemove.function = null; // Clear function to indicate removal
	    toRemove.left = null;
	    toRemove.right = null;
	    assert wellFormed() : "Invariant broken after removePart";
	    return toRemove;
	}

	
	private FunctionalPart removeHelper(FunctionalPart r, FunctionalPart n) {
	    if (r == null) return null; // Base case, part not found.
	    
	    int cmp = compare(n, r);
	    
	    if (cmp < 0) r.left = removeHelper(r.left, n);      // If n is smaller than r navigate to the left subtree
	    
	    else if (cmp > 0) r.right = removeHelper(r.right, n);  // If n is larger than r navigate to the right subtree
	        // Found the part to remove now 
	     else {
	        
	        // cases where the part has 0 or 1 child.
	        if (r.left == null || r.right == null) {
	        	// Selects r's left child if it exists, otherwise selects r's right child, preparing for r's removal.
	            FunctionalPart child = (r.left != null) ? r.left : r.right;
	            
	            if (child != null) child.parent = r.parent;  // Determine if 'r' is a left child or right child, then update parent's pointer
	           
	            if (r.parent != null) { // If 'r' has a parent, update this parent's child reference
	            	
	            	// Determine if 'r' is a left child or right child, then update parent's pointer
	                if (r.parent.left == r) r.parent.left = child;
	                else r.parent.right = child;
	            }
	            
	           
	         // Return the child
	            return child;
	        }

	        // case has two children
	        FunctionalPart successor = findMin(r.right); // find the in-order successor
	        
	        r.right = removeHelper(r.right, successor); // Remove successor from its current position

	        // Attach 'r's left and right children to successor
	        successor.left = r.left;
	        successor.right = r.right;
	        
	        // Update parent pointers of successor's new children
	        if (successor.left != null) successor.left.parent = successor;
	        if (successor.right != null) successor.right.parent = successor;
	        successor.parent = r.parent; // Link successor to 'r's parent
	        
	    	// If 'r' was the root, make successor the new root
	        if (r == root) root = successor;
	        else {
	        	// Otherwise, update 'r's parent to point to successor
	            if (r.parent.left == r) r.parent.left = successor;
	            else r.parent.right = successor;
	        }
	       
	        return successor;
	    }
	    
	    return r; 
	}

	private FunctionalPart findMin(FunctionalPart node) {
	    while (node.left != null) {
	        node = node.left;
	    }
	    return node;
	}

	private boolean isPartOfRobot(FunctionalPart current, FunctionalPart part) {
	    if (current == null) return false;
	    if (current == part) return true; // Found the part
	    // Recursively check in both subtrees
	    return isPartOfRobot(current.left, part) || isPartOfRobot(current.right, part);
	}
	
	
	@Override // required
	public Part getPart(String function, int index) {
		assert wellFormed(): "invariant broke before getPart";
		if(index < 0) throw new IllegalArgumentException("negative index");
		Cell<Integer> mutableIndex = new Cell<>(index);
		Part result = getHelper(root, function, mutableIndex);
		assert wellFormed(): "invariant broke by getPart"; // not mandatory
		return result;
	}

	private void reInsertAll(FunctionalPart r) {
		if (r == null) return;
		FunctionalPart ch1 = r.left;
		FunctionalPart ch2 = r.right;
		r.left = null;
		r.right = null;
		root = insertPart(root, r, null);
		reInsertAll(ch1);
		reInsertAll(ch2);
	}
	
	/**
	 * Change the comparator used to order the robot parts.
	 * The parts will be reorganized as necessary to accommodate the new order,
	 * but two parts will be reordered only if necessary.
	 * (The sorting is "stable".) 
	 * @param comp comparator to use, if null, then henceforth the parts
	 * can be in any order.
	 */
	public void setComparator(Comparator<FunctionalPart> comp) {
		assert wellFormed() : "invariant broken in setComparator";
		if (comp != comparator) {
			comparator = comp;
			FunctionalPart saved = root;
			root = null;
			reInsertAll(saved);
		}
		assert wellFormed() : "invariant broken by setComparator";
	}
	

	/**
	 * Class for internal testing.  Do not modify.
	 * Do not use in client/application code
	 */
	public static class Spy {
		/**
		 * A public version of the data structure's internal node class.
		 * This class is only used for testing.
		 */
		public static class Part extends FunctionalPart {
			/**
			 * Create a part with null function and null left and right fields.
			 */
			public Part() {
				this(null, null, null, null);
			}
			
			/**
			 * Create a part with the given values
			 * @param f function for new part, may be null
			 * @param l left for new part, may be null
			 * @param r right for new part, may be null
			 * @param p parent or new part, may be null
			 */
			public Part(String f, Part l, Part r, Part p) {
				super();
				this.function = f;
				this.left = l;
				this.right = r;
				this.parent = p;
			}
		}
		
		/**
		 * Return the sink for invariant error messages
		 * @return current reporter
		 */
		public Consumer<String> getReporter() {
			return reporter;
		}

		/**
		 * Change the sink for invariant error messages.
		 * @param r where to send invariant error messages.
		 */
		public void setReporter(Consumer<String> r) {
			reporter = r;
		}

		/**
		 * Create a part for testing.
		 * @param f function, may be null
		 * @param l left part, may be null
		 * @param r right part, may be null
		 * @param p parent part, may be null
		 * @return newly created test node
		 */
		public Part newPart(String f, Part l, Part r, Part p) {
			return new Part(f, l, r, p);
		}
		
		/**
		 * Set the function of a spy part
		 * @param p part to set, must not be null
		 * @param f function to set it to
		 */
		public void setFunction(Part p, String f) {
			p.function = f;
		}
		
		/**
		 * Change a part's left field
		 * @param n1 part to change, must not be null
		 * @param n2 part to point to, may be null
		 */
		public void setLeft(Part n1, Part n2) {
			n1.left = n2;
		}

		/**
		 * Change a part's right field
		 * @param n1 part to change, must not be null
		 * @param n2 part to point to, may be null
		 */
		public void setRight(Part n1, Part n2) {
			n1.right = n2;
		}

		/**
		 * Change a part's parent field
		 * @param n1 part to change, must not be null
		 * @param n2 part to point to, may be null
		 */
		public void setParent(Part n1, Part n2) {
			n1.parent = n2;
		}

		/**
		 * Create an instance of the ADT with given data structure.
		 * This should only be used for testing.
		 * @param r root
		 * @param c comparator
		 * @return instance of WiredRobot with the given field values.
		 */
		public WiredRobot create(Part r, Comparator<FunctionalPart> c) {
			WiredRobot result = new WiredRobot(false);
			result.root = r;
			result.comparator = c;
			return result;
		}
		
		/** Call checkInRange helper method with these arguments
		 * @param wr wired robot to use, must not be null
		 * @param r subtree to examine
		 * @param lo lower bound (exclusive) of all parts in subtree. (Null means no bound)
		 * @param hi upper bound (exclusive) of all parts in subtree. (Null means no bound)
		 * @param p required parent pointer, may be null
		 * @return whether any problems were found within the specified subtree 
		 */
		public boolean checkInRange(WiredRobot wr, Part r, Part lo, Part hi, Part p) {
			return wr.checkInRange(r, lo, hi, p);
		}

		/**
		 * Return whether the wellFormed routine returns true for the argument
		 * @param s robot to check.
		 * @return
		 */
		public boolean wellFormed(WiredRobot s) {
			return s.wellFormed();
		}

		
	}

}


