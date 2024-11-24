package edu.uwm.cs351;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Consumer;

import edu.uwm.cs351.util.AbstractEntry;
import edu.uwm.cs351.util.PowersOfTwo;

public class Ranking<T> extends AbstractMap<Integer,T> 
{


	@Override // efficiency 
	public boolean containsValue(Object value) {
	    int index = find(value, true);  // Use find to get the index
	    if (index < 0 || index >= table.length) {
	        return false;  // Check if index is within bounds
	    }

	    Node<T> node = table[index];
	    if (node != null && node != PLACE_HOLDER) {  // Ensure it's a valid node and not a placeholder
	        if ((value == null && node.data == null) || (value != null && value.equals(node.data))) {
	            return true;  // Correct equality check
	        }
	    }

	    return false;
	}

	



	private static Consumer<String> reporter = (s) -> System.out.println("Invariant error: "+ s);
	
	private static boolean report(String error) {
		reporter.accept(error);
		return false;
	}
	
	private static class Node<E> {
		E data;
		int count;
		Node<E> left, right, parent;
		
		Node(E d) {
			data = d;
			count = 1;
		}
		
		@Override // decorate
		public String toString() {
			return super.toString() + "(" + data + "," + count + ")";
		}
	}
	
	// A helper method to hide the messiness of creating the array
	@SuppressWarnings("unchecked")
	protected Node<T>[] makeArray(int n) {
		return (Node<T>[]) new Node<?>[n];
	}
	
	// The placeholder to be used when we remove something
	private static final Node<?> PLACE_HOLDER = new Node<>(null);
	@SuppressWarnings("unchecked")
	protected Node<T> getPlaceHolder() {
		return (Node<T>) PLACE_HOLDER;
	}
	
	// The initial size of the hash table, must be a power of two
	private static final int INITIAL_CAPACITY = 8;
	
	private Node<T> root;
	private Node<T>[] table; // NEW!
	private int used; // NEW!
	private int version;
	
	protected int hash(Object value) {
	    return (value == null) ? 0 : value.hashCode();
	}

	/**
	 * Return the number of nodes in this subtree.
	 * If the subtree isn't null, we use the stored `count' field rather than
	 * computing the count.
	 * @param r subtree to count nodes for, must not be null
	 * @return count of nodes in this subtree
	 */
	private static int getCount(Node<?> r) {
		if (r == null) return 0;
		return r.count;
	}
	
	private void setCount(Node<T> r) {
		if (r == null) return;
		r.count = getCount(r.left)+ getCount(r.right) + 1; 
	}
	
	/**
	 * Check that a subtree's count and parent fields are correct.
	 * @param r subtree to check
	 * @param p what the parent should be.
	 * @return whether any problems ere found.  If false is returned than 
	 * exactly one problem has been reported.
	 */
	private boolean checkTree(Node<T> r, Node<T> p) {
		if (r == null) return true;
		if (r.parent != p) return report("parent is wrong for " + r); 
		if (r.count != getCount(r.left) + getCount(r.right) + 1) {
			return report("computed count " + r.count + " not consistent with subtrees");
		}
		return checkTree(r.left, r) && checkTree(r.right, r);
	}
	
	/**
	 * Find a value in the table and return its index or the index
	 * of the first available location.
	 * This method uses quadratic hashing.
	 * @param value value to search for, may be null
	 * @param skipPH whether PLACE_HOLDERS must be skipped (are not available)
	 * @return index of place in hash array that has the key,
	 * or the next available index.
	 */
	protected int find(Object value, boolean skipPH) {
	    int hash = hash(value);    
	    int index = hash % table.length;   
	    if (index < 0) {
	        index += table.length;
	    }
	    int i = 0; 

	    while (true) {
	    	if(index < 0 ) {
	    		index = Math.abs(index);
	    	}
	        Node<T> node = table[index];

	        if (node == null) {
	            return index; 
	        }

	        
	        if (node == PLACE_HOLDER && !skipPH) {  
	            return index; 
	        } else if (node != PLACE_HOLDER) {
	    
	            if ((node.data == null && value == null) || (node.data != null && node.data.equals(value))) {
	                return index; 
	            }
	        }


	        i++;
	        index = (hash + (i * (i + 1)) / 2) % table.length; 
	       
	        if (i > table.length) {
	            throw new IllegalStateException("No available spot found");
	        }
	    }
	}


