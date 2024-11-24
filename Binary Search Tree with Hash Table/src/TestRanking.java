import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Supplier;

import edu.uwm.cs351.Ranking;
import edu.uwm.cs351.util.DefaultEntry;
import junit.framework.TestCase;

public class TestRanking extends TestCase {
	protected <T> void assertException(Class<?> excClass, Runnable f) {
		try {
			f.run();
			assertFalse("Should have thrown an exception, not returned",true);
		} catch (RuntimeException ex) {
			if (!excClass.isInstance(ex)) {
				ex.printStackTrace();
				assertFalse("Wrong kind of exception thrown: "+ ex.getClass().getSimpleName(),true);
			}
		}		
	}

	protected Ranking<String> self;
	protected Set<Map.Entry<Integer, String>> es;
	protected Iterator<Map.Entry<Integer, String>> it;
	protected Map.Entry<Integer, String> e;
	protected Set<Integer> ks;
	protected Collection<String> vs;
	
	@Override // implementation
	protected void setUp() {
		try {
			assert self.size() > 0;
			System.out.println("Assertions must be enabled when runnig these tests");
			System.out.println("Add '-ea' to the VM Arguments box on the argument pane of ");
			System.out.println("the Ron Configuration");
			assertFalse("Must enable assertions", true);
		} catch (NullPointerException ex) {
			assertTrue("correctly enabling assertions", true);
		}
		self = new Ranking<>();
	}
	
	
	/// Locked Tests

	protected String asString(Supplier<?> supp) {
		try {
			return "" + supp.get();
		} catch(RuntimeException ex) {
			return ex.getClass().getSimpleName();
		}
	}
	
	protected String asString(Runnable r) {
		return asString(() -> { r.run(); return "void"; });
	}
	
	
	/// testAn: empty ranking
	
	public void testA0() {
		assertEquals(0, self.size());
	}
	
	public void testA1() {
		assertNull(self.get(1));
	}
	
	public void testA2() {
		assertNull(self.get(0));
	}
	
	public void testA3() {
		assertNull(self.get((Object)"nothing"));
	}
	
	public void testA4() {
		assertTrue(self.isEmpty());
	}
	
	
	/// testBn: testing "put"
	
	public void testB0() {
		assertNull(self.put(1, "A"));
	}
	
	public void testB1() {
		self.put(1, "B");
		assertEquals(1, self.size());
	}
	
	public void testB2() {
		self.put(1, "C");
		assertEquals("C", self.get((Object)1));
	}
	
	public void testB3() {
		self.put(1, "D");
		assertNull(self.get(2));
	}
	
	public void testB4() {
		assertException(IllegalArgumentException.class, () -> self.put(0, "A"));
	}
	
	public void testB5() {
		assertException(IllegalArgumentException.class, () -> self.put(2, "A"));		
	}
	
	public void testB6() {
		self.put(1, null);
		assertNull(self.put(2, "B"));
		assertEquals(2, self.size());
	}
	
	public void testB7() {
		self.put(1, null);
		self.put(2, "B");
		assertEquals(null, self.get(1));
		assertEquals("B", self.get(2));
	}
	
	public void testB8() {
		self.put(1, "A");
		self.put(2, "B");
		assertEquals("A", self.put(1, "C"));
	}
	
	public void testB9() {
		self.put(1, "D");
		self.put(2, "E");
		assertEquals("E", self.put(2, "A"));
		assertFalse(self.isEmpty());
	}
	
	
	/// testCx: testing insert
	
	public void testC0() {
		self.insert(1, "A");
		assertEquals(1, self.size());
	}
	
	public void testC1() {
		self.insert(1, "B");
		assertEquals("B", self.get(1));
	}
	
	public void testC2() {
		self.insert(1, "C");
		self.insert(1, null);
		assertEquals(2, self.size());
	}
	
	public void testC3() {
		self.insert(1, null);
		self.insert(1, "D");
		assertEquals("D", self.get(1));
	}
	
	public void testC4() {
		self.insert(1, "B");
		self.insert(1, "C");
		assertEquals("B", self.get(2));
	}
	
	public void testC5() {
		self.insert(1, "A");
		self.insert(2, "D");
		assertEquals("D", self.get(2));
	}
	
	public void testC6() {
		assertException(IllegalArgumentException.class, () -> self.insert(2, "A"));
	}
	
	public void testC7() {
		self.insert(1, "A");
		assertException(IllegalArgumentException.class, () -> self.insert(3, null));
	}
	
	public void testC8() {
		self.insert(1, "A");
		self.insert(2, "B");
		self.insert(2, "C");
		assertEquals("B", self.get(3));
	}
	
	public void testC9() {
		self.insert(1, "A");
		self.insert(2, "B");
		self.insert(1, "C");
		self.insert(2, "D");
		assertEquals("B", self.get(4));
	}
	
	
	/// testD: insert and put intermixed
	
	public void testD0() {
		self.insert(1, "A");
		assertEquals("A", self.put(1, "B"));
		self.insert(1, "C");
		assertEquals("B", self.put(2, "D"));
	}
	
	public void testD1() {
		self.insert(1, "A");
		self.insert(1, "B");
		assertNull(self.put(3, "C"));
		assertEquals("B", self.put(1, "D"));
	}
	
	public void testD2() {
		self.put(1, "A");
		self.put(2, "B");
		self.insert(1, "C");
		self.insert(2, "D");
		self.insert(4, "E");
		assertEquals("C", self.get(1));
		assertEquals("D", self.get(2));
		assertEquals("A", self.get(3));
		assertEquals("E", self.get(4));
		assertEquals("B", self.get(5));
	}
	
	public void testD4() {
		self.put(1, "A");
		self.put(2, "B");
		self.insert(1, "C");
		self.insert(2, "D");
		self.insert(4, "E");
		assertEquals("C", self.put(1, "F"));	
	}
	
	public void testD5() {
		self.put(1, "A");
		self.put(2, "B");
		self.insert(1, "C");
		self.insert(2, "D");
		self.insert(4, "E");
		assertEquals("D", self.put(2, "G"));	
	}
	
