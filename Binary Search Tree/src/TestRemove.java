import junit.framework.TestCase;

import edu.uwm.cs351.WiredRobot;
import edu.uwm.cs351.WiredRobot.FunctionalPart;

public class TestRemove extends TestCase {
	protected WiredRobot r;
	protected FunctionalPart p0, p1, p2, p3, p4, p5, p6;

	@Override // implementation
	protected void setUp() {
		p0 = new FunctionalPart();
		p1 = new FunctionalPart();
		p2 = new FunctionalPart();
		p3 = new FunctionalPart();
		p4 = new FunctionalPart();
		p5 = new FunctionalPart();
		p6 = new FunctionalPart();
		r = new WiredRobot();
	}

	public void test1000() {
		r.addPart("ARM",p0);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertNull(p);
	}

	public void test2000() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test2001() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test2002() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test2003() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test3000() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test3001() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test3002() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test3003() {
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test3004() {
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test3005() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test3006() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test3007() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test3008() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test3009() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test3010() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test3011() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test3012() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test3013() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test3014() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test4000() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test4001() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test4002() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test4003() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test4004() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test4005() {
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test4006() {
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test4007() {
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test4008() {
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test4009() {
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test4010() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test4011() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test4012() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test4013() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test4014() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test4015() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test4016() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test4017() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test4018() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test4019() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test4020() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test4021() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test4022() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test4023() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test4024() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test4025() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test4026() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test4027() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test4028() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test4029() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test4030() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test4031() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test4032() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test4033() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test4034() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test4035() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test4036() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test4037() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test4038() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test4039() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test4040() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test4041() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test4042() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test4043() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test4044() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test4045() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test4046() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test4047() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5000() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5001() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5002() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5003() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5004() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5005() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5006() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5007() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5008() {
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5009() {
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5010() {
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5011() {
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5012() {
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5013() {
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5014() {
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5015() {
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5016() {
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5017() {
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5018() {
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5019() {
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5020() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5021() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5022() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5023() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5024() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5025() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5026() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5027() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5028() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5029() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5030() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5031() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5032() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5033() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5034() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5035() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5036() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5037() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5038() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5039() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5040() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5041() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5042() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5043() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5044() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5045() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5046() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5047() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5048() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5049() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5050() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5051() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5052() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5053() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5054() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5055() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5056() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5057() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5058() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5059() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5060() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5061() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5062() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5063() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5064() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5065() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5066() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5067() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5068() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5069() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5070() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5071() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5072() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5073() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5074() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5075() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5076() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5077() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5078() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5079() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5080() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5081() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5082() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5083() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5084() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5085() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5086() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5087() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5088() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5089() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5090() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5091() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5092() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5093() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5094() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5095() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5096() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5097() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5098() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5099() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5100() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5101() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5102() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5103() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5104() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5105() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5106() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5107() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5108() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5109() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5110() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5111() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5112() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5113() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5114() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5115() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5116() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5117() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5118() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5119() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5120() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5121() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5122() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5123() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5124() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5125() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5126() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5127() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5128() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5129() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5130() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5131() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5132() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5133() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5134() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5135() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5136() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5137() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5138() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5139() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5140() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5141() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5142() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5143() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5144() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test5145() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6000() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6001() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6002() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6003() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6004() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6005() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6006() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6007() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6008() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6009() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6010() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6011() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6012() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6013() {
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6014() {
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6015() {
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6016() {
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6017() {
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6018() {
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6019() {
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6020() {
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6021() {
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6022() {
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6023() {
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6024() {
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6025() {
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6026() {
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6027() {
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6028() {
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6029() {
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6030() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6031() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6032() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6033() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6034() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6035() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6036() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6037() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6038() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6039() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6040() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6041() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6042() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6043() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6044() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6045() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6046() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6047() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6048() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6049() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6050() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6051() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6052() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6053() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6054() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6055() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6056() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6057() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6058() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6059() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6060() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6061() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6062() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6063() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6064() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6065() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6066() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6067() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6068() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6069() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6070() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6071() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6072() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6073() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6074() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6075() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6076() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6077() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6078() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6079() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6080() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6081() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6082() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6083() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6084() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6085() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6086() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6087() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6088() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6089() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6090() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6091() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6092() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6093() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6094() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6095() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6096() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6097() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6098() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6099() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6100() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6101() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6102() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6103() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6104() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6105() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6106() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6107() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6108() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6109() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6110() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6111() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6112() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6113() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6114() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6115() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6116() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6117() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6118() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6119() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6120() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6121() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6122() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6123() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6124() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6125() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6126() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6127() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6128() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6129() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6130() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6131() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6132() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6133() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6134() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6135() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6136() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6137() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6138() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6139() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6140() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6141() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6142() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6143() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6144() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6145() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6146() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6147() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6148() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6149() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6150() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6151() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6152() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6153() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6154() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6155() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6156() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6157() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6158() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6159() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6160() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6161() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6162() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6163() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6164() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6165() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6166() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6167() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6168() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6169() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6170() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6171() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6172() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6173() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6174() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6175() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6176() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6177() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6178() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6179() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6180() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6181() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6182() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6183() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6184() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6185() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6186() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6187() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6188() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6189() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6190() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6191() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6192() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6193() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6194() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6195() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6196() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6197() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6198() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6199() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6200() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6201() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6202() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6203() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6204() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6205() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6206() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6207() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6208() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6209() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6210() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6211() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6212() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6213() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6214() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6215() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6216() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6217() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6218() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6219() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6220() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6221() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6222() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6223() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6224() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6225() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6226() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6227() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6228() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6229() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6230() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6231() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6232() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6233() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6234() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6235() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6236() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6237() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6238() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6239() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6240() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6241() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6242() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6243() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6244() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6245() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6246() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6247() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6248() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6249() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6250() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6251() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6252() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6253() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6254() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6255() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6256() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6257() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6258() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6259() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6260() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6261() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6262() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6263() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6264() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6265() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6266() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6267() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6268() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6269() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6270() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6271() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6272() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6273() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6274() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6275() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6276() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6277() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6278() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6279() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6280() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6281() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6282() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6283() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6284() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6285() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6286() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6287() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6288() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6289() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6290() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6291() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6292() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6293() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6294() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6295() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6296() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6297() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6298() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6299() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6300() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6301() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6302() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6303() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6304() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6305() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6306() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6307() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6308() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6309() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6310() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6311() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6312() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6313() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6314() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6315() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6316() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6317() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6318() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6319() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6320() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6321() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6322() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6323() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6324() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6325() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6326() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6327() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6328() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6329() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6330() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6331() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6332() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6333() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6334() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6335() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6336() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6337() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6338() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6339() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6340() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6341() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6342() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6343() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6344() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6345() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6346() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6347() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6348() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6349() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6350() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6351() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6352() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6353() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6354() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6355() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6356() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6357() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6358() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6359() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6360() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6361() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6362() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6363() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6364() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6365() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6366() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6367() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6368() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6369() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6370() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6371() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6372() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6373() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6374() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6375() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6376() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6377() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6378() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6379() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6380() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6381() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6382() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6383() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6384() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6385() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6386() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6387() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6388() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6389() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6390() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6391() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6392() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6393() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6394() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6395() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6396() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6397() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6398() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6399() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6400() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6401() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6402() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6403() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6404() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6405() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6406() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6407() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6408() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6409() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6410() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6411() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6412() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6413() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6414() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6415() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6416() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6417() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6418() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6419() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6420() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6421() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6422() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6423() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6424() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test6425() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7000() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7001() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7002() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7003() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7004() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7005() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7006() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7007() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7008() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7009() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7010() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7011() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7012() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7013() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7014() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7015() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7016() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7017() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7018() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7019() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7020() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7021() {
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7022() {
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7023() {
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7024() {
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7025() {
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7026() {
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7027() {
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7028() {
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7029() {
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7030() {
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7031() {
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7032() {
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7033() {
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7034() {
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7035() {
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7036() {
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7037() {
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7038() {
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7039() {
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7040() {
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7041() {
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7042() {
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7043() {
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7044() {
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7045() {
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7046() {
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7047() {
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7048() {
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7049() {
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7050() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7051() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7052() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7053() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7054() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7055() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7056() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7057() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7058() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7059() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7060() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7061() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7062() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7063() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7064() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7065() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7066() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7067() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7068() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7069() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7070() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7071() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7072() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7073() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7074() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7075() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7076() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7077() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7078() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7079() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7080() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7081() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7082() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7083() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7084() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7085() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7086() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7087() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7088() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7089() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7090() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7091() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7092() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7093() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7094() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7095() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7096() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7097() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7098() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7099() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7100() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7101() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7102() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7103() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7104() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7105() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7106() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7107() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7108() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7109() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7110() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7111() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7112() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7113() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7114() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7115() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7116() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7117() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7118() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7119() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7120() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7121() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7122() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7123() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7124() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7125() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7126() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7127() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7128() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7129() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7130() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7131() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7132() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7133() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7134() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7135() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7136() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7137() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7138() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7139() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7140() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7141() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7142() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7143() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7144() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7145() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7146() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7147() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7148() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7149() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7150() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7151() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7152() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7153() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7154() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7155() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7156() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7157() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7158() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7159() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7160() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7161() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7162() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7163() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7164() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7165() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7166() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7167() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7168() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7169() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7170() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7171() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7172() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7173() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7174() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7175() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7176() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7177() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7178() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7179() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7180() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7181() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7182() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7183() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7184() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7185() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7186() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7187() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7188() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7189() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7190() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7191() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7192() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7193() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7194() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7195() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7196() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7197() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7198() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7199() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7200() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7201() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7202() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7203() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7204() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7205() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7206() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7207() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7208() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7209() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7210() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7211() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7212() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7213() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7214() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7215() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7216() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7217() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7218() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7219() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7220() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7221() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7222() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7223() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7224() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7225() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7226() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7227() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7228() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7229() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7230() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7231() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7232() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7233() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7234() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7235() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7236() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7237() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7238() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7239() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7240() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7241() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7242() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7243() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7244() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7245() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7246() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7247() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7248() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7249() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7250() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7251() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7252() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7253() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7254() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7255() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7256() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7257() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7258() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7259() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7260() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7261() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7262() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7263() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7264() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7265() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7266() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7267() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7268() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7269() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7270() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7271() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7272() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7273() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7274() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7275() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7276() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7277() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7278() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7279() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7280() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7281() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7282() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7283() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7284() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7285() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7286() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7287() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7288() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7289() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7290() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7291() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7292() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7293() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7294() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7295() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7296() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7297() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7298() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7299() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7300() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7301() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7302() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7303() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7304() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7305() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7306() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7307() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7308() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7309() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7310() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7311() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7312() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7313() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7314() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7315() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7316() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7317() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7318() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7319() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7320() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7321() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7322() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7323() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7324() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7325() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7326() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7327() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7328() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7329() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7330() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7331() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7332() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7333() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7334() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7335() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7336() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7337() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7338() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7339() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7340() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7341() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7342() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7343() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7344() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7345() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7346() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7347() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7348() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7349() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7350() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7351() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7352() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7353() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7354() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7355() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7356() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7357() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7358() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7359() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7360() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7361() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7362() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7363() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7364() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7365() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7366() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7367() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7368() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7369() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7370() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7371() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7372() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7373() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7374() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7375() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7376() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7377() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7378() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7379() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7380() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7381() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7382() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7383() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7384() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7385() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7386() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7387() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7388() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7389() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7390() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7391() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7392() {
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7393() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7394() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7395() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7396() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7397() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7398() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7399() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7400() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7401() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7402() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7403() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7404() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7405() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7406() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7407() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7408() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7409() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7410() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7411() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7412() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7413() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7414() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7415() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7416() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7417() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7418() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7419() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7420() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7421() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7422() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7423() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7424() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7425() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7426() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7427() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7428() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7429() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7430() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7431() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7432() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7433() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7434() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7435() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7436() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7437() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7438() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7439() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7440() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7441() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7442() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7443() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7444() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7445() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7446() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7447() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7448() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7449() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7450() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7451() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7452() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7453() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7454() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p6);
		r.remove(p6);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7455() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7456() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7457() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7458() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7459() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7460() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7461() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7462() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7463() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7464() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7465() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7466() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7467() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7468() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7469() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7470() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7471() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7472() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7473() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7474() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7475() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7476() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7477() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7478() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7479() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7480() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7481() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7482() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7483() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7484() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7485() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7486() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7487() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7488() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7489() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7490() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7491() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7492() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7493() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7494() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7495() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7496() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7497() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7498() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7499() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7500() {
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7501() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7502() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7503() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7504() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7505() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7506() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7507() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7508() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7509() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7510() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7511() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7512() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7513() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7514() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7515() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7516() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7517() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7518() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7519() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7520() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7521() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7522() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7523() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7524() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7525() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7526() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7527() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7528() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7529() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7530() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7531() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7532() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7533() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7534() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7535() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7536() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7537() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7538() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7539() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7540() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7541() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7542() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7543() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7544() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7545() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7546() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7547() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7548() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7549() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7550() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7551() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7552() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7553() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7554() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7555() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7556() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7557() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7558() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7559() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7560() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7561() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7562() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7563() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7564() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7565() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7566() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7567() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7568() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7569() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7570() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7571() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7572() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7573() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7574() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7575() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7576() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7577() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7578() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7579() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7580() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7581() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7582() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7583() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7584() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7585() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7586() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7587() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7588() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7589() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7590() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7591() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7592() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7593() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7594() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7595() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7596() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7597() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7598() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7599() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7600() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7601() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7602() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7603() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7604() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7605() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7606() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7607() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7608() {
		r.addPart("ARM",p5);
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7609() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7610() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7611() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7612() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7613() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7614() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7615() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7616() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7617() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7618() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7619() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7620() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7621() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7622() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7623() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7624() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7625() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7626() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7627() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7628() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7629() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7630() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7631() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7632() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7633() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7634() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7635() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7636() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7637() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7638() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7639() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7640() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7641() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7642() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7643() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7644() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7645() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7646() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7647() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7648() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7649() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7650() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7651() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7652() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7653() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7654() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7655() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7656() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7657() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7658() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7659() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7660() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7661() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7662() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7663() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7664() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7665() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7666() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7667() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7668() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7669() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7670() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7671() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7672() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7673() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7674() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7675() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7676() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7677() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7678() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7679() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7680() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7681() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7682() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7683() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7684() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7685() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7686() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7687() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7688() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7689() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7690() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7691() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7692() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7693() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7694() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7695() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7696() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7697() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7698() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7699() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7700() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7701() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7702() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7703() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7704() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7705() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7706() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7707() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7708() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7709() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7710() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7711() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7712() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7713() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7714() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7715() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7716() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7717() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7718() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7719() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7720() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7721() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7722() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7723() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7724() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7725() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7726() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7727() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7728() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7729() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7730() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7731() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7732() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7733() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7734() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7735() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7736() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7737() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7738() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7739() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7740() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7741() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7742() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7743() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7744() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7745() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7746() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7747() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7748() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7749() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7750() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7751() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7752() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7753() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7754() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7755() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7756() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7757() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7758() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7759() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7760() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7761() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7762() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7763() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7764() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7765() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7766() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7767() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7768() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7769() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7770() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7771() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7772() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p5);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7773() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7774() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7775() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7776() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.remove(p5);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7777() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7778() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7779() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7780() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7781() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7782() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7783() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7784() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7785() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7786() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7787() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7788() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7789() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7790() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7791() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7792() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7793() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7794() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7795() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7796() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7797() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7798() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7799() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7800() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7801() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7802() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7803() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7804() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7805() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7806() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7807() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7808() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7809() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7810() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7811() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7812() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7813() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7814() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7815() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7816() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7817() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7818() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7819() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7820() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7821() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7822() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p4);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7823() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7824() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7825() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7826() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7827() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7828() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7829() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7830() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7831() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7832() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7833() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7834() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7835() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7836() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7837() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7838() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7839() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7840() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7841() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7842() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7843() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7844() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7845() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7846() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7847() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7848() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7849() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7850() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7851() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7852() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7853() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7854() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7855() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7856() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7857() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7858() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7859() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7860() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7861() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7862() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7863() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7864() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7865() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7866() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7867() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7868() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7869() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7870() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7871() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7872() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7873() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7874() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7875() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7876() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7877() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7878() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7879() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7880() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7881() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7882() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7883() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7884() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p4);
		r.remove(p4);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7885() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7886() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7887() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7888() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7889() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7890() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7891() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7892() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7893() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7894() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7895() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7896() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p3);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7897() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7898() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7899() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7900() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7901() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7902() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7903() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7904() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7905() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7906() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7907() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7908() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7909() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7910() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7911() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7912() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7913() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7914() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p3);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7915() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7916() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7917() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7918() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.remove(p3);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7919() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7920() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p2);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7921() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7922() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7923() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7924() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7925() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7926() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.addPart("ARM",p2);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7927() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7928() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.addPart("ARM",p2);
		r.remove(p2);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7929() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p0);
		r.addPart("ARM",p1);
		r.remove(p0);
		FunctionalPart p = r.getFirst();
		assertSame(p1, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}

	public void test7930() {
		r.addPart("ARM",p6);
		r.addPart("ARM",p5);
		r.addPart("ARM",p4);
		r.addPart("ARM",p3);
		r.addPart("ARM",p2);
		r.addPart("ARM",p1);
		r.addPart("ARM",p0);
		r.remove(p1);
		FunctionalPart p = r.getFirst();
		assertSame(p0, p);
		p = p.getNext();
		assertSame(p2, p);
		p = p.getNext();
		assertSame(p3, p);
		p = p.getNext();
		assertSame(p4, p);
		p = p.getNext();
		assertSame(p5, p);
		p = p.getNext();
		assertSame(p6, p);
		p = p.getNext();
		assertNull(p);
	}
}


// Total tests: 1571
