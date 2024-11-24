import java.util.Iterator;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Supplier;

import edu.uwm.cs351.Ranking;
import edu.uwm.cs351.Ranking.Spy.Node;
import junit.framework.TestCase;

public class TestInternals extends TestCase {
	
	protected int reports;
	protected Ranking<String> r;
	protected Ranking.Spy<String> spy;
	protected Iterator<Entry<Integer, String>> it;
	
	protected void assertReporting(boolean expected, Supplier<Boolean> test) {
		reports = 0;
		Consumer<String> savedReporter = spy.getReporter();
		try {
			spy.setReporter((String message) -> {
				++reports;
				if (message == null || message.trim().isEmpty()) {
					assertFalse("Uninformative report is not acceptable", true);
				}
				if (expected) {
					assertFalse("Reported error incorrectly: " + message, true);
				}
			});
			assertEquals(expected, test.get().booleanValue());
			if (!expected) {
				assertEquals("Expected exactly one invariant error to be reported", 1, reports);
			}
			spy.setReporter(null);
		} finally {
			spy.setReporter(savedReporter);
		}
	}
	
	protected void assertWellFormed(boolean expected, Ranking<String> r) {
		assertReporting(expected, () -> spy.wellFormed(r));
	}
	
	protected void assertWellFormed(boolean expected, Iterator<Entry<Integer, String>> it) {
		assertReporting(expected, () -> spy.wellFormed(it));
	}
	
	protected void assertIsInTree(boolean expected, Node<String> n) {
		assertReporting(expected, () -> spy.isInTree(r, n));
	}
	
	@Override // implementation
	protected void setUp() {
		spy = new Ranking.Spy<String>();
	}
	
	@SuppressWarnings("unchecked")
	protected <E> Node<E>[] makeArray(int n) {
		return (Node<E>[])new Node<?>[n];
	}
	
	
	/// test0xx: tests of find
	
	public void test000() {
		Node<String>[] a = makeArray(8);
		r = spy.newInstance(null, 0, 0, a);
		assertEquals(0, spy.find(r, null, false));
	}
	
	public void test001() {
		Node<String>[] a = makeArray(8);
		r = spy.newInstance(null, 0, 0, a);
		assertEquals(0, spy.find(r, null, true));
	}
	
	public void test002() {
		Node<String> n0 = spy.newNode(null, 1, null, null, null);
		Node<String>[] a = makeArray(8);
		r = spy.newInstance(n0, 0, 0, a);
		assertEquals(0, spy.find(r, null, false));
	}
	
	public void test003() {
		Node<String> n0 = spy.newNode(null, 1, null, null, null);
		Node<String>[] a = makeArray(8);
		a[0] = n0;
		r = spy.newInstance(n0, 1, 0, a);
		assertEquals(0, spy.find(r, null, false));
	}
	
	public void test004() {
		Node<String> n0 = spy.newNode(null, 1, null, null, null);
		Node<String>[] a = makeArray(8);
		a[0] = n0;
		r = spy.newInstance(n0, 1, 0, a);
		assertEquals(1, spy.find(r, "A", false));
	}
	
	public void test005() {
		Node<String> n0 = spy.newNode(null, 1, null, null, null);
		Node<String>[] a = makeArray(8);
		a[0] = spy.ph();
		a[1] = spy.ph();
		r = spy.newInstance(n0, 0, 0, a);
		assertEquals(0, spy.find(r, null, false));
	}
	
	public void test006() {
		Node<String> n0 = spy.newNode(null, 1, null, null, null);
		Node<String>[] a = makeArray(8);
		a[0] = spy.ph();
		a[1] = spy.ph();
		r = spy.newInstance(n0, 0, 0, a);
		assertEquals(3, spy.find(r, null, true));
	}
	