	public void testD6() {
		self.put(1, "A");
		self.put(2, "B");
		self.insert(1, "C");
		self.insert(2, "D");
		self.insert(4, "E");
		assertEquals("A", self.put(3, "H"));		
	}
	
	public void testD7() {
		self.put(1, "A");
		self.put(2, "B");
		self.insert(1, "C");
		self.insert(2, "D");
		self.insert(4, "E");
		assertEquals("E", self.put(4, null));
		assertEquals(5, self.size());
	}
	
	public void testD8() {
		self.put(1, "A");
		self.put(2, "B");
		self.insert(1, "C");
		self.insert(2, "D");
		self.insert(4, "E");
		assertEquals("B", self.put(5, "H"));		
	}
	
	public void testD9() {
		self.put(1, "A");
		self.put(2, "B");
		self.insert(1, "C");
		self.insert(2, "D");
		self.insert(4, "E");
		assertEquals("E", self.put(4, "F"));
		assertEquals("F", self.get(4));		
	}

	
	/// testE: entry set / size / isEmpty / keySet / values
	
	public void testE0() {
		es = self.entrySet();
		assertEquals(0, es.size());
	}
	
	public void testE1() {
		es = self.entrySet();
		assertTrue(es.isEmpty());
	}
	
	public void testE2() {
		self.put(1, "A");
		assertEquals(1, self.entrySet().size());
	}
	
	public void testE3() {
		es = self.entrySet();
		self.insert(1, "B");
		assertEquals(1, es.size());
	}
	
	public void testE4() {
		es = self.entrySet();
		self.insert(1, "A");
		self.put(2, "B");
		assertFalse(es.isEmpty());
	}
	
	public void testE5() {
		self.insert(1, "D");;
		es = self.entrySet();
		self.insert(2, "E");
		self.put(3, "F");
		assertEquals(3, es.size());
	}
	
	public void testE6() {
		es = self.entrySet();
		self.insert(1, "G");
		self.put(2, "H");
		assertSame(es, self.entrySet());
	}
	
	public void testE7() {
		es = self.entrySet();
		assertException(UnsupportedOperationException.class, () -> es.add(new DefaultEntry<>(1, "A")));
	}
	
	public void testE8() {
		ks = self.keySet();
		self.put(1, "A");
		self.insert(1, "B");
		assertEquals(2, ks.size());
		assertSame(ks, self.keySet());
		assertException(UnsupportedOperationException.class, () -> ks.add(3));
	}
	
	public void testE9() {
		vs = self.values();
		self.put(1, "B");
		self.insert(1, "A");
		self.put(3, "C");
		assertEquals(3, vs.size());
		assertSame(vs, self.values());
		assertException(UnsupportedOperationException.class, () -> vs.add("A"));
	}
	
	
	/// testFx: iterator hasNext/Next
	
	public void testF0() {
		es = self.entrySet();
		it = es.iterator();
		assertFalse(it.hasNext());
	}
	
	public void testF1() {
		self.put(1, "A");
		it = self.entrySet().iterator();
		assertTrue(it.hasNext());
	}
	
	public void testF2() {
		es = self.entrySet();
		self.insert(1, "B");
		it = es.iterator();
		assertEquals(new DefaultEntry<>(1,"B"), it.next());
	}
	
	public void testF3() {
		es = self.entrySet();
		it = es.iterator();
		assertException(NoSuchElementException.class, () -> it.next());
	}
	
	public void testF4() {
		es = self.entrySet();
		self.put(1, "C");
		self.insert(2, "D");
		it = es.iterator();
		assertEquals(new DefaultEntry<>(1,"C"), it.next());
		assertEquals(new DefaultEntry<>(2,"D"), it.next());
	}
	
	public void testF5() {
		self.put(1, "J");
		self.insert(1, "K");
		self.insert(3, "L");
		it = self.entrySet().iterator();
		assertEquals(new DefaultEntry<>(1,"K"), it.next());
		assertEquals(new DefaultEntry<>(2,"J"), it.next());
		assertEquals(new DefaultEntry<>(3,"L"), it.next());
	}
	
	public void testF6() {
		es = self.entrySet();
		self.put(1, "M");
		it = es.iterator();
		it.next();
		assertException(NoSuchElementException.class, () -> it.next());
	}
	
	public void testF7() {
		es = self.entrySet();
		Iterator<Map.Entry<Integer, String>> other;
		self.put(1, "A");
		self.put(2, "B");
		self.insert(1, "Z");
		it = es.iterator();
		other = es.iterator();
		assertEquals(new DefaultEntry<>(1,"Z"), it.next());
		assertEquals("1=Z", other.next().toString());
		assertEquals(new DefaultEntry<>(2,"A"), it.next());
		assertEquals("2=A", other.next().toString());
		assertEquals("3=B", other.next().toString());
		assertTrue(it.hasNext());
	}
	
	public void testF9() {
		self.put(1, "A");
		self.put(2, "B");
		self.insert(1, "C");
		self.insert(2, "D");
		self.insert(4, "E");
		it = self.entrySet().iterator();
		assertEquals(new DefaultEntry<>(1,"C"), it.next());
		assertEquals(new DefaultEntry<>(2,"D"), it.next());
		assertEquals(new DefaultEntry<>(3,"A"), it.next());
		assertEquals(new DefaultEntry<>(4,"E"), it.next());
		assertEquals(new DefaultEntry<>(5,"B"), it.next());
		assertException(NoSuchElementException.class, () -> it.next());
	}
	
	
	/// testGx: entry to String
	
	public void testG0() {
		self.put(1, "A");
		assertEquals("1=A", self.entrySet().iterator().next().toString());
	}
	
	public void testG1() {
		self.put(1, "A");
		self.insert(1, "B");
		self.put(3, "C");
		it = self.entrySet().iterator();
		it.next(); // skip
		assertEquals("2=A", it.next().toString());
	}
	
	
	/// testHx: entry hashcode
	
