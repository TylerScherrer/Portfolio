import java.util.Random;

import edu.uwm.cs.junit.EfficiencyTestCase;
import edu.uwm.cs351.WiredRobot;
import edu.uwm.cs351.WiredRobot.FunctionalPart;

public class TestEfficiency extends EfficiencyTestCase {
	
	WiredRobot robot;
	FunctionalPart[] parts;
	Random r;
	
	@Override
	public void setUp() {
		robot = new WiredRobot(TestInternals.byFunctionThenId);
		r = new Random();
		try {
			assert 1/robot.getPart(null,0).hashCode() == 42 : "OK";
			assertTrue(true);
		} catch (NullPointerException ex) {
			System.err.println("Assertions must NOT be enabled to use this test suite.");
			System.err.println("In Eclipse: remove -ea from the VM Arguments box under Run>Run Configurations>Arguments");
			assertFalse("Assertions must NOT be enabled while running efficiency tests.",true);
		}
		super.setUp();
		parts = new FunctionalPart[MAX];
		for (int i=0; i < MAX; ++i) {
			parts[i] = new FunctionalPart();
		}
		int tenpower = 10;
		while (tenpower < MAX) {
			tenpower *= 10;
		}
		for (int power = POWER; power > 1; --power) {
			int incr = 1 << power;
			for (int i=1 << (power-1); i < MAX; i += incr) {
				robot.addPart(""+(tenpower+i), parts[i]);
			}
		}

	}

	private static final int POWER = 20;
	private static final int MAX = 1 << POWER;
	private static final int TESTS = MAX / POWER;
		
	
    @Override
    protected void tearDown() {
    	robot = null;
    }

    public void testA() {
    	assertSame(parts[MAX-2], robot.getPart(null, MAX/2-2));
    }
    
    public void testB() {
    	for (int i=0; i < TESTS; ++i) {
    		assertSame(parts[2], robot.getFirst());
    	}
    }
    
    public void testC() {
    	for (int i=0; i < TESTS; ++i) {
    		assertEquals(parts[2],robot.getPart(null, 0));
    	}
    }
    
    public void testD() {
    	int sqrt = 1 << (POWER/2);
    	for (int i=0; i < sqrt; ++i) {
    		assertSame(parts[2*(i+1)], robot.getPart(null, i));
    	}
    }

    public void testE() {
    	robot.setComparator((p1,p2) -> p2.getFunction().compareTo(p1.getFunction()));
    	assertSame(parts[MAX-2], robot.getFirst());
    }
    
    public void testF() {
    	robot.setComparator((p1,p2) -> p2.getId() - p1.getId());
    	assertSame(parts[MAX-2], robot.getFirst());
    }
    
    public void testG() {
    	robot.setComparator((p1,p2) -> 0);
    	assertSame(parts[2], robot.getFirst());
    }
    
    
    /// new tests for HW #9
    
    public void testH() {
    	FunctionalPart p = robot.getFirst();
    	int index = 2;
    	while (p != null) {
    		assertSame(p, parts[index]);
    		p = p.getNext();
    		index += 2;
    	}
    	assertEquals(MAX, index);
    }
    
    public void testI() {
    	for (int i=1; i < MAX; i += 2) {
    		assertFalse(robot.remove(parts[i]));
    	}
    }
    
    public void testJ() {
    	for (int i=2; i < MAX; i += 4) {
    		assertTrue(robot.remove(parts[i]));
    	}
    	for (int i=2; i < MAX; i += 4) {
    		assertFalse(robot.remove(parts[i]));
    	}
    }
}
