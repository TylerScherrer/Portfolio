import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;

import edu.uwm.cs.junit.LockedTestCase;
import edu.uwm.cs351.Ranking;

public class TestRankingNew extends LockedTestCase {
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

	
	/// Locked tests
	
	public void test() {
		self = new Ranking<String>();
		// give the result, or void or exception name
		assertEquals("null", asString(() -> self.put(1, "A")));
		assertEquals(Ts(740972463), asString(() -> self.getRank("A")));
		assertEquals(Ts(175077841), asString(() -> self.insert(1, null)));
		assertEquals(Ts(1295963429), asString(() -> self.getRank("A")));
		assertEquals(Ts(497103925), asString(() -> self.getRank("B")));
		assertEquals(Ts(1538871501), asString(() -> self.getRank(null)));
		assertEquals(Ts(1389629029), asString(() -> self.put(1, "B")));
		assertEquals(Ts(2032039949), asString(() -> self.put(1, "A")));
		assertEquals(Ts(643676913), asString(() -> self.put(2, "A")));
		assertEquals(Ts(385098045), asString(() -> self.insert(1, "B")));
	}
	
	
	/// Test class used to check equivalent but unequal values
	
	class School {
		private final String name;
		public School(String n) { name = n; }
		@Override // implementation
		public String toString() { return "@" + name; }
		@Override // implementation
		public int hashCode() { return name.toLowerCase().hashCode(); }
		@Override // implementation
		public boolean equals(Object o) {
			if (!(o instanceof School)) return false;
			School other = (School)o;
			return name.equalsIgnoreCase(other.name);
		}
	}
	
	
	/// test0x: changes to put/insert
	
	public void test00() {
		self.put(1, "A");
		assertException(IllegalArgumentException.class, () -> self.put(2, "A"));
	}
	
	public void test01() {
		self.put(1, "A");
		assertEquals("A", self.put(1, "A"));
	}
	
	public void test02() {
		self.put(1, "A");
		assertException(IllegalArgumentException.class, () -> self.insert(1, "A"));
	}
	
	public void test03() {
		self.put(1, "A");
		self.insert(1, "Z");
		self.put(3, "C");
		assertException(IllegalArgumentException.class, () -> self.put(3, "Z"));
	}
	
	public void test04() {
		self.put(1, "A");
		self.insert(1, "Z");
		self.put(3, "C");
		assertException(IllegalArgumentException.class, () -> self.insert(3, "A"));
	}
	
	public void test05() {
		self.put(1, "A");
		self.insert(1, "Z");
		self.put(3, "C");
		assertEquals("Z", self.put(1, "Z"));
	}
	
	
	/// test1x: testing getRank
	
	public void test10() {
		assertEquals(0, self.getRank("A"));
	}
	
	public void test11() {
		self.put(1, "A");
		assertEquals(1, self.getRank("A"));
	}
	
	public void test12() {
		self.put(1, "B");
		assertEquals(0, self.getRank("A"));
	}
	
	public void test13() {
		self.put(1, "B");
		self.insert(1, "A");
		self.put(3, "C");
		assertEquals(2, self.getRank("B"));
	}
	
	public void test14() {
		self.put(1, "B");
		self.insert(1, "A");
		self.put(3, "C");
		assertEquals(3, self.getRank("C"));
	}
	
	public void test15() {
		self.put(1, "BB");
		self.insert(1, "A");
		self.put(3, "C");
		assertEquals(1, self.getRank("A"));
		assertEquals(0, self.getRank("Aa"));
	}
	
	public void test16() {
		self.put(1, "D");
		self.insert(1, "B");
		self.insert(2, "C");
		self.insert(1, "A");
		self.put(5, "F");
		self.insert(5, "E");
		self.put(7, "G");
		assertEquals(1, self.getRank("A"));
	}
	
	public void test17() {
		self.put(1, "D");
		self.insert(1, "B");
		self.insert(2, "C");
		self.insert(1, "A");
		self.put(5, "F");
		self.insert(5, "E");
		self.put(7, "G");
		assertEquals(3, self.getRank("C"));
	}
	
	public void test18() {
		self.put(1, "D");
		self.insert(1, "B");
		self.insert(2, "C");
		self.insert(1, "A");
		self.put(5, "F");
		self.insert(5, "E");
		self.put(7, "G");
		assertEquals(5, self.getRank("E"));
	}
	