	public void testH0() {
		self.put(1, "A");
		e = self.entrySet().iterator().next();
		int h0 = new DefaultEntry<>(1,"A").hashCode();
		assertEquals(h0, e.hashCode());
	}

	public void testH1() {
		self.put(1, null);
		e = self.entrySet().iterator().next();
		int h0 = new DefaultEntry<>(1,null).hashCode();
		assertEquals(h0, e.hashCode());
	}
	
	public void testH2() {
		self.put(1, "Aa");
		e = self.entrySet().iterator().next();
		int h0 = new DefaultEntry<>(1,"BB").hashCode();
		assertEquals(h0, e.hashCode());
	}

	
	/// testIx: entry equals (with strings with equal hashcode: Aa BB)
	
	public void testI0() {
		self.put(1, "A");
		self.insert(1, "BB");
		it = self.entrySet().iterator();
		e = it.next();
		assertTrue(e.equals(new DefaultEntry<>(1,"BB")));
	}

	public void testI1() {
		self.put(1, "A");
		self.insert(1, "BB");
		it = self.entrySet().iterator();
		e = it.next();
		assertFalse(e.equals(new DefaultEntry<>(1,"A")));
		assertFalse(e.equals(new DefaultEntry<>(2,"BB")));
	}
	
	public void testI2() {
		self.put(1, "A");
		self.insert(1, "BB");
		it = self.entrySet().iterator();
		e = it.next();
		assertFalse(e.equals((Object)"1=BB"));
	}
	
	public void testI3() {
		self.put(1, "A");
		self.insert(1, "BB");
		it = self.entrySet().iterator();
		e = it.next();
		assertFalse(e.equals(new DefaultEntry<>("1","A")));
	}
	
	public void testI4() {
		self.put(1, "A");
		self.insert(1, "BB");
		it = self.entrySet().iterator();
		e = it.next();
		assertFalse(e.equals(new DefaultEntry<>(1,"Aa")));
	}
	
	public void testI5() {
		self.put(1, "A");
		self.insert(1, "BB");
		it = self.entrySet().iterator();
		e = it.next();
		assertFalse(e.equals(null));
	}
	
	public void testI6() {
		self.put(1, "A");
		self.insert(1, "BB");
		it = self.entrySet().iterator();
		e = it.next();
		TreeMap<Integer,String> map = new TreeMap<>();
		map.put(1,"BB");
		assertTrue(e.equals(map.entrySet().iterator().next()));
	}
	
	public void testI7() {
		self.put(1, null);
		self.insert(1, "BB");
		it = self.entrySet().iterator();
		it.next(); // skip
		e = it.next();
		assertTrue(e.equals(new DefaultEntry<>(2,null)));
	}
	
	
	/// testJx: entry setValue
	
	public void testJ0() {
		self.put(1, "A");
		self.insert(1, "BB");
		it = self.entrySet().iterator();
		e = it.next();
		assertEquals("BB", e.setValue("C"));
	}
	
	public void testJ1() {
		self.put(1, "A");
		self.insert(1, "BB");
		it = self.entrySet().iterator();
		it.next();
		e = it.next();
		assertEquals("A", e.setValue("C"));
	}
	
	public void testJ2() {
		self.put(1, "A");
		self.insert(1, "BB");
		it = self.entrySet().iterator();
		e = it.next();
		e.setValue("D");
		assertEquals("D", e.getValue());
	}
	
	public void testJ3() {
		self.put(1, "A");
		self.insert(1, "BB");
		it = self.entrySet().iterator();
		it.next();
		e = it.next();
		e.setValue("Aa");
		assertEquals(new DefaultEntry<>(2,"Aa"),e);
	}
	
	public void testJ4() {
		self.put(1, "A");
		self.insert(1, "BB");
		it = self.entrySet().iterator();
		e = it.next();
		e.setValue("D");
		assertEquals("D", self.get(1));
	}
	
	public void testJ5() {
		self.put(1, "A");
		self.insert(1, "BB");
		it = self.entrySet().iterator();
		it.next();
		e = it.next();
		e.setValue("Aa");
		assertEquals("Aa", self.get(2));
	}
	
	public void testJ6() {
		self.put(1, "A");
		self.insert(1, null);
		it = self.entrySet().iterator();
		e = it.next();
		assertNull(e.setValue("D"));
		assertEquals("D", self.get(1));
	}
	
	
	/// testKx: test CME
	
	public void testK0() {
		es = self.entrySet();
		it = es.iterator();
		self.put(1, "A");
		assertException(ConcurrentModificationException.class, () -> it.hasNext());
	}
	
	public void testK1() {
		es = self.entrySet();
		self.put(1, "A");
		it = es.iterator();
		self.put(1, "B");
		assertEquals(new DefaultEntry<>(1,"B"), it.next());
	}
	
	public void testK2() {
		es = self.entrySet();
		self.put(1, "A");
		it = es.iterator();
		self.insert(1, "B");
		assertException(ConcurrentModificationException.class, () -> it.next());
	}
	
	public void testK3() {
		es = self.entrySet();
		self.put(1, "A");
		it = es.iterator();
		self.put(2, "B");
		assertException(ConcurrentModificationException.class, () -> it.hasNext());
	}
	
	public void testK4() {
		es = self.entrySet();
		self.put(1, "B");
		self.insert(1, "A");
		self.put(3, "C");
		it = es.iterator();
		it.next();
		self.put(2, "D");
		assertEquals(new DefaultEntry<>(2,"D"), it.next());
	}
	
	public void testK5() {
		es = self.entrySet();
		self.put(1, "B");
		self.insert(1, "A");
		self.put(3, "C");
		it = es.iterator();
		it.next();
		self.put(3, "E");
		assertEquals(new DefaultEntry<>(2,"B"), it.next());
	}
	
	public void testK6() {
		es = self.entrySet();
		self.put(1, "B");
		self.insert(1, "A");
		self.put(3, "C");
		it = es.iterator();
		it.next();
		self.insert(3, "E");
		assertException(ConcurrentModificationException.class, () -> it.next());
	}
	