	/**
	 * Return true if the node is in the tree.
	 * Don't search the whole tree, but rather traverse toward the root
	 * while making sure: <ul>
	 * <li> That we don't get caught in a cycle (Tortoise & Hare)
	 * <li> That every parent we go to has us as a child.
	 * </ul>
	 * @param n node to check for, may be null (always returns true)
	 * @return whether this node is in the tree.
	 * Whether it has a path up to the root.
	 */
	protected boolean isInTree(Node<T> n) {
	    if (n == null) return true; 

	    Node<T> slow = n;
	    Node<T> fast = n.parent; 

	    while (fast != null && fast.parent != null) {
	        if (slow == fast) {
	            return report("Cycle detected in the tree involving node " + n.data);
	        }

	  
	        slow = slow.parent;
	        fast = fast.parent.parent;
	    }

	    Node<T> current = n;
	    while (current.parent != null) {
	        Node<T> parent = current.parent;
	        if (parent.left != current && parent.right != current) {
	        	
	        	System.out.println("Current parent " + current.parent + " Parent left " + parent.left + " Parent right " + parent.right);
	            return report("Node " + current.data + " is not a recognized child of its parent " + parent.data);
	        }
	        current = parent;
	    }

	    if (current != root) {
	        return report("Node " + n.data + " does not belong to the tree rooted at ");
	    }

	    return true; 
	}








	private boolean wellFormed() {

	    if (table == null || table.length < INITIAL_CAPACITY || Integer.bitCount(table.length) != 1) {
	        return report("Table must not be null, length must be a power of two, and never smaller than eight");
	    }

	    int nonNullCount = 0;
	    for (Node<T> node : table) {
	        if (node != null) nonNullCount++;
	    }
	    if (nonNullCount != used) {
	    	System.out.println("Non null count : " + nonNullCount);
	    	System.out.println("Used count : " + used);
	    	return report("'used' does not accurately count the number of non-null slots in the array");
	    }

	    if (nonNullCount > (table.length / 2)) {
	        return report("Table has more than half of its elements as non-null");
	    }

	    for (int i = 0; i < table.length; i++) {
	        Node<T> node = table[i];
	        if (node != null && node != PLACE_HOLDER) {
	            nonNullCount++;

	            
	            for (int j = i + 1; j < table.length; j++) {
	                if (table[j] == node) {
	                    return report("Duplicate node found in the hash table: " + node.data);
	                }
	            }
	        }
	    }
	    
	    
	    
	    int treeCount = 0;
	    for (int i = 0; i < table.length; i++) {
	        Node<T> node = table[i];
	        if (node != null && node != PLACE_HOLDER) {

	            int index = find(node.data, true);
	            if (table[index] != node) {

	                System.out.println("Index " + index + " Node " + node.data);

	                return report("Node is not hashed to the correct place in the table");
	            }

	   
	            if (!isInTree(node)) {

	                return false;
	            }
	            treeCount++;
	        }
	    }

	    if (treeCount != getCount(root)) {
	    	System.out.println("Used " + getCount(root) + " Tree count " + treeCount);
	        return report("Count of non-placeholder nodes is not the same as the count for the tree itself");
	    }
		return checkTree(root, null);
	}
	
	/**
	 * Create an empty ranking.
	 */
	public Ranking() {
	    table = makeArray(INITIAL_CAPACITY); 
	    used = 0;  
	    root = null;  
	    assert wellFormed() : "Invariant broken in constructor";
	}

	
	private Ranking(boolean ignored) {} // don't change this
	
	/**
	 * Return the k'th (1 based) node in the subtree.
	 * This helper method uses the count fields to avoid an
	 * in-order traversal.
	 * @param r subtree to examine, may be null
	 * @param k index (1 based)
	 * @return k'th node of the tree or null if none such
	 */
	private Node<T> doGet(Node<T> r, int k) {
		if (r == null) return null;
		int l = getCount(r.left);
		if (k <= l) return doGet(r.left, k);
		if (k == l+1) return r;
		return doGet(r.right, k - l - 1);
	}

