import junit.framework.TestCase;

import edu.uwm.cs351.WiredRobot;
import edu.uwm.cs351.WiredRobot.FunctionalPart;

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
		WiredRobot r0 = new WiredRobot(null);
		assertNull(r0.getPart(new String("HEAD"),3));
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		assertEquals(true,r0.addPart(new String("ARM"),p0));
		assertSame(p0,r0.getFirst());
		assertEquals(new String("ARM"),p0.getFunction());
		assertEquals(true,r0.addPart(new String("LEG"),p1));
		assertEquals(true,r0.remove(p0)); 
		assertEquals(true,r0.addPart(new String("ANTENNA"),p0));
	}
}