	public void testK7() {
		es = self.entrySet();
		self.put(1, "B");
		self.insert(1, "A");
		self.put(3, "C");
		it = es.iterator();
		it.next();
		self.put(4, "F");
		assertException(ConcurrentModificationException.class, () -> it.next());
	}
	
	public void testK8() {
		es = self.entrySet();
		self.put(1, "B");
		self.insert(1, "A");
		self.put(3, "C");
		it = es.iterator();
		it.next();
		self.insert(1, "Z");
		assertException(ConcurrentModificationException.class, () -> it.next());		
	}
	
	public void testK9() {
		es = self.entrySet();
		self.put(1, "B");
		self.insert(1, "A");
		self.put(3, "C");
		it = es.iterator();
		it.next();
		assertException(IllegalArgumentException.class, () -> self.insert(0, "Z"));
		assertEquals(new DefaultEntry<>(2,"B"), it.next());
	}
	
	
	/// testLx: containsKey
	
	public void testL0() {
		assertFalse(self.containsKey(1));
	}
	
	public void testL1() {
		self.put(1, "A");
		assertTrue(self.containsKey(1));
	}
	
	public void testL2() {
		self.put(1, "B");
		assertFalse(self.containsKey((Object)"1"));
	}
	
	public void testL3() {
		self.put(1, "C");
		assertFalse(self.containsKey(0));
		assertFalse(self.containsKey(2));
	}
	
	public void testL4() {
		self.put(1, "D");
		assertFalse(self.containsKey(null));
	}
	
	public void testL5() {
		self.put(1, "E");
		self.insert(1, "F");
		assertTrue(self.containsKey(2));
	}
	
	public void testL6() {
		self.put(1, "A");
		self.put(2, "B");
		self.insert(1, "C");
		self.insert(2, "D");
		self.insert(4, "E");
		assertTrue(self.containsKey(5));
		assertFalse(self.containsKey(6));
	}
	
	
	/// testMx: containsValue
	
	public void testM0() {
		assertFalse(self.containsValue(null));
	}
	
	public void testM1() {
		self.put(1, null);
		assertTrue(self.containsValue(null));
	}
	
	public void testM2() {
		self.put(1, "A");
		assertFalse(self.containsValue(null));
	}
	
	public void testM3() {
		self.put(1, "B");
		assertTrue(self.containsValue("B"));
	}
	
	public void testM4() {
		self.put(1, "C");
		assertFalse(self.containsValue("B"));
	}
	
	public void testM5() {
		self.put(1, "D");
		self.put(2, "E");
		assertTrue(self.containsValue("E"));
	}
	
	public void testM6() {
		self.put(1, "F");
		self.insert(1, "G");
		assertTrue(self.containsValue("G"));
	}
	
	public void testM7() {
		self.put(1, "B");
		self.insert(1, "Aa");
		self.insert(3, "CCC");
		assertFalse(self.containsValue("BB"));
	}
	
	public void testM8() {
		self.put(1, "A");
		self.put(2, "I");
		self.remove(1);
		assertFalse(self.containsValue("A"));
	}
	
	public void testM9() {
		self.put(1, null);
		self.put(2, "H");
		self.remove(1);
		assertFalse(self.containsValue(null));
	}
	
	
	/// testNx: entry set contains
	
	public void testN0() {
		es = self.entrySet();
		assertFalse(es.contains(new DefaultEntry<>(1,"A")));
	}
	
	public void testN1() {
		es = self.entrySet();
		self.put(1, "A");
		assertTrue(es.contains(new DefaultEntry<>(1,"A")));
	}
	
	public void testN2() {
		es = self.entrySet();
		self.put(1, "A");
		assertFalse(es.contains(new DefaultEntry<>("1","A")));
	}
	
	public void testN3() {
		es = self.entrySet();
		self.put(1, null);
		assertTrue(es.contains(new DefaultEntry<>(1, null)));
		assertFalse(self.isEmpty());
	}
	
	public void testN4() {
		es = self.entrySet();
		self.put(1, "Aa");
		self.put(2, new String("B"));
		self.insert(1, "a");
		assertTrue(es.contains(new DefaultEntry<>(3,"B")));
	}
	
	public void testN5() {
		es = self.entrySet();
		self.put(1, "Aa");
		self.put(2, "B");
		self.insert(1, "a");
		assertFalse(es.contains(new DefaultEntry<>(2,"BB")));
	}
	
	public void testN6() {
		es = self.entrySet();
		self.put(1, "B");
		self.insert(1, "A");
		self.put(3, "C");
		assertFalse(es.contains(new DefaultEntry<>(null,null)));
	}
	
	public void testN7() {
		es = self.entrySet();
		self.put(1, "B");
		self.insert(1, "A");
		self.put(3, "C");
		assertFalse(es.contains(null));
	}
	
	public void testN8() {
		es = self.entrySet();
		self.put(1, "B");
		self.insert(1, "A");
		self.put(3, "C");
		assertFalse(es.contains((Object)"2=B"));
	}
	
	public void testN9() {
		TreeMap<Integer,String> map = new TreeMap<>();
		map.put(2,new String("B"));
		e = map.entrySet().iterator().next();
		es = self.entrySet();
		self.put(1,"B");
		self.insert(1, "A");
		self.insert(3, "C");
		assertTrue(es.contains(e));
		assertEquals(3, self.size());
	}
	
	
	/// testOx: keySet contains
	
	public void testO0() {
		ks = self.keySet();
		assertFalse(ks.contains(1));
	}
	
	public void testO1() {
		ks = self.keySet();
		self.put(1, "A");
		assertTrue(ks.contains(1));
	}
	
	public void testO2() {
		ks = self.keySet();
		self.put(1, "B");
		assertFalse(ks.contains(2));
	}
	
	public void testO3() {
		ks = self.keySet();
		self.put(1, "C");
		assertFalse(ks.contains(new Object()));
	}
	
	public void testO4() {
		ks = self.keySet();
		self.put(1, "B");
		self.insert(1, "A");
		assertTrue(ks.contains(2));
	}
	
	public void testO5() {
		ks = self.keySet();
		self.put(1, "B");
		self.insert(1,"A");
		assertFalse(ks.contains(0));
	}
	