	@Override // efficiency
	public boolean containsKey(Object key) {
		assert wellFormed() : "Invariant broken in containsKey";
		if (!(key instanceof Integer)) return false;
		Integer rank = (Integer)key;
		return rank > 0 && rank <= size();
	}

	@Override // efficiency
	public T get(Object key) {
		assert wellFormed() : "Invariant broken in get";
		if (!(key instanceof Integer)) return null;
		int k = ((Integer)key).intValue();
		if (k <= 0 || k > getCount(root)) return null;
		return doGet(root, k).data;
	}

	/**
	 * Return the (1-based) rank of a node in its tree.
	 * @param n node to get rank for, must not be null and must have a terminating parent chain.
	 * The code will examine count fields of nodes up the tree
	 * @return rank of this node in the tree.
	 */
	protected static int nodeRank(Node<?> n) {
	    int rank = getCount(n.left) + 1; 

	    while (n.parent != null) {
	        if (n == n.parent.right) {
	            rank += getCount(n.parent.left) + 1;
	        }
	        n = n.parent;
	    }

	    return rank;
	}


	/**
	 * Return the rank of this value in the ranking. 
	 * Returns zero if unranked.
	 * @param value value to find ranking for
	 * @return ranking (1-based) or 0 if unranked.
	 */
	public int getRank(T value) {
	    int index = find(value, true);  // Use the existing find method to get the index
	    Node<T> node = table[index];    // Access the node directly from the table

	    if (node != null && node != PLACE_HOLDER && 
	        (node.data == null ? value == null : node.data.equals(value))) {
	        return nodeRank(node);  // Calculate rank using nodeRank if the node is found
	    }

	    return 0;  // Return 0 if the value is not found
	}



	private Node<T> doInsert(Node<T> r, int k, T val, Node<T> p) {
	    if (r == null) {
	        r = new Node<>(val);
	        r.parent = p;
	        int index = find(val, false);
	        if (table[index] == null) {
	            table[index] = r;
	            used++;
	            
	        }
	        if (table[index] == PLACE_HOLDER) {
	            table[index] = r;       
	        }
	        ++version;
	        setCount(root);
	        return r;
	    } else {
	        int l = getCount(r.left);
	        if (k <= l + 1) {
	            r.left = doInsert(r.left, k, val, r);
	        } else {
	            r.right = doInsert(r.right, k - l - 1, val, r);
	        }
	    }
	    setCount(r);
	    ++version;
	    return r;
	}

	@Override // required 
	public T put(Integer key, T value) {
	    assert wellFormed() : "Invariant broken in put";
	    
	    int k = key.intValue();
	    if (k <= 0 || k > size() + 1) throw new IllegalArgumentException("Cannot use rank " + k);
	    

	    int search = find(value, false);
	    Node<T> existingNode = table[search];
	    if (existingNode != null && existingNode != getPlaceHolder() && 
	        existingNode.data != null && existingNode.data.equals(value)) {

	        int currentRank = nodeRank(existingNode);
	        if (currentRank != k) {
	            throw new IllegalArgumentException("Value " + value + " already exists at rank " + currentRank);
	        }
	    }
  

	    Node<T> node = doGet(root, k);
	    T old = null;
	    if (node == null) {
	 
	        root = doInsert(root, k, value, null);
	        
	        int index = find(value, false);
	        
	        if (table[index] == null) {
	            table[index] = root;
	            ++version;
	            
	        }
	    } else {
	    
	        old = node.data;
	        if ((node.data == null ? value != null : !node.data.equals(value))) {
	        
	            int oldIndex = find(node.data, true);
	            table[oldIndex] = getPlaceHolder();
	            node.data = value; 
	            int newIndex = find(value, false);
	            
	            
	            
	            if (table[newIndex] == null) {
	                table[newIndex] = node; 
	                used++; 
	            } else if (table[newIndex] == getPlaceHolder()) {
	                table[newIndex] = node; 
	                
	            } else {
	
	                throw new IllegalStateException("Hash table slot already occupied by non-placeholder node");
	            }
	        }
	        
	        else if (node.data != value) {
	            node.data = value; 
	        }
	    }
	    

		if(used > table.length / 2) {
			resize();
		}

	    assert wellFormed() : "Invariant broken by put";
	    return old;
	}





