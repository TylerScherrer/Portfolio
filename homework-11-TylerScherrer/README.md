[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/uEI32Sld)
# CompSci 351 / CompSt 751 Homework Assignment 11

This is a homework assignment at University of Wisconsin-Milwaukee.

This time, we're asking you to give an example of where you got stuck.

## Planning: Optional

### Gather

#### What do I know?  What do I need to know that's new?


*New to Homework #11*: the planning is optional.  But make sure to record
a test you were stuck on when that happens!

## Reflection: Due Monday 10pm

### Review

#### What's one thing that was more difficult than I anticipated?

	-I had difficulty when trying to remove stuff from the table and the binary tree. I had spent a couple hours trying to figure out how to correctly update all the nodes in both the tree and the table after making removal adjustments to the root. 


#### What's one test case where I got stuck?

The clues:
1. What test failed?

	public void testQ5() {
		es = self.entrySet();
		self.put(1, "B");
		self.insert(1, "A");
		self.put(3, "C");
		it = es.iterator();
		it.next();
		it.next();
		it.remove();
		assertException(IllegalStateException.class, () -> it.remove());
		assertEquals(new DefaultEntry<>(2,"C"), it.next());
	}
	
2. What assertion failed?

	it.remove() was setting off node A was not a parent of node A 
	
3. Why is the assertion justified ?  Or why does it appear to be wrong?

	I was having trouble when it.remove() was called, making sure to rehash my elements. I made changes to my binary tree, but was have some difficulties rehashing the nodes correctly in the table. 

4. How did the code fail?  (What does the failure trace say?)

	The code was failing inside of wellFormed. My main issue was trying to update the nodes inside the table after I made changes. Node A was still referencing the old parent Node B, but instead of pointing at Node B, it was pointing at the new root, which was itself. So I had to rehash the nodes inside the table to make sure they were all updated and correct. 

## Optional Feedback

### Comments (optional)

#### Here are my comments on the assignment to the course instructors:

### Check in (optional)

#### How am I feeling about the assignment and this course?