	public void test007() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String>[] a = makeArray(8);
		a[1] = n1;
		r = spy.newInstance(n1, 1, 0, a);
		assertEquals(1, spy.find(r, "A", false));
	}
	
	public void test008() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String>[] a = makeArray(8);
		a[1] = spy.ph();
		a[2] = spy.ph();
		a[4] = spy.ph();
		r = spy.newInstance(n1, 1, 0, a);
		assertEquals(1, spy.find(r, "A", false));
	}
	
	public void test009() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String>[] a = makeArray(8);
		a[1] = spy.ph();
		a[2] = spy.ph();
		a[4] = spy.ph();
		r = spy.newInstance(n1, 1, 0, a);
		assertEquals(7, spy.find(r, "A", true));
	}
	
	public void test010() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String> n2 = spy.newNode("B", 1, n1, null, null);
		Node<String>[] a = makeArray(8);
		a[1] = n1;
		r = spy.newInstance(n2, 1, 0, a);	
		assertEquals(2, spy.find(r, "B", false));
	}
	
	public void test011() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String> n2 = spy.newNode("B", 2, n1, null, null);
		Node<String>[] a = makeArray(8);
		a[1] = n1;
		a[2] = n2;
		r = spy.newInstance(n2, 2, 0, a);
		assertEquals(2, spy.find(r, "B", false));
	}
	
	public void test012() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String> n2 = spy.newNode("B", 2, n1, null, null);
		Node<String>[] a = makeArray(8);
		a[1] = n1;
		a[2] = spy.ph();
		r = spy.newInstance(n2, 2, 0, a);
		assertEquals(2, spy.find(r, "B", false));
	}
	
	public void test013() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String> n2 = spy.newNode("B", 2, n1, null, null);
		Node<String>[] a = makeArray(8);
		a[1] = n1;
		a[2] = spy.ph();
		r = spy.newInstance(n2, 2, 0, a);
		assertEquals(3, spy.find(r, "B", true));
	}
	
	public void test014() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String> n2 = spy.newNode("B", 3, n1, null, null);
		Node<String> n3 = spy.newNode("I", 1, null, null, null);
		spy.setParent(n3, n2);
		Node<String>[] a = makeArray(8);
		a[1] = n1;
		a[2] = n2;
		r = spy.newInstance(n2, 3, 0, a);
		assertEquals(4, spy.find(r, "I", false));
	}
	
	public void test015() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String> n2 = spy.newNode("B", 3, n1, null, null);
		Node<String> n3 = spy.newNode("I", 1, null, null, null);
		Node<String>[] a = makeArray(8);
		
		a[1] = n1;
		a[2] = n2;
		a[4] = n3;
		r = spy.newInstance(n2, 3, 0, a);
		assertEquals(4, spy.find(r, "I", false));
	}
	
	public void test016() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String> n2 = spy.newNode("B", 3, n1, null, null);
		Node<String> n3 = spy.newNode("I", 1, null, null, null);
		spy.setParent(n3, n2);
		Node<String>[] a = makeArray(8);
		
		a[1] = spy.ph();
		a[2] = spy.ph();
		a[4] = spy.ph();
		r = spy.newInstance(n2, 3, 0, a);
		assertEquals(1, spy.find(r, "I", false));
	}
	
	public void test017() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String> n2 = spy.newNode("B", 3, n1, null, null);
		Node<String> n3 = spy.newNode("I", 1, null, null, null);
		Node<String>[] a = makeArray(8);
		
		a[1] = n1;
		a[2] = n2;
		a[4] = n3;
		r = spy.newInstance(n2, 3, 0, a);
		assertEquals(3, spy.find(r, "C", false));
	}
	
	public void test018() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String> n2 = spy.newNode("B", 3, n1, null, null);
		Node<String> n3 = spy.newNode("I", 2, null, null, null);
		Node<String> n4 = spy.newNode("J", 1, null, null, n3);
		spy.setParent(n4, n3);
		Node<String>[] a = makeArray(8);
		
		a[1] = n1;
		a[2] = n2;
		a[4] = n3;
		r = spy.newInstance(n2, 4, 0, a);
		assertEquals(3, spy.find(r, "J", false));
	}
	
	public void test019() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String> n2 = spy.newNode("B", 3, n1, null, null);
		Node<String> n3 = spy.newNode("I", 2, null, null, null);
		Node<String> n4 = spy.newNode("J", 1, null, null, n3);
		spy.setParent(n4, n3);
		Node<String>[] a = makeArray(8);
		
		a[1] = spy.ph();
		a[2] = spy.ph();
		a[4] = spy.ph();
		r = spy.newInstance(n2, 4, 0, a);
		assertEquals(3, spy.find(r, "J", true));
	}
	
	public void test020() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String> n2 = spy.newNode("B", 3, n1, null, null);
		Node<String> n3 = spy.newNode("I", 2, null, null, null);
		Node<String> n4 = spy.newNode("J", 1, null, null, n3);
		Node<String>[] a = makeArray(8);
		
		a[1] = n1;
		a[2] = n2;
		a[4] = n3;
		a[3] = n4;
		r = spy.newInstance(n2, 4, 0, a);
		assertEquals(3, spy.find(r, "J", false));
	}
	
	public void test021() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String> n2 = spy.newNode("B", 3, n1, null, null);
		Node<String> n3 = spy.newNode("I", 2, null, null, null);
		Node<String> n4 = spy.newNode("J", 1, null, null, n3);
		Node<String>[] a = makeArray(8);
		
		a[1] = n1;
		a[2] = n2;
		a[4] = n3;
		a[3] = n4;
		r = spy.newInstance(n2, 4, 0, a);
		assertEquals(6, spy.find(r, "C", false));
	}
	
	public void test022() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String> n2 = spy.newNode("B", 3, n1, null, null);
		Node<String> n3 = spy.newNode("I", 2, null, null, null);
		Node<String> n4 = spy.newNode("J", 1, null, null, n3);
		spy.setParent(n4, n3);
		Node<String>[] a = makeArray(8);
		
		a[1] = n1;
		a[2] = n2;
		a[4] = n3;
		a[3] = spy.ph();
		r = spy.newInstance(n2, 4, 0, a);
		assertEquals(3, spy.find(r, "C", false));
	}
	
	public void test023() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String> n2 = spy.newNode("B", 3, n1, null, null);
		Node<String> n3 = spy.newNode("I", 2, null, null, null);
		Node<String> n4 = spy.newNode("J", 1, null, null, n3);
		spy.setParent(n4, n3);
		Node<String>[] a = makeArray(8);
		
		a[1] = n1;
		a[2] = n2;
		a[4] = n3;
		a[3] = spy.ph();
		r = spy.newInstance(n2, 4, 0, a);
		assertEquals(6, spy.find(r, "C", true));
	}
	
	public void test024() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String> n2 = spy.newNode("B", 3, n1, null, null);
		Node<String> n3 = spy.newNode("I", 2, null, null, null);
		Node<String> n4 = spy.newNode("J", 1, null, null, n3);
		Node<String>[] a = makeArray(16);
		
		a[1] = n1;
		a[2] = n2;
		a[9] = n3;
		a[10] = n4;
		r = spy.newInstance(n2, 4, 0, a);
		assertEquals(1, spy.find(r, "A", false));
		assertEquals(2, spy.find(r, "B", false));
		assertEquals(9, spy.find(r, "I", false));
		assertEquals(10, spy.find(r, "J", false));
	}
	
	public void test025() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String> n2 = spy.newNode("B", 3, n1, null, null);
		Node<String> n3 = spy.newNode("I", 2, null, null, null);
		Node<String> n4 = spy.newNode("J", 1, null, null, n3);
		Node<String>[] a = makeArray(16);
		
		a[1] = n1;
		a[2] = n2;
		a[9] = n3;
		a[10] = n4;
		r = spy.newInstance(n2, 4, 0, a);
		assertEquals(3, spy.find(r, "C", false));
		assertEquals(11, spy.find(r, "K", false));
	}
	
	public void test026() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String> n2 = spy.newNode("B", 3, n1, null, null);
		Node<String> n3 = spy.newNode("I", 2, null, null, null);
		Node<String> n4 = spy.newNode("J", 1, null, null, n3);
		Node<String>[] a = makeArray(16);
		
		a[1] = n1;
		a[2] = n2;
		a[9] = n3;
		a[10] = n4;
		r = spy.newInstance(n2, 4, 0, a);
		assertEquals(4, spy.find(r, "Q", false));
	}
	
	public void test027() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String> n2 = spy.newNode("B", 3, n1, null, null);
		Node<String> n3 = spy.newNode("I", 2, null, null, null);
		Node<String> n4 = spy.newNode("J", 1, null, null, n3);
		spy.setParent(n4, n3);
		Node<String>[] a = makeArray(16);
		
		a[1] = n1;
		a[2] = n2;
		a[9] = spy.ph();
		a[10] = spy.ph();
		r = spy.newInstance(n2, 4, 0, a);
		assertEquals(9, spy.find(r, "I", false));
		assertEquals(10, spy.find(r, "J", false));
	}
	
	public void test028() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String> n2 = spy.newNode("B", 3, n1, null, null);
		Node<String> n3 = spy.newNode("I", 2, null, null, null);
		Node<String> n4 = spy.newNode("J", 1, null, null, n3);
		spy.setParent(n4, n3);
		Node<String>[] a = makeArray(16);
		
		a[1] = n1;
		a[2] = n2;
		a[9] = spy.ph();
		a[10] = spy.ph();
		r = spy.newInstance(n2, 4, 0, a);
		assertEquals(12, spy.find(r, "I", true));
		assertEquals(11, spy.find(r, "J", true));
	}
	
	public void test029() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String> n2 = spy.newNode("B", 3, n1, null, null);
		Node<String> n3 = spy.newNode("I", 2, null, null, null);
		Node<String> n4 = spy.newNode("J", 1, null, null, n3);
		spy.setParent(n4, n3);
		Node<String>[] a = makeArray(16);
		
		a[1] = n1;
		a[2] = n2;
		a[9] = spy.ph();
		a[10] = spy.ph();
		a[12] = spy.ph();
		a[15] = spy.ph();
		r = spy.newInstance(n2, 4, 0, a);
		assertEquals(3, spy.find(r, "I", true));
	}
	
	public void test030() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String> n2 = spy.newNode("B", 3, n1, null, null);
		Node<String> n3 = spy.newNode("I", 2, null, null, null);
		Node<String> n4 = spy.newNode("J", 1, null, null, n3);
		spy.setParent(n4, n3);
		Node<String>[] a = makeArray(16);
		
		a[1] = n1;
		a[2] = n2;
		a[9] = spy.ph();
		a[10] = spy.ph();
		a[11] = spy.ph();
		a[13] = spy.ph();
		r = spy.newInstance(n2, 4, 0, a);
		assertEquals(0, spy.find(r, "J", true));
	}
	
	public void test040() {
		Node<String>[]a = makeArray(8);
		a[3] = spy.ph();
		r = spy.newInstance(null, 1, 0, a);
		assertEquals(4, spy.find(r, "abcdef",true));
		assertEquals(3, spy.find(r, "abcdef", false));
	}
	
	public void test041() {
		Node<String>[]a = makeArray(8);
		a[3] = spy.ph();
		r = spy.newInstance(null, 1, 0, a);
		assertEquals(3, spy.find(r, "abcdef", false));
	}
	
	public void test042() {
		Node<String> n1 = spy.newNode(new String("abcdef"), 1, null, null, null);
		Node<String>[]a = makeArray(8);
		a[3] = spy.ph();
		a[4] = n1;
		r = spy.newInstance(n1, 2, 0, a);
		assertEquals(3, spy.find(r, "abcdef", false));
	}
	
	public void test043() {
		Node<String> n1 = spy.newNode(new String("abcdef"), 1, null, null, null);
		Node<String>[]a = makeArray(8);
		a[3] = spy.ph();
		a[4] = n1;
		r = spy.newInstance(n1, 2, 0, a);
		assertEquals(4, spy.find(r, "abcdef", true));
	}
	
	
	/// test1xx: tests of isInTree
	
	public void test100() {
		r = spy.newInstance(null, 0, 0, makeArray(8));
		assertIsInTree(true,(null));
	}
	
	public void test101() {
		Node<String> n0 = spy.newNode("A", 1, null, null, null);
		r = spy.newInstance(n0, 1, 0, makeArray(8));
		assertIsInTree(true,(n0));
	}
	
	public void test102() {
		Node<String> n0 = spy.newNode("A", 1, null, null, null);
		Node<String> n0a = spy.newNode("A", 1, null, null, null);
		r = spy.newInstance(n0, 1, 0, makeArray(8));
		assertIsInTree(false,(n0a));
	}
	
	public void test103() {
		Node<String> n0 = spy.newNode("A", 1, null, null, null);
		Node<String> n1 = spy.newNode("B", 3, n0, null, null);
		Node<String> n2 = spy.newNode("C", 1, null, null, n1);
		spy.setParent(n0, n1);
		spy.setRight(n1, n2);
		
		r = spy.newInstance(n1, 3, 0, makeArray(8));
		assertIsInTree(true,(n0));
		assertIsInTree(true,(n1));
		assertIsInTree(true,(n2));
	}
	
	public void test104() {
		Node<String> n0 = spy.newNode("A", 1, null, null, null);
		Node<String> n1 = spy.newNode("B", 3, n0, null, null);
		Node<String> n2 = spy.newNode("C", 1, null, null, n1);
		spy.setParent(n0, n0);
		spy.setRight(n1, n2);
		
		r = spy.newInstance(n1, 3, 0, makeArray(8));
		assertIsInTree(false,(n0));
	}
	
	public void test105() {
		Node<String> n0 = spy.newNode("A", 1, null, null, null);
		Node<String> n1 = spy.newNode("B", 3, n0, null, null);
		Node<String> n2 = spy.newNode("C", 1, null, null, n0);
		spy.setParent(n0, n1);
		spy.setRight(n1, n2);
		
		r = spy.newInstance(n1, 3, 0, makeArray(8));
		assertIsInTree(false,(n2));
	}
	
	public void test106() {
		Node<String> n0 = spy.newNode("A", 1, null, null, null);
		Node<String> n1 = spy.newNode("B", 3, null, null, null);
		Node<String> n2 = spy.newNode("C", 1, null, null, n1);
		spy.setParent(n0, n1);
		spy.setRight(n1, n2);
		
		r = spy.newInstance(n1, 3, 0, makeArray(8));
		assertIsInTree(false,(n0));
	}
	
	public void test107() {
		Node<String> n0 = spy.newNode("A", 1, null, null, null);
		Node<String> n1 = spy.newNode("B", 3, n0, null, null);
		Node<String> n2 = spy.newNode("C", 1, null, null, null);
		spy.setParent(n0, n1);
		spy.setRight(n1, n2);
		
		r = spy.newInstance(n1, 3, 0, makeArray(8));
		assertIsInTree(false,(n2));
	}
	
	public void test108() {
		Node<String> n0 = spy.newNode("A", 1, null, null, null);
		Node<String> n1 = spy.newNode("B", 3, n0, null, null);
		Node<String> n2 = spy.newNode("C", 1, null, null, n1);
		Node<String> n3 = spy.newNode("D", 1, null, null, null);
		
		spy.setParent(n0, n1);
		spy.setParent(n3, n2);
		spy.setRight(n0, n3);
		spy.setRight(n1, n2);
		spy.setRight(n2, n3);
		
		r = spy.newInstance(n1, 3, 0, makeArray(8));
		assertIsInTree(true,(n0));
		assertIsInTree(true,(n1));
		assertIsInTree(true,(n2));
		assertIsInTree(true,(n3));
	}
	
	public void test109() {
		Node<String> n0 = spy.newNode("A", 1, null, null, null);
		Node<String> n1 = spy.newNode("B", 3, n0, null, null);
		Node<String> n2 = spy.newNode("C", 1, null, null, null);
		Node<String> n3 = spy.newNode("D", 1, null, null, null);
		
		spy.setParent(n0, n1);
		spy.setParent(n3, n2);
		spy.setRight(n0, n3);
		spy.setRight(n1, n2);
		spy.setRight(n2, n3);
		
		r = spy.newInstance(n1, 3, 0, makeArray(8));
		assertIsInTree(false,(n2));
	}
	
	public void test110() {
		Node<String> n0 = spy.newNode("A", 1, null, null, null);
		Node<String> n1 = spy.newNode("B", 3, n0, null, null);
		Node<String> n2 = spy.newNode("C", 1, null, null, n1);
		Node<String> n3 = spy.newNode("D", 1, null, null, null);
		
		spy.setParent(n3, n2);
		spy.setRight(n0, n3);
		spy.setRight(n1, n2);
		spy.setRight(n2, n3);
		
		r = spy.newInstance(n1, 3, 0, makeArray(8));
		assertIsInTree(false,(n0));
	}
	
	public void test111() {
		Node<String> n0 = spy.newNode("A", 1, null, null, null);
		Node<String> n1 = spy.newNode("B", 3, n0, null, null);
		Node<String> n2 = spy.newNode("C", 1, null, null, n1);
		Node<String> n3 = spy.newNode("D", 1, null, null, null);
		
		spy.setParent(n0, n1);
		spy.setRight(n0, n3);
		spy.setRight(n1, n2);
		spy.setRight(n2, n3);
		
		r = spy.newInstance(n1, 3, 0, makeArray(8));
		assertIsInTree(false,(n3));
	}
	
	public void test112() {
		Node<String> n0 = spy.newNode("A", 1, null, null, null);
		Node<String> n1 = spy.newNode("B", 3, n0, null, null);
		Node<String> n2 = spy.newNode("C", 1, null, null, n1);
		Node<String> n3 = spy.newNode("D", 7, n1, null, null);
		Node<String> n4 = spy.newNode("E", 1, null, null, null);
		Node<String> n5 = spy.newNode("F", 3, n4, null, n3);
		Node<String> n6 = spy.newNode("G", 1, null, null, n5);
		
		spy.setParent(n0, n1);
		spy.setParent(n1, n3);
		spy.setParent(n4, n5);
		spy.setRight(n1, n2);
		spy.setRight(n3, n5);
		spy.setRight(n5, n6);
		
		r = spy.newInstance(n3, 7, 0, makeArray(8));
		assertIsInTree(true,(n0));
		assertIsInTree(true,(n1));
		assertIsInTree(true,(n2));
		assertIsInTree(true,(n3));
		assertIsInTree(true,(n4));
		assertIsInTree(true,(n5));
		assertIsInTree(true,(n6));
	}
	
	public void test113() {
		Node<String> n0 = spy.newNode("A", 1, null, null, null);
		Node<String> n1 = spy.newNode("B", 3, n0, null, null);
		Node<String> n2 = spy.newNode("C", 1, null, null, n1);
		Node<String> n2a = spy.newNode("C", 1, null, null, n1);
		Node<String> n3 = spy.newNode("D", 7, n1, null, null);
		Node<String> n4 = spy.newNode("E", 1, null, null, null);
		Node<String> n5 = spy.newNode("F", 3, n4, null, n3);
		Node<String> n6 = spy.newNode("G", 1, null, null, n5);
		
		spy.setParent(n0, n1);
		spy.setParent(n1, n3);
		spy.setParent(n4, n5);
		spy.setRight(n1, n2a);
		spy.setRight(n3, n5);
		spy.setRight(n5, n6);
		
		r = spy.newInstance(n3, 7, 0, makeArray(8));
		assertIsInTree(true,(n0));
		assertIsInTree(true,(n1));
		assertIsInTree(false,(n2));
		assertIsInTree(true,(n3));
		assertIsInTree(true,(n4));
		assertIsInTree(true,(n5));
		assertIsInTree(true,(n6));
	}
	
	public void test114() {
		Node<String> n0 = spy.newNode("A", 1, null, null, null);
		Node<String> n1 = spy.newNode("B", 3, n0, null, null);
		Node<String> n2 = spy.newNode("C", 1, null, null, n1);
		Node<String> n3 = spy.newNode("D", 7, n1, null, null);
		Node<String> n4 = spy.newNode("E", 1, null, null, null);
		Node<String> n5 = spy.newNode("F", 3, n4, null, n3);
		Node<String> n5a = spy.newNode("F", 3, n4, null, n3);
		Node<String> n6 = spy.newNode("G", 1, null, null, n5a);
		
		spy.setParent(n0, n1);
		spy.setParent(n1, n3);
		spy.setParent(n4, n5);
		spy.setRight(n1, n2);
		spy.setRight(n3, n5a);
		spy.setRight(n5, n6);
		
		r = spy.newInstance(n3, 7, 0, makeArray(8));
		assertIsInTree(true,(n0));
		assertIsInTree(true,(n1));
		assertIsInTree(true,(n2));
		assertIsInTree(true,(n3));
		assertIsInTree(false,(n4));
		assertIsInTree(false,(n5));
		assertIsInTree(false,(n6));
	}
	
	public void test119() {
		Node<String> n1 = spy.newNode("B", 200, null, null, null);
		Node<String> n2 = spy.newNode("C", 1, null, null, n1);
		Node<String> n3 = spy.newNode("D", 198, n2, null, n1);

		spy.setLeft(n1, n2);
		spy.setRight(n1, n3);
		r = spy.newInstance(n1, 0, 10, makeArray(8));
		
		assertIsInTree(true, n1);
		assertIsInTree(true, n2);
		assertIsInTree(true, n3);
	}
	
	public void test120() {
		Node<String> n0 = spy.newNode("A", 1, null, null, null);
		Node<String> n1 = spy.newNode("B", 200, null, null, null);
		Node<String> n2 = spy.newNode("C", 1, null, null, n1);
		Node<String> n3 = spy.newNode("D", 198, n1, null, n1);
		
		spy.setLeft(n1, n2);
		spy.setRight(n1, n3);
		spy.setParent(n1, n3);
		
		r = spy.newInstance(n0, 0, 0, makeArray(8));
		assertIsInTree(true, n0);
		assertIsInTree(false, n1);
		assertIsInTree(false, n2);
		assertIsInTree(false, n3);
	}
	
	public void test121() {
		Node<String> n0 = spy.newNode("A", 1, null, null, null);
		Node<String> n1 = spy.newNode("B", 200, null, null, null);
		Node<String> n2 = spy.newNode("C", 198, null, n1, n1);
		Node<String> n3 = spy.newNode("D", 1, null, null, n1);
		
		spy.setLeft(n1, n2);
		spy.setRight(n1, n3);
		spy.setParent(n1, n2);
		
		Node<String>[] a = makeArray(8);
		a[1] = n0;
		a[2] = n1;
		a[3] = n2;
		a[4] = n3;
		
		r = spy.newInstance(n0, 4, 10, a);
		assertIsInTree(true, n0);
		assertIsInTree(false, n1);
		assertIsInTree(false, n2);
		assertIsInTree(false, n3);
	}

	
	// test2xx: tests of wellFormed
	
	public void test200() {
		r = spy.newInstance(null, 0, 0, null);
		assertWellFormed(false, r);
	}
	
	public void test201() {
		r = spy.newInstance(null, 0, 0, makeArray(8));
		assertWellFormed(true, r);
	}

	public void test202() {
		r = spy.newInstance(null, 0, 0, makeArray(1));
		assertWellFormed(false, r);
	}
	
	public void test203() {
		r = spy.newInstance(null, 0, 0, makeArray(4));
		assertWellFormed(false, r);
	}
	
	public void test204() {
		r = spy.newInstance(null, 0, 0, makeArray(11));
		assertWellFormed(false, r);
	}
	
	public void test205() {
		r = spy.newInstance(null, 0, 0, makeArray(24));
		assertWellFormed(false, r);
	}

	public void test206() {
		r = spy.newInstance(null, 0, 0, makeArray(256));
		assertWellFormed(true, r);
	}
	
	public void test207() {
		Node<String> n0 = spy.newNode(null, 1, null, null, null);
		Node<String>[] a = makeArray(8);
		r = spy.newInstance(n0, 1, 0, a);
		assertWellFormed(false, r);
	}
	
	public void test208() {
		Node<String> n0 = spy.newNode(null, 1, null, null, null);
		Node<String>[] a = makeArray(8);
		a[0] = n0;
		r = spy.newInstance(n0, 0, 0, a);
		assertWellFormed(false, r);
	}
	
	public void test209() {
		Node<String> n0 = spy.newNode(null, 1, null, null, null);
		Node<String>[] a = makeArray(8);
		a[1] = n0;
		r = spy.newInstance(n0, 0, 0, a);
		assertWellFormed(false, r);
	}
	
	public void test210() {
		Node<String> n0 = spy.newNode(null, 1, null, null, null);
		Node<String>[] a = makeArray(8);
		a[0] = n0;
		r = spy.newInstance(n0, 1, 0, a);
		assertWellFormed(true, r);
	}
	
	public void test211() {
		Node<String> n0 = spy.newNode(null, 1, null, null, null);
		Node<String>[] a = makeArray(8);
		a[0] = spy.ph();
		a[1] = spy.ph();
		r = spy.newInstance(n0, 0, 0, a);
		assertWellFormed(false, r);
	}
	
	public void test212() {
		Node<String> n0 = spy.newNode(null, 1, null, null, null);
		Node<String>[] a = makeArray(8);
		a[0] = spy.ph();
		a[1] = spy.ph();
		r = spy.newInstance(n0, 2, 0, a);
		assertWellFormed(false, r);
	}
	
	public void test213() {
		Node<String> n0 = spy.newNode(null, 1, null, null, null);
		Node<String>[] a = makeArray(8);
		a[0] = spy.ph();
		a[1] = n0;
		r = spy.newInstance(n0, 2, 0, a);
		assertWellFormed(true, r);
	}
	
	public void test214() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String>[] a = makeArray(8);
		r = spy.newInstance(n1, 1, 0, a);
		a[0] = n1;
		assertWellFormed(false, r);
	}
	
	public void test215() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String>[] a = makeArray(8);
		r = spy.newInstance(n1, -1, 0, a);
		a[1] = n1;
		assertWellFormed(false, r);
	}
	
	public void test216() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String> n2 = spy.newNode("B", 2, n1, null, null);
		Node<String>[] a = makeArray(8);
		spy.setParent(n1, n2);

		a[1] = n1;
		r = spy.newInstance(n2, 2, 0, a);
		assertWellFormed(false, r);
	}
	
	public void test217() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String> n2 = spy.newNode("B", 2, n1, null, null);
		Node<String>[] a = makeArray(8);
		spy.setParent(n1, n2);
		
		a[1] = n1;
		a[2] = n2;
		r = spy.newInstance(n2, 1, 0, a);
		assertWellFormed(false, r);
	}
	
	public void test218() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String> n2 = spy.newNode("B", 2, n1, null, null);
		Node<String>[] a = makeArray(8);
		spy.setParent(n1, n2);
		
		a[1] = n1;
		a[3] = n2;
		r = spy.newInstance(n2, 2, 0, a);
		assertWellFormed(false, r);
	}
	
	public void test219() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String> n2 = spy.newNode("B", 2, n1, null, null);
		Node<String>[] a = makeArray(8);
		spy.setParent(n1, n1);
		
		a[1] = n1;
		a[2] = n2;
		r = spy.newInstance(n2, 2, 0, a);
		assertWellFormed(false, r);
	}
	
	public void test220() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String> n2 = spy.newNode("B", 2, n1, null, null);
		Node<String>[] a = makeArray(8);
		spy.setParent(n1, n2);
		
		a[1] = n1;
		a[2] = n2;
		r = spy.newInstance(n2, 2, 0, a);
		assertWellFormed(true, r);
	}
	
	public void test221() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String> n2 = spy.newNode("B", 2, n1, null, null);
		Node<String>[] a = makeArray(8);
		spy.setParent(n1, n2);
		
		a[1] = n1;
		a[2] = spy.ph();
		a[4] = n2;
		r = spy.newInstance(n2, 3, 0, a);
		assertWellFormed(false, r);
	}
	
	public void test222() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String> n2 = spy.newNode("B", 2, n1, null, null);
		Node<String>[] a = makeArray(8);
		spy.setParent(n1, n2);
		
		a[1] = n1;
		a[2] = spy.ph();
		a[3] = n2;
		r = spy.newInstance(n2, 2, 0, a);
		assertWellFormed(false, r);
	}
	
	public void test223() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String> n2 = spy.newNode("B", 2, n1, null, null);
		Node<String>[] a = makeArray(8);
		spy.setParent(n1, n2);
		
		a[1] = n1;
		a[2] = spy.ph();
		a[3] = n2;
		r = spy.newInstance(n2, 3, 0, a);
		assertWellFormed(true, r);
	}
	
	public void test224() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String> n2 = spy.newNode("B", 3, n1, null, null);
		Node<String> n3 = spy.newNode("C", 1, null, null, null);
		Node<String>[] a = makeArray(8);
		spy.setParent(n1, n2);
		spy.setParent(n3, n2);
		spy.setRight(n2, n3);
		
		a[1] = n1;
		a[2] = n2;
		a[3] = n3;
		r = spy.newInstance(n2, 2, 0, a);
		assertWellFormed(false, r);
	}
	
	public void test225() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String> n2 = spy.newNode("B", 3, n1, null, null);
		Node<String> n3 = spy.newNode("C", 1, n2, null, null);
		Node<String>[] a = makeArray(8);
		spy.setParent(n1, n2);
		spy.setParent(n3, n2);
		spy.setRight(n2, n3);
		
		a[1] = n1;
		a[2] = n2;
		a[3] = n3;
		r = spy.newInstance(n2, 3, 0, a);
		assertWellFormed(false, r);
	}
	
	public void test226() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String> n2 = spy.newNode("B", 3, n1, null, null);
		Node<String> n3 = spy.newNode("C", 1, null, null, null);
		Node<String>[] a = makeArray(8);
		spy.setParent(n1, n2);
		spy.setParent(n3, n2);
		spy.setRight(n2, n3);
		
		a[1] = n1;
		a[2] = n2;
		r = spy.newInstance(n2, 3, 0, a);
		assertWellFormed(false, r);
	}
	
	public void test227() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String> n2 = spy.newNode("B", 3, n1, null, null);
		Node<String> n3 = spy.newNode("C", 1, null, null, null);
		Node<String>[] a = makeArray(8);
		spy.setParent(n1, n2);
		spy.setParent(n3, n2);
		spy.setRight(n2, n3);
		
		a[1] = n1;
		a[2] = n2;
		a[3] = n3;
		r = spy.newInstance(n2, 3, 0, a);
		assertWellFormed(true, r);
	}
	
	public void test228() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String> n2 = spy.newNode("B", 3, n1, null, null);
		Node<String> n3 = spy.newNode("C", 1, null, null, null);
		Node<String>[] a = makeArray(8);
		spy.setParent(n1, n2);
		spy.setParent(n3, n2);
		spy.setRight(n2, n3);
		
		a[1] = n1;
		a[2] = spy.ph();
		a[3] = spy.ph();
		a[5] = n2;
		a[4] = n3;
		r = spy.newInstance(n2, 5, 0, a);
		assertWellFormed(false, r);
	}
	
	public void test229() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String> n2 = spy.newNode("B", 3, n1, null, null);
		Node<String> n3 = spy.newNode("C", 1, null, null, null);
		Node<String>[] a = makeArray(16);
		spy.setParent(n1, n2);
		spy.setParent(n3, n2);
		spy.setRight(n2, n3);
		
		a[1] = n1;
		a[2] = spy.ph();
		a[3] = spy.ph();
		a[4] = n2;
		a[3] = n3;
		r = spy.newInstance(n2, 5, 0, a);
		assertWellFormed(false, r);
	}
	
	public void test230() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String> n2 = spy.newNode("B", 3, n1, null, null);
		Node<String> n3 = spy.newNode("C", 1, null, null, null);
		Node<String>[] a = makeArray(16);
		spy.setParent(n1, n2);
		spy.setParent(n3, n2);
		spy.setRight(n2, n3);
		
		a[1] = n1;
		a[2] = spy.ph();
		a[3] = spy.ph();
		a[5] = n2;
		a[4] = n3;
		r = spy.newInstance(n2, 3, 0, a);
		assertWellFormed(false, r);
	}
	
	public void test231() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String> n2 = spy.newNode("B", 3, n1, null, null);
		Node<String> n3 = spy.newNode("C", 1, null, null, null);
		Node<String>[] a = makeArray(16);
		spy.setParent(n1, n2);
		spy.setParent(n3, n2);
		spy.setRight(n2, n3);
		
		a[1] = n1;
		a[2] = spy.ph();
		a[3] = spy.ph();
		a[5] = n2;
		a[4] = n3;
		r = spy.newInstance(n2, 5, 0, a);
		assertWellFormed(true, r);
	}
	
	public void test232() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String> n2 = spy.newNode("B", 3, n1, null, null);
		Node<String> n3 = spy.newNode("C", 2, null, null, null);
		Node<String> n4 = spy.newNode("D", 1, null, null, n3);
		Node<String>[] a = makeArray(8);
		spy.setParent(n1, n2);
		spy.setParent(n3, n2);
		spy.setRight(n2, n3);
		spy.setRight(n3, n4);
		
		a[1] = n1;
		a[2] = n2;
		a[3] = n3;
		a[4] = n4;
		r = spy.newInstance(n2, 4, 0, a);
		assertWellFormed(false, r);
	}
	
	public void test233() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String> n2 = spy.newNode("B", 4, n1, null, null);
		Node<String> n3 = spy.newNode("C", 2, null, null, null);
		Node<String> n4 = spy.newNode("D", 1, null, null, n3);
		Node<String>[] a = makeArray(8);
		spy.setParent(n1, n2);
		spy.setParent(n3, n2);
		spy.setRight(n2, n3);
		spy.setRight(n3, n4);
		
		a[1] = n1;
		a[2] = n2;
		a[3] = n3;
		a[4] = n4;
		r = spy.newInstance(n2, 3, 0, a);
		assertWellFormed(false, r);
	}
	
	public void test234() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String> n2 = spy.newNode("B", 4, n1, null, null);
		Node<String> n3 = spy.newNode("C", 2, null, null, null);
		Node<String> n4 = spy.newNode("D", 1, null, null, n3);
		Node<String>[] a = makeArray(8);
		spy.setParent(n1, n2);
		spy.setParent(n3, n2);
		spy.setRight(n2, n3);
		spy.setRight(n3, n4);
		
		a[1] = n1;
		a[2] = n2;
		a[3] = n3;
		a[4] = n4;
		r = spy.newInstance(n2, 4, 0, a);
		assertWellFormed(true, r);
	}
	
	public void test235() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String> n2 = spy.newNode("B", 3, n1, null, null);
		Node<String> n3 = spy.newNode("C", 1, null, null, n2);
		Node<String> n4 = spy.newNode("D", 7, n2, null, null);
		Node<String> n5 = spy.newNode("E", 1, null, null, null);
		Node<String> n6 = spy.newNode("F", 3, n5, null, n4);
		Node<String> n7 = spy.newNode("G", 1, null, null, n6);
		Node<String>[] a = makeArray(8);
		spy.setParent(n1, n2);
		spy.setParent(n2, n4);
		spy.setParent(n5, n6);
		spy.setRight(n2, n3);
		spy.setRight(n4, n6);
		spy.setRight(n6, n7);
		
		a[1] = n1;
		a[2] = n2;
		a[3] = n3;
		a[4] = n4;
		a[5] = n5;
		a[6] = n6;
		a[7] = n7;
		
		r = spy.newInstance(n4, 7, 0, a);
		assertWellFormed(false, r);
	}
	
	public void test236() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String> n2 = spy.newNode("B", 3, n1, null, null);
		Node<String> n3 = spy.newNode("C", 1, null, null, null);
		Node<String> n4 = spy.newNode("D", 7, n2, null, null);
		Node<String> n5 = spy.newNode("E", 1, null, null, null);
		Node<String> n6 = spy.newNode("F", 3, n5, null, n4);
		Node<String> n7 = spy.newNode("G", 1, null, null, n6);
		Node<String>[] a = makeArray(16);
		spy.setParent(n1, n2);
		spy.setParent(n2, n4);
		spy.setParent(n5, n6);
		spy.setRight(n2, n3);
		spy.setRight(n4, n6);
		spy.setRight(n6, n7);
		
		a[1] = n1;
		a[2] = n2;
		a[3] = n3;
		a[4] = n4;
		a[5] = n5;
		a[6] = n6;
		a[7] = n7;
		
		r = spy.newInstance(n4, 7, 0, a);
		assertWellFormed(false, r);
	}
	
	public void test237() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String> n2 = spy.newNode("B", 3, n1, null, null);
		Node<String> n3 = spy.newNode("C", 1, null, null, n2);
		Node<String> n4 = spy.newNode("D", 7, n2, null, null);
		Node<String> n5 = spy.newNode("E", 1, null, null, null);
		Node<String> n6 = spy.newNode("F", 3, n5, null, n4);
		Node<String> n7 = spy.newNode("G", 1, null, null, n6);
		Node<String>[] a = makeArray(16);
		spy.setParent(n1, n2);
		spy.setParent(n2, n4);
		spy.setParent(n5, n6);
		spy.setRight(n2, n3);
		spy.setRight(n4, n6);
		spy.setRight(n6, n7);
		
		a[1] = n1;
		a[2] = n2;
		a[3] = n3;
		a[4] = n4;
		a[5] = n2;
		a[6] = n6;
		a[7] = n7;
		
		r = spy.newInstance(n4, 7, 0, a);
		assertWellFormed(false, r);
	}
	
	public void test238() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String> n2 = spy.newNode("B", 3, n1, null, null);
		Node<String> n3 = spy.newNode("C", 1, null, null, n2);
		Node<String> n4 = spy.newNode("D", 7, n2, null, null);
		Node<String> n5 = spy.newNode("E", 1, null, null, null);
		Node<String> n6 = spy.newNode("F", 3, n5, null, n4);
		Node<String> n7 = spy.newNode("G", 1, null, null, n6);
		Node<String>[] a = makeArray(16);
		spy.setParent(n1, n2);
		spy.setParent(n2, n4);
		spy.setParent(n5, n6);
		spy.setRight(n2, n3);
		spy.setRight(n4, n6);
		spy.setRight(n6, n7);
		
		a[1] = n1;
		a[2] = n2;
		a[3] = n3;
		a[4] = n4;
		a[5] = n5;
		a[6] = n6;
		a[7] = n7;
		
		r = spy.newInstance(n4, 8, 0, a);
		assertWellFormed(false, r);
	}
	
	public void test239() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String> n2 = spy.newNode("B", 3, n1, null, null);
		Node<String> n3 = spy.newNode("C", 1, null, null, n2);
		Node<String> n4 = spy.newNode("D", 7, n2, null, null);
		Node<String> n5 = spy.newNode("E", 1, null, null, null);
		Node<String> n6 = spy.newNode("F", 3, n5, null, n4);
		Node<String> n7 = spy.newNode("G", 1, null, null, n6);
		Node<String>[] a = makeArray(16);
		spy.setParent(n1, n2);
		spy.setParent(n2, n4);
		spy.setParent(n5, n6);
		spy.setRight(n2, n3);
		spy.setRight(n4, n6);
		spy.setRight(n6, n7);
		
		a[1] = n1;
		a[2] = n2;
		a[3] = n3;
		a[4] = n4;
		a[5] = n5;
		a[6] = n6;
		a[7] = n7;
		
		r = spy.newInstance(n4, 7, 0, a);
		assertWellFormed(true, r);
	}
	
	public void test240() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String> n2 = spy.newNode("B", 3, n1, null, null);
		Node<String> n3 = spy.newNode("C", 1, null, null, n2);
		Node<String> n4 = spy.newNode("D", 7, n2, null, null);
		Node<String> n5 = spy.newNode("E", 1, null, null, null);
		Node<String> n6 = spy.newNode("F", 3, n5, null, n4);
		Node<String> n7 = spy.newNode("G", 1, null, null, n6);
		Node<String>[] a = makeArray(16);
		spy.setParent(n1, n2);
		spy.setParent(n2, n4);
		spy.setParent(n5, n6);
		spy.setRight(n2, n3);
		spy.setRight(n4, n6);
		spy.setRight(n6, n7);
		
		a[1] = spy.ph();
		a[2] = n1;
		a[3] = spy.ph();
		a[4] = n3;
		a[5] = n2;
		a[6] = spy.ph();
		a[7] = n4;
		a[8] = n5;
		a[9] = n6;
		a[10] = n7;
		
		r = spy.newInstance(n4, 10, 0, a);
		assertWellFormed(false, r);
	}
	
	public void test241() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String> n2 = spy.newNode("B", 3, n1, null, null);
		Node<String> n3 = spy.newNode("C", 1, null, null, n2);
		Node<String> n4 = spy.newNode("D", 7, n2, null, null);
		Node<String> n5 = spy.newNode("E", 1, null, null, null);
		Node<String> n6 = spy.newNode("F", 3, n5, null, n4);
		Node<String> n7 = spy.newNode("G", 1, null, null, n6);
		Node<String>[] a = makeArray(32);
		spy.setParent(n1, n2);
		spy.setParent(n2, n4);
		spy.setParent(n5, n6);
		spy.setRight(n2, n3);
		spy.setRight(n4, n6);
		spy.setRight(n6, n7);
		
		a[1] = spy.ph();
		a[2] = n1;
		a[3] = spy.ph();
		a[4] = n2;
		a[5] = n3;
		a[6] = spy.ph();
		a[7] = n4;
		a[8] = n5;
		a[9] = n6;
		a[10] = n7;
		
		r = spy.newInstance(n4, 10, 0, a);
		assertWellFormed(false, r);
	}
	
	public void test242() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String> n2 = spy.newNode("B", 3, n1, null, null);
		Node<String> n3 = spy.newNode("C", 1, null, null, n2);
		Node<String> n4 = spy.newNode("D", 7, n2, null, null);
		Node<String> n5 = spy.newNode("E", 1, null, null, null);
		Node<String> n6 = spy.newNode("F", 3, n5, null, n4);
		Node<String> n7 = spy.newNode("G", 1, null, null, n6);
		Node<String>[] a = makeArray(32);
		spy.setParent(n1, n2);
		spy.setParent(n2, n4);
		spy.setParent(n5, n6);
		spy.setRight(n2, n3);
		spy.setRight(n4, n6);
		spy.setRight(n6, n7);
		
		a[1] = spy.ph();
		a[2] = n1;
		a[3] = spy.ph();
		a[4] = n3;
		a[5] = n2;
		a[6] = spy.ph();
		a[7] = n4;
		a[8] = n5;
		a[9] = n6;
		a[10] = n7;
		
		r = spy.newInstance(n4, 7, 0, a);
		assertWellFormed(false, r);
	}
	
	public void test243() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String> n2 = spy.newNode("B", 3, n1, null, null);
		Node<String> n3 = spy.newNode("C", 1, null, null, n2);
		Node<String> n4 = spy.newNode("D", 7, n2, null, null);
		Node<String> n5 = spy.newNode("E", 1, null, null, null);
		Node<String> n6 = spy.newNode("F", 3, n5, null, n4);
		Node<String> n7 = spy.newNode("G", 1, null, null, n6);
		Node<String>[] a = makeArray(32);
		spy.setParent(n1, n2);
		spy.setParent(n2, n4);
		spy.setParent(n5, n6);
		spy.setRight(n2, n3);
		spy.setRight(n4, n6);
		spy.setRight(n6, n7);
		
		a[1] = spy.ph();
		a[2] = n1;
		a[3] = spy.ph();
		a[4] = n3;
		a[5] = n2;
		a[6] = spy.ph();
		a[7] = n4;
		a[8] = n5;
		a[9] = n6;
		a[10] = n7;
		
		r = spy.newInstance(n4, 10, 0, a);
		assertWellFormed(true, r);
	}
	
	public void test250() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String> n2 = spy.newNode("A", 1, null, null, null);
		
		Node<String>[] a = makeArray(8);
		a[1] = n1;
		
		r = spy.newInstance(n2, 1, 10, a);
		assertWellFormed(false, r);
	}
	
	public void test251() {
		Node<String> n1 = spy.newNode("A", 1, null, null, null);
		Node<String> n2 = spy.newNode("A", 1, null, null, null);
		
		Node<String>[] a = makeArray(8);
		a[1] = n1;
		a[2] = n2;
		
		r = spy.newInstance(n2, 2, 10, a);
		assertWellFormed(false, r);
	}
	
	public void test252() {
		Node<String> n1 = spy.newNode("A", 2, null, null, null);
		Node<String> n2 = spy.newNode("A", 1, null, null, n1);
		spy.setLeft(n1, n2);
		
		Node<String>[] a = makeArray(8);
		a[1] = n1;
		a[2] = n2;
		
		r = spy.newInstance(n1, 2, 10, a);
		assertWellFormed(false, r);
	}
	
	public void test253() {
		Node<String> n1 = spy.newNode("A", 2, null, null, null);
		Node<String> n2 = spy.newNode("a", 1, null, null, n1);
		spy.setLeft(n1, n2);
		
		Node<String>[] a = makeArray(8);
		a[1] = n1;
		a[2] = n2;
		
		r = spy.newInstance(n1, 2, 10, a);
		assertWellFormed(true, r);
	}
	
	public void test254() {
		Node<String> n1 = spy.newNode("A", 2, null, null, null);
		Node<String> n2 = spy.newNode("a", 1, null, null, n1);
		spy.setLeft(n1, n2);
		
		Node<String>[] a = makeArray(8);
		a[1] = n1;
		a[2] = spy.ph();
		
		r = spy.newInstance(n1, 2, 10, a);
		assertWellFormed(false, r);
	}
	
	public void test260() {
		Node<String> n0 = spy.newNode("A", 1, null, null, null);
		Node<String> n1 = spy.newNode("B", 3, null, null, null);
		Node<String> n2 = spy.newNode("C", 1, null, null, n1);
		Node<String> n3 = spy.newNode("D", 1, null, null, n1);
		
		spy.setLeft(n1, n2);
		spy.setRight(n1, n3);
		
		Node<String>[] a = makeArray(8);
		a[1] = n0;
		a[2] = n1;
		a[3] = n2;
		a[4] = n3;
		
		r = spy.newInstance(n0, 4, 10, a);
		assertWellFormed(false, r);
	}
	
	public void test261() {
		Node<String> n0 = spy.newNode("A", 1, null, null, null);
		Node<String> n1 = spy.newNode("B", 200, null, null, null);
		Node<String> n2 = spy.newNode("C", 198, null, n1, n1);
		Node<String> n3 = spy.newNode("D", 1, null, null, n1);
		
		spy.setLeft(n1, n2);
		spy.setRight(n1, n3);
		spy.setParent(n1, n2);
		
		Node<String>[] a = makeArray(8);
		a[1] = n0;
		a[2] = n1;
		a[3] = n2;
		a[4] = n3;
		
		r = spy.newInstance(n0, 4, 10, a);
		assertWellFormed(false, r);
	}

	
	/// test3xx: tests of nodeRank
	
	public void test300() {
		Node<String> n0 = spy.newNode("A", 1, null, null, null);
		assertEquals(1, spy.nodeRank(n0));
	}
		
	public void test301() {
		Node<String> n0 = spy.newNode("B", 3, null, null, null);
		Node<String> n1 = spy.newNode("A", 1, null, null, n0);
		Node<String> n2 = spy.newNode("C", 1, null, null, n0);
		spy.setLeft(n0, n1);
		spy.setRight(n0, n2);
		assertEquals(1, spy.nodeRank(n1));
	}

	public void test302() {
		Node<String> n0 = spy.newNode("B", 3, null, null, null);
		Node<String> n1 = spy.newNode("A", 1, null, null, n0);
		Node<String> n2 = spy.newNode("C", 1, null, null, n0);
		spy.setLeft(n0, n1);
		spy.setRight(n0, n2);
		assertEquals(2, spy.nodeRank(n0));
	}

	public void test303() {
		Node<String> n0 = spy.newNode("B", 3, null, null, null);
		Node<String> n1 = spy.newNode("A", 1, null, null, n0);
		Node<String> n2 = spy.newNode("C", 1, null, null, n0);
		spy.setLeft(n0, n1);
		spy.setRight(n0, n2);
		assertEquals(3, spy.nodeRank(n2));
	}
	
	public void test304() {
		Node<String> n0 = spy.newNode("A", 1, null, null, null);
		r = spy.newInstance(n0, 1, 0, makeArray(8));
		assertEquals(1, spy.nodeRank(n0));
	}
	
	public void test305() {
		Node<String> n0 = spy.newNode("A", 1, null, null, null);
		Node<String> n1 = spy.newNode("B", 3, n0, null, null);
		Node<String> n2 = spy.newNode("C", 1, null, null, n1);
		spy.setParent(n0, n1);
		spy.setRight(n1, n2);
		
		r = spy.newInstance(n1, 3, 0, makeArray(8));
		assertEquals(1, spy.nodeRank(n0));
	}
	
	public void test306() {
		Node<String> n0 = spy.newNode("A", 1, null, null, null);
		Node<String> n1 = spy.newNode("B", 3, n0, null, null);
		Node<String> n2 = spy.newNode("C", 1, null, null, n1);
		spy.setParent(n0, n1);
		spy.setRight(n1, n2);
		
		r = spy.newInstance(n1, 3, 0, makeArray(8));
		assertEquals(2, spy.nodeRank(n1));
	}
	
	public void test307() {
		Node<String> n0 = spy.newNode("A", 1, null, null, null);
		Node<String> n1 = spy.newNode("B", 3, n0, null, null);
		Node<String> n2 = spy.newNode("C", 1, null, null, n1);
		spy.setParent(n0, n1);
		spy.setRight(n1, n2);
		
		r = spy.newInstance(n1, 3, 0, makeArray(8));
		assertEquals(3, spy.nodeRank(n2));
	}
	
	public void test308() {
		// this tree is invalid, but your code shouldn't notice:
		Node<String> n0 = spy.newNode("A", 2, null, null, null);
		Node<String> n1 = spy.newNode("B", 4, n0, null, null);
		Node<String> n2 = spy.newNode("C", 1, null, null, n1);
		Node<String> n3 = spy.newNode("D", 1, null, null, null);
		
		spy.setParent(n0, n1);
		spy.setParent(n3, n2);
		spy.setRight(n0, n3);
		spy.setRight(n1, n2);
		spy.setRight(n2, n3);
		
		r = spy.newInstance(n1, 3, 0, makeArray(8));
		assertEquals(1, spy.nodeRank(n0));
	}
	
	public void test309() {
		// also an invalid tree
		Node<String> n0 = spy.newNode("A", 2, null, null, null);
		Node<String> n1 = spy.newNode("B", 4, n0, null, null);
		Node<String> n2 = spy.newNode("C", 1, null, null, n1);
		Node<String> n3 = spy.newNode("D", 1, null, null, null);
		
		spy.setParent(n0, n1);
		spy.setParent(n3, n2);
		spy.setRight(n0, n3);
		spy.setRight(n1, n2);
		spy.setRight(n2, n3);
		
		r = spy.newInstance(n1, 3, 0, makeArray(8));
		assertEquals(3, spy.nodeRank(n1));
	}
	
	public void test310() {
		Node<String> n0 = spy.newNode("A", 1, null, null, null);
		Node<String> n1 = spy.newNode("B", 3, n0, null, null);
		Node<String> n2 = spy.newNode("C", 1, null, null, n1);
		Node<String> n3 = spy.newNode("D", 1, null, null, null);
		
		spy.setParent(n0, n1);
		spy.setParent(n3, n2);
		spy.setRight(n0, n3);
		spy.setRight(n1, n2);
		spy.setRight(n2, n3);
		
		r = spy.newInstance(n1, 3, 0, makeArray(8));
		assertEquals(3, spy.nodeRank(n2));
	}
	
	public void test311() {
		Node<String> n0 = spy.newNode("A", 1, null, null, null);
		Node<String> n1 = spy.newNode("B", 3, n0, null, null);
		Node<String> n2 = spy.newNode("C", 1, null, null, n1);
		Node<String> n3 = spy.newNode("D", 1, null, null, null);
		
		spy.setParent(n0, n1);
		spy.setParent(n3, n2);
		spy.setRight(n0, n3);
		spy.setRight(n1, n2);
		spy.setRight(n2, n3);
		
		r = spy.newInstance(n1, 3, 0, makeArray(8));
		assertEquals(4, spy.nodeRank(n3));
	}
	
	public void test312() {
		Node<String> n0 = spy.newNode("A", 1, null, null, null);
		Node<String> n1 = spy.newNode("B", 3, n0, null, null);
		Node<String> n2 = spy.newNode("C", 1, null, null, n1);
		Node<String> n3 = spy.newNode("D", 7, n1, null, null);
		Node<String> n4 = spy.newNode("E", 1, null, null, null);
		Node<String> n5 = spy.newNode("F", 3, n4, null, n3);
		Node<String> n6 = spy.newNode("G", 1, null, null, n5);
		
		spy.setParent(n0, n1);
		spy.setParent(n1, n3);
		spy.setParent(n4, n5);
		spy.setRight(n1, n2);
		spy.setRight(n3, n5);
		spy.setRight(n5, n6);
		
		r = spy.newInstance(n3, 7, 0, makeArray(8));
		assertEquals(1, spy.nodeRank(n0));
	}
	
	public void test313() {
		Node<String> n0 = spy.newNode("A", 1, null, null, null);
		Node<String> n1 = spy.newNode("B", 3, n0, null, null);
		Node<String> n2 = spy.newNode("C", 1, null, null, n1);
		Node<String> n3 = spy.newNode("D", 7, n1, null, null);
		Node<String> n4 = spy.newNode("E", 1, null, null, null);
		Node<String> n5 = spy.newNode("F", 3, n4, null, n3);
		Node<String> n6 = spy.newNode("G", 1, null, null, n5);
		
		spy.setParent(n0, n1);
		spy.setParent(n1, n3);
		spy.setParent(n4, n5);
		spy.setRight(n1, n2);
		spy.setRight(n3, n5);
		spy.setRight(n5, n6);
		
		r = spy.newInstance(n3, 7, 0, makeArray(8));
		assertEquals(2, spy.nodeRank(n1));
		assertEquals(4, spy.nodeRank(n3));
		assertEquals(6, spy.nodeRank(n5));
	}
	
	public void test314() {
		Node<String> n0 = spy.newNode("A", 1, null, null, null);
		Node<String> n1 = spy.newNode("B", 3, n0, null, null);
		Node<String> n2 = spy.newNode("C", 1, null, null, n1);
		Node<String> n3 = spy.newNode("D", 7, n1, null, null);
		Node<String> n4 = spy.newNode("E", 1, null, null, null);
		Node<String> n5 = spy.newNode("F", 3, n4, null, n3);
		Node<String> n6 = spy.newNode("G", 1, null, null, n5);
		
		spy.setParent(n0, n1);
		spy.setParent(n1, n3);
		spy.setParent(n4, n5);
		spy.setRight(n1, n2);
		spy.setRight(n3, n5);
		spy.setRight(n5, n6);
		
		r = spy.newInstance(n3, 7, 0, makeArray(8));
		assertEquals(3, spy.nodeRank(n2));
		assertEquals(5, spy.nodeRank(n4));
		assertEquals(7, spy.nodeRank(n6));
	}

	// The following tests work with invalid trees
	// your code shouldn't care
	
	public void test320() {
		Node<String> n0 = spy.newNode("B", 1002, null, null, null);
		Node<String> n1 = spy.newNode("A", 1000, null, null, n0);
		Node<String> n2 = spy.newNode("C", 1, null, null, n0);
		spy.setLeft(n0, n1);
		spy.setRight(n0, n2);
		spy.setRight(n1, n1);
		assertEquals(1001, spy.nodeRank(n0));
	}
	
	public void test321() {
		Node<String> n0 = spy.newNode("B", 1002, null, null, null);
		Node<String> n1 = spy.newNode("A", 1000, null, null, n0);
		Node<String> n2 = spy.newNode("C", 1, null, null, n0);
		spy.setLeft(n0, n1);
		spy.setRight(n0, n2);
		spy.setRight(n1, n1);
		assertEquals(1002, spy.nodeRank(n2));
	}
	
	public void test322() {
		Node<String> n0 = spy.newNode("B", 1100, null, null, null);
		Node<String> n1 = spy.newNode("A", 1000, null, null, n0);
		Node<String> n2 = spy.newNode("C", 99, null, null, n0);
		Node<String> n3 = spy.newNode("C1", 36, null, null, n2);
		Node<String> n4 = spy.newNode("C2", 62, null, null, n2);
		spy.setLeft(n0, n1);
		spy.setRight(n0, n2);
		spy.setRight(n1, n1);
		spy.setLeft(n2, n3);
		spy.setLeft(n3, n3);
		spy.setRight(n2, n4);
		spy.setRight(n4, n4);
		assertEquals(1038, spy.nodeRank(n2));
	}
	
	public void test323() {
		Node<String> n0 = spy.newNode("B", 100, null, null, null);
		//Node<String> n1 = spy.newNode("A", 1000, null, null, n0);
		Node<String> n2 = spy.newNode("C", 99, null, null, n0);
		Node<String> n3 = spy.newNode("C1", 36, null, null, n2);
		Node<String> n4 = spy.newNode("C2", 62, null, null, n2);
		// spy.setLeft(n0, n1);
		spy.setRight(n0, n2);
		//spy.setRight(n1, n1);
		spy.setLeft(n2, n3);
		spy.setLeft(n3, n3);
		spy.setRight(n2, n4);
		spy.setRight(n4, n4);
		assertEquals(38, spy.nodeRank(n2));
	}

	public void test330() {
		Node<String> nA = spy.newNode("A",  2, null, null, null);
		Node<String> nB = spy.newNode("B",  3, null, null, null);
		Node<String> n9 = spy.newNode("n9", 6, nA, nB, null);
		Node<String> n8 = spy.newNode("n8", 7, n9, null, null);
		Node<String> n7 = spy.newNode("n7", 8, null, n8, null);
		Node<String> nC = spy.newNode("C",  5, null, null, null);
		Node<String> n6 = spy.newNode("n6",14, n7, nC, null);
		Node<String> nD = spy.newNode("D",  7, null, null, null);
		Node<String> n5 = spy.newNode("n5",22, nD, n6, null);
		Node<String> n4 = spy.newNode("n4",23, n5, null, null);
		Node<String> n3 = spy.newNode("n3",24, null, n4, null);
		Node<String> nE = spy.newNode("E", 11, null, null, null);
		Node<String> n2 = spy.newNode("n2",36, n3, nE, null);
		Node<String> nF = spy.newNode("F", 13, null, null, null);
		Node<String> n1 = spy.newNode("n1",50, nF, n2, null);
		Node<String> n0 = spy.newNode("n0",51, null, n1, null);
		spy.setParent(nA, n9);
		spy.setParent(nB, n9);
		spy.setParent(nC, n6);
		spy.setParent(nD, n5);
		spy.setParent(nE, n2);
		spy.setParent(nF, n1);
		spy.setParent(n9, n8);
		spy.setParent(n8, n7);
		spy.setParent(n7, n6);
		spy.setParent(n6, n5);
		spy.setParent(n5, n4);
		spy.setParent(n4, n3);
		spy.setParent(n3, n2);
		spy.setParent(n2, n1);
		spy.setParent(n1, n0);
		assertEquals(1, spy.nodeRank(n0));
	}

	public void test331() {
		Node<String> nA = spy.newNode("A",  2, null, null, null);
		Node<String> nB = spy.newNode("B",  3, null, null, null);
		Node<String> n9 = spy.newNode("n9", 6, nA, nB, null);
		Node<String> n8 = spy.newNode("n8", 7, n9, null, null);
		Node<String> n7 = spy.newNode("n7", 8, null, n8, null);
		Node<String> nC = spy.newNode("C",  5, null, null, null);
		Node<String> n6 = spy.newNode("n6",14, n7, nC, null);
		Node<String> nD = spy.newNode("D",  7, null, null, null);
		Node<String> n5 = spy.newNode("n5",22, nD, n6, null);
		Node<String> n4 = spy.newNode("n4",23, n5, null, null);
		Node<String> n3 = spy.newNode("n3",24, null, n4, null);
		Node<String> nE = spy.newNode("E", 11, null, null, null);
		Node<String> n2 = spy.newNode("n2",36, n3, nE, null);
		Node<String> nF = spy.newNode("F", 13, null, null, null);
		Node<String> n1 = spy.newNode("n1",50, nF, n2, null);
		Node<String> n0 = spy.newNode("n0",51, null, n1, null);
		spy.setParent(nA, n9);
		spy.setParent(nB, n9);
		spy.setParent(nC, n6);
		spy.setParent(nD, n5);
		spy.setParent(nE, n2);
		spy.setParent(nF, n1);
		spy.setParent(n9, n8);
		spy.setParent(n8, n7);
		spy.setParent(n7, n6);
		spy.setParent(n6, n5);
		spy.setParent(n5, n4);
		spy.setParent(n4, n3);
		spy.setParent(n3, n2);
		spy.setParent(n2, n1);
		spy.setParent(n1, n0);
		assertEquals(15, spy.nodeRank(n1));
	}

	public void test332() {
		Node<String> nA = spy.newNode("A",  2, null, null, null);
		Node<String> nB = spy.newNode("B",  3, null, null, null);
		Node<String> n9 = spy.newNode("n9", 6, nA, nB, null);
		Node<String> n8 = spy.newNode("n8", 7, n9, null, null);
		Node<String> n7 = spy.newNode("n7", 8, null, n8, null);
		Node<String> nC = spy.newNode("C",  5, null, null, null);
		Node<String> n6 = spy.newNode("n6",14, n7, nC, null);
		Node<String> nD = spy.newNode("D",  7, null, null, null);
		Node<String> n5 = spy.newNode("n5",22, nD, n6, null);
		Node<String> n4 = spy.newNode("n4",23, n5, null, null);
		Node<String> n3 = spy.newNode("n3",24, null, n4, null);
		Node<String> nE = spy.newNode("E", 11, null, null, null);
		Node<String> n2 = spy.newNode("n2",36, n3, nE, null);
		Node<String> nF = spy.newNode("F", 13, null, null, null);
		Node<String> n1 = spy.newNode("n1",50, nF, n2, null);
		Node<String> n0 = spy.newNode("n0",51, null, n1, null);
		spy.setParent(nA, n9);
		spy.setParent(nB, n9);
		spy.setParent(nC, n6);
		spy.setParent(nD, n5);
		spy.setParent(nE, n2);
		spy.setParent(nF, n1);
		spy.setParent(n9, n8);
		spy.setParent(n8, n7);
		spy.setParent(n7, n6);
		spy.setParent(n6, n5);
		spy.setParent(n5, n4);
		spy.setParent(n4, n3);
		spy.setParent(n3, n2);
		spy.setParent(n2, n1);
		spy.setParent(n1, n0);
		assertEquals(40, spy.nodeRank(n2));
	}

	public void test333() {
		Node<String> nA = spy.newNode("A",  2, null, null, null);
		Node<String> nB = spy.newNode("B",  3, null, null, null);
		Node<String> n9 = spy.newNode("n9", 6, nA, nB, null);
		Node<String> n8 = spy.newNode("n8", 7, n9, null, null);
		Node<String> n7 = spy.newNode("n7", 8, null, n8, null);
		Node<String> nC = spy.newNode("C",  5, null, null, null);
		Node<String> n6 = spy.newNode("n6",14, n7, nC, null);
		Node<String> nD = spy.newNode("D",  7, null, null, null);
		Node<String> n5 = spy.newNode("n5",22, nD, n6, null);
		Node<String> n4 = spy.newNode("n4",23, n5, null, null);
		Node<String> n3 = spy.newNode("n3",24, null, n4, null);
		Node<String> nE = spy.newNode("E", 11, null, null, null);
		Node<String> n2 = spy.newNode("n2",36, n3, nE, null);
		Node<String> nF = spy.newNode("F", 13, null, null, null);
		Node<String> n1 = spy.newNode("n1",50, nF, n2, null);
		Node<String> n0 = spy.newNode("n0",51, null, n1, null);
		spy.setParent(nA, n9);
		spy.setParent(nB, n9);
		spy.setParent(nC, n6);
		spy.setParent(nD, n5);
		spy.setParent(nE, n2);
		spy.setParent(nF, n1);
		spy.setParent(n9, n8);
		spy.setParent(n8, n7);
		spy.setParent(n7, n6);
		spy.setParent(n6, n5);
		spy.setParent(n5, n4);
		spy.setParent(n4, n3);
		spy.setParent(n3, n2);
		spy.setParent(n2, n1);
		spy.setParent(n1, n0);
		assertEquals(16, spy.nodeRank(n3));
	}

	public void test334() {
		Node<String> nA = spy.newNode("A",  2, null, null, null);
		Node<String> nB = spy.newNode("B",  3, null, null, null);
		Node<String> n9 = spy.newNode("n9", 6, nA, nB, null);
		Node<String> n8 = spy.newNode("n8", 7, n9, null, null);
		Node<String> n7 = spy.newNode("n7", 8, null, n8, null);
		Node<String> nC = spy.newNode("C",  5, null, null, null);
		Node<String> n6 = spy.newNode("n6",14, n7, nC, null);
		Node<String> nD = spy.newNode("D",  7, null, null, null);
		Node<String> n5 = spy.newNode("n5",22, nD, n6, null);
		Node<String> n4 = spy.newNode("n4",23, n5, null, null);
		Node<String> n3 = spy.newNode("n3",24, null, n4, null);
		Node<String> nE = spy.newNode("E", 11, null, null, null);
		Node<String> n2 = spy.newNode("n2",36, n3, nE, null);
		Node<String> nF = spy.newNode("F", 13, null, null, null);
		Node<String> n1 = spy.newNode("n1",50, nF, n2, null);
		Node<String> n0 = spy.newNode("n0",51, null, n1, null);
		spy.setParent(nA, n9);
		spy.setParent(nB, n9);
		spy.setParent(nC, n6);
		spy.setParent(nD, n5);
		spy.setParent(nE, n2);
		spy.setParent(nF, n1);
		spy.setParent(n9, n8);
		spy.setParent(n8, n7);
		spy.setParent(n7, n6);
		spy.setParent(n6, n5);
		spy.setParent(n5, n4);
		spy.setParent(n4, n3);
		spy.setParent(n3, n2);
		spy.setParent(n2, n1);
		spy.setParent(n1, n0);
		assertEquals(39, spy.nodeRank(n4));
	}

	public void test335() {
		Node<String> nA = spy.newNode("A",  2, null, null, null);
		Node<String> nB = spy.newNode("B",  3, null, null, null);
		Node<String> n9 = spy.newNode("n9", 6, nA, nB, null);
		Node<String> n8 = spy.newNode("n8", 7, n9, null, null);
		Node<String> n7 = spy.newNode("n7", 8, null, n8, null);
		Node<String> nC = spy.newNode("C",  5, null, null, null);
		Node<String> n6 = spy.newNode("n6",14, n7, nC, null);
		Node<String> nD = spy.newNode("D",  7, null, null, null);
		Node<String> n5 = spy.newNode("n5",22, nD, n6, null);
		Node<String> n4 = spy.newNode("n4",23, n5, null, null);
		Node<String> n3 = spy.newNode("n3",24, null, n4, null);
		Node<String> nE = spy.newNode("E", 11, null, null, null);
		Node<String> n2 = spy.newNode("n2",36, n3, nE, null);
		Node<String> nF = spy.newNode("F", 13, null, null, null);
		Node<String> n1 = spy.newNode("n1",50, nF, n2, null);
		Node<String> n0 = spy.newNode("n0",51, null, n1, null);
		spy.setParent(nA, n9);
		spy.setParent(nB, n9);
		spy.setParent(nC, n6);
		spy.setParent(nD, n5);
		spy.setParent(nE, n2);
		spy.setParent(nF, n1);
		spy.setParent(n9, n8);
		spy.setParent(n8, n7);
		spy.setParent(n7, n6);
		spy.setParent(n6, n5);
		spy.setParent(n5, n4);
		spy.setParent(n4, n3);
		spy.setParent(n3, n2);
		spy.setParent(n2, n1);
		spy.setParent(n1, n0);
		assertEquals(24, spy.nodeRank(n5));
	}

	public void test336() {
		Node<String> nA = spy.newNode("A",  2, null, null, null);
		Node<String> nB = spy.newNode("B",  3, null, null, null);
		Node<String> n9 = spy.newNode("n9", 6, nA, nB, null);
		Node<String> n8 = spy.newNode("n8", 7, n9, null, null);
		Node<String> n7 = spy.newNode("n7", 8, null, n8, null);
		Node<String> nC = spy.newNode("C",  5, null, null, null);
		Node<String> n6 = spy.newNode("n6",14, n7, nC, null);
		Node<String> nD = spy.newNode("D",  7, null, null, null);
		Node<String> n5 = spy.newNode("n5",22, nD, n6, null);
		Node<String> n4 = spy.newNode("n4",23, n5, null, null);
		Node<String> n3 = spy.newNode("n3",24, null, n4, null);
		Node<String> nE = spy.newNode("E", 11, null, null, null);
		Node<String> n2 = spy.newNode("n2",36, n3, nE, null);
		Node<String> nF = spy.newNode("F", 13, null, null, null);
		Node<String> n1 = spy.newNode("n1",50, nF, n2, null);
		Node<String> n0 = spy.newNode("n0",51, null, n1, null);
		spy.setParent(nA, n9);
		spy.setParent(nB, n9);
		spy.setParent(nC, n6);
		spy.setParent(nD, n5);
		spy.setParent(nE, n2);
		spy.setParent(nF, n1);
		spy.setParent(n9, n8);
		spy.setParent(n8, n7);
		spy.setParent(n7, n6);
		spy.setParent(n6, n5);
		spy.setParent(n5, n4);
		spy.setParent(n4, n3);
		spy.setParent(n3, n2);
		spy.setParent(n2, n1);
		spy.setParent(n1, n0);
		assertEquals(33, spy.nodeRank(n6));
	}

	public void test337() {
		Node<String> nA = spy.newNode("A",  2, null, null, null);
		Node<String> nB = spy.newNode("B",  3, null, null, null);
		Node<String> n9 = spy.newNode("n9", 6, nA, nB, null);
		Node<String> n8 = spy.newNode("n8", 7, n9, null, null);
		Node<String> n7 = spy.newNode("n7", 8, null, n8, null);
		Node<String> nC = spy.newNode("C",  5, null, null, null);
		Node<String> n6 = spy.newNode("n6",14, n7, nC, null);
		Node<String> nD = spy.newNode("D",  7, null, null, null);
		Node<String> n5 = spy.newNode("n5",22, nD, n6, null);
		Node<String> n4 = spy.newNode("n4",23, n5, null, null);
		Node<String> n3 = spy.newNode("n3",24, null, n4, null);
		Node<String> nE = spy.newNode("E", 11, null, null, null);
		Node<String> n2 = spy.newNode("n2",36, n3, nE, null);
		Node<String> nF = spy.newNode("F", 13, null, null, null);
		Node<String> n1 = spy.newNode("n1",50, nF, n2, null);
		Node<String> n0 = spy.newNode("n0",51, null, n1, null);
		spy.setParent(nA, n9);
		spy.setParent(nB, n9);
		spy.setParent(nC, n6);
		spy.setParent(nD, n5);
		spy.setParent(nE, n2);
		spy.setParent(nF, n1);
		spy.setParent(n9, n8);
		spy.setParent(n8, n7);
		spy.setParent(n7, n6);
		spy.setParent(n6, n5);
		spy.setParent(n5, n4);
		spy.setParent(n4, n3);
		spy.setParent(n3, n2);
		spy.setParent(n2, n1);
		spy.setParent(n1, n0);
		assertEquals(25, spy.nodeRank(n7));
	}

	public void test338() {
		Node<String> nA = spy.newNode("A",  2, null, null, null);
		Node<String> nB = spy.newNode("B",  3, null, null, null);
		Node<String> n9 = spy.newNode("n9", 6, nA, nB, null);
		Node<String> n8 = spy.newNode("n8", 7, n9, null, null);
		Node<String> n7 = spy.newNode("n7", 8, null, n8, null);
		Node<String> nC = spy.newNode("C",  5, null, null, null);
		Node<String> n6 = spy.newNode("n6",14, n7, nC, null);
		Node<String> nD = spy.newNode("D",  7, null, null, null);
		Node<String> n5 = spy.newNode("n5",22, nD, n6, null);
		Node<String> n4 = spy.newNode("n4",23, n5, null, null);
		Node<String> n3 = spy.newNode("n3",24, null, n4, null);
		Node<String> nE = spy.newNode("E", 11, null, null, null);
		Node<String> n2 = spy.newNode("n2",36, n3, nE, null);
		Node<String> nF = spy.newNode("F", 13, null, null, null);
		Node<String> n1 = spy.newNode("n1",50, nF, n2, null);
		Node<String> n0 = spy.newNode("n0",51, null, n1, null);
		spy.setParent(nA, n9);
		spy.setParent(nB, n9);
		spy.setParent(nC, n6);
		spy.setParent(nD, n5);
		spy.setParent(nE, n2);
		spy.setParent(nF, n1);
		spy.setParent(n9, n8);
		spy.setParent(n8, n7);
		spy.setParent(n7, n6);
		spy.setParent(n6, n5);
		spy.setParent(n5, n4);
		spy.setParent(n4, n3);
		spy.setParent(n3, n2);
		spy.setParent(n2, n1);
		spy.setParent(n1, n0);
		assertEquals(32, spy.nodeRank(n8));
	}

	public void test339() {
		Node<String> nA = spy.newNode("A",  2, null, null, null);
		Node<String> nB = spy.newNode("B",  3, null, null, null);
		Node<String> n9 = spy.newNode("n9", 6, nA, nB, null);
		Node<String> n8 = spy.newNode("n8", 7, n9, null, null);
		Node<String> n7 = spy.newNode("n7", 8, null, n8, null);
		Node<String> nC = spy.newNode("C",  5, null, null, null);
		Node<String> n6 = spy.newNode("n6",14, n7, nC, null);
		Node<String> nD = spy.newNode("D",  7, null, null, null);
		Node<String> n5 = spy.newNode("n5",22, nD, n6, null);
		Node<String> n4 = spy.newNode("n4",23, n5, null, null);
		Node<String> n3 = spy.newNode("n3",24, null, n4, null);
		Node<String> nE = spy.newNode("E", 11, null, null, null);
		Node<String> n2 = spy.newNode("n2",36, n3, nE, null);
		Node<String> nF = spy.newNode("F", 13, null, null, null);
		Node<String> n1 = spy.newNode("n1",50, nF, n2, null);
		Node<String> n0 = spy.newNode("n0",51, null, n1, null);
		spy.setParent(nA, n9);
		spy.setParent(nB, n9);
		spy.setParent(nC, n6);
		spy.setParent(nD, n5);
		spy.setParent(nE, n2);
		spy.setParent(nF, n1);
		spy.setParent(n9, n8);
		spy.setParent(n8, n7);
		spy.setParent(n7, n6);
		spy.setParent(n6, n5);
		spy.setParent(n5, n4);
		spy.setParent(n4, n3);
		spy.setParent(n3, n2);
		spy.setParent(n2, n1);
		spy.setParent(n1, n0);
		assertEquals(28, spy.nodeRank(n9));
	}
}