	private Node<T> doRemove(Node<T> r, int k) {
		if (r == null) return null;
		int l = getCount(r.left);
		if (k <= l) {
			r.left = doRemove(r.left, k);
		} else if (k == l+1) {
			if (r.left == null && r.right == null) return null;
			if (r.left == null) {
				r.right.parent = r.parent;
				return r.right;
			} else if (r.right == null) {
				r.left.parent = r.parent;
				return r.left;
			}
			Node<T> tmp = r.left;
			while (tmp.right != null) {
				tmp = tmp.right;
			}
			 int hashIndex = find(tmp.data, true);

		   
		        r.data = tmp.data;
		        
		      
		        if (hashIndex != -1 && table[hashIndex] != getPlaceHolder()) {
		            table[hashIndex] = r;
		        }
			r.left = doRemove(r.left,getCount(r.left));
		} else {
			r.right = doRemove(r.right, k-l-1);
		}
		setCount(r);
		return r;
	}
	
	


	@Override // required 
	public T remove(Object key) {
	    assert wellFormed() : "Invariant broken at start of remove";
	    if (!(key instanceof Integer)) return null; 
	    int rank = (Integer) key;
	    Node<T> node = doGet(root, rank);

	    if (node == null) return null; 

	    int index = find(node.data, true); 
	    if (table[index] == null || table[index] == getPlaceHolder()) return null; 

	    T oldValue = node.data; 
	    table[index] = getPlaceHolder(); 

	    root = doRemove(root, rank);
	    setCount(root); 
	   
	    version++;
	    assert wellFormed() : "Invariant broken at end of remove";
	    return oldValue;
	}




	
	
	
	private void resize() {
	    int nonPlaceholderCount = 0;
	    for (Node<T> node : table) {
	        if (node != null && node != PLACE_HOLDER) {
	            nonPlaceholderCount++;
	        }
	    }

	    int requiredCapacity = Math.max(8, Math.max(INITIAL_CAPACITY, 4 * nonPlaceholderCount));
	    int newSize = PowersOfTwo.next(requiredCapacity);


	    if (nonPlaceholderCount < table.length / 4) { 
	        newSize = Math.max(8, PowersOfTwo.next(nonPlaceholderCount));
	    }

	   
	    Node<T>[] oldTable = table;
	    table = makeArray(newSize);
	    used = 0; 

	    
	    for (Node<T> node : oldTable) {
	        if (node != null && node != PLACE_HOLDER) {
	            int index = find(node.data, false);
	            table[index] = node;
	            used++; 
	        }
	    }
	}



	
	
	/**
	 * Insert a new data at the given rank
	 * @param k rank to insert at, must be between 1 and size()+1 inclusive
	 * @param value value to add, may be null
	 * @exception IllegalArgumentException if rank is not valid
	 */
	public void insert(int k, T value) {
		assert wellFormed() : "Invariant broken in insert";
		if (k <= 0 || k > size()+1) throw new IllegalArgumentException("out of range: " + k);
	    int index = find(value, true); 
	    
	    Node<T> existingNode = table[index];
	    if (existingNode != null && existingNode != PLACE_HOLDER && (existingNode.data == null ? value == null : existingNode.data.equals(value))) {
	        throw new IllegalArgumentException("Value '" + value + "' already exists in the ranking");
	    }
		if(used >= table.length / 2) {
			resize();
		}
		root = doInsert(root, k, value, null);
		++version;
		assert wellFormed() : "Invariant broken by insert";
	}
	
	private Set<Map.Entry<Integer, T>> entrySet;
	
	@Override // required
	public Set<Entry<Integer, T>> entrySet() {
		assert wellFormed() : "Invariant broken in entrySet";
		if (entrySet == null) entrySet = new EntrySet();
		return entrySet;
	}
	
	

	private class EntrySet extends AbstractSet<Map.Entry<Integer,T>> {

		@Override // required
		public int size() {
			assert wellFormed() : "Invariant broken in size";
			return getCount(root);
		}

