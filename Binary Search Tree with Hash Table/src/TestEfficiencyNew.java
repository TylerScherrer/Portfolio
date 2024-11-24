import java.util.Collection;
import java.util.Map;

import edu.uwm.cs.junit.EfficiencyTestCase;
import edu.uwm.cs351.Ranking;

public class TestEfficiencyNew extends EfficiencyTestCase {

	private Map<Integer,Double> m;
	private Ranking<Double> r;
	
	private static final int POWER = 21; // million entries
	private static final int SIZE = (1 << (POWER-1)) - 1;
	private static final int TESTS = SIZE/POWER; //
	
	protected void setUp() {
		super.setUp();
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

	/* Less work for Spring 2024
	public void testN() {
		Set<Integer> s = m.keySet();
		int removed = 0;
		for (int i=0; i < TESTS; ++i) {
			if ((i%8) == 0) {
				++removed;
				assertTrue(s.remove((Object)Integer.valueOf(i+1)));
			} else {
				assertFalse(s.remove(-i));
			}
		}
		assertEquals(SIZE - removed, s.size());
	}
	*/
	
	public void testU() {
		for (int i=1; i <= TESTS; ++i) {
			assertEquals(i, r.getRank(2.0*i));
		}
	}
	
	public void testV() {
		for (int i=0; i < SIZE; ++i) {
			int j = SIZE - i;
			assertTrue(m.containsValue(2.0 * j));
			assertFalse(m.containsValue(2.0 * j + 1));
		}
	}
	
	public void testW() {
		for (int i=1; i <= SIZE; ++i) {
			assertTrue(m.values().contains(2.0 * i));
			assertFalse(m.values().contains(2.0 * i + 1));
		}
	}
	
	public void testX() {
		Collection<Double> vs = m.values();
		for (int i=1; i <= TESTS; i += 2) {
			assertTrue(vs.remove(2.0 * i));
			assertFalse(vs.remove(2.0 * i + 1));
		}
		assertEquals(SIZE - TESTS/2, m.size());
	}
}