	public void test19() {
		self.put(1, "D");
		self.insert(1, "B");
		self.insert(2, "C");
		self.insert(1, "A");
		self.put(5, "F");
		self.insert(5, "E");
		self.put(7, "G");
		assertEquals(7, self.getRank("G"));
	}
	
	
	/// test2x: testing setValue
	
	public void test20() {
		self.put(1, "A");
		e = self.entrySet().iterator().next(); 
		assertEquals("A", e.setValue(null));
	}
	
	public void test21() {
		self.put(1, "A");
		e = self.entrySet().iterator().next(); 
		assertEquals("A", e.setValue("A"));
	}
	
	public void test22() {
		self.put(1, "A");
		self.put(2, "B");
		e = self.entrySet().iterator().next();
		assertException(IllegalArgumentException.class, () -> e.setValue("B"));
	}
	
	public void test23() {
		self.put(1, "A");
		self.insert(1, "Z");
		self.put(3, "C");
		it = self.entrySet().iterator();
		it.next();
		it.next();
		e = it.next();
		assertException(IllegalArgumentException.class, () -> e.setValue("Z"));
	}
	
	public void test24() {
		self.put(1, "A");
		self.insert(1, "Z");
		self.put(3, "C");
		it = self.entrySet().iterator();
		it.next();
		it.next();
		e = it.next();
		assertException(IllegalArgumentException.class, () -> e.setValue("A"));
	}
	
	public void test25() {
		self.put(1, "A");
		self.insert(1, "Z");
		self.put(3, "C");
		e = self.entrySet().iterator().next();
		assertEquals("Z", e.setValue("Z"));
	}
	
	
	/// text3x: Testing replacement
	
	public void test30() {
		Ranking<School> r = new Ranking<>();
		r.put(1, new School("UW MILWAUKEE"));
		r.insert(1, new School("UW Madison"));
		r.put(3, new School("Marquette"));
		assertEquals("@UW MILWAUKEE", r.put(2, new School("UW Milwaukee")).toString());
	}
	
	public void test31() {
		Ranking<School> r = new Ranking<>();
		r.put(1, new School("UW MILWAUKEE"));
		r.insert(1, new School("UW Madison"));
		r.put(3, new School("Marquette"));
		r.put(2, new School("UW Milwaukee"));
		assertEquals("@UW Milwaukee", r.get(2).toString());
	}
	
	public void test32() {
		Ranking<School> r = new Ranking<>();
		r.put(1, new School("UW MILWAUKEE"));
		r.insert(1, new School("UW Madison"));
		r.put(3, new School("Marquette"));
		Iterator<Map.Entry<Integer, School>> it = r.entrySet().iterator();
		Map.Entry<Integer, School> e = it.next();
		assertEquals("@UW Madison",e.setValue(new School("UW MADISON")).toString());
	}
	
	public void test33() {
		Ranking<School> r = new Ranking<>();
		r.put(1, new School("UW MILWAUKEE"));
		r.insert(1, new School("UW Madison"));
		r.put(3, new School("Marquette"));
		Iterator<Map.Entry<Integer, School>> it = r.entrySet().iterator();
		Map.Entry<Integer, School> e = it.next();
		e.setValue(new School("UW MADISON"));
		assertEquals("@UW MADISON", r.get(1).toString());
	}
	
	public void test34() {
		Ranking<School> r = new Ranking<>();
		r.put(1, new School("UW MILWAUKEE"));
		r.insert(1, new School("UW Madison"));
		r.put(3, new School("Marquette"));
		assertException(IllegalArgumentException.class, () -> r.put(1, new School("UW Milwaukee")));
	}
	

	/// test5x: implicitly testing rehashing with larger tests
	
	protected Ranking.Spy<String> spy = new Ranking.Spy<>();
	
	public void test50() {
		assertEquals(8, spy.getCapacity(self));
		self.put(1, "A");
		self.put(2, "I");
		self.put(3, "Q");
		self.put(4, "B");
		assertEquals(8, spy.getCapacity(self));
		assertEquals(1, self.getRank("A"));
		assertEquals(2, self.getRank("I"));
		assertEquals(3, self.getRank("Q"));
		assertEquals(4, self.getRank("B"));
	}
	