		@Override // required
		public Iterator<Entry<Integer, T>> iterator() {
			assert wellFormed() : "Invariant broken in iterator";
			return new MyIterator();
		}

		@Override // efficiency
		public boolean contains(Object o) {
			assert wellFormed() : "invariant broken in contains";
			if (!(o instanceof Entry<?,?>)) return false;
			Entry<?,?> e = (Entry<?,?>)o;
			if (!(e.getKey() instanceof Integer)) return false;
			Node<T> node = doGet(root, (Integer)e.getKey());
			if (node == null) return false;
			if (node.data == null) return e.getValue() == null;
			return node.data.equals(e.getValue());
		}

		@Override // efficiency
		public boolean remove(Object o) {
			assert wellFormed() : "invariant broken in remove";
			if (!contains(o)) return false;
			Entry<?,?> e = (Entry<?,?>)o;
			Ranking.this.remove(e.getKey());
			return true;
		}	
	}
	
	/**
	 * Return the next node in in-order traversal.
	 * This method uses the parent pointers.
	 * @param n node to get next for, must not be null
	 * @return next node in in-order traversal
	 */
	private Node<T> getNext(Node<T> n) {
		if (n.right == null) {
			Node<T> p = n.parent;
			while (p != null) {
				if (p.left == n) return p;
				assert n == p.right;
				n = p;
				p = p.parent;
			}
			return null;
		} else {
			n = n.right;
			while (n.left != null) {
				n = n.left;
			}
			return n;
		}
	}
	
	/**
	 * Wrapper class for nodes to be entries
	 */
	private class MyEntry extends AbstractEntry<Integer,T> {
		private final int rank;
		private final Node<T> cur;
		
		MyEntry(int r, Node<T> n) {
			rank = r;
			cur = n;
		}
		
		@Override // required
		public Integer getKey() {
			return rank;
		}

		@Override // required
		public T getValue() {
			return cur.data;
		}

		@SuppressWarnings("unchecked")
		@Override // implementation  
		public T setValue(T newValue) {
		    assert wellFormed() : "invariant broken in setValue";

		    T oldValue = cur.data;
		    if ((cur.data == null ? newValue != null : !cur.data.equals(newValue))) {
		        
		        int oldIndex = find(cur.data, true); 
		        if (table[oldIndex] != PLACE_HOLDER) { 
		            table[oldIndex] = (Node<T>) PLACE_HOLDER; 
		        }

		        
		        cur.data = newValue;

		        
		        int newIndex = find(newValue, false);
		        if (table[newIndex] == null) {
		            table[newIndex] = cur;
		            used++; 
		            
		        } else if (table[newIndex] == getPlaceHolder()) {
		            table[newIndex] = cur; 		        } else {
		            throw new IllegalArgumentException("Hash table insertion failed, slot already occupied");
		        }
		    } else { 
		        
		        cur.data = newValue;
		    }
		    
		    assert wellFormed() : "invariant broken by setValue";
		    return oldValue;
		}


	}
	
	private class MyIterator implements Iterator<Map.Entry<Integer,T>>
	{
		// Fields:
		private int rank;
		private Node<T> cur, next;
		private int colVersion;
	
		private boolean wellFormed() {
			if (!Ranking.this.wellFormed()) return false;
			if (version != colVersion) return true;
			if (next != doGet(root, rank+1)) {
				return report("next is wrong node: " + next + " for rank " + rank);
			}
			if (cur != next) {
				if (cur != doGet(root, rank)) return report("cur is wrong node: " + cur + " for rank " + rank);
			}
			return true;
		}
		
		MyIterator() {
			rank = 0;
			next = root;
			if (next != null) {
				while (next.left != null) {
					next = next.left;
				}
			}
			cur = next;
			colVersion = version;
			assert wellFormed() : "Invariant broken by MyIterator constructor";
		}
		
		MyIterator(boolean ignored) {} // do not change this
		
		private void checkVersion() {
			if (version != colVersion) throw new ConcurrentModificationException("stale!");
		}
		
		@Override // required
		public boolean hasNext() {
			assert wellFormed() : "invariant broken in hasNext";
			checkVersion();
			return next != null;
		}

