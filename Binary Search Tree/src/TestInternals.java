import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Supplier;

import edu.uwm.cs351.WiredRobot;
import edu.uwm.cs351.WiredRobot.FunctionalPart;
import edu.uwm.cs351.WiredRobot.Spy;
import junit.framework.TestCase;

public class TestInternals extends TestCase {
	public static Comparator<FunctionalPart> nonDiscrimination = (p1,p2) -> 0;
	public static Comparator<FunctionalPart> byFunctionThenId = (p1,p2) -> {
		int c = p1.getFunction().compareTo(p2.getFunction());
		if (c != 0) return c;
		return p1.getId() - p2.getId();
	};
	
	protected WiredRobot.Spy spy;
	protected int reports;
	protected WiredRobot r;
    
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
    
    protected void assertWellFormed(boolean expected, WiredRobot r) {
		assertReporting(expected, () -> spy.wellFormed(r));
	}
    
    @Override
    protected void setUp() {
		spy = new WiredRobot.Spy();
	}
    
    
        
    /// testCxx: tests of the checkInRange helper method
    
    
    public void testC00() {
    	r = spy.create(null, null);
    	assertReporting(true, () -> spy.checkInRange(r, null, null, null, null));
    }
    
    public void testC01() {
    	r = spy.create(null, nonDiscrimination);
    	assertReporting(true, () -> spy.checkInRange(r, null, null, null, null));
    }
    
    public void testC02() {
    	r = spy.create(null, byFunctionThenId);
    	assertReporting(true, () -> spy.checkInRange(r, null, null, null, null));
    }
    
    public void testC03() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("arm", p1, null, null);
    	Spy.Part p3 = spy.newPart("arm", null, null, p2);
    	Spy.Part p4 = spy.newPart("arm", p2, null, null);
    	Spy.Part p5 = spy.newPart("arm", null, null, null);
    	Spy.Part p6 = spy.newPart("arm", p5, null, p4);
    	Spy.Part p7 = spy.newPart("arm", null, null, p6);
    	
    	spy.setRight(p2, p3);
    	spy.setRight(p4, p6);
    	spy.setRight(p6, p7);
    	