	public void testO6() {
		ks = self.keySet();
		self.put(1, "C");
		self.insert(1, "A");
		self.insert(2, "B");
		self.put(4, "E");
		self.insert(4, "D");
		assertTrue(ks.contains(5));
	}
	
	public void testO7() {
		ks = self.keySet();
		self.put(1, "C");
		self.insert(1, "A");
		self.insert(2, "B");
		self.put(4, "E");
		self.insert(4, "D");
		assertTrue(ks.contains(1));
	}
	
	public void testO8() {
		ks = self.keySet();
		self.put(1, "C");
		self.insert(1, "A");
		self.insert(2, "B");
		self.put(4, "E");
		self.insert(4, "D");
		assertFalse(ks.contains(null));
	}
	
	public void testO9() {
		ks = self.keySet();
		self.put(1, "C");
		self.insert(1, "A");
		self.insert(2, "B");
		self.put(4, "E");
		self.insert(4, "D");
		assertFalse(ks.contains((Object)Double.valueOf(2.5)));
	}
	
	
	/// testPx: values contains
	
	public void testP0() {
		vs = self.values();
		assertFalse(vs.contains(null));
	}
	
	public void testP1() {
		vs = self.values();
		self.put(1, null);
		assertTrue(vs.contains(null));
	}
	
	public void testP2() {
		vs = self.values();
		self.put(1, "A");
		assertFalse(vs.contains(null));
	}
	
	public void testP3() {
		vs = self.values();
		self.put(1, "B");
		assertTrue(vs.contains("B"));
	}
	
	public void testP4() {
		vs = self.values();
		self.put(1, "C");
		assertFalse(vs.contains("B"));
	}
	
	public void testP5() {
		vs = self.values();
		self.put(1, "D");
		self.put(2, "E");
		assertTrue(vs.contains("E"));
	}
	
	public void testP6() {
		vs = self.values();
		self.put(1, "F");
		self.insert(1, "G");
		assertTrue(vs.contains("G"));
	}
	
	public void testP7() {
		vs = self.values();
		self.put(1, "B");
		self.insert(1, "Aa");
		self.insert(3, "CCC");
		assertFalse(vs.contains("BB"));
	}

	
	/// testQx: iterator remove
	
	public void testQ0() {
		it = self.entrySet().iterator();
		assertException(IllegalStateException.class, () -> it.remove());
	}
	
	public void testQ1() {
		self.put(1, "A");
		it = self.entrySet().iterator();
		assertException(IllegalStateException.class, () -> it.remove());		
	}
	
	public void testQ2() {
		self.put(1, "B");
		it = self.entrySet().iterator();
		it.next();
		it.remove();
		assertTrue(self.isEmpty());
	}
	
	public void testQ3() {
		es = self.entrySet();
		self.put(1, "C");
		self.put(2, "D");
		it = es.iterator();
		it.next();
		it.remove();
		assertEquals(new DefaultEntry<>(1,"D"), it.next());
	}
	
	public void testQ4() {
		es = self.entrySet();
		self.put(1, "E");
		self.insert(1, "F");
		it = es.iterator();
		it.next();
		it.remove();
		assertEquals(new DefaultEntry<>(1,"E"), it.next());
	}
	
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
	
	public void testQ6() {
		es = self.entrySet();
		self.put(1, "E");
		self.insert(1, "D");
		self.insert(3, "F");
		it = es.iterator();
		it.next();
		it.next();
		self.put(3, "G");
		it.remove();
		assertEquals(new DefaultEntry<>(2,"G"), it.next());
	}
	
	public void testQ7() {
		es = self.entrySet();
		self.put(1, "E");
		self.insert(1, "D");
		self.insert(3, "F");
		it = es.iterator();
		it.next();
		it.next();
		self.put(4, "G");
		assertException(ConcurrentModificationException.class, () -> it.remove());
	}
	
	public void testQ8() {
		es = self.entrySet();
		self.put(1, "K");
		self.insert(1, "J");
		self.insert(3, "L");
		Iterator<Map.Entry<Integer, String>> local = es.iterator();
		it = es.iterator();
		it.next();
		it.remove();
		assertException(ConcurrentModificationException.class, () -> local.hasNext());
	}
	
	public void testQ9() {
		self.put(1, "A");
		self.put(2, "B");
		self.insert(1, "C");
		self.insert(2, "D");
		self.insert(4, "E");
		it = self.entrySet().iterator();
		it.next();
		it.next();
		it.remove();
		it.next();
		it.next();
		it.remove();
		assertEquals(new DefaultEntry<>(3,"B"), it.next());
		assertEquals("C", self.get(1));
	}
	
	
	/// testRx: ranking remove
	
	public void testR0() {
		assertNull(self.remove(1));
	}
	
	public void testR1() {
		self.put(1, "A");
		assertEquals("A", self.remove(1));
	}
	
	public void testR2() {
		self.put(1, "B");
		assertNull(self.remove(0));
		assertNull(self.remove(2));
	}
	
	public void testR3() {
		self.put(1, "B");
		assertNull(self.remove((Object)"1"));
	}
	
	public void testR4() {
		self.put(1, "BB");
		self.insert(1, "A");
		self.put(3, "C");
		assertNull(self.remove(null));
	}
	
	public void testR5() {
		self.put(1, "BB");
		self.insert(1, "A");
		self.put(3, "C");
		assertEquals("BB", self.remove(2));
	}
	
	public void testR6() {
		self.put(1, null);
		self.insert(1, "null");
		self.insert(3, "NULL");
		assertNull(self.remove(2));
		assertEquals(2, self.size());
	}
	
	public void testR7() {
		self.put(1, "A");
		self.put(2, "B");
		self.insert(1, "C");
		self.insert(2, "D");
		self.insert(4, "E");
		self.remove(1);
		self.remove(2);
		assertEquals("B",self.remove(3));
	}

