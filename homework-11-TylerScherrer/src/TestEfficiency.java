import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

import edu.uwm.cs.junit.EfficiencyTestCase;
import edu.uwm.cs351.Ranking;
import edu.uwm.cs351.util.DefaultEntry;

public class TestEfficiency extends EfficiencyTestCase {

	private Map<Integer,Double> m;
	private Ranking<Double> r;

	private Random random;
	
	private static final int POWER = 21; // million entries
	private static final int SIZE = (1 << (POWER-1)) - 1;
	private static final int TESTS = SIZE/POWER; //
	
	protected void setUp() {
		super.setUp();
		random = new Random();
		try {
			assert m.size() == TESTS : "cannot run test with assertions enabled";
		} catch (NullPointerException ex) {
			throw new IllegalStateException("Cannot run test with assertions enabled");
		}
		m = r = new Ranking<Double>();
		for (int power = POWER; power > 1; --power) {
			int incr = 1 << power;
			int start = 1 << (power-1);
			for (int j=0; j < 1<<(POWER-power); ++j) {
				r.insert(j*2+1, Double.valueOf(j*incr+start));
			}
		}
	}
		
	
	@Override
	protected void tearDown() {
		m = null;
		super.tearDown();
	}


	public void testA() {
		for (int i=0; i < SIZE; ++i) {
			assertFalse(m.isEmpty());
		}
	}
	
	public void testB() {
		for (int i=0; i < SIZE; ++i) {
			assertEquals(SIZE,m.size());
		}
	}

	public void testC() {
		for (int i=0; i < TESTS; ++i) {
			int r = random.nextInt(SIZE-1)+1;
			assertTrue(m.containsKey((Object)r));
			assertEquals(r*2.0,m.get((Object)r).doubleValue());
			assertNull(m.get(SIZE+1+r));
			assertFalse(m.containsKey(SIZE+1+r));
		}
	}
	
	public void testD() {
		for (int i=0; i < TESTS; ++i) {
			int r = random.nextInt(SIZE-1-i)+1;
			Double val = m.remove(r);
			assertFalse(val == null);
		}
		assertEquals(SIZE-TESTS, m.size());
	}

	public void testE() {
		Set<Integer> touched = new HashSet<Integer>();
		for (int i=0; i < TESTS; ++i) {
			int r = random.nextInt(SIZE-1)+1;
			if (!touched.add(r)) continue; // don't check again
			assertEquals(r*2.0,m.put(r, -r*2.0).doubleValue());
		}
	}

	public void testF() {
		for (int i=0; i < SIZE; ++i) {
			assertEquals(SIZE, m.entrySet().size());
		}
	}
	
	public void testG() {
		for (int i=1; i < TESTS; ++i) {
			assertFalse("should not contain bad entry for " + i,
					m.entrySet().contains(new DefaultEntry<>(i*4,Double.valueOf(i*4))));
			assertTrue("should contain entry for " + i,
					m.entrySet().contains((Object)new DefaultEntry<>(i*4,Double.valueOf(i*8))));
			assertFalse("should not contain non-existent entry for " + i,
					m.entrySet().contains(new DefaultEntry<>(SIZE+1+i*4, Double.valueOf(i*8))));	
		}
	}
	
	public void testH() {
		Set<Entry<Integer,Double>> es = m.entrySet();
		for (int i=0; i < TESTS; ++i) {
			assertFalse("should not remove bad entry for " + i,
					es.remove(new DefaultEntry<>(i+1,Double.valueOf(i+1))));
			assertTrue("should be able to remove entry for " + i, 
					es.remove((Object)new DefaultEntry<>(i+1,Double.valueOf(i*4+2))));	
			assertFalse("should not remove twice entry for " + i,
					es.remove(new DefaultEntry<>(i+1,Double.valueOf(i*4+2))));
		}
		assertEquals(SIZE-TESTS, m.size());
	}

	public void testI() {
		Set<Entry<Integer,Double>> es = m.entrySet();
		for (int i=0; i < TESTS; ++i) {
			Iterator<Entry<Integer,Double>> it= es.iterator();
			assertEquals(new DefaultEntry<>(1,Double.valueOf(2)), it.next());
		}
	}
	
	public void testJ() {
		Iterator<Entry<Integer,Double>> it = m.entrySet().iterator();
		for (int i=1; i <= SIZE; ++i) {
			assertTrue("After " + i + " next(), should still have next",it.hasNext());
			assertEquals(new DefaultEntry<>(i,Double.valueOf(2*i)), it.next());
		}
	}
	
	public void testK() {
		int removed = 0;
		assertEquals(SIZE,m.size());
		Iterator<Entry<Integer,Double>> it = m.entrySet().iterator();
		for (int i = 1; i < TESTS; ++i) {
			assertEquals(i-removed,it.next().getKey().intValue());
			if (random.nextBoolean()) {
				it.remove();
				++removed;
			}
		}
		assertEquals(SIZE-removed,m.size());
	}

	/// The remaining tests should be sufficiently efficient (since we deleted testN)
	/// since AbstractMap provides adequate definitions.
	
	public void testL() {
		for (int i=0; i < SIZE; ++i) {
			Set<Integer> s = m.keySet();
			assertEquals(SIZE, s.size());
		}
	}
	
	public void testM() {
		Set<Integer> s = m.keySet();
		for (int i=0; i < TESTS; ++i) {
			assertTrue(s.contains((Object)Integer.valueOf(i+1)));
		}
		assertEquals(SIZE, s.size());
	}
		
	public void testO() {
		for (int i=1; i < TESTS; ++i) {
			Iterator<Integer> it = m.keySet().iterator();
			assertEquals(1, it.next().intValue());
		}
	}

	public void testP() {
		Iterator<Integer> it = m.keySet().iterator();
		for (int i=0; i < SIZE; ++i) {
			assertTrue("After " + i + " next(), should still have next",it.hasNext());
			it.next();
		}
	}
	
	public void testQ() {
		int removed = 0;
		assertEquals(SIZE,m.size());
		Iterator<Integer> it = m.keySet().iterator();
		for (int i = 1; i < TESTS; ++i) {
			assertEquals(i-removed,it.next().intValue());
			if (random.nextBoolean()) {
				it.remove();
				++removed;
			}
		}
		assertEquals(SIZE-removed,m.size());
	}
	
	public void testR() {
		for (int i=0; i < SIZE; ++i) {
			assertEquals(SIZE, m.values().size());
		}
	}
	
	public void testS() {
		Iterator<Double> it = m.values().iterator();
		for (int i=0; i < SIZE; ++i) {
			assertTrue("After " + i + " next(), should still have next",it.hasNext());
			it.next();
		}
	}
	
	public void testT() {
		Iterator<Double> it = m.values().iterator();
		int removed = 0;
		for (int i=1; i < TESTS; ++i) {
			if ((i%2) == 0) {
				assertEquals(i*2.0, it.next().doubleValue());
				it.remove();
				++removed;
			} else {
				it.next();
			}
		}
		assertEquals(SIZE - removed, m.values().size());
	}
	
}
