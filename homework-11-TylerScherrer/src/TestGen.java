import junit.framework.TestCase;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import edu.uwm.cs351.util.DefaultEntry;
import edu.uwm.cs351.Ranking;

public class TestGen extends TestCase {
	protected void assertException(Class<?> exc, Runnable r) {
		try {
			r.run();
			assertFalse("should have thrown an exception.",true);
		} catch (RuntimeException e) {
			if (exc == null) return;
			assertTrue("threw wrong exception type: " + e.getClass(),exc.isInstance(e));
		}
	}

	protected void assertEquals(int expected, Integer result) {
		super.assertEquals(Integer.valueOf(expected),result);
	}

	public void test() {
		Ranking<String> m0 = new Ranking<String>();
		m0.insert(1,null); // should terminate normally
		assertException(java.lang.IllegalArgumentException.class, () -> m0.insert(22,new String("S")));
		Collection<String> vc0 = m0.values();
		assertEquals(1,m0.size());
		assertSame(vc0,m0.values());
		Iterator<String> vi0 = vc0.iterator();
		assertNull(m0.remove(23));
		assertEquals(1,m0.size());
		assertEquals(false,vc0.remove(new String("F")));
		assertEquals(false,vc0.contains(new String("G")));
		assertEquals(1,vc0.size());
		assertException(java.lang.IllegalArgumentException.class, () -> m0.insert(23,new String("6")));
		assertEquals(true,vi0.hasNext());
		assertException(java.lang.IllegalStateException.class, () -> vi0.remove());
		assertNull(m0.put(1,new String("y")));
	}
}