	public void testR8() {
		self.put(1, "A");
		self.put(2, "B");
		self.insert(1, "C");
		self.insert(2, "D");
		self.insert(4, "E");
		it = self.entrySet().iterator();
		self.remove(4);
		assertException(ConcurrentModificationException.class, () -> it.next());
	}
	
	public void testR9() {
		self.put(1, "A");
		self.put(2, "B");
		self.insert(1, "C");
		self.insert(2, "D");
		self.insert(4, "E");
		it = self.entrySet().iterator();
		self.remove(6);
		assertEquals(new DefaultEntry<>(1,"C"), it.next());
	}
	
	
	/// testSx: entry set remove
	
	public void testS0() {
		es = self.entrySet();
		assertFalse(es.remove(new DefaultEntry<>(1,"A")));
	}
	
	public void testS1() {
		es = self.entrySet();
		self.put(1, "A");
		assertTrue(es.remove(new DefaultEntry<>(1,"A")));
		assertTrue(self.isEmpty());
	}
	
	public void testS2() {
		es = self.entrySet();
		self.put(1, "A");
		assertFalse(es.remove(new DefaultEntry<>("1","A")));
		assertFalse(self.isEmpty());
	}
	
	public void testS3() {
		es = self.entrySet();
		self.put(1, null);
		assertTrue(es.remove(new DefaultEntry<>(1, null)));
		assertTrue(self.isEmpty());
	}
	
	public void testS4() {
		es = self.entrySet();
		self.put(1, "Aa");
		self.put(2, new String("B"));
		self.insert(1, "a");
		assertTrue(es.remove(new DefaultEntry<>(3,"B")));
		assertEquals(2, self.size());
	}
	
	public void testS5() {
		es = self.entrySet();
		self.put(1, "Aa");
		self.put(2, "B");
		self.insert(1, "a");
		assertFalse(es.remove(new DefaultEntry<>(2,"BB")));
		assertEquals("Aa", self.get(2));
	}
	
	public void testS6() {
		es = self.entrySet();
		self.put(1, "B");
		self.insert(1, "A");
		self.put(3, "C");
		assertFalse(es.remove(new DefaultEntry<>(null,null)));
	}
	
	public void testS7() {
		es = self.entrySet();
		self.put(1, "B");
		self.insert(1, "A");
		self.put(3, "C");
		assertFalse(es.remove(null));
	}
	
	public void testS8() {
		es = self.entrySet();
		self.put(1, "B");
		self.insert(1, "A");
		self.put(3, "C");
		assertFalse(es.remove((Object)"2=B"));
		assertEquals(3, es.size());
	}
	
	public void testS9() {
		TreeMap<Integer,String> map = new TreeMap<>();
		map.put(2,new String("B"));
		e = map.entrySet().iterator().next();
		es = self.entrySet();
		self.put(1,"B");
		self.insert(1, "A");
		self.insert(3, "C");
		assertTrue(es.remove(e));
		assertEquals("C", self.get(2));
	}
	
	
	/// testTx: keySet remove
	
	public void testT0() {
		ks = self.keySet();
		assertFalse(ks.remove(1));
	}
	
	public void testT1() {
		ks = self.keySet();
		self.put(1, "A");
		assertTrue(ks.remove(1));
		assertTrue(self.isEmpty());
	}
	
	public void testT2() {
		ks = self.keySet();
		self.put(1, "B");
		assertFalse(ks.remove(2));
		assertFalse(self.isEmpty());
	}
	
	public void testT3() {
		ks = self.keySet();
		self.put(1, "C");
		self.put(2, "D");
		assertTrue(ks.remove(1));
		assertEquals("D", self.get(1));
	}
	
	public void testT4() {
		ks = self.keySet();
		self.put(1, "E");
		self.insert(1, "D");
		assertTrue(ks.remove(2));
		assertEquals(1, self.size());
	}
	
	public void testT5() {
		ks = self.keySet();
		self.put(1, "B");
		self.insert(1, "A");
		self.put(3, "C");
		assertTrue(ks.remove(2));
		assertTrue(ks.remove(2));
		assertEquals(1, self.size());
	}
	
	public void testT6() {
		ks = self.keySet();
		self.put(1, "B");
		self.insert(1, "A");
		self.put(3, "C");
		assertFalse(ks.remove(null));
	}
	
	public void testT7() {
		ks = self.keySet();
		self.put(1, "B");
		self.insert(1, "A");
		self.put(3, "C");
		assertFalse(ks.remove((Object)"1"));
	}
	
	public void testT8() {
		ks = self.keySet();
		self.put(1, "B");
		self.insert(1, "A");
		self.put(3, "C");
		assertFalse(ks.remove(0));
	}
	
	
	/// testUx: values remove
	
	public void testU0() {
		assertFalse(self.values().remove(null));
	}
	
	public void testU1() {
		vs = self.values();
		self.put(1, "A");
		assertTrue(vs.remove("A"));
		assertTrue(self.isEmpty());
	}
	
	public void testU2() {
		vs = self.values();
		self.put(1, "B");
		assertFalse(vs.remove(null));
		assertFalse(self.isEmpty());
	}
	
	public void testU3() {
		vs = self.values();
		self.put(1, "BB");
		assertFalse(vs.remove("Aa"));
		assertEquals("BB", self.get(1));
	}
	
	public void testU4() {
		vs = self.values();
		self.put(1, "C");
		self.put(2, "D");
		assertTrue(vs.remove("C"));
		assertEquals("D", self.get(1));
	}
	
	public void testU5() {
		vs = self.values();
		self.put(1, "2");
		self.insert(1, "1");
		assertFalse(vs.remove((Object)1));
	}
	
	public void testU6() {
		vs = self.values();
		self.put(1, "B");
		self.put(2, "C");
		self.insert(1, "A");
		assertTrue(vs.remove((Object)"C"));
	}
	
	public void testU7() {
		vs = self.values();
		self.put(1, "A");
		self.insert(1, null);
		self.put(3, "null");
		assertTrue(vs.remove(null));
		assertEquals("null", self.get(2));
	}
	
	
	/// testVx: tests of clear
	
	public void testV0() {
		es = self.entrySet();
		it = es.iterator();
		self.clear();
		assertFalse(it.hasNext());
	}
	