		@Override // required
		public Entry<Integer, T> next() {
			assert wellFormed() : "Invariant broken in next";
			if (!hasNext()) throw new NoSuchElementException("no more");
			cur = next;
			++rank;
			next = getNext(next);
			assert wellFormed() : "Invariant broken by next";
			return new MyEntry(rank,cur);
		}

		@Override // implementation
		public void remove() {
			 checkVersion();
		    assert wellFormed() : "Invariant broken in iterator remove";
		    if (cur == null || cur == next) throw new IllegalStateException("Next must be called before calling remove.");
   
		    checkVersion();

		    int index = find(cur.data, true);
		    if (index == -1 || table[index] == getPlaceHolder()) throw new IllegalStateException("Element to remove not found or already removed.");

		    table[index] = getPlaceHolder();

		    root = doRemove(root, rank);
		    if (root != null) setCount(root);
		    --rank;
		    next = doGet(root, rank + 1);

		    cur = next;  
		    colVersion = ++version; 

		    
		    assert wellFormed() : "Invariant broken by iterator remove";
		}


		

	}


	/**
	 * Testing class.  Do not change.
	 * @param T type of elements
	 */
	public static class Spy<T> {
		/**
		 * A public version of the data structure's internal node class.
		 * This class is only used for testing.
		 */
		public static class Node<U> extends Ranking.Node<U> {
			/**
			 * Create a node with default values for all fields.
			 */
			public Node() {
				this(null, 0, null, null, null);
			}
			/**
			 * Create a node with the given values
			 * @param d data for new node, may be null
			 * @param c count for new node,
			 * @param l left for new node, may be null
			 * @param r right for new node, may be null
			 * @param p parent for new node, may be null
			 */
			public Node(U d, int c, Node<U> l, Node<U> r, Node<U> p) {
				super(null);
				this.count = c;
				this.data = d;
				this.parent = p;
				this.left = l;
				this.right = r;
			}
		}
		
		private static final Node<?> SPY_PH = new Node<>();
		
		/**
		 * Return the spy placeholder that will be substituted
		 * wit the real one.
		 * @return place holder.
		 */
		@SuppressWarnings("unchecked")
		public Node<T> ph() {
			return (Node<T>)SPY_PH;
		}
		
		/**
		 * Create a node for testing.
			 * @param d data for new node, may be null
			 * @param c count for new node,
			 * @param l left for new node, may be null
			 * @param r right for new node, may be null
			 * @param p parent for new node, may be null
		 * @return newly created test node
		 */
		public Node<T> newNode(T d, int c, Node<T> l, Node<T> r, Node<T> p) {
			return new Node<T>(d, c, l, r, p);
		}
		
		/**
		 * Create a node with all default fields for testing.
		 * @return newly created test node
		 */
		public Node<T> newNode() {
			return new Node<T>();
		}
		
		/**
		 * Change a node's left field
		 * @param n1 node to change, must not be null
		 * @param n2 node to point to, may be null
		 */
		public void setLeft(Node<T> n1, Node<T> n2) {
			n1.left = n2;
		}
		
		/**
		 * Change a node's right field
		 * @param n1 node to change, must not be null
		 * @param n2 node to point to, may be null
		 */
		public void setRight(Node<T> n1, Node<T> n2) {
			n1.right = n2;
		}
		