    	spy.setParent(p1, p2);
    	spy.setParent(p2, p4);
    	spy.setParent(p5, p6);
    	r = spy.create(p4, nonDiscrimination);
    	assertReporting(true, () -> spy.checkInRange(r, null, null, null, null));
    }
    
    public void testC04() { // uncertain about whether testing for this is appropriate
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("arm", p1, null, null);
    	Spy.Part p3 = spy.newPart("arm", null, null, p2);
    	Spy.Part p4 = spy.newPart("arm", p2, null, null);
    	Spy.Part p5 = spy.newPart("arm", null, null, null);
    	Spy.Part p6 = spy.newPart("arm", p5, null, p4);
    	Spy.Part p7 = spy.newPart("arm", null, null, p6);
    	
    	spy.setRight(p2, p3);
    	spy.setRight(p4, p6);
    	spy.setRight(p6, p7);
    	
    	spy.setParent(p1, p2);
    	spy.setParent(p2, p4);
    	spy.setParent(p5, p6);
    	r = spy.create(null, nonDiscrimination);
    	assertReporting(true, () -> spy.checkInRange(r, p4, null, null, null));
    }
    
    public void testC05() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	r = spy.create(null, null);
    	assertReporting(true, () -> spy.checkInRange(r, null, null, p1, null));
    }
    
    public void testC06() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	r = spy.create(null, null);
    	assertReporting(true, () -> spy.checkInRange(r, null, p1, null, null));
    }
    
    public void testC07() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	r = spy.create(null, null);
    	assertReporting(true, () -> spy.checkInRange(r, null, p1, p1, null));
    }
    
    public void testC10() {
    	Spy.Part p1 = spy.newPart(null, null, null, null);
    	r = spy.create(p1, null);
    	assertReporting(true, () -> spy.checkInRange(r, null, null, null, null));
    }
    
    public void testC11() {
    	Spy.Part p1 = spy.newPart(null, null, null, null);
    	r = spy.create(p1, null);
    	assertReporting(false, () -> spy.checkInRange(r, p1, null, null, null));
    }

    public void testC12() {
    	Spy.Part p1 = spy.newPart(null, null, null, null);
    	Spy.Part p2 = spy.newPart("head", p1, null, null);
    	Spy.Part p3 = spy.newPart("leg", null, null, p2);
    	spy.setRight(p2, p3);
    	spy.setParent(p1, p2);
    	r = spy.create(p2, nonDiscrimination);
    	assertReporting(false, () -> spy.checkInRange(r, p2, null, null, null));
    }
    
    public void testC13() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart(null, p1, null, null);
    	Spy.Part p3 = spy.newPart("leg", null, null, p2);
    	spy.setRight(p2, p3);
    	spy.setParent(p1, p2);
    	r = spy.create(p2, nonDiscrimination);
    	assertReporting(false, () -> spy.checkInRange(r, p2, null, null, null));
    }
    
    public void testC14() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("head", p1, null, null);
    	Spy.Part p3 = spy.newPart(null, null, null, p2);
    	spy.setRight(p2, p3);
    	spy.setParent(p1, p2);
    	r = spy.create(p2, nonDiscrimination);
    	assertReporting(false, () -> spy.checkInRange(r, p2, null, null, null));
    }
    
    public void testC15() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("head", p1, null, null);
    	Spy.Part p3 = spy.newPart("leg", null, null, p2);
    	spy.setRight(p2, p3);
    	spy.setParent(p1, p2);
    	spy.setFunction(p1, null);
    	r = spy.create(p2, nonDiscrimination);
    	assertReporting(false, () -> spy.checkInRange(r, p2, null, null, null));
    }
    
    public void testC20() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("arm", p1, null, null);
    	Spy.Part p3 = spy.newPart("arm", null, null, p2);
    	
    	spy.setRight(p2, p3);
    	spy.setParent(p1, p2);
    	r = spy.create(p2, null);
    	assertReporting(true, () -> spy.checkInRange(r, p2, null, null, null));
    }
    
    public void testC21() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("arm", p1, null, null);
    	Spy.Part p3 = spy.newPart("arm", null, null, null);
    	
    	spy.setRight(p2, p3);
    	spy.setParent(p1, p2);
    	r = spy.create(p2, null);
    	assertReporting(false, () -> spy.checkInRange(r, p2, null, null, null));
    }
    
    public void testC22() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("arm", p1, null, p1);
    	Spy.Part p3 = spy.newPart("arm", null, null, p2);
    	
    	spy.setRight(p2, p3);
    	spy.setParent(p1, p2);
    	r = spy.create(p2, null);
    	assertReporting(false, () -> spy.checkInRange(r, p2, null, null, null));
    }
    
    public void testC23() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("arm", p1, null, null);
    	Spy.Part p3 = spy.newPart("arm", null, null, p2);
    	
    	spy.setRight(p2, p3);
    	spy.setParent(p1, p2);
    	spy.setParent(p3, null);
    	r = spy.create(p2, null);
    	assertReporting(false, () -> spy.checkInRange(r, p2, null, null, null));
    }
    
    public void testC24() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("arm", p1, null, null);
    	Spy.Part p3 = spy.newPart("arm", null, null, p2);
    	Spy.Part p2n = spy.newPart("arm", p1, null, null);
    	
    	spy.setRight(p2, p3);
    	spy.setParent(p1, p2n);
    	r = spy.create(p2, null);
    	assertReporting(false, () -> spy.checkInRange(r, p2, null, null, null));
    }
    
    public void testC25() {
    	Spy.Part lo = spy.newPart("arm", null, null, null);
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("arm", p1, null, null);
    	Spy.Part p3 = spy.newPart("arm", null, null, p2);
    	Spy.Part hi = spy.newPart("arm", null, null, null);
    	
    	spy.setRight(p2, p3);
    	spy.setParent(p1, p2);
    	r = spy.create(p2, null);
    	assertReporting(true, () -> spy.checkInRange(r, p2, lo, hi, null));
    }
    
    public void testC26() {
    	Spy.Part lo = spy.newPart("arm", null, null, null);
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("arm", p1, null, null);
    	Spy.Part p3 = spy.newPart("arm", null, null, p2);
    	
    	spy.setRight(p2, p3);
    	spy.setParent(p1, p2);
    	r = spy.create(p2, null);
    	assertReporting(false, () -> spy.checkInRange(r, p2, lo, lo, null));
    }
    
    public void testC27() {
    	Spy.Part lo = spy.newPart("arm", null, null, null);
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("arm", p1, null, null);
    	Spy.Part p3 = spy.newPart("arm", null, null, p2);
    	
    	spy.setRight(p2, p3);
    	spy.setParent(p1, p2);
    	r = spy.create(p2, null);
    	assertReporting(false, () -> spy.checkInRange(r, p2, null, lo, null));
    }
    
    public void testC28() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("arm", p1, null, null);
    	Spy.Part p3 = spy.newPart("arm", null, null, p2);
    	Spy.Part hi = spy.newPart("arm", null, null, null);
    	
    	spy.setRight(p2, p3);
    	spy.setParent(p1, p2);
    	r = spy.create(p2, null);
    	assertReporting(false, () -> spy.checkInRange(r, p2, hi, null, null));
    }
    
    public void testC29() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("arm", p1, null, null);
    	Spy.Part p3 = spy.newPart("arm", null, null, p2);
    	Spy.Part hi = spy.newPart("arm", null, null, null);
    	
    	spy.setRight(p2, p3);
    	spy.setParent(p1, p2);
    	r = spy.create(p2, null);
    	assertReporting(false, () -> spy.checkInRange(r, p2, hi, hi, null));
    }
    
    public void testC30() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("arm", p1, null, null);
    	Spy.Part p3 = spy.newPart("arm", null, null, p2);
    	Spy.Part p4 = spy.newPart("arm", p2, null, null);
    	Spy.Part p5 = spy.newPart("arm", null, null, null);
    	Spy.Part p6 = spy.newPart("arm", p5, null, p4);
    	Spy.Part p7 = spy.newPart("arm", null, null, p6);
    	
    	spy.setRight(p4, p6);
    	spy.setRight(p6, p7);
    	
    	spy.setParent(p1, p2);
    	spy.setParent(p2, p4);
    	spy.setParent(p5, p6);
    	r = spy.create(p4, byFunctionThenId);
    	assertReporting(false, () -> spy.checkInRange(r, p4, p3, null, null));
    }
    
    public void testC31() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, null);
    	Spy.Part p3 = spy.newPart("leg", p1, p2, null);
    	
    	spy.setParent(p1, p3);
    	spy.setParent(p2, p3);
    	r = spy.create(p3, null);
    	assertReporting(false, () -> spy.checkInRange(r, p3, null, null, null));
    }
    
    public void testC32() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, null);
    	Spy.Part p3 = spy.newPart("leg", p1, p2, null);
    	
    	spy.setParent(p1, p3);
    	spy.setParent(p2, p3);
    	r = spy.create(p3, nonDiscrimination);
    	assertReporting(false, () -> spy.checkInRange(r, p3, null, null, null));
    }
    
    public void testC33() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, null);
    	Spy.Part p3 = spy.newPart("leg", p1, p2, null);
    	
    	spy.setParent(p1, p3);
    	spy.setParent(p2, p3);
    	r = spy.create(p3, byFunctionThenId);
    	assertReporting(false, () -> spy.checkInRange(r, p3, null, null, null));
    }
    
    public void testC34() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", p1, null, null);
    	Spy.Part p3 = spy.newPart("head", null, null, p2);
    	
    	spy.setRight(p2, p3);
    	spy.setParent(p1, p2);
    	r = spy.create(p2, null);
    	assertReporting(true, () -> spy.checkInRange(r, p2, null, null, null));
    }
    
    public void testC35() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", p1, null, null);
    	Spy.Part p3 = spy.newPart("head", null, null, p2);
    	
    	spy.setRight(p2, p3);
    	spy.setParent(p1, p2);
    	r = spy.create(p2, nonDiscrimination);
    	assertReporting(true, () -> spy.checkInRange(r, p2, null, null, null));
    }
    
    public void testC36() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", p1, null, null);
    	Spy.Part p3 = spy.newPart("head", null, null, p2);
    	
    	spy.setRight(p2, p3);
    	spy.setParent(p1, p2);
    	r = spy.create(p2, byFunctionThenId);
    	assertReporting(false, () -> spy.checkInRange(r, p2, null, null, null));
    }
    
    // Larger tree tests
    public void testC40() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("arm", p1, null, null);
    	Spy.Part p3 = spy.newPart("arm", null, null, p2);
    	Spy.Part p4 = spy.newPart("arm", p2, null, null);
    	Spy.Part p5 = spy.newPart("arm", null, null,null);
    	Spy.Part p6 = spy.newPart("arm", p5, null, p4);
    	Spy.Part p7 = spy.newPart("arm", null, null, p6);
    	
    	spy.setRight(p2, p3);
    	spy.setRight(p4, p6);
    	spy.setRight(p6, p7);
    	
    	spy.setParent(p1, p2);
    	spy.setParent(p2, p4);
    	spy.setParent(p5, p6);
    	r = spy.create(p4, nonDiscrimination);
    	assertReporting(true, () -> spy.checkInRange(r, p4, null, null, null));
    }
    
    public void testC41() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", p1, null, null);
    	Spy.Part p3 = spy.newPart("head", null, null, p2);
    	Spy.Part p4 = spy.newPart("arm", p2, null, null);
    	Spy.Part p5 = spy.newPart("leg", null, null, null);
    	Spy.Part p6 = spy.newPart("head", p5, null, p4);
    	Spy.Part p7 = spy.newPart("arm", null, null, p6);
    	
    	spy.setRight(p2, p3);
    	spy.setRight(p4, p6);
    	spy.setRight(p6, p7);
    	
    	spy.setParent(p1, p4);
    	spy.setParent(p2, p4);
    	spy.setParent(p5, p6);
    	r = spy.create(p4, nonDiscrimination);
    	assertReporting(false, () -> spy.checkInRange(r, p4, null, null, null));
    }
    
    public void testC42() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", p1, null, null);
    	Spy.Part p3 = spy.newPart("head", null, null, p2);
    	Spy.Part p4 = spy.newPart("arm", p2, null, null);
    	Spy.Part p5 = spy.newPart("leg", null, null, null);
    	Spy.Part p6 = spy.newPart("head", p5, null, p4);
    	Spy.Part p7 = spy.newPart("arm", null, null, p6);
    	
    	spy.setRight(p2, p3);
    	spy.setRight(p4, p6);
    	spy.setRight(p6, p7);
    	
    	spy.setParent(p1, p2);
    	spy.setParent(p2, p4);
    	spy.setParent(p5, p7);
    	r = spy.create(p4, nonDiscrimination);
    	assertReporting(false, () -> spy.checkInRange(r, p4, null, null, null));
    }
    
    public void testC43() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("arm", p1, null, null);
    	Spy.Part p3 = spy.newPart("arm", null, null, p2);
    	Spy.Part p4 = spy.newPart("arm", p2, null, null);
    	Spy.Part p5 = spy.newPart("arm", null, null,null);
    	Spy.Part p6 = spy.newPart("arm", p5, null, p4);
    	Spy.Part p7 = spy.newPart("arm", null, null, p6);
    	
    	spy.setRight(p2, p3);
    	spy.setRight(p4, p6);
    	spy.setRight(p6, p7);
    	
    	spy.setParent(p1, p2);
    	spy.setParent(p2, p4);
    	spy.setParent(p5, p6);
    	r = spy.create(p4, nonDiscrimination);
    	assertReporting(false, () -> spy.checkInRange(r, p4, p1, p7, null));
    }
    
    public void testC44() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("arm", p1, null, null);
    	Spy.Part p3 = spy.newPart("arm", null, null, p2);
    	Spy.Part p4 = spy.newPart("arm", p2, null, null);
    	Spy.Part p5 = spy.newPart("arm", null, null, null);
    	Spy.Part p6 = spy.newPart("arm", p5, null, p4);
    	Spy.Part p7 = spy.newPart("arm", null, null, p6);
    	
    	spy.setRight(p2, p3);
    	spy.setRight(p4, p6);
    	spy.setRight(p6, p7);
    	
    	spy.setParent(p1, p2);
    	spy.setParent(p2, p4);
    	spy.setParent(p5, p6);
    	r = spy.create(p4, nonDiscrimination);
    	assertReporting(true, () -> spy.checkInRange(r, p2, null, null, p4));
    }
    
    public void testC45() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("arm", p1, null, null);
    	Spy.Part p3 = spy.newPart("arm", null, null, p2);
    	Spy.Part p4 = spy.newPart("arm", p2, null, null);
    	Spy.Part p5 = spy.newPart("arm", null, null,null);
    	Spy.Part p6 = spy.newPart("arm", p5, null, p4);
    	Spy.Part p7 = spy.newPart("arm", null, null, p6);
    	
    	spy.setRight(p2, p3);
    	spy.setRight(p4, p6);
    	spy.setRight(p6, p7);
    	
    	spy.setParent(p1, p2);
    	spy.setParent(p2, p4);
    	spy.setParent(p5, p6);
    	r = spy.create(p4, nonDiscrimination);
    	assertReporting(true, () -> spy.checkInRange(r, p2, null, p4, p4));
    }
    
    public void testC46() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("arm", p1, null, null);
    	Spy.Part p3 = spy.newPart("arm", null, null, p2);
    	Spy.Part p4 = spy.newPart("arm", p2, null, null);
    	Spy.Part p5 = spy.newPart("arm", null, null,null);
    	Spy.Part p6 = spy.newPart("arm", p5, null, p4);
    	Spy.Part p7 = spy.newPart("arm", null, null, p6);
    	
    	spy.setRight(p2, p3);
    	spy.setRight(p4, p6);
    	spy.setRight(p6, p7);
    	
    	spy.setParent(p1, p2);
    	spy.setParent(p2, p4);
    	spy.setParent(p5, p6);
    	r = spy.create(p4, nonDiscrimination);
    	assertReporting(true, () -> spy.checkInRange(r, p2, null, p5, p4));
    }
    
    public void testC47() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("arm", p1, null, null);
    	Spy.Part p3 = spy.newPart("arm", null, null, p2);
    	Spy.Part p4 = spy.newPart("arm", p2, null, null);
    	Spy.Part p5 = spy.newPart("arm", null, null,null);
    	Spy.Part p6 = spy.newPart("arm", p5, null, p4);
    	Spy.Part p7 = spy.newPart("arm", null, null, p6);
    	
    	spy.setRight(p2, p3);
    	spy.setRight(p4, p6);
    	spy.setRight(p6, p7);
    	
    	spy.setParent(p1, p2);
    	spy.setParent(p2, p4);
    	spy.setParent(p5, p6);
    	r = spy.create(p4, nonDiscrimination);
    	assertReporting(false, () -> spy.checkInRange(r, p2, p1, null, p4));
    }
    
    public void testC48() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("arm", p1, null, null);
    	Spy.Part p3 = spy.newPart("arm", null, null, p2);
    	Spy.Part p4 = spy.newPart("arm", p2, null, null);
    	Spy.Part p5 = spy.newPart("arm", null, null,null);
    	Spy.Part p6 = spy.newPart("arm", p5, null, p4);
    	Spy.Part p7 = spy.newPart("arm", null, null, p6);
    	
    	spy.setRight(p2, p3);
    	spy.setRight(p4, p6);
    	spy.setRight(p6, p7);
    	
    	spy.setParent(p1, p2);
    	spy.setParent(p2, p4);
    	spy.setParent(p5, p6);
    	r = spy.create(p4, nonDiscrimination);
    	assertReporting(true, () -> spy.checkInRange(r, p6, null, null, p4));
    }
    
    public void testC49() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("arm", p1, null, null);
    	Spy.Part p3 = spy.newPart("arm", null, null, p2);
    	Spy.Part p4 = spy.newPart("arm", p2, null, null);
    	Spy.Part p5 = spy.newPart("arm", null, null,null);
    	Spy.Part p6 = spy.newPart("arm", p5, null, p4);
    	Spy.Part p7 = spy.newPart("arm", null, null, p6);
    	
    	spy.setRight(p2, p3);
    	spy.setRight(p4, p6);
    	spy.setRight(p6, p7);
    	
    	spy.setParent(p1, p2);
    	spy.setParent(p2, p4);
    	spy.setParent(p5, p6);
    	r = spy.create(p4, nonDiscrimination);
    	assertReporting(true, () -> spy.checkInRange(r, p6, p2, null, p4));
    }
    
    public void testC50() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", p1, null, null);
    	Spy.Part p3 = spy.newPart("head", null, null, p2);
    	Spy.Part p4 = spy.newPart("arm", p2, null, null);
    	Spy.Part p5 = spy.newPart("leg", null, null, null);
    	Spy.Part p6 = spy.newPart("head", p5, null, p4);
    	Spy.Part p7 = spy.newPart("arm", null, null, p6);
    	
    	spy.setRight(p2, p3);
    	spy.setRight(p4, p6);
    	spy.setRight(p6, p7);
    	
    	spy.setParent(p1, p2);
    	spy.setParent(p2, p4);
    	spy.setParent(p5, p6);
    	r = spy.create(p4, nonDiscrimination);
    	assertReporting(true, () -> spy.checkInRange(r, p4, null, null, null));
    }
    
    public void testC51() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", p1, null, null);
    	Spy.Part p3 = spy.newPart("head", null, null, p2);
    	Spy.Part p4 = spy.newPart("arm", p2, null, null);
    	Spy.Part p5 = spy.newPart("leg", null, null, null);
    	Spy.Part p6 = spy.newPart("head", p5, null, p4);
    	Spy.Part p7 = spy.newPart("arm", null, null, p6);
    	
    	spy.setRight(p2, p3);
    	spy.setRight(p4, p6);
    	spy.setRight(p6, p7);
    	
    	spy.setParent(p1, p2);
    	spy.setParent(p2, p4);
    	spy.setParent(p5, p6);
    	r = spy.create(p4, nonDiscrimination);
    	assertReporting(false, () -> spy.checkInRange(r, p4, p1, p7, null));
    }
    
    public void testC52() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", p1, null, null);
    	Spy.Part p3 = spy.newPart("head", null, null, p2);
    	Spy.Part p4 = spy.newPart("arm", p2, null, null);
    	Spy.Part p5 = spy.newPart("leg", null, null, null);
    	Spy.Part p6 = spy.newPart("head", p5, null, p4);
    	Spy.Part p7 = spy.newPart("arm", null, null, p6);
    	
    	spy.setRight(p2, p3);
    	spy.setRight(p4, p6);
    	spy.setRight(p6, p7);
    	
    	spy.setParent(p1, p2);
    	spy.setParent(p2, p4);
    	spy.setParent(p5, p6);
    	r = spy.create(p4, nonDiscrimination);
    	assertReporting(true, () -> spy.checkInRange(r, p2, null, null, p4));
    }
    
    public void testC53() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", p1, null, null);
    	Spy.Part p3 = spy.newPart("head", null, null, p2);
    	Spy.Part p4 = spy.newPart("arm", p2, null, null);
    	Spy.Part p5 = spy.newPart("leg", null, null, null);
    	Spy.Part p6 = spy.newPart("head", p5, null, p4);
    	Spy.Part p7 = spy.newPart("arm", null, null, p6);
    	
    	spy.setRight(p2, p3);
    	spy.setRight(p4, p6);
    	spy.setRight(p6, p7);
    	
    	spy.setParent(p1, p2);
    	spy.setParent(p2, p4);
    	spy.setParent(p5, p6);
    	r = spy.create(p4, nonDiscrimination);
    	assertReporting(false, () -> spy.checkInRange(r, p2, null, null, null));
    }
    
    public void testC54() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", p1, null, null);
    	Spy.Part p3 = spy.newPart("head", null, null, p2);
    	Spy.Part p4 = spy.newPart("arm", p2, null, null);
    	Spy.Part p5 = spy.newPart("leg", null, null, null);
    	Spy.Part p6 = spy.newPart("head", p5, null, p4);
    	Spy.Part p7 = spy.newPart("arm", null, null, p6);
    	
    	spy.setRight(p2, p3);
    	spy.setRight(p4, p6);
    	spy.setRight(p6, p7);
    	
    	spy.setParent(p1, p2);
    	spy.setParent(p2, p4);
    	spy.setParent(p5, p6);
    	r = spy.create(p4, nonDiscrimination);
    	assertReporting(false, () -> spy.checkInRange(r, p6, null, null, null));
    }
    
    public void testC55() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", p1, null, null);
    	Spy.Part p3 = spy.newPart("head", null, null, p2);
    	Spy.Part p4 = spy.newPart("arm", p2, null, null);
    	Spy.Part p5 = spy.newPart("leg", null, null, null);
    	Spy.Part p6 = spy.newPart("head", p5, null, p4);
    	Spy.Part p7 = spy.newPart("arm", null, null, p6);
    	
    	spy.setRight(p2, p3);
    	spy.setRight(p4, p6);
    	spy.setRight(p6, p7);
    	
    	spy.setParent(p1, p2);
    	spy.setParent(p2, p4);
    	spy.setParent(p5, p6);
    	r = spy.create(p4, nonDiscrimination);
    	assertReporting(true, () -> spy.checkInRange(r, p2, null, p4, p4));
    }
    
    public void testC56() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", p1, null, null);
    	Spy.Part p3 = spy.newPart("head", null, null, p2);
    	Spy.Part p4 = spy.newPart("arm", p2, null, null);
    	Spy.Part p5 = spy.newPart("leg", null, null, null);
    	Spy.Part p6 = spy.newPart("head", p5, null, p4);
    	Spy.Part p7 = spy.newPart("arm", null, null, p6);
    	
    	spy.setRight(p2, p3);
    	spy.setRight(p4, p6);
    	spy.setRight(p6, p7);
    	
    	spy.setParent(p1, p2);
    	spy.setParent(p2, p4);
    	spy.setParent(p5, p6);
    	r = spy.create(p4, nonDiscrimination);
    	assertReporting(true, () -> spy.checkInRange(r, p2, null, p5, p4));
    }
    
    public void testC57() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", p1, null, null);
    	Spy.Part p3 = spy.newPart("head", null, null, p2);
    	Spy.Part p4 = spy.newPart("arm", p2, null, null);
    	Spy.Part p5 = spy.newPart("leg", null, null, null);
    	Spy.Part p6 = spy.newPart("head", p5, null, p4);
    	Spy.Part p7 = spy.newPart("arm", null, null, p6);
    	
    	spy.setRight(p2, p3);
    	spy.setRight(p4, p6);
    	spy.setRight(p6, p7);
    	
    	spy.setParent(p1, p2);
    	spy.setParent(p2, p4);
    	spy.setParent(p5, p6);
    	r = spy.create(p4, nonDiscrimination);
    	assertReporting(false, () -> spy.checkInRange(r, p2, p1, null, p4));
    }
    
    public void testC58() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", p1, null, null);
    	Spy.Part p3 = spy.newPart("head", null, null, p2);
    	Spy.Part p4 = spy.newPart("arm", p2, null, null);
    	Spy.Part p5 = spy.newPart("leg", null, null, null);
    	Spy.Part p6 = spy.newPart("head", p5, null, p4);
    	Spy.Part p7 = spy.newPart("arm", null, null, p6);
    	
    	spy.setRight(p2, p3);
    	spy.setRight(p4, p6);
    	spy.setRight(p6, p7);
    	
    	spy.setParent(p1, p2);
    	spy.setParent(p2, p4);
    	spy.setParent(p5, p6);
    	r = spy.create(p4, nonDiscrimination);
    	assertReporting(true, () -> spy.checkInRange(r, p6, null, null, p4));
    }
    
    public void testC59() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", p1, null, null);
    	Spy.Part p3 = spy.newPart("head", null, null, p2);
    	Spy.Part p4 = spy.newPart("arm", p2, null, null);
    	Spy.Part p5 = spy.newPart("leg", null, null, null);
    	Spy.Part p6 = spy.newPart("head", p5, null, p4);
    	Spy.Part p7 = spy.newPart("arm", null, null, p6);
    	
    	spy.setRight(p2, p3);
    	spy.setRight(p4, p6);
    	spy.setRight(p6, p7);
    	
    	spy.setParent(p1, p2);
    	spy.setParent(p2, p4);
    	spy.setParent(p5, p6);
    	r = spy.create(p4, nonDiscrimination);
    	assertReporting(true, () -> spy.checkInRange(r, p6, p2, null, p4));
    }
    
    public void testC60() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, null);
    	Spy.Part p3 = spy.newPart("head", null, p2, null);
    	Spy.Part p4 = spy.newPart("arm", p1, null, p3);
    	Spy.Part p5 = spy.newPart("leg", null, null, p2);
    	Spy.Part p6 = spy.newPart("head", null, null, p2);
    	Spy.Part p7 = spy.newPart("arm", null, null, p4);
    	
    	spy.setLeft(p3, p4);
    	spy.setLeft(p2, p6);
    	spy.setRight(p4, p7);
    	spy.setRight(p2, p5);
    	
    	spy.setParent(p1, p4);
    	spy.setParent(p2, p3);
    	r = spy.create(p3, byFunctionThenId);
    	assertReporting(true, () -> spy.checkInRange(r, p3, null, null, null));
    }
    
    public void testC61() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, null);
    	Spy.Part p3 = spy.newPart("head", null, p2, null);
    	Spy.Part p4 = spy.newPart("arm", p1, null, p3);
    	Spy.Part p5 = spy.newPart("leg", null, null, p2);
    	Spy.Part p6 = spy.newPart("head", null, null, p2);
    	Spy.Part p7 = spy.newPart("arm", null, null, p4);
    	
    	spy.setLeft(p3, p4);
    	spy.setLeft(p2, p6);
    	spy.setRight(p4, p7);
    	spy.setRight(p2, p5);
    	
    	spy.setParent(p1, p4);
    	spy.setParent(p2, p3);
    	r = spy.create(p3, byFunctionThenId);
    	assertReporting(true, () -> spy.checkInRange(r, p4, null, null, p3));
    }
    
    public void testC62() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, null);
    	Spy.Part p3 = spy.newPart("head", null, p2, null);
    	Spy.Part p4 = spy.newPart("arm", p1, null, p3);
    	Spy.Part p5 = spy.newPart("leg", null, null, p2);
    	Spy.Part p6 = spy.newPart("head", null, null, p2);
    	Spy.Part p7 = spy.newPart("arm", null, null, p4);
    	
    	spy.setLeft(p3, p4);
    	spy.setLeft(p2, p6);
    	spy.setRight(p4, p7);
    	spy.setRight(p2, p5);
    	
    	spy.setParent(p1, p4);
    	spy.setParent(p2, p3);
    	r = spy.create(p3, byFunctionThenId);
    	assertReporting(true, () -> spy.checkInRange(r, p1, null, null, p4));
    }
    
    public void testC63() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, null);
    	Spy.Part p3 = spy.newPart("head", null, p2, null);
    	Spy.Part p4 = spy.newPart("arm", p1, null, p3);
    	Spy.Part p5 = spy.newPart("leg", null, null, p2);
    	Spy.Part p6 = spy.newPart("head", null, null, p2);
    	Spy.Part p7 = spy.newPart("arm", null, null, p4);
    	
    	spy.setLeft(p3, p4);
    	spy.setLeft(p2, p6);
    	spy.setRight(p4, p7);
    	spy.setRight(p2, p5);
    	
    	spy.setParent(p1, p4);
    	spy.setParent(p2, p3);
    	r = spy.create(p3, byFunctionThenId);
    	assertReporting(true, () -> spy.checkInRange(r, p7, null, null, p4));
    }
    
    public void testC64() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, null);
    	Spy.Part p3 = spy.newPart("head", null, p2, null);
    	Spy.Part p4 = spy.newPart("arm", p1, null, p3);
    	Spy.Part p5 = spy.newPart("leg", null, null, p2);
    	Spy.Part p6 = spy.newPart("head", null, null, p2);
    	Spy.Part p7 = spy.newPart("arm", null, null, p4);
    	
    	spy.setLeft(p3, p4);
    	spy.setLeft(p2, p6);
    	spy.setRight(p4, p7);
    	spy.setRight(p2, p5);
    	
    	spy.setParent(p1, p4);
    	spy.setParent(p2, p3);
    	r = spy.create(p3, byFunctionThenId);
    	assertReporting(true, () -> spy.checkInRange(r, p2, null, null, p3));
    }
    
    public void testC65() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, null);
    	Spy.Part p3 = spy.newPart("head", null, p2, null);
    	Spy.Part p4 = spy.newPart("arm", p1, null, p3);
    	Spy.Part p5 = spy.newPart("leg", null, null, p2);
    	Spy.Part p6 = spy.newPart("head", null, null, p2);
    	Spy.Part p7 = spy.newPart("arm", null, null, p4);
    	
    	spy.setLeft(p3, p4);
    	spy.setLeft(p2, p6);
    	spy.setRight(p4, p7);
    	spy.setRight(p2, p5);
    	
    	spy.setParent(p1, p4);
    	spy.setParent(p2, p3);
    	r = spy.create(p3, byFunctionThenId);
    	assertReporting(true, () -> spy.checkInRange(r, p6, null, null, p2));
    }
    
    public void testC66() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, null);
    	Spy.Part p3 = spy.newPart("head", null, p2, null);
    	Spy.Part p4 = spy.newPart("arm", p1, null, p3);
    	Spy.Part p5 = spy.newPart("leg", null, null, p2);
    	Spy.Part p6 = spy.newPart("head", null, null, p2);
    	Spy.Part p7 = spy.newPart("arm", null, null, p4);
    	
    	spy.setLeft(p3, p4);
    	spy.setLeft(p2, p6);
    	spy.setRight(p4, p7);
    	spy.setRight(p2, p5);
    	
    	spy.setParent(p1, p4);
    	spy.setParent(p2, p3);
    	r = spy.create(p3, byFunctionThenId);
    	assertReporting(true, () -> spy.checkInRange(r, p5, null, null, p2));
    }
    
    public void testC67() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, null);
    	Spy.Part p3 = spy.newPart("head", null, p2, null);
    	Spy.Part p4 = spy.newPart("arm", p1, null, p3);
    	Spy.Part p5 = spy.newPart("leg", null, null, p2);
    	Spy.Part p6 = spy.newPart("head", null, null, p2);
    	Spy.Part p7 = spy.newPart("arm", null, null, p4);
    	
    	spy.setLeft(p3, p4);
    	spy.setLeft(p2, p6);
    	spy.setRight(p4, p7);
    	spy.setRight(p2, p5);
    	
    	spy.setParent(p1, p4);
    	spy.setParent(p2, p3);
    	r = spy.create(p3, byFunctionThenId);
    	assertReporting(true, () -> spy.checkInRange(r, p2, p3, null, p3));
    }
    
    public void testC68() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, null);
    	Spy.Part p3 = spy.newPart("head", null, p2, null);
    	Spy.Part p4 = spy.newPart("arm", p1, null, p3);
    	Spy.Part p5 = spy.newPart("leg", null, null, p2);
    	Spy.Part p6 = spy.newPart("head", null, null, p2);
    	Spy.Part p7 = spy.newPart("arm", null, null, p4);
    	
    	spy.setLeft(p3, p4);
    	spy.setLeft(p2, p6);
    	spy.setRight(p4, p7);
    	spy.setRight(p2, p5);
    	
    	spy.setParent(p1, p4);
    	spy.setParent(p2, p3);
    	r = spy.create(p3, byFunctionThenId);
    	assertReporting(false, () -> spy.checkInRange(r, p2, null, p7, p3));
    }
    
    public void testC69() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, null);
    	Spy.Part p3 = spy.newPart("head", null, p2, null);
    	Spy.Part p4 = spy.newPart("arm", p1, null, p3);
    	Spy.Part p5 = spy.newPart("leg", null, null, p2);
    	Spy.Part p6 = spy.newPart("head", null, null, p2);
    	Spy.Part p7 = spy.newPart("arm", null, null, p4);
    	
    	spy.setLeft(p3, p4);
    	spy.setLeft(p2, p6);
    	spy.setRight(p4, p7);
    	spy.setRight(p2, p5);
    	
    	spy.setParent(p1, p2);
    	spy.setParent(p2, p3);
    	r = spy.create(p3, byFunctionThenId);
    	assertReporting(true, () -> spy.checkInRange(r, p2, p3, null, p3));
    }
    
    public void testC70() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, null);
    	Spy.Part p3 = spy.newPart("head", null, p2, null);
    	Spy.Part p4 = spy.newPart("arm", p1, null, p3);
    	Spy.Part p5 = spy.newPart("leg", null, null, p2);
    	Spy.Part p6 = spy.newPart("head", null, null, p2);
    	Spy.Part p7 = spy.newPart("arm", null, null, p4);
    	
    	spy.setLeft(p3, p4);
    	spy.setLeft(p2, p6);
    	spy.setRight(p4, p7);
    	spy.setRight(p2, p5);
    	
    	spy.setParent(p1, p2);
    	spy.setParent(p2, p3);
    	r = spy.create(p3, byFunctionThenId);
    	assertReporting(false, () -> spy.checkInRange(r, p1, p3, null, p2));
    }
    
    // bad trees
    public void testC71() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, null);
    	Spy.Part p3 = spy.newPart("head", p1, p2, null);
    	Spy.Part p4 = spy.newPart("arm", p3, null, null);
    	Spy.Part p5 = spy.newPart("leg", null, null, null);
    	Spy.Part p6 = spy.newPart("head", p5, null, p4);
    	Spy.Part p7 = spy.newPart("arm", null, null, p6);
    	
    	spy.setRight(p4, p6);
    	spy.setRight(p6, p7);
    	
    	spy.setParent(p1, p3);
    	spy.setParent(p2, p3);
    	spy.setParent(p3, p4);
    	spy.setParent(p5, p6);
    	r = spy.create(p4, nonDiscrimination);
    	assertReporting(false, () -> spy.checkInRange(r, p4, null, null, null));
    }
    
    public void testC72() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, null);
    	Spy.Part p3 = spy.newPart("head", p1, p2, null);
    	Spy.Part p4 = spy.newPart("arm", p3, null, null);
    	Spy.Part p5 = spy.newPart("leg", null, null, null);
    	Spy.Part p6 = spy.newPart("head", p5, null, p4);
    	Spy.Part p7 = spy.newPart("arm", null, null, p6);
    	
    	spy.setRight(p4, p6);
    	spy.setRight(p6, p7);
    	
    	spy.setParent(p1, p3);
    	spy.setParent(p2, p3);
    	spy.setParent(p3, p4);
    	spy.setParent(p5, p6);
    	r = spy.create(p4, nonDiscrimination);
    	assertReporting(false, () -> spy.checkInRange(r, p3, null, null, null));
    }
    
    public void testC73() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, null);
    	Spy.Part p3 = spy.newPart("head", p1, p2, null);
    	Spy.Part p4 = spy.newPart("arm", p3, null, null);
    	Spy.Part p5 = spy.newPart("leg", null, null, null);
    	Spy.Part p6 = spy.newPart("head", p5, null, p4);
    	Spy.Part p7 = spy.newPart("arm", null, null, p6);
    	
    	spy.setRight(p4, p6);
    	spy.setRight(p6, p7);
    	
    	spy.setParent(p1, p3);
    	spy.setParent(p2, p3);
    	spy.setParent(p3, p4);
    	spy.setParent(p5, p6);
    	r = spy.create(p4, nonDiscrimination);
    	assertReporting(true, () -> spy.checkInRange(r, p1, null, null, p3));
    }
    
    public void testC74() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, null);
    	Spy.Part p3 = spy.newPart("head", p1, p2, null);
    	Spy.Part p4 = spy.newPart("arm", p3, null, null);
    	Spy.Part p5 = spy.newPart("leg", null, null, null);
    	Spy.Part p6 = spy.newPart("head", p5, null, p4);
    	Spy.Part p7 = spy.newPart("arm", null, null, p6);
    	
    	spy.setRight(p4, p6);
    	spy.setRight(p6, p7);
    	
    	spy.setParent(p1, p3);
    	spy.setParent(p2, p3);
    	spy.setParent(p3, p4);
    	spy.setParent(p5, p6);
    	r = spy.create(p4, nonDiscrimination);
    	assertReporting(true, () -> spy.checkInRange(r, p2, null, null, p3));
    }
    
    public void testC75() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, null);
    	Spy.Part p3 = spy.newPart("head", p1, p2, null);
    	Spy.Part p4 = spy.newPart("arm", p3, null, null);
    	Spy.Part p5 = spy.newPart("leg", null, null, null);
    	Spy.Part p6 = spy.newPart("head", p5, null, p4);
    	Spy.Part p7 = spy.newPart("arm", null, null, p6);
    	
    	spy.setRight(p4, p6);
    	spy.setRight(p6, p7);
    	
    	spy.setParent(p1, p3);
    	spy.setParent(p2, p3);
    	spy.setParent(p3, p4);
    	spy.setParent(p5, p6);
    	r = spy.create(p4, nonDiscrimination);
    	assertReporting(true, () -> spy.checkInRange(r, p6, null, null, p4));
    }
    
    public void testC76() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, null);
    	Spy.Part p3 = spy.newPart("head", p1, p2, null);
    	Spy.Part p4 = spy.newPart("arm", p3, null, null);
    	Spy.Part p5 = spy.newPart("leg", null, null, null);
    	Spy.Part p6 = spy.newPart("head", p5, null, p4);
    	Spy.Part p7 = spy.newPart("arm", null, null, p6);
    	
    	spy.setRight(p4, p6);
    	spy.setRight(p6, p7);
    	
    	spy.setParent(p1, p3);
    	spy.setParent(p2, p3);
    	spy.setParent(p3, p4);
    	spy.setParent(p5, p6);
    	r = spy.create(p4, nonDiscrimination);
    	assertReporting(true, () -> spy.checkInRange(r, p6, p1, null, p4));
    }
    
    public void testC77() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, null);
    	Spy.Part p3 = spy.newPart("head", p1, p2, null);
    	Spy.Part p4 = spy.newPart("arm", p3, null, null);
    	Spy.Part p5 = spy.newPart("leg", null, null, null);
    	Spy.Part p6 = spy.newPart("head", p5, null, p4);
    	Spy.Part p7 = spy.newPart("arm", null, null, p6);
    	
    	spy.setRight(p4, p6);
    	spy.setRight(p6, p7);
    	
    	spy.setParent(p1, p3);
    	spy.setParent(p2, p3);
    	spy.setParent(p3, p4);
    	spy.setParent(p5, p6);
    	r = spy.create(p4, nonDiscrimination);
    	assertReporting(true, () -> spy.checkInRange(r, p5, null, null, p6));
    }
    
    public void testC78() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, null);
    	Spy.Part p3 = spy.newPart("head", p1, p2, null);
    	Spy.Part p4 = spy.newPart("arm", p3, null, null);
    	Spy.Part p5 = spy.newPart("leg", null, null, null);
    	Spy.Part p6 = spy.newPart("head", p5, null, p4);
    	Spy.Part p7 = spy.newPart("arm", null, null, p6);
    	
    	spy.setRight(p4, p6);
    	spy.setRight(p6, p7);
    	
    	spy.setParent(p1, p3);
    	spy.setParent(p2, p3);
    	spy.setParent(p3, p4);
    	spy.setParent(p5, p6);
    	r = spy.create(p4, nonDiscrimination);
    	assertReporting(true, () -> spy.checkInRange(r, p7, null, null, p6));
    }
    
    public void testC80() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, null);
    	Spy.Part p3 = spy.newPart("head", null, null, null);
    	Spy.Part p4 = spy.newPart("arm", p1, null, p3);
    	Spy.Part p5 = spy.newPart("leg", null, p2, p3);
    	Spy.Part p6 = spy.newPart("head", null, null, p5);
    	Spy.Part p7 = spy.newPart("arm", null, null, p4);
    	
    	spy.setLeft(p3, p4);
    	spy.setLeft(p5, p6);
    	spy.setRight(p3, p5);
    	spy.setRight(p4, p7);
    	
    	spy.setParent(p1, p4);
    	spy.setParent(p2, p5);
    	r = spy.create(p3, byFunctionThenId);
    	assertReporting(false, () -> spy.checkInRange(r, p3, null, null, null));
    }
    
    public void testC81() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, null);
    	Spy.Part p3 = spy.newPart("head", null, null, null);
    	Spy.Part p4 = spy.newPart("arm", p1, null, p3);
    	Spy.Part p5 = spy.newPart("leg", null, p2, p3);
    	Spy.Part p6 = spy.newPart("head", null, null, p5);
    	Spy.Part p7 = spy.newPart("arm", null, null, p4);
    	
    	spy.setLeft(p3, p4);
    	spy.setLeft(p5, p6);
    	spy.setRight(p3, p5);
    	spy.setRight(p4, p7);
    	
    	spy.setParent(p1, p4);
    	spy.setParent(p2, p5);
    	r = spy.create(p3, byFunctionThenId);
    	assertReporting(true, () -> spy.checkInRange(r, p4, null, null, p3));
    }
    
    public void testC82() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, null);
    	Spy.Part p3 = spy.newPart("head", null, null, null);
    	Spy.Part p4 = spy.newPart("arm", p1, null, p3);
    	Spy.Part p5 = spy.newPart("leg", null, p2, p3);
    	Spy.Part p6 = spy.newPart("head", null, null, p5);
    	Spy.Part p7 = spy.newPart("arm", null, null, p4);
    	
    	spy.setLeft(p3, p4);
    	spy.setLeft(p5, p6);
    	spy.setRight(p3, p5);
    	spy.setRight(p4, p7);
    	
    	spy.setParent(p1, p4);
    	spy.setParent(p2, p5);
    	r = spy.create(p3, byFunctionThenId);
    	assertReporting(true, () -> spy.checkInRange(r, p1, null, null, p4));
    }
    
    public void testC83() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, null);
    	Spy.Part p3 = spy.newPart("head", null, null, null);
    	Spy.Part p4 = spy.newPart("arm", p1, null, p3);
    	Spy.Part p5 = spy.newPart("leg", null, p2, p3);
    	Spy.Part p6 = spy.newPart("head", null, null, p5);
    	Spy.Part p7 = spy.newPart("arm", null, null, p4);
    	
    	spy.setLeft(p3, p4);
    	spy.setLeft(p5, p6);
    	spy.setRight(p3, p5);
    	spy.setRight(p4, p7);
    	
    	spy.setParent(p1, p4);
    	spy.setParent(p2, p5);
    	r = spy.create(p3, byFunctionThenId);
    	assertReporting(true, () -> spy.checkInRange(r, p7, null, null, p4));
    }
    
    public void testC84() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, null);
    	Spy.Part p3 = spy.newPart("head", null, null, null);
    	Spy.Part p4 = spy.newPart("arm", p1, null, p3);
    	Spy.Part p5 = spy.newPart("leg", null, p2, p3);
    	Spy.Part p6 = spy.newPart("head", null, null, p5);
    	Spy.Part p7 = spy.newPart("arm", null, null, p4);
    	
    	spy.setLeft(p3, p4);
    	spy.setLeft(p5, p6);
    	spy.setRight(p3, p5);
    	spy.setRight(p4, p7);
    	
    	spy.setParent(p1, p4);
    	spy.setParent(p2, p5);
    	r = spy.create(p3, byFunctionThenId);
    	assertReporting(false, () -> spy.checkInRange(r, p5, null, null, p3));
    }
    
    public void testC85() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, null);
    	Spy.Part p3 = spy.newPart("head", null, null, null);
    	Spy.Part p4 = spy.newPart("arm", p1, null, p3);
    	Spy.Part p5 = spy.newPart("leg", null, p2, p3);
    	Spy.Part p6 = spy.newPart("head", null, null, p5);
    	Spy.Part p7 = spy.newPart("arm", null, null, p4);
    	
    	spy.setLeft(p3, p4);
    	spy.setLeft(p5, p6);
    	spy.setRight(p3, p5);
    	spy.setRight(p4, p7);
    	
    	spy.setParent(p1, p4);
    	spy.setParent(p2, p5);
    	r = spy.create(p3, byFunctionThenId);
    	assertReporting(true, () -> spy.checkInRange(r, p6, null, null, p5));
    }
    
    public void testC86() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, null);
    	Spy.Part p3 = spy.newPart("head", null, null, null);
    	Spy.Part p4 = spy.newPart("arm", p1, null, p3);
    	Spy.Part p5 = spy.newPart("leg", null, p2, p3);
    	Spy.Part p6 = spy.newPart("head", null, null, p5);
    	Spy.Part p7 = spy.newPart("arm", null, null, p4);
    	
    	spy.setLeft(p3, p4);
    	spy.setLeft(p5, p6);
    	spy.setRight(p3, p5);
    	spy.setRight(p4, p7);
    	
    	spy.setParent(p1, p4);
    	spy.setParent(p2, p5);
    	r = spy.create(p3, byFunctionThenId);
    	assertReporting(true, () -> spy.checkInRange(r, p2, null, null, p5));
    }
    
    public void testC87() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, null);
    	Spy.Part p3 = spy.newPart("head", p1, p2, null);
    	Spy.Part p4 = spy.newPart("arm", p3, null, null);
    	Spy.Part p5 = spy.newPart("leg", null, null, null);
    	Spy.Part p6 = spy.newPart("head", p5, null, p4);
    	Spy.Part p7 = spy.newPart("arm", null, null, p6);
    	
    	spy.setRight(p4, p6);
    	spy.setRight(p6, p7);
    	
    	spy.setParent(p1, p2);
    	spy.setParent(p2, p3);
    	spy.setParent(p3, p4);
    	spy.setParent(p5, p6);
    	r = spy.create(p4, nonDiscrimination);
    	assertReporting(false, () -> spy.checkInRange(r, p1, null, null, p3));
    }
    
    public void testC88() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, null);
    	Spy.Part p3 = spy.newPart("head", p1, p2, null);
    	Spy.Part p4 = spy.newPart("arm", p3, null, null);
    	Spy.Part p5 = spy.newPart("leg", null, null, null);
    	Spy.Part p6 = spy.newPart("head", p5, null, p4);
    	Spy.Part p7 = spy.newPart("arm", null, null, p6);
    	
    	spy.setRight(p4, p6);
    	spy.setRight(p6, p7);
    	
    	spy.setParent(p1, p2);
    	spy.setParent(p2, p3);
    	spy.setParent(p3, p4);
    	spy.setParent(p5, p6);
    	r = spy.create(p4, nonDiscrimination);
    	assertReporting(true, () -> spy.checkInRange(r, p2, null, null, p3));
    }
    
    public void testC89() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, null);
    	Spy.Part p3 = spy.newPart("head", p1, p2, null);
    	Spy.Part p4 = spy.newPart("arm", p3, null, null);
    	Spy.Part p5 = spy.newPart("leg", null, null, null);
    	Spy.Part p6 = spy.newPart("head", p5, null, p4);
    	Spy.Part p7 = spy.newPart("arm", null, null, p6);
    	
    	spy.setRight(p4, p6);
    	spy.setRight(p6, p7);
    	
    	spy.setParent(p1, p3);
    	spy.setParent(p2, p3);
    	spy.setParent(p3, p4);
    	spy.setParent(p5, p6);
    	r = spy.create(p4, nonDiscrimination);
    	assertReporting(false, () -> spy.checkInRange(r, p6, null, null, p3));
    }
    
    // testWxx: tests of wellFormed
    
    public void testW00() {
    	r = spy.create(null, null);
    	assertWellFormed(true, r);
    }
    
    public void testW01() {
    	r = spy.create(null, nonDiscrimination);
    	assertWellFormed(true, r);
    }
    
    public void testW02() {
    	r = spy.create(null, byFunctionThenId);
    	assertWellFormed(true, r);
    }
    
    public void testW10() {
    	Spy.Part p1 = spy.newPart(null, null, null, null);
    	r = spy.create(p1, null);
    	assertWellFormed(false, r);
    }
    
    public void testW20() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, p1);
    	
    	spy.setRight(p1, p2);
    	r = spy.create(p1, nonDiscrimination);
    	assertWellFormed(true, r);
    }
    
    public void testW21() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, null);
    	
    	spy.setRight(p1, p2);
    	r = spy.create(p2, nonDiscrimination);
    	assertWellFormed(true, r);
    }
    
    public void testW22() {
    	Spy.Part p2 = spy.newPart("leg", null, null, null);
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	spy.setRight(p1, p2);
    	r = spy.create(p2, nonDiscrimination);
    	assertWellFormed(true, r);
    }
    
    public void testW23() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, p1);
    	
    	spy.setLeft(p1, p2);
    	r = spy.create(p1, nonDiscrimination);
    	assertWellFormed(false, r);
    }
    
    public void testW24() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, null);
    	
    	spy.setRight(p1, p2);
    	r = spy.create(p1, nonDiscrimination);
    	assertWellFormed(false, r);
    }
    
    public void testW25() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, null);
    	
    	spy.setRight(p1, p2);
    	r = spy.create(p2, nonDiscrimination);
    	assertWellFormed(true, r);
    }
    
    public void testW26() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", p1, null, null);
    	Spy.Part p3 = spy.newPart("head", null, null, p2);
    	
    	spy.setRight(p2, p3);
    	spy.setParent(p1, p2);
    	r = spy.create(p2, nonDiscrimination);
    	assertWellFormed(true, r);
    }
    
    public void testW27() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, null);
    	Spy.Part p3 = spy.newPart("head", null, null, p2);
    	
    	spy.setRight(p1, p2);
    	spy.setRight(p2, p3);
    	spy.setParent(p2, p1);
    	r = spy.create(p1, nonDiscrimination);
    	assertWellFormed(true, r);
    }
    
    public void testW28() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", p1, null, null);
    	Spy.Part p3 = spy.newPart("head", p2, null, null);
    	
    	spy.setParent(p2,  p3);
    	spy.setParent(p1,  p2);
    	r = spy.create(p3, nonDiscrimination);
    	assertWellFormed(true, r);
    }
    
    public void testW29() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, null);
    	Spy.Part p3 = spy.newPart("head", p2, null, p1);
    	
    	spy.setRight(p1, p3);
    	spy.setParent(p2, p3);
    	spy.setParent(p3, p1);
    	r = spy.create(p1, nonDiscrimination);
    	assertWellFormed(true, r);
    }
    
    public void testW30() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, p1);
    	Spy.Part p3 = spy.newPart("head", p1, null, null);
    	
    	spy.setRight(p1, p2);
    	spy.setParent(p1, p3);
    	r = spy.create(p3, nonDiscrimination);
    	assertWellFormed(true, r);
    }
    
    public void testW31() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", p1, null, null);
    	Spy.Part p3 = spy.newPart("head", null, null, p2);
    	
    	spy.setRight(p2, p3);
    	r = spy.create(p2, nonDiscrimination);
    	assertWellFormed(false, r);
    }
    
    public void testW32() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", p1, null, null);
    	Spy.Part p3 = spy.newPart("head", null, null, null);
    	
    	spy.setRight(p2, p3);
    	spy.setParent(p1, p2);
    	r = spy.create(p2, nonDiscrimination);
    	assertWellFormed(false, r);
    }
    
    public void testW33() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", p1, null, p1);
    	Spy.Part p3 = spy.newPart("head", null, null, null);
    	
    	spy.setRight(p2, p3);
    	spy.setParent(p1, p2);
    	r = spy.create(p2, nonDiscrimination);
    	assertWellFormed(false, r);
    }
    
    public void testW34() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, p1);
    	Spy.Part p3 = spy.newPart("head", null, null, p2);
    	Spy.Part p4 = spy.newPart("arm", null, null, p3);
    	
    	spy.setRight(p1, p2);
    	spy.setRight(p2, p3);
    	spy.setRight(p3, p4);
    	r = spy.create(p1, nonDiscrimination);
    	assertWellFormed(true, r);
    }
    
    public void testW35() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, null);
    	Spy.Part p3 = spy.newPart("head", null, null, null);
    	Spy.Part p4 = spy.newPart("arm", null, null, null);
    	
    	spy.setLeft(p4, p3);
    	spy.setLeft(p3, p2);
    	spy.setLeft(p2, p1);
    	spy.setParent(p1, p2);
    	spy.setParent(p2, p3);
    	spy.setParent(p3, p4);
    	r = spy.create(p4, nonDiscrimination);
    	assertWellFormed(true, r);
    }
    
    public void testW36() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", p1, null, null);
    	Spy.Part p3 = spy.newPart("head", null, null, p2);
    	Spy.Part p4 = spy.newPart("arm", null, null, p3);
    	
    	spy.setRight(p2, p3);
    	spy.setRight(p3, p4);
    	spy.setParent(p1, p2);
    	r = spy.create(p2, nonDiscrimination);
    	assertWellFormed(true, r);
    }
    
    public void testW37() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", p1, null, null);
    	Spy.Part p3 = spy.newPart("head", p2, null, null);
    	Spy.Part p4 = spy.newPart("arm", null, null, p3);
    	
    	spy.setRight(p3, p4);
    	spy.setParent(p2, p3);
    	spy.setParent(p1, p2);
    	r = spy.create(p3, nonDiscrimination);
    	assertWellFormed(true, r);
    }
    
    public void testW38() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, p1);
    	Spy.Part p3 = spy.newPart("head", p1, null, null);
    	Spy.Part p4 = spy.newPart("arm", null, null, p3);
    	
    	spy.setLeft(p1, p2);
    	spy.setRight(p3, p4);
    	spy.setParent(p1, p3);
    	r = spy.create(p3, nonDiscrimination);
    	assertWellFormed(false, r);
    }
    
    public void testW39() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", p1, null, null);
    	Spy.Part p3 = spy.newPart("head", null, null, null);
    	Spy.Part p4 = spy.newPart("arm", p3, null, p2);
    	
    	spy.setRight(p2, p4);
    	spy.setParent(p1, p2);
    	spy.setParent(p3, p4);
    	r = spy.create(p2, nonDiscrimination);
    	assertWellFormed(true, r);
    }
    
    public void testW40() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, p1);
    	Spy.Part p3 = spy.newPart("head", p1, null, null);
    	Spy.Part p4 = spy.newPart("arm", null, null, p3);
    	
    	spy.setRight(p3, p4);
    	spy.setRight(p1, p2);
    	spy.setParent(p1, p3);
    	r = spy.create(p3, nonDiscrimination);
    	assertWellFormed(true, r);
    }
    
    public void testW41() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", p1, null, null);
    	Spy.Part p3 = spy.newPart("head", null, null, p2);
    	Spy.Part p4 = spy.newPart("arm", null, null, p1);
    	
    	spy.setRight(p1, p4);
    	spy.setRight(p2, p3);
    	spy.setParent(p1, p2);
    	r = spy.create(p2, nonDiscrimination);
    	assertWellFormed(false, r);
    }
    
    public void testW42() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, null);
    	Spy.Part p3 = spy.newPart("head", p2, null, p1);
    	Spy.Part p4 = spy.newPart("arm", null, null, p3);
    	
    	spy.setRight(p1, p3);
    	spy.setRight(p3, p4);
    	spy.setParent(p2, p3);
    	r = spy.create(p1, nonDiscrimination);
    	assertWellFormed(true, r);
    }
    
    public void testW43() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", p1, null, null);
    	Spy.Part p3 = spy.newPart("head", null, null, p2);
    	Spy.Part p4 = spy.newPart("arm", p2, null, null);
    	
    	spy.setRight(p2, p3);
    	spy.setParent(p1, p2);
    	spy.setParent(p2, p4);
    	r = spy.create(p4, nonDiscrimination);
    	assertWellFormed(true, r);
    }
    
    public void testW44() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, null);
    	Spy.Part p3 = spy.newPart("head", null, null, p2);
    	Spy.Part p4 = spy.newPart("arm", p2, null, p1);
    	
    	spy.setRight(p1, p4);
    	spy.setRight(p2, p3);
    	spy.setParent(p2, p4);
    	r = spy.create(p1, nonDiscrimination);
    	assertWellFormed(true, r);
    }
    
    public void testW45() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, null);
    	Spy.Part p3 = spy.newPart("head", p2, null, null);
    	Spy.Part p4 = spy.newPart("arm", p3, null, p1);
    	
    	spy.setRight(p1, p4);
    	spy.setParent(p2, p3);
    	spy.setParent(p3, p4);
    	r = spy.create(p1, nonDiscrimination);
    	assertWellFormed(true, r);
    }
    
    public void testW46() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, null);
    	Spy.Part p3 = spy.newPart("head", null, p2, null);
    	Spy.Part p4 = spy.newPart("arm", p3, null, p1);
    	
    	spy.setRight(p1, p4);
    	spy.setParent(p2, p3);
    	spy.setParent(p3, p4);
    	r = spy.create(p1, nonDiscrimination);
    	assertWellFormed(false, r);
    }
    
    public void testW47() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, null);
    	Spy.Part p3 = spy.newPart("head", p2, null, p1);
    	Spy.Part p4 = spy.newPart("arm", p1, null, null);
    	
    	spy.setRight(p1, p3);
    	spy.setParent(p1, p4);
    	spy.setParent(p2, p3);
    	r = spy.create(p4, nonDiscrimination);
    	assertWellFormed(true, r);
    }
    
    public void testW48() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, null);
    	Spy.Part p3 = spy.newPart("head", p1, null, p2);
    	Spy.Part p4 = spy.newPart("arm", p2, null, null);
    	
    	spy.setRight(p2, p3);
    	spy.setParent(p1, p3);
    	spy.setParent(p2, p4);
    	r = spy.create(p4, nonDiscrimination);
    	assertWellFormed(false, r);
    }
    
    public void testW49() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, null);
    	Spy.Part p3 = spy.newPart("head", null, null, null);
    	Spy.Part p4 = spy.newPart("arm", null, null, null);
    	
    	spy.setLeft(p4, p3);
    	spy.setLeft(p3, p2);
    	spy.setLeft(p2, p1);
    	
    	spy.setParent(p2, p3);
    	spy.setParent(p3, p4);
    	r = spy.create(p4, nonDiscrimination);
    	assertWellFormed(false, r);
    }
    
    public void testW50() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, null);
    	Spy.Part p3 = spy.newPart("head", null, null, null);
    	Spy.Part p4 = spy.newPart("arm", null, null, null);
    	
    	spy.setLeft(p4, p3);
    	spy.setLeft(p3, p2);
    	spy.setLeft(p2, p1);
    	spy.setParent(p1, p3);
    	spy.setParent(p2, p3);
    	spy.setParent(p3, p4);
    	r = spy.create(p4, nonDiscrimination);
    	assertWellFormed(false, r);
    }
    
    public void testW51() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, null);
    	Spy.Part p3 = spy.newPart("head", null, null, p2);
    	Spy.Part p4 = spy.newPart("arm", p2, null, p1);
    	
    	spy.setRight(p1, p4);
    	spy.setRight(p2, p3);
    	spy.setParent(p1, p3);
    	spy.setParent(p2, p4);
    	r = spy.create(p1, nonDiscrimination);
    	assertWellFormed(false, r);
    }
    
    public void testW52() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, null);
    	Spy.Part p3 = spy.newPart("head", null, null, p2);
    	Spy.Part p4 = spy.newPart("arm", p2, null, p1);
    	
    	spy.setRight(p1, p4);
    	spy.setRight(p2, p3);
    	spy.setParent(p1, p3);
    	spy.setParent(p2, p4);
    	r = spy.create(p1, nonDiscrimination);
    	assertWellFormed(false, r);
    }
    
    public void testW53() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, null);
    	Spy.Part p3 = spy.newPart("head", null, null, null);
    	Spy.Part p4 = spy.newPart("arm", p2, null, p1);
    	
    	spy.setRight(p1, p4);
    	spy.setRight(p2, p3);
    	spy.setParent(p2, p4);
    	r = spy.create(p1, nonDiscrimination);
    	assertWellFormed(false, r);
    }
    
    // byFunctionThenId comparator tests
    public void testW54() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, p1);
    	
    	spy.setRight(p1, p2);
    	r = spy.create(p1, byFunctionThenId);
    	assertWellFormed(true, r);
    }
    
    public void testW55() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("head", null, null, p1);
    	
    	spy.setRight(p1, p2);
    	r = spy.create(p1, byFunctionThenId);
    	assertWellFormed(true, r);
    }
    
    public void testW56() {
    	Spy.Part p1 = spy.newPart("leg", null, null, null);
    	Spy.Part p2 = spy.newPart("arm", null, null, p1);
    	
    	spy.setLeft(p1, p2);
    	r = spy.create(p1, byFunctionThenId);
    	assertWellFormed(true, r);
    }
    
    public void testW57() {
    	Spy.Part p1 = spy.newPart("head", null, null, null);
    	Spy.Part p2 = spy.newPart("arm", null, null, p1);
    	
    	spy.setLeft(p1, p2);
    	r = spy.create(p1, byFunctionThenId);
    	assertWellFormed(true, r);
    }
    
    public void testW58() {
    	Spy.Part p1 = spy.newPart("head", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, p1);
    	
    	spy.setRight(p1, p2);
    	r = spy.create(p1, byFunctionThenId);
    	assertWellFormed(true, r);
    }
    
    public void testW59() {
    	Spy.Part p1 = spy.newPart("leg", null, null, null);
    	Spy.Part p2 = spy.newPart("head", null, null, p1);
    	
    	spy.setLeft(p1, p2);
    	r = spy.create(p1, byFunctionThenId);
    	assertWellFormed(true, r);
    }
    
    public void testW60() {
    	Spy.Part p1 = spy.newPart("leg", null, null, null);
    	Spy.Part p2 = spy.newPart("head", null, null, null);
    	
    	spy.setLeft(p1, p2);
    	r = spy.create(p1, byFunctionThenId);
    	assertWellFormed(false, r);
    }
    
    public void testW61() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("arm", null, null, p1);
    	Spy.Part p3 = spy.newPart("leg", null, null, p2);
    	
    	spy.setRight(p1, p2);
    	spy.setRight(p2, p3);
    	r = spy.create(p1, byFunctionThenId);
    	assertWellFormed(true, r);
    }
    
    public void testW62() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("arm", null, null, p1);
    	Spy.Part p3 = spy.newPart("head", null, null, p2);
    	
    	spy.setRight(p1, p2);
    	spy.setRight(p2, p3);
    	r = spy.create(p1, byFunctionThenId);
    	assertWellFormed(true, r);
    }
    
    public void testW63() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, p1);
    	Spy.Part p3 = spy.newPart("leg", null, null, p2);
    	
    	spy.setRight(p1, p2);
    	spy.setRight(p2, p3);
    	r = spy.create(p1, byFunctionThenId);
    	assertWellFormed(true, r);
    }
    
    public void testW64() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("head", null, null, p1);
    	Spy.Part p3 = spy.newPart("head", null, null, p2);
    	
    	spy.setRight(p1, p2);
    	spy.setRight(p2, p3);
    	r = spy.create(p1, byFunctionThenId);
    	assertWellFormed(true, r);
    }
    
    public void testW65() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("head", null, null, p1);
    	Spy.Part p3 = spy.newPart("leg", null, null, p2);
    	
    	spy.setRight(p1, p2);
    	spy.setRight(p2, p3);
    	r = spy.create(p1, byFunctionThenId);
    	assertWellFormed(true, r);
    }
    
    public void testW66() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("head", null, null, p1);
    	Spy.Part p3 = spy.newPart("leg", null, null, p1);
    	
    	spy.setRight(p1, p2);
    	spy.setRight(p2, p3);
    	r = spy.create(p1, byFunctionThenId);
    	assertWellFormed(false, r);
    }
    
    public void testW67() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, p1);
    	Spy.Part p3 = spy.newPart("head", null, null, p2);
    	
    	spy.setRight(p1, p2);
    	spy.setLeft(p2, p3);
    	r = spy.create(p1, byFunctionThenId);
    	assertWellFormed(true, r);
    }
    
    public void testW68() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, p1);
    	Spy.Part p3 = spy.newPart("arm", null, null, p2);
    	
    	spy.setRight(p1, p2);
    	spy.setLeft(p2, p3);
    	r = spy.create(p1, byFunctionThenId);
    	assertWellFormed(true, r);
    }
    
    public void testW69() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("head", null, null, p1);
    	Spy.Part p3 = spy.newPart("arm", null, null, p2);
    	
    	spy.setRight(p1, p2);
    	spy.setLeft(p2, p3);
    	r = spy.create(p1, byFunctionThenId);
    	assertWellFormed(true, r);
    }
    
    public void testW70() {
    	Spy.Part p1 = spy.newPart("leg", null, null, null);
    	Spy.Part p2 = spy.newPart("arm", null, null, p1);
    	Spy.Part p3 = spy.newPart("arm", null, null, p2);
    	
    	spy.setRight(p2, p3);
    	spy.setLeft(p1, p2);
    	r = spy.create(p1, byFunctionThenId);
    	assertWellFormed(true, r);
    }
    
    public void testW71() {
    	Spy.Part p1 = spy.newPart("leg", null, null, null);
    	Spy.Part p2 = spy.newPart("arm", null, null, p1);
    	Spy.Part p3 = spy.newPart("head", null, null, p2);
    	
    	spy.setRight(p2, p3);
    	spy.setLeft(p1, p2);
    	r = spy.create(p1, byFunctionThenId);
    	assertWellFormed(true, r);
    }
    
    public void testW72() {
    	Spy.Part p1 = spy.newPart("leg", null, null, null);
    	Spy.Part p2 = spy.newPart("arm", null, null, p1);
    	Spy.Part p3 = spy.newPart("leg", null, null, p1);
    	
    	spy.setRight(p1, p3);
    	spy.setLeft(p1, p2);
    	r = spy.create(p1, byFunctionThenId);
    	assertWellFormed(true, r);
    }
    
    public void testW73() {
    	Spy.Part p1 = spy.newPart("leg", null, null, null);
    	Spy.Part p2 = spy.newPart("head", null, null, p1);
    	Spy.Part p3 = spy.newPart("leg", null, null, p1);
    	
    	spy.setRight(p1, p3);
    	spy.setLeft(p1, p2);
    	r = spy.create(p1, byFunctionThenId);
    	assertWellFormed(true, r);
    }
    
    public void testW74() {
    	Spy.Part p1 = spy.newPart("leg", null, null, null);
    	Spy.Part p2 = spy.newPart("head", null, null, p1);
    	Spy.Part p3 = spy.newPart("leg", null, null, p2);
    	
    	spy.setRight(p1, p3);
    	spy.setLeft(p1, p2);
    	r = spy.create(p1, byFunctionThenId);
    	assertWellFormed(false, r);
    }
    
    public void testW75() {
    	Spy.Part p1 = spy.newPart("leg", null, null, null);
    	Spy.Part p2 = spy.newPart("head", null, null, p1);
    	Spy.Part p3 = spy.newPart("head", null, null, p2);
    	
    	spy.setRight(p2, p3);
    	spy.setLeft(p1, p2);
    	r = spy.create(p1, byFunctionThenId);
    	assertWellFormed(true, r);
    }
    
    public void testW76() {
    	Spy.Part p1 = spy.newPart("leg", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, p1);
    	Spy.Part p3 = spy.newPart("head", null, null, p1);
    	
    	spy.setRight(p1, p2);
    	spy.setLeft(p1, p3);
    	r = spy.create(p1, byFunctionThenId);
    	assertWellFormed(true, r);
    }
    
    public void testW77() {
    	Spy.Part p1 = spy.newPart("leg", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, p1);
    	Spy.Part p3 = spy.newPart("arm", null, null, p1);
    	
    	spy.setRight(p1, p2);
    	spy.setLeft(p1, p3);
    	r = spy.create(p1, byFunctionThenId);
    	assertWellFormed(true, r);
    }
    
    public void testW78() {
    	Spy.Part p1 = spy.newPart("leg", null, null, null);
    	Spy.Part p2 = spy.newPart("head", null, null, p1);
    	Spy.Part p3 = spy.newPart("arm", null, null, p2);
    	
    	spy.setLeft(p1, p2);
    	spy.setLeft(p2, p3);
    	r = spy.create(p1, byFunctionThenId);
    	assertWellFormed(true, r);
    }
    
    public void testW79() {
    	Spy.Part p1 = spy.newPart("head", null, null, null);
    	Spy.Part p2 = spy.newPart("arm", null, null, p1);
    	Spy.Part p3 = spy.newPart("arm", null, null, p2);
    	
    	spy.setRight(p2, p3);
    	spy.setLeft(p1, p2);
    	r = spy.create(p1, byFunctionThenId);
    	assertWellFormed(true, r);
    }
    
    public void testW80() {
    	Spy.Part p1 = spy.newPart("head", null, null, null);
    	Spy.Part p2 = spy.newPart("arm", null, null, p1);
    	Spy.Part p3 = spy.newPart("leg", null, null, p1);
    	
    	spy.setRight(p1, p3);
    	spy.setLeft(p1, p2);
    	r = spy.create(p1, byFunctionThenId);
    	assertWellFormed(true, r);
    }
    
    public void testW81() {
    	Spy.Part p1 = spy.newPart("head", null, null, null);
    	Spy.Part p2 = spy.newPart("arm", null, null, p1);
    	Spy.Part p3 = spy.newPart("head", null, null, p1);
    	
    	spy.setRight(p1, p3);
    	spy.setLeft(p1, p2);
    	r = spy.create(p1, byFunctionThenId);
    	assertWellFormed(true, r);
    }
    
    public void testW82() {
    	Spy.Part p1 = spy.newPart("head", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, p1);
    	Spy.Part p3 = spy.newPart("arm", null, null, p1);
    	
    	spy.setRight(p1, p2);
    	spy.setLeft(p1, p3);
    	r = spy.create(p1, byFunctionThenId);
    	assertWellFormed(true, r);
    }
    
    public void testW83() {
    	Spy.Part p1 = spy.newPart("head", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, p1);
    	Spy.Part p3 = spy.newPart("leg", null, null, p2);
    	
    	spy.setRight(p1, p2);
    	spy.setRight(p2, p3);
    	r = spy.create(p1, byFunctionThenId);
    	assertWellFormed(true, r);
    }
    
    public void testW84() {
    	Spy.Part p1 = spy.newPart("head", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", null, null, p1);
    	Spy.Part p3 = spy.newPart("head", null, null, p2);
    	
    	spy.setRight(p1, p2);
    	spy.setLeft(p2, p3);
    	r = spy.create(p1, byFunctionThenId);
    	assertWellFormed(true, r);
    }
    
    public void testW85() {
    	Spy.Part p1 = spy.newPart("head", null, null, null);
    	Spy.Part p2 = spy.newPart("head", null, null, p1);
    	Spy.Part p3 = spy.newPart("arm", null, null, p1);
    	
    	spy.setRight(p1, p2);
    	spy.setLeft(p1, p3);
    	r = spy.create(p1, byFunctionThenId);
    	assertWellFormed(true, r);
    }
    
    public void testW86() {
    	Spy.Part p1 = spy.newPart("head", null, null, null);
    	Spy.Part p2 = spy.newPart("head", null, null, p1);
    	Spy.Part p3 = spy.newPart("leg", null, null, p2);
    	
    	spy.setRight(p1, p2);
    	spy.setRight(p2, p3);
    	r = spy.create(p1, byFunctionThenId);
    	assertWellFormed(true, r);
    }
    
    public void testW87() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("arm", p1, null, null);
    	Spy.Part p3 = spy.newPart("leg", null, null, p2);
    	
    	spy.setRight(p2, p3);
    	spy.setParent(p1, p2);
    	r = spy.create(p2, byFunctionThenId);
    	assertWellFormed(true, r);
    }
    
    public void testW88() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("arm", p1, null, null);
    	Spy.Part p3 = spy.newPart("head", null, null, p2);
    	
    	spy.setRight(p2, p3);
    	spy.setParent(p1, p2);
    	r = spy.create(p2, byFunctionThenId);
    	assertWellFormed(true, r);
    }
    
    public void testW89() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", p1, null, null);
    	Spy.Part p3 = spy.newPart("arm", null, null, p1);
    	
    	spy.setRight(p1, p3);
    	spy.setParent(p1, p2);
    	r = spy.create(p2, byFunctionThenId);
    	assertWellFormed(true, r);
    }
    
    public void testW90() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", p1, null, null);
    	Spy.Part p3 = spy.newPart("leg", null, null, p2);
    	
    	spy.setRight(p2, p3);
    	spy.setParent(p1, p2);
    	r = spy.create(p2, byFunctionThenId);
    	assertWellFormed(true, r);
    }
    
    public void testW91() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("leg", p1, null, null);
    	Spy.Part p3 = spy.newPart("head", null, null, p1);
    	
    	spy.setRight(p1, p3);
    	spy.setParent(p1, p2);
    	r = spy.create(p2, byFunctionThenId);
    	assertWellFormed(true, r);
    }
    
    public void testW92() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("head", null, null, p1);
    	Spy.Part p3 = spy.newPart("leg", p1, null, null);
    	Spy.Part p4 = spy.newPart("leg", null, null, p3);
    	
    	spy.setRight(p1, p2);
    	spy.setRight(p3, p4);
    	spy.setParent(p1, p3);
    	r = spy.create(p3, byFunctionThenId);
    	assertWellFormed(true, r);
    }
    
    public void testW93() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("head", null, null, p1);
    	Spy.Part p3 = spy.newPart("leg", p1, null, null);
    	Spy.Part p4 = spy.newPart("leg", null, null, p3);
    	
    	spy.setLeft(p1, p2);
    	spy.setRight(p3, p4);
    	spy.setParent(p1, p3);
    	r = spy.create(p3, byFunctionThenId);
    	assertWellFormed(false, r);
    }
    
    public void testW94() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("head", null, null, p1);
    	Spy.Part p3 = spy.newPart("leg", p1, null, null);
    	Spy.Part p4 = spy.newPart("arm", null, null, p3);
    	
    	spy.setRight(p1, p2);
    	spy.setRight(p3, p4);
    	spy.setParent(p1, p3);
    	r = spy.create(p3, byFunctionThenId);
    	assertWellFormed(false, r);
    }
    
    public void testW95() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("arm", p1, null, null);
    	Spy.Part p3 = spy.newPart("head", p2, null, null);
    	Spy.Part p4 = spy.newPart("leg", null, null, p3);
    	Spy.Part p5 = spy.newPart("leg", null, null, p4);
    	
    	spy.setRight(p3, p4);
    	spy.setRight(p4, p5);
    	spy.setParent(p1, p2);
    	spy.setParent(p2, p3);
    	r = spy.create(p3, nonDiscrimination);
    	assertWellFormed(true, r);
    }
    
    public void testW96() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("arm", p1, null, null);
    	Spy.Part p3 = spy.newPart("head", p2, null, null);
    	Spy.Part p4 = spy.newPart("leg", null, null, p3);
    	Spy.Part p5 = spy.newPart("leg", null, null, p4);
    	
    	spy.setRight(p3, p4);
    	spy.setRight(p4, p5);
    	spy.setParent(p1, p2);
    	spy.setParent(p2, p3);
    	r = spy.create(p3, byFunctionThenId);
    	assertWellFormed(true, r);
    }
    
    public void testW97() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("arm", p1, null, null);
    	Spy.Part p3 = spy.newPart("arm", null, null, p2);
    	Spy.Part p4 = spy.newPart("arm", p2, null, null);
    	Spy.Part p5 = spy.newPart("arm", null, null, p4);
    	
    	spy.setRight(p2, p3);
    	spy.setRight(p4, p5);
    	spy.setParent(p1, p2);
    	spy.setParent(p2, p4);
    	r = spy.create(p4, nonDiscrimination);
    	assertWellFormed(true, r);
    }
    
    public void testW98() {
    	Spy.Part p1 = spy.newPart("arm", null, null, null);
    	Spy.Part p2 = spy.newPart("arm", p1, null, null);
    	Spy.Part p3 = spy.newPart("head", p2, null, null);
    	Spy.Part p4 = spy.newPart("leg", null, null, p3);
    	Spy.Part p5 = spy.newPart("leg", null, null, p4);
    	
    	spy.setRight(p3, p4);
    	spy.setRight(p4, p5);
    	spy.setParent(p1, p2);
    	r = spy.create(p3, byFunctionThenId);
    	assertWellFormed(false, r);
    }
    
}