	public void testV1() {
		self.put(1, "A");
		es = self.entrySet();
		it = es.iterator();
		self.clear();
		assertException(ConcurrentModificationException.class, () -> it.next());
	}
	
	public void testV2() {
		self.put(1, "B");
		self.clear();
		assertTrue(self.isEmpty());
	}
	
	public void testV3() {
		self.put(1, "C");
		self.insert(1, "A");
		self.entrySet().clear();
		assertNull(self.get(1));
	}
	
	public void testV4() {
		self.put(1, "B");
		self.insert(1, "A");
		self.put(3, "C");
		self.keySet().clear();
		assertEquals(0, self.entrySet().size());
	}
	
	public void testV5() {
		self.put(1, "E");
		self.insert(1, "C");
		self.insert(2, "D");
		self.values().clear();
		assertTrue(self.keySet().isEmpty());
	}
	
	public void testV6() {
		self.put(1, "Z");
		self.insert(1, "Y");
		self.insert(1, "X");
		it = self.entrySet().iterator();
		self.values().clear();
		assertException(ConcurrentModificationException.class, () -> it.next());
		it = self.entrySet().iterator();
		self.values().clear();
		assertFalse(it.hasNext());
	}
	
	
	/// testWx: keySet iterator hasNext/next
	
	public void testW0() {
		ks = self.keySet();
		Iterator<Integer> i = ks.iterator();
		assertFalse(i.hasNext());
	}
	
	public void testW1() {
		self.put(1, "A");
		Iterator<Integer> it = self.keySet().iterator();
		assertTrue(it.hasNext());
	}
	
	public void testW2() {
		ks = self.keySet();
		self.insert(1, "B");
		Iterator<Integer> it = ks.iterator();
		assertEquals(1, it.next().intValue());
	}
	
	public void testW3() {
		ks = self.keySet();
		Iterator<Integer> it = ks.iterator();
		assertException(NoSuchElementException.class, () -> it.next());
	}
	
	public void testW4() {
		ks = self.keySet();
		self.put(1, "C");
		self.insert(2, "D");
		Iterator<Integer> it = ks.iterator();
		assertEquals(1, it.next().intValue());
		assertEquals(2, it.next().intValue());
	}
	
	public void testW5() {
		self.put(1, "J");
		self.insert(1, "K");
		self.insert(3, "L");
		Iterator<Integer> it = self.keySet().iterator();
		assertEquals(Integer.valueOf(1), it.next());
		assertEquals(Integer.valueOf(2), it.next());
		assertEquals(Integer.valueOf(3), it.next());
	}
	
	public void testW6() {
		ks = self.keySet();
		self.put(1, "M");
		Iterator<Integer> it = ks.iterator();
		it.next();
		assertException(NoSuchElementException.class, () -> it.next());
	}
	
	public void testW7() {
		ks = self.keySet();
		Iterator<Integer> other;
		self.put(1, "A");
		self.put(2, "B");
		self.insert(1, "Z");
		Iterator<Integer> it = ks.iterator();
		other = ks.iterator();
		assertEquals(Integer.valueOf(1), it.next());
		assertEquals("1", other.next().toString());
		assertEquals(Integer.valueOf(2), it.next());
		assertEquals("2", other.next().toString());
		assertEquals("3", other.next().toString());
		assertTrue(it.hasNext());
	}
	
	public void testW8() {
		ks = self.keySet();
		self.put(1, "A");
		self.put(2, "B");
		self.insert(1, "C");
		self.insert(2, "D");
		Iterator<Integer> i = ks.iterator();
		assertTrue(i.hasNext());
		self.insert(4, "E");
		assertException(ConcurrentModificationException.class, () -> i.hasNext());
	}
	
	public void testW9() {
		ks = self.keySet();
		self.put(1, "A");
		self.put(2, "B");
		Iterator<Integer> i = ks.iterator();
		i.next();
		assertTrue(i.hasNext());
		self.remove(2);
		assertException(ConcurrentModificationException.class, () -> i.next());		
	}

	
	/// testXx: keySet iterator remove
	
	public void testX0() {
		Iterator<Integer> it = self.keySet().iterator();
		assertException(IllegalStateException.class, () -> it.remove());
	}
	
	public void testX1() {
		self.put(1, "A");
		Iterator<Integer> it = self.keySet().iterator();
		assertException(IllegalStateException.class, () -> it.remove());		
	}
	
	public void testX2() {
		self.put(1, "B");
		Iterator<Integer> it = self.keySet().iterator();
		it.next();
		it.remove();
		assertTrue(self.isEmpty());
	}
	
	public void testX3() {
		ks = self.keySet();
		self.put(1, "C");
		self.put(2, "D");
		Iterator<Integer> it = ks.iterator();
		it.next();
		it.remove();
		assertEquals(1, it.next().intValue());
	}
	
	public void testX4() {
		ks = self.keySet();
		self.put(1, "E");
		self.insert(1, "F");
		Iterator<Integer> it = ks.iterator();
		it.next();
		it.remove();
		assertEquals(1, it.next().intValue());
	}
	
	public void testX5() {
		ks = self.keySet();
		self.put(1, "B");
		self.insert(1, "A");
		self.put(3, "C");
		Iterator<Integer> it = ks.iterator();
		it.next();
		it.next();
		it.remove();
		assertException(IllegalStateException.class, () -> it.remove());
		assertEquals(Integer.valueOf(2), it.next());
	}
	
	public void testX6() {
		ks = self.keySet();
		self.put(1, "E");
		self.insert(1, "D");
		self.insert(3, "F");
		Iterator<Integer> it = ks.iterator();
		it.next();
		it.next();
		self.put(3, "G");
		it.remove();
		assertEquals(Integer.valueOf(2), it.next());
	}
	
	public void testX7() {
		ks = self.keySet();
		self.put(1, "E");
		self.insert(1, "D");
		self.insert(3, "F");
		Iterator<Integer> it = ks.iterator();
		it.next();
		it.next();
		self.put(4, "G");
		assertException(ConcurrentModificationException.class, () -> it.remove());
	}
	