		/**
		 * Change a node's parent field
		 * @param n1 node to change, must not be null
		 * @param n2 node to point to, may be null
		 */
		public void setParent(Node<T> n1, Node<T> n2) {
			n1.parent = n2;
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
		 * Return the size of the hash table used.
		 * @param r ranking to get information for
		 * @return length of the table
		 */
		public int getCapacity(Ranking<?> r) {
			return r.table.length;
		}
		
		/**
		 * Add values to the hashtable
		 * @param r ranking to access
		 * @param i location of table to change
		 * @param n the node to add
		 * @return length of the table
		 */
		public void setTable(Ranking<T> rank, int i, Node<T> n) {
			rank.table[i] = n;
		}
		
		/**
		 * get values from hashtable
		 * @param r ranking to access
		 * @param i location of table to change
		 * @param n the node to add
		 * @return length of the table
		 */
		public Node<T> getTable(Ranking<T> rank, int i) {
			return (Node<T>) rank.table[i];
		}
		
		/**
		 * Create a testing instance of a ranking with the given
		 * data structure.
		 * @param r the root
		 * @param u the number of used
		 * @param v the version
		 * @param t what the table should look like
		 * (the instance will have a copy).  If null, the instance's table will be null
		 * @return a new testing ranking with this data structure.
		 */
		public Ranking<T> newInstance(Node<T> r, int u, int v, Node<T>[] t) {
			Ranking<T> result = new Ranking<>(false);
			result.root = r;
			if (t != null) {
				result.table = result.makeArray(t.length);
				Ranking.Node<T> ph = result.getPlaceHolder();
				for (int i=0; i < t.length; ++i) {
					if (t[i] == SPY_PH) result.table[i] = ph;
					else result.table[i] = t[i];
				}
			}
			result.version = v;
			result.used = u;
			return result;
		}
			
		/**
		 * Creates a testing instance of an iterator
		 * @param outer the collection attached to the iterator
		 * @param r the rank
		 * @param c the current node
		 * @param n the next node
		 * @param cv the colVersion
		 */
		public Iterator<Entry<Integer,T>> newIterator(Ranking<T> outer, int r, Node<T> c, Node<T> n, int cv) {
			Ranking<T>.MyIterator result = outer.new MyIterator(false);
			result.rank = r;
			result.cur = c;
			result.next = n;
			result.colVersion = cv;
			return result;
		}
			
		/**
		 * Check the invariant on the given dynamic array robot.
		 * @param r ranking to check, must not be null
		 * @return whether the invariant is computed as true
		 */
		public boolean wellFormed(Ranking<?> r) {
			return r.wellFormed();
		}
			
		/**
		 * Check the invariant on the given Iterator.
		 * @param it iterator to check, must not be null
		 * @return whether the invariant is computed as true
		 */
		public boolean wellFormed(Iterator<Entry<Integer,T>> it) {
			Ranking<T>.MyIterator myIt = (Ranking<T>.MyIterator)it;
			return myIt.wellFormed();
		}
		
		/**
		 * Call getCount helper method with these arguments
		 * @param rank ranking to use, must not be null
		 * @param r node to get count of
		 * @return the int count of the node passed
		 */
		public int getCount(Node<T> r) {
			return Ranking.getCount(r);
		}
		
		/**
		 * Call doGet helper method with these arguments
		 * @param rank ranking to use, must not be null
		 * @param r subtree to use
		 * @param k rank to look for
		 * @return the node within the subtree associated with the given rank or null
		 */
		public Node<T> doGet(Ranking<T> rank, Node<T> r, int k) {
			return (Node<T>) rank.doGet(r, k);
		}
		
		/**
		 * Call checkTree helper method with these arguments
		 * @param rank ranking to use, must not be null
		 * @param r subtree to examine
		 * @param p parent node of the subtree being used, may be null
		 * @return whether any problems were found within the specified subtree
		 */
		public boolean checkTree(Ranking<T> rank, Node<T> r, Node<T> p) {
			return rank.checkTree(r, p);
		}
		
		/**
		 * Call find helper method with these arguments
		 * @param rank ranking to use, must not be null
		 * @param value value to search for, may be null
		 * @param skipPH whether PLACE_HOLDERS must be skipped (are not available)
		 * @return index of place in hash array that has the key,
		 * or the next available index.
		 */
		public int find(Ranking<T> rank, T value, boolean skipPH) {
			return rank.find(value, skipPH);
		}
		
		/**
		 * Call isInTree helper method with these arguments
		 * @param rank ranking to use, must not be null
		 * @param n node to check for, may be null (always returns true)
		 * @return whether this node is in the tree.
		 * Whether it has a path up to the root.
		 */
		public boolean isInTree(Ranking<T> rank, Node<T> n) {
			return rank.isInTree(n);
		}
		
		/**
		 * Call nodeRank helper method with this argument
		 * @param n node to get rank for, must not be null and must be in a tree.
		 * The parent chain must terminate, or this code may run forever.
		 * It looks at count fields of siblings in the tree.
		 * @return rank of this node in the tree.
		 */
		public int nodeRank(Node<T> n) {
			return Ranking.nodeRank(n);
		}
	}

}