	public void test51() {
		self.put(1, "A");
		self.put(2, "I");
		self.put(3, "Q");
		self.put(4, "B");
		self.remove(1);
		self.remove(1);
		assertEquals(1, self.getRank("Q"));
		assertEquals(2, self.getRank("B"));
	}
	
	public void test52() {
		self.put(1, "A");
		self.put(2, "I");
		self.put(3, "Q");
		self.put(4, "B");
		self.insert(2, "D");
		assertEquals(32, spy.getCapacity(self));
		assertEquals(1, self.getRank("A"));
		assertEquals(2, self.getRank("D"));
		assertEquals(3, self.getRank("I"));
		assertEquals(4, self.getRank("Q"));
		assertEquals(5, self.getRank("B"));
	}
	
	public void test53() {
		self.put(1, "A");
		self.put(2, "I");
		self.put(3, "D");
		self.put(4, "Q");
		assertEquals(8, spy.getCapacity(self));
		assertEquals(1, self.getRank("A"));
		assertEquals(2, self.getRank("I"));
		assertEquals(3, self.getRank("D"));
		assertEquals(4, self.getRank("Q"));		
	}
	
	public void test54() {
		self.put(1, "A");
		self.put(2, "I");
		self.put(3, "D");
		self.put(4, "Q");
		self.remove(3);
		self.remove(2);
		self.remove(1);
		assertEquals(1, self.getRank("Q"));	
	}
	
	public void test55() {
		self.put(1, "A");
		self.put(2, "I");
		self.insert(2, "D");
		self.insert(4, "Q");
		self.insert(2, "B");
		self.insert(3, "C");
		self.insert(5, "F");
		self.insert(6, "G");
		self.insert(5, "E");
		assertEquals(32, spy.getCapacity(self));
		assertEquals(1, self.getRank("A"));	
		assertEquals(2, self.getRank("B"));	
		assertEquals(3, self.getRank("C"));	
		assertEquals(4, self.getRank("D"));	
		assertEquals(5, self.getRank("E"));	
		assertEquals(6, self.getRank("F"));	
		assertEquals(7, self.getRank("G"));	
		assertEquals(8, self.getRank("I"));	
		assertEquals(9, self.getRank("Q"));	
	}
	
	public void test56() {
		self.put(1, "A");
		self.put(2, "I");
		self.insert(2, "D");
		self.insert(4, "Q");
		self.remove(1);
		self.insert(2, "B");
		assertEquals(16, spy.getCapacity(self));
		self.insert(2, "C");
		self.insert(4, "F");
		self.insert(5, "G");
		self.insert(1, "A");
		self.remove(1);
		self.remove(2);
		self.remove(2);
		self.remove(4);
		self.remove(3);
		self.remove(2);
		self.remove(1);
		assertEquals(1, self.size());
		self.insert(2, "M"); // should cause another rehash
		assertEquals(8, spy.getCapacity(self));
	}
	
	
	/// test6x: testing proper use of placeholders
	
	public void test60() {
		self.put(1, "A");
		self.put(2, "B");
		self.put(3, "C");
		self.put(4, "D");
		self.remove(2);
		self.put(4, "I");
		assertEquals(8, spy.getCapacity(self));
	}
	
	public void test61() {
		self.put(1, "A");
		self.put(2, "B");
		self.put(3, "D");
		self.put(4, "F");
		self.remove(3);
		self.remove(1);
		self.put(3, "I");
		self.put(4, "D");
		assertEquals(8, spy.getCapacity(self));
	}
	
	public void test62() {
		self.put(1, "A");
		self.put(2, "C");
		self.put(3, "E");
		self.put(4, "G");
		self.remove(4);
		self.put(3, "O");
		self.put(2, "M");
		self.put(1, "K");
		self.put(3, "I");
		self.put(2, "U");
		self.put(4, "G");
		assertEquals(8, spy.getCapacity(self));
	}
	
	public void test63() {
		self.put(1, "A");
		self.put(2, "B");
		self.put(3, "D");
		self.put(4, "G");
		self.remove(3);
		self.put(4, "I");
		assertEquals(8, spy.getCapacity(self));
	}
	
	public void test64() {
		self.put(1, "A");
		self.put(2, "B");
		self.put(3, "D");
		self.put(4, "G");
		self.values().remove("A");
		self.values().remove("D");
		self.put(3, "J");
		assertEquals(16, spy.getCapacity(self));
	}
}