	public void testX8() {
		ks = self.keySet();
		self.put(1, "K");
		self.insert(1, "J");
		self.insert(3, "L");
		Iterator<Integer> local = ks.iterator();
		Iterator<Integer> it = ks.iterator();
		it.next();
		it.remove();
		assertException(ConcurrentModificationException.class, () -> local.hasNext());
	}
	
	public void testX9() {
		self.put(1, "A");
		self.put(2, "B");
		self.insert(1, "C");
		self.insert(2, "D");
		self.insert(4, "E");
		Iterator<Integer> it = self.keySet().iterator();
		it.next();
		it.next();
		it.remove();
		it.next();
		it.next();
		it.remove();
		assertEquals(Integer.valueOf(3), it.next());
		assertEquals("C", self.get(1));
	}
	
	
	/// testYx: values iterator hasNext/next

	public void testY0() {
		vs = self.values();
		Iterator<String> i = vs.iterator();
		assertFalse(i.hasNext());
	}
	
	public void testY1() {
		self.put(1, "A");
		Iterator<String> it = self.values().iterator();
		assertTrue(it.hasNext());
	}
	
	public void testY2() {
		vs = self.values();
		self.insert(1, "B");
		Iterator<String> it = vs.iterator();
		assertEquals("B", it.next());
	}
	
	public void testY3() {
		vs = self.values();
		Iterator<String> it = vs.iterator();
		assertException(NoSuchElementException.class, () -> it.next());
	}
	
	public void testY4() {
		vs = self.values();
		self.put(1, "C");
		self.insert(2, "D");
		Iterator<String> it = vs.iterator();
		assertEquals("C", it.next());
		assertEquals("D", it.next());
	}
	
	public void testY5() {
		self.put(1, "J");
		self.insert(1, "K");
		self.insert(3, null);
		Iterator<String> it = self.values().iterator();
		assertEquals("K", it.next());
		assertEquals("J", it.next());
		assertTrue(it.hasNext());
	}
	
	public void testY6() {
		vs = self.values();
		self.put(1, "M");
		Iterator<String> it = vs.iterator();
		it.next();
		assertException(NoSuchElementException.class, () -> it.next());
	}
	
	public void testY7() {
		vs = self.values();
		Iterator<String> other;
		self.put(1, "A");
		self.put(2, "B");
		self.insert(1, "Z");
		Iterator<String> it = vs.iterator();
		other = vs.iterator();
		assertEquals("Z", it.next());
		assertEquals("Z", other.next());
		assertEquals("A", it.next());
		assertEquals("A", other.next());
		assertEquals("B", other.next());
		assertTrue(it.hasNext());
	}
	
	public void testY8() {
		vs = self.values();
		self.put(1, "A");
		self.put(2, "B");
		self.insert(1, "C");
		self.insert(2, "D");
		Iterator<String> i = vs.iterator();
		assertTrue(i.hasNext());
		self.insert(4, "E");
		assertException(ConcurrentModificationException.class, () -> i.hasNext());
	}
	
	public void testY9() {
		vs = self.values();
		self.put(1, "A");
		self.put(2, "B");
		Iterator<String> i = vs.iterator();
		i.next();
		assertTrue(i.hasNext());
		self.remove(2);
		assertException(ConcurrentModificationException.class, () -> i.next());		
	}

	
	/// testZx: values iterator remove
	
	public void testZ0() {
		Iterator<String> it = self.values().iterator();
		assertException(IllegalStateException.class, () -> it.remove());
	}
	
	public void testZ1() {
		self.put(1, "A");
		Iterator<String> it = self.values().iterator();
		assertException(IllegalStateException.class, () -> it.remove());		
	}
	
	public void testZ2() {
		self.put(1, "B");
		Iterator<String> it = self.values().iterator();
		it.next();
		it.remove();
		assertTrue(self.isEmpty());
	}
	
	public void testZ3() {
		vs = self.values();
		self.put(1, "C");
		self.put(2, "D");
		Iterator<String> it = vs.iterator();
		it.next();
		it.remove();
		assertEquals("D", it.next());
	}
	
	public void testZ4() {
		vs = self.values();
		self.put(1, null);
		self.insert(1, "F");
		Iterator<String> it = vs.iterator();
		it.next();
		it.remove();
		assertEquals(null, it.next());
	}
	
	public void testZ5() {
		vs = self.values();
		self.put(1, "B");
		self.insert(1, "A");
		self.put(3, "C");
		Iterator<String> it = vs.iterator();
		it.next();
		it.next();
		it.remove();
		assertException(IllegalStateException.class, () -> it.remove());
		assertEquals("C", it.next());
	}
	
	public void testZ6() {
		vs = self.values();
		self.put(1, "E");
		self.insert(1, "D");
		self.insert(3, "F");
		Iterator<String> it = vs.iterator();
		it.next();
		it.next();
		self.put(3, "G");
		it.remove();
		assertEquals("G", it.next());
	}
	
	public void testZ7() {
		vs = self.values();
		self.put(1, "E");
		self.insert(1, "D");
		self.insert(3, "F");
		Iterator<String> it = vs.iterator();
		it.next();
		it.next();
		self.put(4, "G");
		assertException(ConcurrentModificationException.class, () -> it.remove());
	}
	
	public void testZ8() {
		vs = self.values();
		self.put(1, "K");
		self.insert(1, "J");
		self.insert(3, "L");
		Iterator<String> local = vs.iterator();
		Iterator<String> it = vs.iterator();
		it.next();
		it.remove();
		assertException(ConcurrentModificationException.class, () -> local.hasNext());
	}
	
	public void testZ9() {
		self.put(1, "A");
		self.put(2, "B");
		self.insert(1, "C");
		self.insert(2, "D");
		self.insert(4, "E");
		Iterator<String> it = self.values().iterator();
		it.next();
		it.next();
		it.remove();
		it.next();
		it.next();
		it.remove();
		assertEquals("B", it.next());
		assertEquals("C", self.get(1));
	}
}
