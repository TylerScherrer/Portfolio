import edu.uwm.cs351.WiredRobot;
import edu.uwm.cs351.WiredRobot.FunctionalPart;
import java.util.Comparator;

import junit.framework.TestCase;

public class TestExhaustive extends TestCase {
	private Comparator<FunctionalPart> comp = RandomTest.byFunction;
	private WiredRobot robot;

	public void test1001() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertNull(robot.getPart(null,1));
	}

	public void test2001() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		robot.addPart("head", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertNull(robot.getPart(null,2));
	}

	public void test2002() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		robot.addPart("arm", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertNull(robot.getPart(null,2));
	}

	public void test3001() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		robot.addPart("leg", p2);
		robot.addPart("head", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertNull(robot.getPart(null,3));
	}

	public void test3002() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		robot.addPart("leg", p2);
		robot.addPart("arm", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertNull(robot.getPart(null,3));
	}

	public void test3003() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		robot.addPart("head", p2);
		robot.addPart("arm", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertNull(robot.getPart(null,3));
	}

	public void test3004() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		robot.addPart("head", p2);
		robot.addPart("leg", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertNull(robot.getPart(null,3));
	}

	public void test3005() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		robot.addPart("arm", p2);
		robot.addPart("leg", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertNull(robot.getPart(null,3));
	}

	public void test3006() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		robot.addPart("arm", p2);
		robot.addPart("head", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertNull(robot.getPart(null,3));
	}

	public void test4001() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		robot.addPart("screen", p3);
		robot.addPart("leg", p2);
		robot.addPart("head", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertNull(robot.getPart(null,4));
	}

	public void test4002() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		robot.addPart("screen", p3);
		robot.addPart("leg", p2);
		robot.addPart("arm", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertNull(robot.getPart(null,4));
	}

	public void test4003() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		robot.addPart("screen", p3);
		robot.addPart("head", p2);
		robot.addPart("arm", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertNull(robot.getPart(null,4));
	}

	public void test4004() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		robot.addPart("screen", p3);
		robot.addPart("head", p2);
		robot.addPart("leg", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertNull(robot.getPart(null,4));
	}

	public void test4005() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		robot.addPart("screen", p3);
		robot.addPart("arm", p2);
		robot.addPart("leg", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertNull(robot.getPart(null,4));
	}

	public void test4006() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		robot.addPart("screen", p3);
		robot.addPart("arm", p2);
		robot.addPart("head", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertNull(robot.getPart(null,4));
	}

	public void test4007() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		robot.addPart("leg", p3);
		robot.addPart("arm", p2);
		robot.addPart("head", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertNull(robot.getPart(null,4));
	}

	public void test4008() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		robot.addPart("leg", p3);
		robot.addPart("arm", p2);
		robot.addPart("screen", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertNull(robot.getPart(null,4));
	}

	public void test4009() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		robot.addPart("leg", p3);
		robot.addPart("head", p2);
		robot.addPart("screen", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertNull(robot.getPart(null,4));
	}

	public void test4010() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		robot.addPart("leg", p3);
		robot.addPart("head", p2);
		robot.addPart("arm", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertNull(robot.getPart(null,4));
	}

	public void test4011() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		robot.addPart("leg", p3);
		robot.addPart("screen", p2);
		robot.addPart("arm", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertNull(robot.getPart(null,4));
	}

	public void test4012() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		robot.addPart("leg", p3);
		robot.addPart("screen", p2);
		robot.addPart("head", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertNull(robot.getPart(null,4));
	}

	public void test4013() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		robot.addPart("head", p3);
		robot.addPart("screen", p2);
		robot.addPart("leg", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertNull(robot.getPart(null,4));
	}

	public void test4014() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		robot.addPart("head", p3);
		robot.addPart("screen", p2);
		robot.addPart("arm", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertNull(robot.getPart(null,4));
	}

	public void test4015() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		robot.addPart("head", p3);
		robot.addPart("leg", p2);
		robot.addPart("arm", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertNull(robot.getPart(null,4));
	}

	public void test4016() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		robot.addPart("head", p3);
		robot.addPart("leg", p2);
		robot.addPart("screen", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertNull(robot.getPart(null,4));
	}

	public void test4017() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		robot.addPart("head", p3);
		robot.addPart("arm", p2);
		robot.addPart("screen", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertNull(robot.getPart(null,4));
	}

	public void test4018() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		robot.addPart("head", p3);
		robot.addPart("arm", p2);
		robot.addPart("leg", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertNull(robot.getPart(null,4));
	}

	public void test4019() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		robot.addPart("arm", p3);
		robot.addPart("head", p2);
		robot.addPart("leg", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertNull(robot.getPart(null,4));
	}

	public void test4020() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		robot.addPart("arm", p3);
		robot.addPart("head", p2);
		robot.addPart("screen", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertNull(robot.getPart(null,4));
	}

	public void test4021() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		robot.addPart("arm", p3);
		robot.addPart("leg", p2);
		robot.addPart("screen", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertNull(robot.getPart(null,4));
	}

	public void test4022() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		robot.addPart("arm", p3);
		robot.addPart("leg", p2);
		robot.addPart("head", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertNull(robot.getPart(null,4));
	}

	public void test4023() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		robot.addPart("arm", p3);
		robot.addPart("screen", p2);
		robot.addPart("head", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertNull(robot.getPart(null,4));
	}

	public void test4024() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		robot.addPart("arm", p3);
		robot.addPart("screen", p2);
		robot.addPart("leg", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertNull(robot.getPart(null,4));
	}

	public void test5001() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("speaker", p4);
		robot.addPart("screen", p3);
		robot.addPart("leg", p2);
		robot.addPart("head", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5002() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("speaker", p4);
		robot.addPart("screen", p3);
		robot.addPart("leg", p2);
		robot.addPart("arm", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5003() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("speaker", p4);
		robot.addPart("screen", p3);
		robot.addPart("head", p2);
		robot.addPart("arm", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5004() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("speaker", p4);
		robot.addPart("screen", p3);
		robot.addPart("head", p2);
		robot.addPart("leg", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5005() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("speaker", p4);
		robot.addPart("screen", p3);
		robot.addPart("arm", p2);
		robot.addPart("leg", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5006() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("speaker", p4);
		robot.addPart("screen", p3);
		robot.addPart("arm", p2);
		robot.addPart("head", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5007() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("speaker", p4);
		robot.addPart("leg", p3);
		robot.addPart("arm", p2);
		robot.addPart("head", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5008() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("speaker", p4);
		robot.addPart("leg", p3);
		robot.addPart("arm", p2);
		robot.addPart("screen", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5009() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("speaker", p4);
		robot.addPart("leg", p3);
		robot.addPart("head", p2);
		robot.addPart("screen", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5010() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("speaker", p4);
		robot.addPart("leg", p3);
		robot.addPart("head", p2);
		robot.addPart("arm", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5011() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("speaker", p4);
		robot.addPart("leg", p3);
		robot.addPart("screen", p2);
		robot.addPart("arm", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5012() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("speaker", p4);
		robot.addPart("leg", p3);
		robot.addPart("screen", p2);
		robot.addPart("head", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5013() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("speaker", p4);
		robot.addPart("head", p3);
		robot.addPart("screen", p2);
		robot.addPart("leg", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5014() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("speaker", p4);
		robot.addPart("head", p3);
		robot.addPart("screen", p2);
		robot.addPart("arm", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5015() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("speaker", p4);
		robot.addPart("head", p3);
		robot.addPart("leg", p2);
		robot.addPart("arm", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5016() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("speaker", p4);
		robot.addPart("head", p3);
		robot.addPart("leg", p2);
		robot.addPart("screen", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5017() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("speaker", p4);
		robot.addPart("head", p3);
		robot.addPart("arm", p2);
		robot.addPart("screen", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5018() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("speaker", p4);
		robot.addPart("head", p3);
		robot.addPart("arm", p2);
		robot.addPart("leg", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5019() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("speaker", p4);
		robot.addPart("arm", p3);
		robot.addPart("head", p2);
		robot.addPart("leg", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5020() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("speaker", p4);
		robot.addPart("arm", p3);
		robot.addPart("head", p2);
		robot.addPart("screen", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5021() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("speaker", p4);
		robot.addPart("arm", p3);
		robot.addPart("leg", p2);
		robot.addPart("screen", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5022() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("speaker", p4);
		robot.addPart("arm", p3);
		robot.addPart("leg", p2);
		robot.addPart("head", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5023() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("speaker", p4);
		robot.addPart("arm", p3);
		robot.addPart("screen", p2);
		robot.addPart("head", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5024() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("speaker", p4);
		robot.addPart("arm", p3);
		robot.addPart("screen", p2);
		robot.addPart("leg", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5025() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("head", p4);
		robot.addPart("arm", p3);
		robot.addPart("screen", p2);
		robot.addPart("leg", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5026() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("head", p4);
		robot.addPart("arm", p3);
		robot.addPart("screen", p2);
		robot.addPart("speaker", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5027() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("head", p4);
		robot.addPart("arm", p3);
		robot.addPart("leg", p2);
		robot.addPart("speaker", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5028() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("head", p4);
		robot.addPart("arm", p3);
		robot.addPart("leg", p2);
		robot.addPart("screen", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5029() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("head", p4);
		robot.addPart("arm", p3);
		robot.addPart("speaker", p2);
		robot.addPart("screen", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5030() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("head", p4);
		robot.addPart("arm", p3);
		robot.addPart("speaker", p2);
		robot.addPart("leg", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5031() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("head", p4);
		robot.addPart("screen", p3);
		robot.addPart("speaker", p2);
		robot.addPart("leg", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5032() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("head", p4);
		robot.addPart("screen", p3);
		robot.addPart("speaker", p2);
		robot.addPart("arm", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5033() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("head", p4);
		robot.addPart("screen", p3);
		robot.addPart("leg", p2);
		robot.addPart("arm", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5034() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("head", p4);
		robot.addPart("screen", p3);
		robot.addPart("leg", p2);
		robot.addPart("speaker", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5035() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("head", p4);
		robot.addPart("screen", p3);
		robot.addPart("arm", p2);
		robot.addPart("speaker", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5036() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("head", p4);
		robot.addPart("screen", p3);
		robot.addPart("arm", p2);
		robot.addPart("leg", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5037() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("head", p4);
		robot.addPart("leg", p3);
		robot.addPart("arm", p2);
		robot.addPart("screen", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5038() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("head", p4);
		robot.addPart("leg", p3);
		robot.addPart("arm", p2);
		robot.addPart("speaker", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5039() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("head", p4);
		robot.addPart("leg", p3);
		robot.addPart("screen", p2);
		robot.addPart("speaker", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5040() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("head", p4);
		robot.addPart("leg", p3);
		robot.addPart("screen", p2);
		robot.addPart("arm", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5041() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("head", p4);
		robot.addPart("leg", p3);
		robot.addPart("speaker", p2);
		robot.addPart("arm", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5042() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("head", p4);
		robot.addPart("leg", p3);
		robot.addPart("speaker", p2);
		robot.addPart("screen", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5043() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("head", p4);
		robot.addPart("speaker", p3);
		robot.addPart("leg", p2);
		robot.addPart("screen", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5044() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("head", p4);
		robot.addPart("speaker", p3);
		robot.addPart("leg", p2);
		robot.addPart("arm", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5045() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("head", p4);
		robot.addPart("speaker", p3);
		robot.addPart("screen", p2);
		robot.addPart("arm", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5046() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("head", p4);
		robot.addPart("speaker", p3);
		robot.addPart("screen", p2);
		robot.addPart("leg", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5047() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("head", p4);
		robot.addPart("speaker", p3);
		robot.addPart("arm", p2);
		robot.addPart("leg", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5048() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("head", p4);
		robot.addPart("speaker", p3);
		robot.addPart("arm", p2);
		robot.addPart("screen", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5049() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("leg", p4);
		robot.addPart("speaker", p3);
		robot.addPart("arm", p2);
		robot.addPart("screen", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5050() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("leg", p4);
		robot.addPart("speaker", p3);
		robot.addPart("arm", p2);
		robot.addPart("head", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5051() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("leg", p4);
		robot.addPart("speaker", p3);
		robot.addPart("screen", p2);
		robot.addPart("head", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5052() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("leg", p4);
		robot.addPart("speaker", p3);
		robot.addPart("screen", p2);
		robot.addPart("arm", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5053() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("leg", p4);
		robot.addPart("speaker", p3);
		robot.addPart("head", p2);
		robot.addPart("arm", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5054() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("leg", p4);
		robot.addPart("speaker", p3);
		robot.addPart("head", p2);
		robot.addPart("screen", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5055() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("leg", p4);
		robot.addPart("arm", p3);
		robot.addPart("head", p2);
		robot.addPart("screen", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5056() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("leg", p4);
		robot.addPart("arm", p3);
		robot.addPart("head", p2);
		robot.addPart("speaker", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5057() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("leg", p4);
		robot.addPart("arm", p3);
		robot.addPart("screen", p2);
		robot.addPart("speaker", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5058() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("leg", p4);
		robot.addPart("arm", p3);
		robot.addPart("screen", p2);
		robot.addPart("head", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5059() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("leg", p4);
		robot.addPart("arm", p3);
		robot.addPart("speaker", p2);
		robot.addPart("head", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5060() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("leg", p4);
		robot.addPart("arm", p3);
		robot.addPart("speaker", p2);
		robot.addPart("screen", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5061() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("leg", p4);
		robot.addPart("screen", p3);
		robot.addPart("speaker", p2);
		robot.addPart("arm", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5062() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("leg", p4);
		robot.addPart("screen", p3);
		robot.addPart("speaker", p2);
		robot.addPart("head", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5063() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("leg", p4);
		robot.addPart("screen", p3);
		robot.addPart("arm", p2);
		robot.addPart("head", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5064() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("leg", p4);
		robot.addPart("screen", p3);
		robot.addPart("arm", p2);
		robot.addPart("speaker", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5065() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("leg", p4);
		robot.addPart("screen", p3);
		robot.addPart("head", p2);
		robot.addPart("speaker", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5066() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("leg", p4);
		robot.addPart("screen", p3);
		robot.addPart("head", p2);
		robot.addPart("arm", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5067() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("leg", p4);
		robot.addPart("head", p3);
		robot.addPart("screen", p2);
		robot.addPart("arm", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5068() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("leg", p4);
		robot.addPart("head", p3);
		robot.addPart("screen", p2);
		robot.addPart("speaker", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5069() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("leg", p4);
		robot.addPart("head", p3);
		robot.addPart("arm", p2);
		robot.addPart("speaker", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5070() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("leg", p4);
		robot.addPart("head", p3);
		robot.addPart("arm", p2);
		robot.addPart("screen", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5071() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("leg", p4);
		robot.addPart("head", p3);
		robot.addPart("speaker", p2);
		robot.addPart("screen", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5072() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("leg", p4);
		robot.addPart("head", p3);
		robot.addPart("speaker", p2);
		robot.addPart("arm", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5073() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("screen", p4);
		robot.addPart("head", p3);
		robot.addPart("speaker", p2);
		robot.addPart("arm", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5074() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("screen", p4);
		robot.addPart("head", p3);
		robot.addPart("speaker", p2);
		robot.addPart("leg", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5075() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("screen", p4);
		robot.addPart("head", p3);
		robot.addPart("arm", p2);
		robot.addPart("leg", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5076() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("screen", p4);
		robot.addPart("head", p3);
		robot.addPart("arm", p2);
		robot.addPart("speaker", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5077() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("screen", p4);
		robot.addPart("head", p3);
		robot.addPart("leg", p2);
		robot.addPart("speaker", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5078() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("screen", p4);
		robot.addPart("head", p3);
		robot.addPart("leg", p2);
		robot.addPart("arm", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5079() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("screen", p4);
		robot.addPart("speaker", p3);
		robot.addPart("leg", p2);
		robot.addPart("arm", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5080() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("screen", p4);
		robot.addPart("speaker", p3);
		robot.addPart("leg", p2);
		robot.addPart("head", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5081() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("screen", p4);
		robot.addPart("speaker", p3);
		robot.addPart("arm", p2);
		robot.addPart("head", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5082() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("screen", p4);
		robot.addPart("speaker", p3);
		robot.addPart("arm", p2);
		robot.addPart("leg", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5083() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("screen", p4);
		robot.addPart("speaker", p3);
		robot.addPart("head", p2);
		robot.addPart("leg", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5084() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("screen", p4);
		robot.addPart("speaker", p3);
		robot.addPart("head", p2);
		robot.addPart("arm", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5085() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("screen", p4);
		robot.addPart("arm", p3);
		robot.addPart("head", p2);
		robot.addPart("speaker", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5086() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("screen", p4);
		robot.addPart("arm", p3);
		robot.addPart("head", p2);
		robot.addPart("leg", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5087() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("screen", p4);
		robot.addPart("arm", p3);
		robot.addPart("speaker", p2);
		robot.addPart("leg", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5088() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("screen", p4);
		robot.addPart("arm", p3);
		robot.addPart("speaker", p2);
		robot.addPart("head", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5089() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("screen", p4);
		robot.addPart("arm", p3);
		robot.addPart("leg", p2);
		robot.addPart("head", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5090() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("screen", p4);
		robot.addPart("arm", p3);
		robot.addPart("leg", p2);
		robot.addPart("speaker", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5091() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("screen", p4);
		robot.addPart("leg", p3);
		robot.addPart("arm", p2);
		robot.addPart("speaker", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5092() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("screen", p4);
		robot.addPart("leg", p3);
		robot.addPart("arm", p2);
		robot.addPart("head", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5093() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("screen", p4);
		robot.addPart("leg", p3);
		robot.addPart("speaker", p2);
		robot.addPart("head", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5094() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("screen", p4);
		robot.addPart("leg", p3);
		robot.addPart("speaker", p2);
		robot.addPart("arm", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5095() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("screen", p4);
		robot.addPart("leg", p3);
		robot.addPart("head", p2);
		robot.addPart("arm", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5096() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("screen", p4);
		robot.addPart("leg", p3);
		robot.addPart("head", p2);
		robot.addPart("speaker", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5097() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("arm", p4);
		robot.addPart("leg", p3);
		robot.addPart("head", p2);
		robot.addPart("speaker", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5098() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("arm", p4);
		robot.addPart("leg", p3);
		robot.addPart("head", p2);
		robot.addPart("screen", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5099() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("arm", p4);
		robot.addPart("leg", p3);
		robot.addPart("speaker", p2);
		robot.addPart("screen", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5100() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("arm", p4);
		robot.addPart("leg", p3);
		robot.addPart("speaker", p2);
		robot.addPart("head", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5101() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("arm", p4);
		robot.addPart("leg", p3);
		robot.addPart("screen", p2);
		robot.addPart("head", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5102() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("arm", p4);
		robot.addPart("leg", p3);
		robot.addPart("screen", p2);
		robot.addPart("speaker", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5103() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("arm", p4);
		robot.addPart("head", p3);
		robot.addPart("screen", p2);
		robot.addPart("speaker", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5104() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("arm", p4);
		robot.addPart("head", p3);
		robot.addPart("screen", p2);
		robot.addPart("leg", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5105() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("arm", p4);
		robot.addPart("head", p3);
		robot.addPart("speaker", p2);
		robot.addPart("leg", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5106() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("arm", p4);
		robot.addPart("head", p3);
		robot.addPart("speaker", p2);
		robot.addPart("screen", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5107() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("arm", p4);
		robot.addPart("head", p3);
		robot.addPart("leg", p2);
		robot.addPart("screen", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5108() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("arm", p4);
		robot.addPart("head", p3);
		robot.addPart("leg", p2);
		robot.addPart("speaker", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5109() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("arm", p4);
		robot.addPart("speaker", p3);
		robot.addPart("leg", p2);
		robot.addPart("head", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5110() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("arm", p4);
		robot.addPart("speaker", p3);
		robot.addPart("leg", p2);
		robot.addPart("screen", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5111() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("arm", p4);
		robot.addPart("speaker", p3);
		robot.addPart("head", p2);
		robot.addPart("screen", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5112() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("arm", p4);
		robot.addPart("speaker", p3);
		robot.addPart("head", p2);
		robot.addPart("leg", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5113() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("arm", p4);
		robot.addPart("speaker", p3);
		robot.addPart("screen", p2);
		robot.addPart("leg", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5114() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("arm", p4);
		robot.addPart("speaker", p3);
		robot.addPart("screen", p2);
		robot.addPart("head", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5115() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("arm", p4);
		robot.addPart("screen", p3);
		robot.addPart("speaker", p2);
		robot.addPart("head", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5116() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("arm", p4);
		robot.addPart("screen", p3);
		robot.addPart("speaker", p2);
		robot.addPart("leg", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5117() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("arm", p4);
		robot.addPart("screen", p3);
		robot.addPart("head", p2);
		robot.addPart("leg", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5118() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("arm", p4);
		robot.addPart("screen", p3);
		robot.addPart("head", p2);
		robot.addPart("speaker", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5119() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("arm", p4);
		robot.addPart("screen", p3);
		robot.addPart("leg", p2);
		robot.addPart("speaker", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test5120() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		robot.addPart("arm", p4);
		robot.addPart("screen", p3);
		robot.addPart("leg", p2);
		robot.addPart("head", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertNull(robot.getPart(null,5));
	}

	public void test6001() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("speaker", p4);
		robot.addPart("screen", p3);
		robot.addPart("leg", p2);
		robot.addPart("head", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6002() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("speaker", p4);
		robot.addPart("screen", p3);
		robot.addPart("leg", p2);
		robot.addPart("arm", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6003() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("speaker", p4);
		robot.addPart("screen", p3);
		robot.addPart("head", p2);
		robot.addPart("arm", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6004() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("speaker", p4);
		robot.addPart("screen", p3);
		robot.addPart("head", p2);
		robot.addPart("leg", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6005() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("speaker", p4);
		robot.addPart("screen", p3);
		robot.addPart("arm", p2);
		robot.addPart("leg", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6006() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("speaker", p4);
		robot.addPart("screen", p3);
		robot.addPart("arm", p2);
		robot.addPart("head", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6007() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("speaker", p4);
		robot.addPart("leg", p3);
		robot.addPart("arm", p2);
		robot.addPart("head", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6008() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("speaker", p4);
		robot.addPart("leg", p3);
		robot.addPart("arm", p2);
		robot.addPart("screen", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6009() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("speaker", p4);
		robot.addPart("leg", p3);
		robot.addPart("head", p2);
		robot.addPart("screen", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6010() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("speaker", p4);
		robot.addPart("leg", p3);
		robot.addPart("head", p2);
		robot.addPart("arm", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6011() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("speaker", p4);
		robot.addPart("leg", p3);
		robot.addPart("screen", p2);
		robot.addPart("arm", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6012() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("speaker", p4);
		robot.addPart("leg", p3);
		robot.addPart("screen", p2);
		robot.addPart("head", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6013() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("speaker", p4);
		robot.addPart("head", p3);
		robot.addPart("screen", p2);
		robot.addPart("leg", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6014() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("speaker", p4);
		robot.addPart("head", p3);
		robot.addPart("screen", p2);
		robot.addPart("arm", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6015() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("speaker", p4);
		robot.addPart("head", p3);
		robot.addPart("leg", p2);
		robot.addPart("arm", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6016() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("speaker", p4);
		robot.addPart("head", p3);
		robot.addPart("leg", p2);
		robot.addPart("screen", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6017() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("speaker", p4);
		robot.addPart("head", p3);
		robot.addPart("arm", p2);
		robot.addPart("screen", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6018() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("speaker", p4);
		robot.addPart("head", p3);
		robot.addPart("arm", p2);
		robot.addPart("leg", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6019() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("speaker", p4);
		robot.addPart("arm", p3);
		robot.addPart("head", p2);
		robot.addPart("leg", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6020() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("speaker", p4);
		robot.addPart("arm", p3);
		robot.addPart("head", p2);
		robot.addPart("screen", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6021() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("speaker", p4);
		robot.addPart("arm", p3);
		robot.addPart("leg", p2);
		robot.addPart("screen", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6022() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("speaker", p4);
		robot.addPart("arm", p3);
		robot.addPart("leg", p2);
		robot.addPart("head", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6023() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("speaker", p4);
		robot.addPart("arm", p3);
		robot.addPart("screen", p2);
		robot.addPart("head", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6024() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("speaker", p4);
		robot.addPart("arm", p3);
		robot.addPart("screen", p2);
		robot.addPart("leg", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6025() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("head", p4);
		robot.addPart("arm", p3);
		robot.addPart("screen", p2);
		robot.addPart("leg", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6026() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("head", p4);
		robot.addPart("arm", p3);
		robot.addPart("screen", p2);
		robot.addPart("speaker", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6027() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("head", p4);
		robot.addPart("arm", p3);
		robot.addPart("leg", p2);
		robot.addPart("speaker", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6028() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("head", p4);
		robot.addPart("arm", p3);
		robot.addPart("leg", p2);
		robot.addPart("screen", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6029() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("head", p4);
		robot.addPart("arm", p3);
		robot.addPart("speaker", p2);
		robot.addPart("screen", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6030() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("head", p4);
		robot.addPart("arm", p3);
		robot.addPart("speaker", p2);
		robot.addPart("leg", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6031() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("head", p4);
		robot.addPart("screen", p3);
		robot.addPart("speaker", p2);
		robot.addPart("leg", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6032() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("head", p4);
		robot.addPart("screen", p3);
		robot.addPart("speaker", p2);
		robot.addPart("arm", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6033() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("head", p4);
		robot.addPart("screen", p3);
		robot.addPart("leg", p2);
		robot.addPart("arm", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6034() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("head", p4);
		robot.addPart("screen", p3);
		robot.addPart("leg", p2);
		robot.addPart("speaker", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6035() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("head", p4);
		robot.addPart("screen", p3);
		robot.addPart("arm", p2);
		robot.addPart("speaker", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6036() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("head", p4);
		robot.addPart("screen", p3);
		robot.addPart("arm", p2);
		robot.addPart("leg", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6037() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("head", p4);
		robot.addPart("leg", p3);
		robot.addPart("arm", p2);
		robot.addPart("screen", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6038() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("head", p4);
		robot.addPart("leg", p3);
		robot.addPart("arm", p2);
		robot.addPart("speaker", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6039() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("head", p4);
		robot.addPart("leg", p3);
		robot.addPart("screen", p2);
		robot.addPart("speaker", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6040() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("head", p4);
		robot.addPart("leg", p3);
		robot.addPart("screen", p2);
		robot.addPart("arm", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6041() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("head", p4);
		robot.addPart("leg", p3);
		robot.addPart("speaker", p2);
		robot.addPart("arm", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6042() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("head", p4);
		robot.addPart("leg", p3);
		robot.addPart("speaker", p2);
		robot.addPart("screen", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6043() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("head", p4);
		robot.addPart("speaker", p3);
		robot.addPart("leg", p2);
		robot.addPart("screen", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6044() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("head", p4);
		robot.addPart("speaker", p3);
		robot.addPart("leg", p2);
		robot.addPart("arm", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6045() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("head", p4);
		robot.addPart("speaker", p3);
		robot.addPart("screen", p2);
		robot.addPart("arm", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6046() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("head", p4);
		robot.addPart("speaker", p3);
		robot.addPart("screen", p2);
		robot.addPart("leg", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6047() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("head", p4);
		robot.addPart("speaker", p3);
		robot.addPart("arm", p2);
		robot.addPart("leg", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6048() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("head", p4);
		robot.addPart("speaker", p3);
		robot.addPart("arm", p2);
		robot.addPart("screen", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6049() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("leg", p4);
		robot.addPart("speaker", p3);
		robot.addPart("arm", p2);
		robot.addPart("screen", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6050() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("leg", p4);
		robot.addPart("speaker", p3);
		robot.addPart("arm", p2);
		robot.addPart("head", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6051() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("leg", p4);
		robot.addPart("speaker", p3);
		robot.addPart("screen", p2);
		robot.addPart("head", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6052() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("leg", p4);
		robot.addPart("speaker", p3);
		robot.addPart("screen", p2);
		robot.addPart("arm", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6053() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("leg", p4);
		robot.addPart("speaker", p3);
		robot.addPart("head", p2);
		robot.addPart("arm", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6054() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("leg", p4);
		robot.addPart("speaker", p3);
		robot.addPart("head", p2);
		robot.addPart("screen", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6055() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("leg", p4);
		robot.addPart("arm", p3);
		robot.addPart("head", p2);
		robot.addPart("screen", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6056() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("leg", p4);
		robot.addPart("arm", p3);
		robot.addPart("head", p2);
		robot.addPart("speaker", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6057() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("leg", p4);
		robot.addPart("arm", p3);
		robot.addPart("screen", p2);
		robot.addPart("speaker", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6058() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("leg", p4);
		robot.addPart("arm", p3);
		robot.addPart("screen", p2);
		robot.addPart("head", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6059() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("leg", p4);
		robot.addPart("arm", p3);
		robot.addPart("speaker", p2);
		robot.addPart("head", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6060() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("leg", p4);
		robot.addPart("arm", p3);
		robot.addPart("speaker", p2);
		robot.addPart("screen", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6061() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("leg", p4);
		robot.addPart("screen", p3);
		robot.addPart("speaker", p2);
		robot.addPart("arm", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6062() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("leg", p4);
		robot.addPart("screen", p3);
		robot.addPart("speaker", p2);
		robot.addPart("head", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6063() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("leg", p4);
		robot.addPart("screen", p3);
		robot.addPart("arm", p2);
		robot.addPart("head", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6064() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("leg", p4);
		robot.addPart("screen", p3);
		robot.addPart("arm", p2);
		robot.addPart("speaker", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6065() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("leg", p4);
		robot.addPart("screen", p3);
		robot.addPart("head", p2);
		robot.addPart("speaker", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6066() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("leg", p4);
		robot.addPart("screen", p3);
		robot.addPart("head", p2);
		robot.addPart("arm", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6067() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("leg", p4);
		robot.addPart("head", p3);
		robot.addPart("screen", p2);
		robot.addPart("arm", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6068() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("leg", p4);
		robot.addPart("head", p3);
		robot.addPart("screen", p2);
		robot.addPart("speaker", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6069() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("leg", p4);
		robot.addPart("head", p3);
		robot.addPart("arm", p2);
		robot.addPart("speaker", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6070() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("leg", p4);
		robot.addPart("head", p3);
		robot.addPart("arm", p2);
		robot.addPart("screen", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6071() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("leg", p4);
		robot.addPart("head", p3);
		robot.addPart("speaker", p2);
		robot.addPart("screen", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6072() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("leg", p4);
		robot.addPart("head", p3);
		robot.addPart("speaker", p2);
		robot.addPart("arm", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6073() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("screen", p4);
		robot.addPart("head", p3);
		robot.addPart("speaker", p2);
		robot.addPart("arm", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6074() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("screen", p4);
		robot.addPart("head", p3);
		robot.addPart("speaker", p2);
		robot.addPart("leg", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6075() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("screen", p4);
		robot.addPart("head", p3);
		robot.addPart("arm", p2);
		robot.addPart("leg", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6076() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("screen", p4);
		robot.addPart("head", p3);
		robot.addPart("arm", p2);
		robot.addPart("speaker", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6077() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("screen", p4);
		robot.addPart("head", p3);
		robot.addPart("leg", p2);
		robot.addPart("speaker", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6078() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("screen", p4);
		robot.addPart("head", p3);
		robot.addPart("leg", p2);
		robot.addPart("arm", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6079() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("screen", p4);
		robot.addPart("speaker", p3);
		robot.addPart("leg", p2);
		robot.addPart("arm", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6080() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("screen", p4);
		robot.addPart("speaker", p3);
		robot.addPart("leg", p2);
		robot.addPart("head", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6081() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("screen", p4);
		robot.addPart("speaker", p3);
		robot.addPart("arm", p2);
		robot.addPart("head", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6082() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("screen", p4);
		robot.addPart("speaker", p3);
		robot.addPart("arm", p2);
		robot.addPart("leg", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6083() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("screen", p4);
		robot.addPart("speaker", p3);
		robot.addPart("head", p2);
		robot.addPart("leg", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6084() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("screen", p4);
		robot.addPart("speaker", p3);
		robot.addPart("head", p2);
		robot.addPart("arm", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6085() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("screen", p4);
		robot.addPart("arm", p3);
		robot.addPart("head", p2);
		robot.addPart("speaker", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6086() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("screen", p4);
		robot.addPart("arm", p3);
		robot.addPart("head", p2);
		robot.addPart("leg", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6087() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("screen", p4);
		robot.addPart("arm", p3);
		robot.addPart("speaker", p2);
		robot.addPart("leg", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6088() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("screen", p4);
		robot.addPart("arm", p3);
		robot.addPart("speaker", p2);
		robot.addPart("head", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6089() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("screen", p4);
		robot.addPart("arm", p3);
		robot.addPart("leg", p2);
		robot.addPart("head", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6090() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("screen", p4);
		robot.addPart("arm", p3);
		robot.addPart("leg", p2);
		robot.addPart("speaker", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6091() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("screen", p4);
		robot.addPart("leg", p3);
		robot.addPart("arm", p2);
		robot.addPart("speaker", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6092() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("screen", p4);
		robot.addPart("leg", p3);
		robot.addPart("arm", p2);
		robot.addPart("head", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6093() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("screen", p4);
		robot.addPart("leg", p3);
		robot.addPart("speaker", p2);
		robot.addPart("head", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6094() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("screen", p4);
		robot.addPart("leg", p3);
		robot.addPart("speaker", p2);
		robot.addPart("arm", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6095() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("screen", p4);
		robot.addPart("leg", p3);
		robot.addPart("head", p2);
		robot.addPart("arm", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6096() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("screen", p4);
		robot.addPart("leg", p3);
		robot.addPart("head", p2);
		robot.addPart("speaker", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6097() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("arm", p4);
		robot.addPart("leg", p3);
		robot.addPart("head", p2);
		robot.addPart("speaker", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6098() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("arm", p4);
		robot.addPart("leg", p3);
		robot.addPart("head", p2);
		robot.addPart("screen", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6099() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("arm", p4);
		robot.addPart("leg", p3);
		robot.addPart("speaker", p2);
		robot.addPart("screen", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6100() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("arm", p4);
		robot.addPart("leg", p3);
		robot.addPart("speaker", p2);
		robot.addPart("head", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6101() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("arm", p4);
		robot.addPart("leg", p3);
		robot.addPart("screen", p2);
		robot.addPart("head", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6102() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("arm", p4);
		robot.addPart("leg", p3);
		robot.addPart("screen", p2);
		robot.addPart("speaker", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6103() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("arm", p4);
		robot.addPart("head", p3);
		robot.addPart("screen", p2);
		robot.addPart("speaker", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6104() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("arm", p4);
		robot.addPart("head", p3);
		robot.addPart("screen", p2);
		robot.addPart("leg", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6105() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("arm", p4);
		robot.addPart("head", p3);
		robot.addPart("speaker", p2);
		robot.addPart("leg", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6106() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("arm", p4);
		robot.addPart("head", p3);
		robot.addPart("speaker", p2);
		robot.addPart("screen", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6107() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("arm", p4);
		robot.addPart("head", p3);
		robot.addPart("leg", p2);
		robot.addPart("screen", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6108() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("arm", p4);
		robot.addPart("head", p3);
		robot.addPart("leg", p2);
		robot.addPart("speaker", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6109() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("arm", p4);
		robot.addPart("speaker", p3);
		robot.addPart("leg", p2);
		robot.addPart("head", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6110() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("arm", p4);
		robot.addPart("speaker", p3);
		robot.addPart("leg", p2);
		robot.addPart("screen", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6111() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("arm", p4);
		robot.addPart("speaker", p3);
		robot.addPart("head", p2);
		robot.addPart("screen", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6112() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("arm", p4);
		robot.addPart("speaker", p3);
		robot.addPart("head", p2);
		robot.addPart("leg", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6113() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("arm", p4);
		robot.addPart("speaker", p3);
		robot.addPart("screen", p2);
		robot.addPart("leg", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6114() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("arm", p4);
		robot.addPart("speaker", p3);
		robot.addPart("screen", p2);
		robot.addPart("head", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6115() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("arm", p4);
		robot.addPart("screen", p3);
		robot.addPart("speaker", p2);
		robot.addPart("head", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6116() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("arm", p4);
		robot.addPart("screen", p3);
		robot.addPart("speaker", p2);
		robot.addPart("leg", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6117() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("arm", p4);
		robot.addPart("screen", p3);
		robot.addPart("head", p2);
		robot.addPart("leg", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6118() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("arm", p4);
		robot.addPart("screen", p3);
		robot.addPart("head", p2);
		robot.addPart("speaker", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6119() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("arm", p4);
		robot.addPart("screen", p3);
		robot.addPart("leg", p2);
		robot.addPart("speaker", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6120() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("tail", p5);
		robot.addPart("arm", p4);
		robot.addPart("screen", p3);
		robot.addPart("leg", p2);
		robot.addPart("head", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p5, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6121() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("arm", p4);
		robot.addPart("screen", p3);
		robot.addPart("leg", p2);
		robot.addPart("head", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6122() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("arm", p4);
		robot.addPart("screen", p3);
		robot.addPart("leg", p2);
		robot.addPart("tail", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6123() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("arm", p4);
		robot.addPart("screen", p3);
		robot.addPart("head", p2);
		robot.addPart("tail", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6124() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("arm", p4);
		robot.addPart("screen", p3);
		robot.addPart("head", p2);
		robot.addPart("leg", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6125() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("arm", p4);
		robot.addPart("screen", p3);
		robot.addPart("tail", p2);
		robot.addPart("leg", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6126() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("arm", p4);
		robot.addPart("screen", p3);
		robot.addPart("tail", p2);
		robot.addPart("head", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6127() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("arm", p4);
		robot.addPart("leg", p3);
		robot.addPart("tail", p2);
		robot.addPart("head", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6128() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("arm", p4);
		robot.addPart("leg", p3);
		robot.addPart("tail", p2);
		robot.addPart("screen", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6129() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("arm", p4);
		robot.addPart("leg", p3);
		robot.addPart("head", p2);
		robot.addPart("screen", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6130() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("arm", p4);
		robot.addPart("leg", p3);
		robot.addPart("head", p2);
		robot.addPart("tail", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6131() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("arm", p4);
		robot.addPart("leg", p3);
		robot.addPart("screen", p2);
		robot.addPart("tail", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6132() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("arm", p4);
		robot.addPart("leg", p3);
		robot.addPart("screen", p2);
		robot.addPart("head", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6133() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("arm", p4);
		robot.addPart("head", p3);
		robot.addPart("screen", p2);
		robot.addPart("leg", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6134() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("arm", p4);
		robot.addPart("head", p3);
		robot.addPart("screen", p2);
		robot.addPart("tail", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6135() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("arm", p4);
		robot.addPart("head", p3);
		robot.addPart("leg", p2);
		robot.addPart("tail", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6136() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("arm", p4);
		robot.addPart("head", p3);
		robot.addPart("leg", p2);
		robot.addPart("screen", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6137() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("arm", p4);
		robot.addPart("head", p3);
		robot.addPart("tail", p2);
		robot.addPart("screen", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6138() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("arm", p4);
		robot.addPart("head", p3);
		robot.addPart("tail", p2);
		robot.addPart("leg", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6139() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("arm", p4);
		robot.addPart("tail", p3);
		robot.addPart("head", p2);
		robot.addPart("leg", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6140() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("arm", p4);
		robot.addPart("tail", p3);
		robot.addPart("head", p2);
		robot.addPart("screen", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6141() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("arm", p4);
		robot.addPart("tail", p3);
		robot.addPart("leg", p2);
		robot.addPart("screen", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6142() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("arm", p4);
		robot.addPart("tail", p3);
		robot.addPart("leg", p2);
		robot.addPart("head", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6143() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("arm", p4);
		robot.addPart("tail", p3);
		robot.addPart("screen", p2);
		robot.addPart("head", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6144() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("arm", p4);
		robot.addPart("tail", p3);
		robot.addPart("screen", p2);
		robot.addPart("leg", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6145() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("head", p4);
		robot.addPart("tail", p3);
		robot.addPart("screen", p2);
		robot.addPart("leg", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6146() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("head", p4);
		robot.addPart("tail", p3);
		robot.addPart("screen", p2);
		robot.addPart("arm", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6147() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("head", p4);
		robot.addPart("tail", p3);
		robot.addPart("leg", p2);
		robot.addPart("arm", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6148() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("head", p4);
		robot.addPart("tail", p3);
		robot.addPart("leg", p2);
		robot.addPart("screen", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6149() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("head", p4);
		robot.addPart("tail", p3);
		robot.addPart("arm", p2);
		robot.addPart("screen", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6150() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("head", p4);
		robot.addPart("tail", p3);
		robot.addPart("arm", p2);
		robot.addPart("leg", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6151() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("head", p4);
		robot.addPart("screen", p3);
		robot.addPart("arm", p2);
		robot.addPart("leg", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6152() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("head", p4);
		robot.addPart("screen", p3);
		robot.addPart("arm", p2);
		robot.addPart("tail", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6153() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("head", p4);
		robot.addPart("screen", p3);
		robot.addPart("leg", p2);
		robot.addPart("tail", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6154() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("head", p4);
		robot.addPart("screen", p3);
		robot.addPart("leg", p2);
		robot.addPart("arm", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6155() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("head", p4);
		robot.addPart("screen", p3);
		robot.addPart("tail", p2);
		robot.addPart("arm", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6156() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("head", p4);
		robot.addPart("screen", p3);
		robot.addPart("tail", p2);
		robot.addPart("leg", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6157() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("head", p4);
		robot.addPart("leg", p3);
		robot.addPart("tail", p2);
		robot.addPart("screen", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6158() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("head", p4);
		robot.addPart("leg", p3);
		robot.addPart("tail", p2);
		robot.addPart("arm", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6159() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("head", p4);
		robot.addPart("leg", p3);
		robot.addPart("screen", p2);
		robot.addPart("arm", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6160() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("head", p4);
		robot.addPart("leg", p3);
		robot.addPart("screen", p2);
		robot.addPart("tail", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6161() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("head", p4);
		robot.addPart("leg", p3);
		robot.addPart("arm", p2);
		robot.addPart("tail", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6162() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("head", p4);
		robot.addPart("leg", p3);
		robot.addPart("arm", p2);
		robot.addPart("screen", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6163() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("head", p4);
		robot.addPart("arm", p3);
		robot.addPart("leg", p2);
		robot.addPart("screen", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6164() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("head", p4);
		robot.addPart("arm", p3);
		robot.addPart("leg", p2);
		robot.addPart("tail", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6165() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("head", p4);
		robot.addPart("arm", p3);
		robot.addPart("screen", p2);
		robot.addPart("tail", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6166() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("head", p4);
		robot.addPart("arm", p3);
		robot.addPart("screen", p2);
		robot.addPart("leg", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6167() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("head", p4);
		robot.addPart("arm", p3);
		robot.addPart("tail", p2);
		robot.addPart("leg", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6168() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("head", p4);
		robot.addPart("arm", p3);
		robot.addPart("tail", p2);
		robot.addPart("screen", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6169() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("leg", p4);
		robot.addPart("arm", p3);
		robot.addPart("tail", p2);
		robot.addPart("screen", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6170() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("leg", p4);
		robot.addPart("arm", p3);
		robot.addPart("tail", p2);
		robot.addPart("head", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6171() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("leg", p4);
		robot.addPart("arm", p3);
		robot.addPart("screen", p2);
		robot.addPart("head", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6172() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("leg", p4);
		robot.addPart("arm", p3);
		robot.addPart("screen", p2);
		robot.addPart("tail", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6173() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("leg", p4);
		robot.addPart("arm", p3);
		robot.addPart("head", p2);
		robot.addPart("tail", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6174() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("leg", p4);
		robot.addPart("arm", p3);
		robot.addPart("head", p2);
		robot.addPart("screen", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6175() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("leg", p4);
		robot.addPart("tail", p3);
		robot.addPart("head", p2);
		robot.addPart("screen", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6176() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("leg", p4);
		robot.addPart("tail", p3);
		robot.addPart("head", p2);
		robot.addPart("arm", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6177() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("leg", p4);
		robot.addPart("tail", p3);
		robot.addPart("screen", p2);
		robot.addPart("arm", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6178() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("leg", p4);
		robot.addPart("tail", p3);
		robot.addPart("screen", p2);
		robot.addPart("head", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6179() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("leg", p4);
		robot.addPart("tail", p3);
		robot.addPart("arm", p2);
		robot.addPart("head", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6180() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("leg", p4);
		robot.addPart("tail", p3);
		robot.addPart("arm", p2);
		robot.addPart("screen", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6181() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("leg", p4);
		robot.addPart("screen", p3);
		robot.addPart("arm", p2);
		robot.addPart("tail", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6182() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("leg", p4);
		robot.addPart("screen", p3);
		robot.addPart("arm", p2);
		robot.addPart("head", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6183() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("leg", p4);
		robot.addPart("screen", p3);
		robot.addPart("tail", p2);
		robot.addPart("head", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6184() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("leg", p4);
		robot.addPart("screen", p3);
		robot.addPart("tail", p2);
		robot.addPart("arm", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6185() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("leg", p4);
		robot.addPart("screen", p3);
		robot.addPart("head", p2);
		robot.addPart("arm", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6186() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("leg", p4);
		robot.addPart("screen", p3);
		robot.addPart("head", p2);
		robot.addPart("tail", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6187() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("leg", p4);
		robot.addPart("head", p3);
		robot.addPart("screen", p2);
		robot.addPart("tail", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6188() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("leg", p4);
		robot.addPart("head", p3);
		robot.addPart("screen", p2);
		robot.addPart("arm", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6189() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("leg", p4);
		robot.addPart("head", p3);
		robot.addPart("tail", p2);
		robot.addPart("arm", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6190() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("leg", p4);
		robot.addPart("head", p3);
		robot.addPart("tail", p2);
		robot.addPart("screen", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6191() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("leg", p4);
		robot.addPart("head", p3);
		robot.addPart("arm", p2);
		robot.addPart("screen", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6192() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("leg", p4);
		robot.addPart("head", p3);
		robot.addPart("arm", p2);
		robot.addPart("tail", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6193() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("screen", p4);
		robot.addPart("head", p3);
		robot.addPart("arm", p2);
		robot.addPart("tail", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6194() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("screen", p4);
		robot.addPart("head", p3);
		robot.addPart("arm", p2);
		robot.addPart("leg", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6195() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("screen", p4);
		robot.addPart("head", p3);
		robot.addPart("tail", p2);
		robot.addPart("leg", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6196() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("screen", p4);
		robot.addPart("head", p3);
		robot.addPart("tail", p2);
		robot.addPart("arm", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6197() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("screen", p4);
		robot.addPart("head", p3);
		robot.addPart("leg", p2);
		robot.addPart("arm", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6198() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("screen", p4);
		robot.addPart("head", p3);
		robot.addPart("leg", p2);
		robot.addPart("tail", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6199() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("screen", p4);
		robot.addPart("arm", p3);
		robot.addPart("leg", p2);
		robot.addPart("tail", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6200() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("screen", p4);
		robot.addPart("arm", p3);
		robot.addPart("leg", p2);
		robot.addPart("head", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6201() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("screen", p4);
		robot.addPart("arm", p3);
		robot.addPart("tail", p2);
		robot.addPart("head", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6202() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("screen", p4);
		robot.addPart("arm", p3);
		robot.addPart("tail", p2);
		robot.addPart("leg", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6203() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("screen", p4);
		robot.addPart("arm", p3);
		robot.addPart("head", p2);
		robot.addPart("leg", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6204() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("screen", p4);
		robot.addPart("arm", p3);
		robot.addPart("head", p2);
		robot.addPart("tail", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6205() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("screen", p4);
		robot.addPart("tail", p3);
		robot.addPart("head", p2);
		robot.addPart("arm", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6206() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("screen", p4);
		robot.addPart("tail", p3);
		robot.addPart("head", p2);
		robot.addPart("leg", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6207() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("screen", p4);
		robot.addPart("tail", p3);
		robot.addPart("arm", p2);
		robot.addPart("leg", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6208() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("screen", p4);
		robot.addPart("tail", p3);
		robot.addPart("arm", p2);
		robot.addPart("head", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6209() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("screen", p4);
		robot.addPart("tail", p3);
		robot.addPart("leg", p2);
		robot.addPart("head", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6210() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("screen", p4);
		robot.addPart("tail", p3);
		robot.addPart("leg", p2);
		robot.addPart("arm", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6211() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("screen", p4);
		robot.addPart("leg", p3);
		robot.addPart("tail", p2);
		robot.addPart("arm", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6212() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("screen", p4);
		robot.addPart("leg", p3);
		robot.addPart("tail", p2);
		robot.addPart("head", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6213() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("screen", p4);
		robot.addPart("leg", p3);
		robot.addPart("arm", p2);
		robot.addPart("head", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6214() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("screen", p4);
		robot.addPart("leg", p3);
		robot.addPart("arm", p2);
		robot.addPart("tail", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6215() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("screen", p4);
		robot.addPart("leg", p3);
		robot.addPart("head", p2);
		robot.addPart("tail", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6216() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("screen", p4);
		robot.addPart("leg", p3);
		robot.addPart("head", p2);
		robot.addPart("arm", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6217() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("tail", p4);
		robot.addPart("leg", p3);
		robot.addPart("head", p2);
		robot.addPart("arm", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6218() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("tail", p4);
		robot.addPart("leg", p3);
		robot.addPart("head", p2);
		robot.addPart("screen", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6219() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("tail", p4);
		robot.addPart("leg", p3);
		robot.addPart("arm", p2);
		robot.addPart("screen", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6220() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("tail", p4);
		robot.addPart("leg", p3);
		robot.addPart("arm", p2);
		robot.addPart("head", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6221() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("tail", p4);
		robot.addPart("leg", p3);
		robot.addPart("screen", p2);
		robot.addPart("head", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6222() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("tail", p4);
		robot.addPart("leg", p3);
		robot.addPart("screen", p2);
		robot.addPart("arm", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6223() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("tail", p4);
		robot.addPart("head", p3);
		robot.addPart("screen", p2);
		robot.addPart("arm", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6224() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("tail", p4);
		robot.addPart("head", p3);
		robot.addPart("screen", p2);
		robot.addPart("leg", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6225() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("tail", p4);
		robot.addPart("head", p3);
		robot.addPart("arm", p2);
		robot.addPart("leg", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6226() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("tail", p4);
		robot.addPart("head", p3);
		robot.addPart("arm", p2);
		robot.addPart("screen", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6227() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("tail", p4);
		robot.addPart("head", p3);
		robot.addPart("leg", p2);
		robot.addPart("screen", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6228() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("tail", p4);
		robot.addPart("head", p3);
		robot.addPart("leg", p2);
		robot.addPart("arm", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6229() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("tail", p4);
		robot.addPart("arm", p3);
		robot.addPart("leg", p2);
		robot.addPart("head", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6230() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("tail", p4);
		robot.addPart("arm", p3);
		robot.addPart("leg", p2);
		robot.addPart("screen", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6231() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("tail", p4);
		robot.addPart("arm", p3);
		robot.addPart("head", p2);
		robot.addPart("screen", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6232() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("tail", p4);
		robot.addPart("arm", p3);
		robot.addPart("head", p2);
		robot.addPart("leg", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6233() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("tail", p4);
		robot.addPart("arm", p3);
		robot.addPart("screen", p2);
		robot.addPart("leg", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6234() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("tail", p4);
		robot.addPart("arm", p3);
		robot.addPart("screen", p2);
		robot.addPart("head", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6235() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("tail", p4);
		robot.addPart("screen", p3);
		robot.addPart("arm", p2);
		robot.addPart("head", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6236() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("tail", p4);
		robot.addPart("screen", p3);
		robot.addPart("arm", p2);
		robot.addPart("leg", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6237() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("tail", p4);
		robot.addPart("screen", p3);
		robot.addPart("head", p2);
		robot.addPart("leg", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6238() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("tail", p4);
		robot.addPart("screen", p3);
		robot.addPart("head", p2);
		robot.addPart("arm", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6239() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("tail", p4);
		robot.addPart("screen", p3);
		robot.addPart("leg", p2);
		robot.addPart("arm", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6240() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("speaker", p5);
		robot.addPart("tail", p4);
		robot.addPart("screen", p3);
		robot.addPart("leg", p2);
		robot.addPart("head", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p5, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6241() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("tail", p4);
		robot.addPart("screen", p3);
		robot.addPart("leg", p2);
		robot.addPart("speaker", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6242() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("tail", p4);
		robot.addPart("screen", p3);
		robot.addPart("leg", p2);
		robot.addPart("arm", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6243() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("tail", p4);
		robot.addPart("screen", p3);
		robot.addPart("speaker", p2);
		robot.addPart("arm", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6244() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("tail", p4);
		robot.addPart("screen", p3);
		robot.addPart("speaker", p2);
		robot.addPart("leg", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6245() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("tail", p4);
		robot.addPart("screen", p3);
		robot.addPart("arm", p2);
		robot.addPart("leg", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6246() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("tail", p4);
		robot.addPart("screen", p3);
		robot.addPart("arm", p2);
		robot.addPart("speaker", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6247() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("tail", p4);
		robot.addPart("leg", p3);
		robot.addPart("arm", p2);
		robot.addPart("speaker", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6248() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("tail", p4);
		robot.addPart("leg", p3);
		robot.addPart("arm", p2);
		robot.addPart("screen", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6249() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("tail", p4);
		robot.addPart("leg", p3);
		robot.addPart("speaker", p2);
		robot.addPart("screen", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6250() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("tail", p4);
		robot.addPart("leg", p3);
		robot.addPart("speaker", p2);
		robot.addPart("arm", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6251() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("tail", p4);
		robot.addPart("leg", p3);
		robot.addPart("screen", p2);
		robot.addPart("arm", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6252() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("tail", p4);
		robot.addPart("leg", p3);
		robot.addPart("screen", p2);
		robot.addPart("speaker", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6253() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("tail", p4);
		robot.addPart("speaker", p3);
		robot.addPart("screen", p2);
		robot.addPart("leg", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6254() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("tail", p4);
		robot.addPart("speaker", p3);
		robot.addPart("screen", p2);
		robot.addPart("arm", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6255() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("tail", p4);
		robot.addPart("speaker", p3);
		robot.addPart("leg", p2);
		robot.addPart("arm", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6256() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("tail", p4);
		robot.addPart("speaker", p3);
		robot.addPart("leg", p2);
		robot.addPart("screen", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6257() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("tail", p4);
		robot.addPart("speaker", p3);
		robot.addPart("arm", p2);
		robot.addPart("screen", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6258() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("tail", p4);
		robot.addPart("speaker", p3);
		robot.addPart("arm", p2);
		robot.addPart("leg", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6259() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("tail", p4);
		robot.addPart("arm", p3);
		robot.addPart("speaker", p2);
		robot.addPart("leg", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6260() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("tail", p4);
		robot.addPart("arm", p3);
		robot.addPart("speaker", p2);
		robot.addPart("screen", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6261() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("tail", p4);
		robot.addPart("arm", p3);
		robot.addPart("leg", p2);
		robot.addPart("screen", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6262() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("tail", p4);
		robot.addPart("arm", p3);
		robot.addPart("leg", p2);
		robot.addPart("speaker", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6263() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("tail", p4);
		robot.addPart("arm", p3);
		robot.addPart("screen", p2);
		robot.addPart("speaker", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6264() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("tail", p4);
		robot.addPart("arm", p3);
		robot.addPart("screen", p2);
		robot.addPart("leg", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6265() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("speaker", p4);
		robot.addPart("arm", p3);
		robot.addPart("screen", p2);
		robot.addPart("leg", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6266() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("speaker", p4);
		robot.addPart("arm", p3);
		robot.addPart("screen", p2);
		robot.addPart("tail", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6267() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("speaker", p4);
		robot.addPart("arm", p3);
		robot.addPart("leg", p2);
		robot.addPart("tail", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6268() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("speaker", p4);
		robot.addPart("arm", p3);
		robot.addPart("leg", p2);
		robot.addPart("screen", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6269() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("speaker", p4);
		robot.addPart("arm", p3);
		robot.addPart("tail", p2);
		robot.addPart("screen", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6270() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("speaker", p4);
		robot.addPart("arm", p3);
		robot.addPart("tail", p2);
		robot.addPart("leg", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6271() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("speaker", p4);
		robot.addPart("screen", p3);
		robot.addPart("tail", p2);
		robot.addPart("leg", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6272() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("speaker", p4);
		robot.addPart("screen", p3);
		robot.addPart("tail", p2);
		robot.addPart("arm", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6273() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("speaker", p4);
		robot.addPart("screen", p3);
		robot.addPart("leg", p2);
		robot.addPart("arm", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6274() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("speaker", p4);
		robot.addPart("screen", p3);
		robot.addPart("leg", p2);
		robot.addPart("tail", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6275() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("speaker", p4);
		robot.addPart("screen", p3);
		robot.addPart("arm", p2);
		robot.addPart("tail", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6276() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("speaker", p4);
		robot.addPart("screen", p3);
		robot.addPart("arm", p2);
		robot.addPart("leg", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6277() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("speaker", p4);
		robot.addPart("leg", p3);
		robot.addPart("arm", p2);
		robot.addPart("screen", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6278() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("speaker", p4);
		robot.addPart("leg", p3);
		robot.addPart("arm", p2);
		robot.addPart("tail", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6279() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("speaker", p4);
		robot.addPart("leg", p3);
		robot.addPart("screen", p2);
		robot.addPart("tail", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6280() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("speaker", p4);
		robot.addPart("leg", p3);
		robot.addPart("screen", p2);
		robot.addPart("arm", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6281() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("speaker", p4);
		robot.addPart("leg", p3);
		robot.addPart("tail", p2);
		robot.addPart("arm", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6282() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("speaker", p4);
		robot.addPart("leg", p3);
		robot.addPart("tail", p2);
		robot.addPart("screen", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6283() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("speaker", p4);
		robot.addPart("tail", p3);
		robot.addPart("leg", p2);
		robot.addPart("screen", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6284() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("speaker", p4);
		robot.addPart("tail", p3);
		robot.addPart("leg", p2);
		robot.addPart("arm", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6285() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("speaker", p4);
		robot.addPart("tail", p3);
		robot.addPart("screen", p2);
		robot.addPart("arm", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6286() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("speaker", p4);
		robot.addPart("tail", p3);
		robot.addPart("screen", p2);
		robot.addPart("leg", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6287() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("speaker", p4);
		robot.addPart("tail", p3);
		robot.addPart("arm", p2);
		robot.addPart("leg", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6288() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("speaker", p4);
		robot.addPart("tail", p3);
		robot.addPart("arm", p2);
		robot.addPart("screen", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6289() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("leg", p4);
		robot.addPart("tail", p3);
		robot.addPart("arm", p2);
		robot.addPart("screen", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6290() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("leg", p4);
		robot.addPart("tail", p3);
		robot.addPart("arm", p2);
		robot.addPart("speaker", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6291() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("leg", p4);
		robot.addPart("tail", p3);
		robot.addPart("screen", p2);
		robot.addPart("speaker", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6292() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("leg", p4);
		robot.addPart("tail", p3);
		robot.addPart("screen", p2);
		robot.addPart("arm", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6293() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("leg", p4);
		robot.addPart("tail", p3);
		robot.addPart("speaker", p2);
		robot.addPart("arm", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6294() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("leg", p4);
		robot.addPart("tail", p3);
		robot.addPart("speaker", p2);
		robot.addPart("screen", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6295() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("leg", p4);
		robot.addPart("arm", p3);
		robot.addPart("speaker", p2);
		robot.addPart("screen", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6296() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("leg", p4);
		robot.addPart("arm", p3);
		robot.addPart("speaker", p2);
		robot.addPart("tail", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6297() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("leg", p4);
		robot.addPart("arm", p3);
		robot.addPart("screen", p2);
		robot.addPart("tail", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6298() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("leg", p4);
		robot.addPart("arm", p3);
		robot.addPart("screen", p2);
		robot.addPart("speaker", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6299() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("leg", p4);
		robot.addPart("arm", p3);
		robot.addPart("tail", p2);
		robot.addPart("speaker", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6300() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("leg", p4);
		robot.addPart("arm", p3);
		robot.addPart("tail", p2);
		robot.addPart("screen", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6301() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("leg", p4);
		robot.addPart("screen", p3);
		robot.addPart("tail", p2);
		robot.addPart("arm", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6302() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("leg", p4);
		robot.addPart("screen", p3);
		robot.addPart("tail", p2);
		robot.addPart("speaker", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6303() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("leg", p4);
		robot.addPart("screen", p3);
		robot.addPart("arm", p2);
		robot.addPart("speaker", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6304() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("leg", p4);
		robot.addPart("screen", p3);
		robot.addPart("arm", p2);
		robot.addPart("tail", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6305() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("leg", p4);
		robot.addPart("screen", p3);
		robot.addPart("speaker", p2);
		robot.addPart("tail", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6306() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("leg", p4);
		robot.addPart("screen", p3);
		robot.addPart("speaker", p2);
		robot.addPart("arm", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6307() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("leg", p4);
		robot.addPart("speaker", p3);
		robot.addPart("screen", p2);
		robot.addPart("arm", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6308() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("leg", p4);
		robot.addPart("speaker", p3);
		robot.addPart("screen", p2);
		robot.addPart("tail", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6309() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("leg", p4);
		robot.addPart("speaker", p3);
		robot.addPart("arm", p2);
		robot.addPart("tail", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6310() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("leg", p4);
		robot.addPart("speaker", p3);
		robot.addPart("arm", p2);
		robot.addPart("screen", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6311() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("leg", p4);
		robot.addPart("speaker", p3);
		robot.addPart("tail", p2);
		robot.addPart("screen", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6312() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("leg", p4);
		robot.addPart("speaker", p3);
		robot.addPart("tail", p2);
		robot.addPart("arm", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6313() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("screen", p4);
		robot.addPart("speaker", p3);
		robot.addPart("tail", p2);
		robot.addPart("arm", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6314() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("screen", p4);
		robot.addPart("speaker", p3);
		robot.addPart("tail", p2);
		robot.addPart("leg", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6315() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("screen", p4);
		robot.addPart("speaker", p3);
		robot.addPart("arm", p2);
		robot.addPart("leg", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6316() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("screen", p4);
		robot.addPart("speaker", p3);
		robot.addPart("arm", p2);
		robot.addPart("tail", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6317() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("screen", p4);
		robot.addPart("speaker", p3);
		robot.addPart("leg", p2);
		robot.addPart("tail", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6318() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("screen", p4);
		robot.addPart("speaker", p3);
		robot.addPart("leg", p2);
		robot.addPart("arm", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6319() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("screen", p4);
		robot.addPart("tail", p3);
		robot.addPart("leg", p2);
		robot.addPart("arm", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6320() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("screen", p4);
		robot.addPart("tail", p3);
		robot.addPart("leg", p2);
		robot.addPart("speaker", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6321() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("screen", p4);
		robot.addPart("tail", p3);
		robot.addPart("arm", p2);
		robot.addPart("speaker", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6322() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("screen", p4);
		robot.addPart("tail", p3);
		robot.addPart("arm", p2);
		robot.addPart("leg", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6323() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("screen", p4);
		robot.addPart("tail", p3);
		robot.addPart("speaker", p2);
		robot.addPart("leg", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6324() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("screen", p4);
		robot.addPart("tail", p3);
		robot.addPart("speaker", p2);
		robot.addPart("arm", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6325() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("screen", p4);
		robot.addPart("arm", p3);
		robot.addPart("speaker", p2);
		robot.addPart("tail", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6326() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("screen", p4);
		robot.addPart("arm", p3);
		robot.addPart("speaker", p2);
		robot.addPart("leg", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6327() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("screen", p4);
		robot.addPart("arm", p3);
		robot.addPart("tail", p2);
		robot.addPart("leg", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6328() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("screen", p4);
		robot.addPart("arm", p3);
		robot.addPart("tail", p2);
		robot.addPart("speaker", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6329() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("screen", p4);
		robot.addPart("arm", p3);
		robot.addPart("leg", p2);
		robot.addPart("speaker", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6330() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("screen", p4);
		robot.addPart("arm", p3);
		robot.addPart("leg", p2);
		robot.addPart("tail", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6331() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("screen", p4);
		robot.addPart("leg", p3);
		robot.addPart("arm", p2);
		robot.addPart("tail", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6332() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("screen", p4);
		robot.addPart("leg", p3);
		robot.addPart("arm", p2);
		robot.addPart("speaker", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6333() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("screen", p4);
		robot.addPart("leg", p3);
		robot.addPart("tail", p2);
		robot.addPart("speaker", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6334() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("screen", p4);
		robot.addPart("leg", p3);
		robot.addPart("tail", p2);
		robot.addPart("arm", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6335() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("screen", p4);
		robot.addPart("leg", p3);
		robot.addPart("speaker", p2);
		robot.addPart("arm", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6336() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("screen", p4);
		robot.addPart("leg", p3);
		robot.addPart("speaker", p2);
		robot.addPart("tail", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6337() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("arm", p4);
		robot.addPart("leg", p3);
		robot.addPart("speaker", p2);
		robot.addPart("tail", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6338() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("arm", p4);
		robot.addPart("leg", p3);
		robot.addPart("speaker", p2);
		robot.addPart("screen", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6339() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("arm", p4);
		robot.addPart("leg", p3);
		robot.addPart("tail", p2);
		robot.addPart("screen", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6340() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("arm", p4);
		robot.addPart("leg", p3);
		robot.addPart("tail", p2);
		robot.addPart("speaker", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6341() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("arm", p4);
		robot.addPart("leg", p3);
		robot.addPart("screen", p2);
		robot.addPart("speaker", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6342() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("arm", p4);
		robot.addPart("leg", p3);
		robot.addPart("screen", p2);
		robot.addPart("tail", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6343() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("arm", p4);
		robot.addPart("speaker", p3);
		robot.addPart("screen", p2);
		robot.addPart("tail", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6344() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("arm", p4);
		robot.addPart("speaker", p3);
		robot.addPart("screen", p2);
		robot.addPart("leg", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6345() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("arm", p4);
		robot.addPart("speaker", p3);
		robot.addPart("tail", p2);
		robot.addPart("leg", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6346() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("arm", p4);
		robot.addPart("speaker", p3);
		robot.addPart("tail", p2);
		robot.addPart("screen", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6347() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("arm", p4);
		robot.addPart("speaker", p3);
		robot.addPart("leg", p2);
		robot.addPart("screen", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6348() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("arm", p4);
		robot.addPart("speaker", p3);
		robot.addPart("leg", p2);
		robot.addPart("tail", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6349() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("arm", p4);
		robot.addPart("tail", p3);
		robot.addPart("leg", p2);
		robot.addPart("speaker", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6350() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("arm", p4);
		robot.addPart("tail", p3);
		robot.addPart("leg", p2);
		robot.addPart("screen", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6351() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("arm", p4);
		robot.addPart("tail", p3);
		robot.addPart("speaker", p2);
		robot.addPart("screen", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6352() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("arm", p4);
		robot.addPart("tail", p3);
		robot.addPart("speaker", p2);
		robot.addPart("leg", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6353() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("arm", p4);
		robot.addPart("tail", p3);
		robot.addPart("screen", p2);
		robot.addPart("leg", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6354() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("arm", p4);
		robot.addPart("tail", p3);
		robot.addPart("screen", p2);
		robot.addPart("speaker", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6355() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("arm", p4);
		robot.addPart("screen", p3);
		robot.addPart("tail", p2);
		robot.addPart("speaker", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6356() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("arm", p4);
		robot.addPart("screen", p3);
		robot.addPart("tail", p2);
		robot.addPart("leg", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6357() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("arm", p4);
		robot.addPart("screen", p3);
		robot.addPart("speaker", p2);
		robot.addPart("leg", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6358() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("arm", p4);
		robot.addPart("screen", p3);
		robot.addPart("speaker", p2);
		robot.addPart("tail", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6359() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("arm", p4);
		robot.addPart("screen", p3);
		robot.addPart("leg", p2);
		robot.addPart("tail", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6360() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("head", p5);
		robot.addPart("arm", p4);
		robot.addPart("screen", p3);
		robot.addPart("leg", p2);
		robot.addPart("speaker", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p5, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6361() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("arm", p4);
		robot.addPart("screen", p3);
		robot.addPart("head", p2);
		robot.addPart("speaker", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6362() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("arm", p4);
		robot.addPart("screen", p3);
		robot.addPart("head", p2);
		robot.addPart("tail", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6363() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("arm", p4);
		robot.addPart("screen", p3);
		robot.addPart("speaker", p2);
		robot.addPart("tail", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6364() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("arm", p4);
		robot.addPart("screen", p3);
		robot.addPart("speaker", p2);
		robot.addPart("head", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6365() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("arm", p4);
		robot.addPart("screen", p3);
		robot.addPart("tail", p2);
		robot.addPart("head", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6366() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("arm", p4);
		robot.addPart("screen", p3);
		robot.addPart("tail", p2);
		robot.addPart("speaker", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6367() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("arm", p4);
		robot.addPart("head", p3);
		robot.addPart("tail", p2);
		robot.addPart("speaker", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6368() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("arm", p4);
		robot.addPart("head", p3);
		robot.addPart("tail", p2);
		robot.addPart("screen", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6369() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("arm", p4);
		robot.addPart("head", p3);
		robot.addPart("speaker", p2);
		robot.addPart("screen", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6370() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("arm", p4);
		robot.addPart("head", p3);
		robot.addPart("speaker", p2);
		robot.addPart("tail", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6371() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("arm", p4);
		robot.addPart("head", p3);
		robot.addPart("screen", p2);
		robot.addPart("tail", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6372() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("arm", p4);
		robot.addPart("head", p3);
		robot.addPart("screen", p2);
		robot.addPart("speaker", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6373() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("arm", p4);
		robot.addPart("speaker", p3);
		robot.addPart("screen", p2);
		robot.addPart("head", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6374() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("arm", p4);
		robot.addPart("speaker", p3);
		robot.addPart("screen", p2);
		robot.addPart("tail", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6375() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("arm", p4);
		robot.addPart("speaker", p3);
		robot.addPart("head", p2);
		robot.addPart("tail", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6376() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("arm", p4);
		robot.addPart("speaker", p3);
		robot.addPart("head", p2);
		robot.addPart("screen", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6377() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("arm", p4);
		robot.addPart("speaker", p3);
		robot.addPart("tail", p2);
		robot.addPart("screen", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6378() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("arm", p4);
		robot.addPart("speaker", p3);
		robot.addPart("tail", p2);
		robot.addPart("head", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6379() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("arm", p4);
		robot.addPart("tail", p3);
		robot.addPart("speaker", p2);
		robot.addPart("head", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6380() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("arm", p4);
		robot.addPart("tail", p3);
		robot.addPart("speaker", p2);
		robot.addPart("screen", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6381() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("arm", p4);
		robot.addPart("tail", p3);
		robot.addPart("head", p2);
		robot.addPart("screen", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6382() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("arm", p4);
		robot.addPart("tail", p3);
		robot.addPart("head", p2);
		robot.addPart("speaker", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6383() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("arm", p4);
		robot.addPart("tail", p3);
		robot.addPart("screen", p2);
		robot.addPart("speaker", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6384() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("arm", p4);
		robot.addPart("tail", p3);
		robot.addPart("screen", p2);
		robot.addPart("head", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6385() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("speaker", p4);
		robot.addPart("tail", p3);
		robot.addPart("screen", p2);
		robot.addPart("head", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6386() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("speaker", p4);
		robot.addPart("tail", p3);
		robot.addPart("screen", p2);
		robot.addPart("arm", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6387() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("speaker", p4);
		robot.addPart("tail", p3);
		robot.addPart("head", p2);
		robot.addPart("arm", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6388() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("speaker", p4);
		robot.addPart("tail", p3);
		robot.addPart("head", p2);
		robot.addPart("screen", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6389() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("speaker", p4);
		robot.addPart("tail", p3);
		robot.addPart("arm", p2);
		robot.addPart("screen", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6390() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("speaker", p4);
		robot.addPart("tail", p3);
		robot.addPart("arm", p2);
		robot.addPart("head", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6391() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("speaker", p4);
		robot.addPart("screen", p3);
		robot.addPart("arm", p2);
		robot.addPart("head", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6392() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("speaker", p4);
		robot.addPart("screen", p3);
		robot.addPart("arm", p2);
		robot.addPart("tail", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6393() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("speaker", p4);
		robot.addPart("screen", p3);
		robot.addPart("head", p2);
		robot.addPart("tail", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6394() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("speaker", p4);
		robot.addPart("screen", p3);
		robot.addPart("head", p2);
		robot.addPart("arm", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6395() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("speaker", p4);
		robot.addPart("screen", p3);
		robot.addPart("tail", p2);
		robot.addPart("arm", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6396() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("speaker", p4);
		robot.addPart("screen", p3);
		robot.addPart("tail", p2);
		robot.addPart("head", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6397() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("speaker", p4);
		robot.addPart("head", p3);
		robot.addPart("tail", p2);
		robot.addPart("screen", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6398() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("speaker", p4);
		robot.addPart("head", p3);
		robot.addPart("tail", p2);
		robot.addPart("arm", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6399() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("speaker", p4);
		robot.addPart("head", p3);
		robot.addPart("screen", p2);
		robot.addPart("arm", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6400() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("speaker", p4);
		robot.addPart("head", p3);
		robot.addPart("screen", p2);
		robot.addPart("tail", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6401() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("speaker", p4);
		robot.addPart("head", p3);
		robot.addPart("arm", p2);
		robot.addPart("tail", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6402() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("speaker", p4);
		robot.addPart("head", p3);
		robot.addPart("arm", p2);
		robot.addPart("screen", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6403() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("speaker", p4);
		robot.addPart("arm", p3);
		robot.addPart("head", p2);
		robot.addPart("screen", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6404() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("speaker", p4);
		robot.addPart("arm", p3);
		robot.addPart("head", p2);
		robot.addPart("tail", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6405() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("speaker", p4);
		robot.addPart("arm", p3);
		robot.addPart("screen", p2);
		robot.addPart("tail", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6406() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("speaker", p4);
		robot.addPart("arm", p3);
		robot.addPart("screen", p2);
		robot.addPart("head", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6407() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("speaker", p4);
		robot.addPart("arm", p3);
		robot.addPart("tail", p2);
		robot.addPart("head", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6408() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("speaker", p4);
		robot.addPart("arm", p3);
		robot.addPart("tail", p2);
		robot.addPart("screen", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6409() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("head", p4);
		robot.addPart("arm", p3);
		robot.addPart("tail", p2);
		robot.addPart("screen", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6410() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("head", p4);
		robot.addPart("arm", p3);
		robot.addPart("tail", p2);
		robot.addPart("speaker", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6411() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("head", p4);
		robot.addPart("arm", p3);
		robot.addPart("screen", p2);
		robot.addPart("speaker", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6412() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("head", p4);
		robot.addPart("arm", p3);
		robot.addPart("screen", p2);
		robot.addPart("tail", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6413() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("head", p4);
		robot.addPart("arm", p3);
		robot.addPart("speaker", p2);
		robot.addPart("tail", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6414() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("head", p4);
		robot.addPart("arm", p3);
		robot.addPart("speaker", p2);
		robot.addPart("screen", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6415() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("head", p4);
		robot.addPart("tail", p3);
		robot.addPart("speaker", p2);
		robot.addPart("screen", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6416() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("head", p4);
		robot.addPart("tail", p3);
		robot.addPart("speaker", p2);
		robot.addPart("arm", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6417() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("head", p4);
		robot.addPart("tail", p3);
		robot.addPart("screen", p2);
		robot.addPart("arm", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6418() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("head", p4);
		robot.addPart("tail", p3);
		robot.addPart("screen", p2);
		robot.addPart("speaker", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6419() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("head", p4);
		robot.addPart("tail", p3);
		robot.addPart("arm", p2);
		robot.addPart("speaker", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6420() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("head", p4);
		robot.addPart("tail", p3);
		robot.addPart("arm", p2);
		robot.addPart("screen", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6421() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("head", p4);
		robot.addPart("screen", p3);
		robot.addPart("arm", p2);
		robot.addPart("tail", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6422() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("head", p4);
		robot.addPart("screen", p3);
		robot.addPart("arm", p2);
		robot.addPart("speaker", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6423() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("head", p4);
		robot.addPart("screen", p3);
		robot.addPart("tail", p2);
		robot.addPart("speaker", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6424() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("head", p4);
		robot.addPart("screen", p3);
		robot.addPart("tail", p2);
		robot.addPart("arm", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6425() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("head", p4);
		robot.addPart("screen", p3);
		robot.addPart("speaker", p2);
		robot.addPart("arm", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6426() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("head", p4);
		robot.addPart("screen", p3);
		robot.addPart("speaker", p2);
		robot.addPart("tail", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6427() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("head", p4);
		robot.addPart("speaker", p3);
		robot.addPart("screen", p2);
		robot.addPart("tail", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6428() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("head", p4);
		robot.addPart("speaker", p3);
		robot.addPart("screen", p2);
		robot.addPart("arm", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6429() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("head", p4);
		robot.addPart("speaker", p3);
		robot.addPart("tail", p2);
		robot.addPart("arm", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6430() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("head", p4);
		robot.addPart("speaker", p3);
		robot.addPart("tail", p2);
		robot.addPart("screen", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6431() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("head", p4);
		robot.addPart("speaker", p3);
		robot.addPart("arm", p2);
		robot.addPart("screen", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6432() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("head", p4);
		robot.addPart("speaker", p3);
		robot.addPart("arm", p2);
		robot.addPart("tail", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6433() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("screen", p4);
		robot.addPart("speaker", p3);
		robot.addPart("arm", p2);
		robot.addPart("tail", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6434() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("screen", p4);
		robot.addPart("speaker", p3);
		robot.addPart("arm", p2);
		robot.addPart("head", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6435() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("screen", p4);
		robot.addPart("speaker", p3);
		robot.addPart("tail", p2);
		robot.addPart("head", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6436() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("screen", p4);
		robot.addPart("speaker", p3);
		robot.addPart("tail", p2);
		robot.addPart("arm", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6437() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("screen", p4);
		robot.addPart("speaker", p3);
		robot.addPart("head", p2);
		robot.addPart("arm", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6438() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("screen", p4);
		robot.addPart("speaker", p3);
		robot.addPart("head", p2);
		robot.addPart("tail", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6439() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("screen", p4);
		robot.addPart("arm", p3);
		robot.addPart("head", p2);
		robot.addPart("tail", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6440() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("screen", p4);
		robot.addPart("arm", p3);
		robot.addPart("head", p2);
		robot.addPart("speaker", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6441() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("screen", p4);
		robot.addPart("arm", p3);
		robot.addPart("tail", p2);
		robot.addPart("speaker", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6442() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("screen", p4);
		robot.addPart("arm", p3);
		robot.addPart("tail", p2);
		robot.addPart("head", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6443() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("screen", p4);
		robot.addPart("arm", p3);
		robot.addPart("speaker", p2);
		robot.addPart("head", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6444() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("screen", p4);
		robot.addPart("arm", p3);
		robot.addPart("speaker", p2);
		robot.addPart("tail", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6445() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("screen", p4);
		robot.addPart("tail", p3);
		robot.addPart("speaker", p2);
		robot.addPart("arm", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6446() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("screen", p4);
		robot.addPart("tail", p3);
		robot.addPart("speaker", p2);
		robot.addPart("head", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6447() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("screen", p4);
		robot.addPart("tail", p3);
		robot.addPart("arm", p2);
		robot.addPart("head", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6448() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("screen", p4);
		robot.addPart("tail", p3);
		robot.addPart("arm", p2);
		robot.addPart("speaker", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6449() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("screen", p4);
		robot.addPart("tail", p3);
		robot.addPart("head", p2);
		robot.addPart("speaker", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6450() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("screen", p4);
		robot.addPart("tail", p3);
		robot.addPart("head", p2);
		robot.addPart("arm", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6451() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("screen", p4);
		robot.addPart("head", p3);
		robot.addPart("tail", p2);
		robot.addPart("arm", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6452() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("screen", p4);
		robot.addPart("head", p3);
		robot.addPart("tail", p2);
		robot.addPart("speaker", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6453() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("screen", p4);
		robot.addPart("head", p3);
		robot.addPart("arm", p2);
		robot.addPart("speaker", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6454() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("screen", p4);
		robot.addPart("head", p3);
		robot.addPart("arm", p2);
		robot.addPart("tail", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6455() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("screen", p4);
		robot.addPart("head", p3);
		robot.addPart("speaker", p2);
		robot.addPart("tail", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6456() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("screen", p4);
		robot.addPart("head", p3);
		robot.addPart("speaker", p2);
		robot.addPart("arm", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6457() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("tail", p4);
		robot.addPart("head", p3);
		robot.addPart("speaker", p2);
		robot.addPart("arm", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6458() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("tail", p4);
		robot.addPart("head", p3);
		robot.addPart("speaker", p2);
		robot.addPart("screen", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6459() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("tail", p4);
		robot.addPart("head", p3);
		robot.addPart("arm", p2);
		robot.addPart("screen", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6460() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("tail", p4);
		robot.addPart("head", p3);
		robot.addPart("arm", p2);
		robot.addPart("speaker", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6461() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("tail", p4);
		robot.addPart("head", p3);
		robot.addPart("screen", p2);
		robot.addPart("speaker", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6462() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("tail", p4);
		robot.addPart("head", p3);
		robot.addPart("screen", p2);
		robot.addPart("arm", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6463() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("tail", p4);
		robot.addPart("speaker", p3);
		robot.addPart("screen", p2);
		robot.addPart("arm", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6464() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("tail", p4);
		robot.addPart("speaker", p3);
		robot.addPart("screen", p2);
		robot.addPart("head", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6465() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("tail", p4);
		robot.addPart("speaker", p3);
		robot.addPart("arm", p2);
		robot.addPart("head", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6466() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("tail", p4);
		robot.addPart("speaker", p3);
		robot.addPart("arm", p2);
		robot.addPart("screen", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6467() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("tail", p4);
		robot.addPart("speaker", p3);
		robot.addPart("head", p2);
		robot.addPart("screen", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6468() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("tail", p4);
		robot.addPart("speaker", p3);
		robot.addPart("head", p2);
		robot.addPart("arm", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6469() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("tail", p4);
		robot.addPart("arm", p3);
		robot.addPart("head", p2);
		robot.addPart("speaker", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6470() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("tail", p4);
		robot.addPart("arm", p3);
		robot.addPart("head", p2);
		robot.addPart("screen", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6471() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("tail", p4);
		robot.addPart("arm", p3);
		robot.addPart("speaker", p2);
		robot.addPart("screen", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6472() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("tail", p4);
		robot.addPart("arm", p3);
		robot.addPart("speaker", p2);
		robot.addPart("head", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6473() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("tail", p4);
		robot.addPart("arm", p3);
		robot.addPart("screen", p2);
		robot.addPart("head", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6474() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("tail", p4);
		robot.addPart("arm", p3);
		robot.addPart("screen", p2);
		robot.addPart("speaker", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6475() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("tail", p4);
		robot.addPart("screen", p3);
		robot.addPart("arm", p2);
		robot.addPart("speaker", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6476() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("tail", p4);
		robot.addPart("screen", p3);
		robot.addPart("arm", p2);
		robot.addPart("head", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6477() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("tail", p4);
		robot.addPart("screen", p3);
		robot.addPart("speaker", p2);
		robot.addPart("head", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6478() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("tail", p4);
		robot.addPart("screen", p3);
		robot.addPart("speaker", p2);
		robot.addPart("arm", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6479() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("tail", p4);
		robot.addPart("screen", p3);
		robot.addPart("head", p2);
		robot.addPart("arm", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6480() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("leg", p5);
		robot.addPart("tail", p4);
		robot.addPart("screen", p3);
		robot.addPart("head", p2);
		robot.addPart("speaker", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p5, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6481() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("tail", p4);
		robot.addPart("leg", p3);
		robot.addPart("head", p2);
		robot.addPart("speaker", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6482() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("tail", p4);
		robot.addPart("leg", p3);
		robot.addPart("head", p2);
		robot.addPart("arm", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6483() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("tail", p4);
		robot.addPart("leg", p3);
		robot.addPart("speaker", p2);
		robot.addPart("arm", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6484() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("tail", p4);
		robot.addPart("leg", p3);
		robot.addPart("speaker", p2);
		robot.addPart("head", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6485() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("tail", p4);
		robot.addPart("leg", p3);
		robot.addPart("arm", p2);
		robot.addPart("head", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6486() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("tail", p4);
		robot.addPart("leg", p3);
		robot.addPart("arm", p2);
		robot.addPart("speaker", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6487() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("tail", p4);
		robot.addPart("head", p3);
		robot.addPart("arm", p2);
		robot.addPart("speaker", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6488() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("tail", p4);
		robot.addPart("head", p3);
		robot.addPart("arm", p2);
		robot.addPart("leg", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6489() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("tail", p4);
		robot.addPart("head", p3);
		robot.addPart("speaker", p2);
		robot.addPart("leg", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6490() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("tail", p4);
		robot.addPart("head", p3);
		robot.addPart("speaker", p2);
		robot.addPart("arm", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6491() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("tail", p4);
		robot.addPart("head", p3);
		robot.addPart("leg", p2);
		robot.addPart("arm", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6492() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("tail", p4);
		robot.addPart("head", p3);
		robot.addPart("leg", p2);
		robot.addPart("speaker", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6493() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("tail", p4);
		robot.addPart("speaker", p3);
		robot.addPart("leg", p2);
		robot.addPart("head", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6494() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("tail", p4);
		robot.addPart("speaker", p3);
		robot.addPart("leg", p2);
		robot.addPart("arm", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6495() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("tail", p4);
		robot.addPart("speaker", p3);
		robot.addPart("head", p2);
		robot.addPart("arm", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6496() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("tail", p4);
		robot.addPart("speaker", p3);
		robot.addPart("head", p2);
		robot.addPart("leg", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6497() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("tail", p4);
		robot.addPart("speaker", p3);
		robot.addPart("arm", p2);
		robot.addPart("leg", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6498() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("tail", p4);
		robot.addPart("speaker", p3);
		robot.addPart("arm", p2);
		robot.addPart("head", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6499() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("tail", p4);
		robot.addPart("arm", p3);
		robot.addPart("speaker", p2);
		robot.addPart("head", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6500() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("tail", p4);
		robot.addPart("arm", p3);
		robot.addPart("speaker", p2);
		robot.addPart("leg", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6501() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("tail", p4);
		robot.addPart("arm", p3);
		robot.addPart("head", p2);
		robot.addPart("leg", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6502() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("tail", p4);
		robot.addPart("arm", p3);
		robot.addPart("head", p2);
		robot.addPart("speaker", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6503() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("tail", p4);
		robot.addPart("arm", p3);
		robot.addPart("leg", p2);
		robot.addPart("speaker", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6504() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("tail", p4);
		robot.addPart("arm", p3);
		robot.addPart("leg", p2);
		robot.addPart("head", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6505() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("speaker", p4);
		robot.addPart("arm", p3);
		robot.addPart("leg", p2);
		robot.addPart("head", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6506() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("speaker", p4);
		robot.addPart("arm", p3);
		robot.addPart("leg", p2);
		robot.addPart("tail", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6507() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("speaker", p4);
		robot.addPart("arm", p3);
		robot.addPart("head", p2);
		robot.addPart("tail", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6508() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("speaker", p4);
		robot.addPart("arm", p3);
		robot.addPart("head", p2);
		robot.addPart("leg", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6509() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("speaker", p4);
		robot.addPart("arm", p3);
		robot.addPart("tail", p2);
		robot.addPart("leg", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6510() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("speaker", p4);
		robot.addPart("arm", p3);
		robot.addPart("tail", p2);
		robot.addPart("head", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6511() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("speaker", p4);
		robot.addPart("leg", p3);
		robot.addPart("tail", p2);
		robot.addPart("head", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6512() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("speaker", p4);
		robot.addPart("leg", p3);
		robot.addPart("tail", p2);
		robot.addPart("arm", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6513() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("speaker", p4);
		robot.addPart("leg", p3);
		robot.addPart("head", p2);
		robot.addPart("arm", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6514() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("speaker", p4);
		robot.addPart("leg", p3);
		robot.addPart("head", p2);
		robot.addPart("tail", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6515() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("speaker", p4);
		robot.addPart("leg", p3);
		robot.addPart("arm", p2);
		robot.addPart("tail", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6516() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("speaker", p4);
		robot.addPart("leg", p3);
		robot.addPart("arm", p2);
		robot.addPart("head", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6517() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("speaker", p4);
		robot.addPart("head", p3);
		robot.addPart("arm", p2);
		robot.addPart("leg", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6518() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("speaker", p4);
		robot.addPart("head", p3);
		robot.addPart("arm", p2);
		robot.addPart("tail", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6519() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("speaker", p4);
		robot.addPart("head", p3);
		robot.addPart("leg", p2);
		robot.addPart("tail", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6520() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("speaker", p4);
		robot.addPart("head", p3);
		robot.addPart("leg", p2);
		robot.addPart("arm", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6521() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("speaker", p4);
		robot.addPart("head", p3);
		robot.addPart("tail", p2);
		robot.addPart("arm", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6522() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("speaker", p4);
		robot.addPart("head", p3);
		robot.addPart("tail", p2);
		robot.addPart("leg", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6523() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("speaker", p4);
		robot.addPart("tail", p3);
		robot.addPart("head", p2);
		robot.addPart("leg", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6524() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("speaker", p4);
		robot.addPart("tail", p3);
		robot.addPart("head", p2);
		robot.addPart("arm", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6525() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("speaker", p4);
		robot.addPart("tail", p3);
		robot.addPart("leg", p2);
		robot.addPart("arm", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6526() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("speaker", p4);
		robot.addPart("tail", p3);
		robot.addPart("leg", p2);
		robot.addPart("head", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6527() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("speaker", p4);
		robot.addPart("tail", p3);
		robot.addPart("arm", p2);
		robot.addPart("head", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6528() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("speaker", p4);
		robot.addPart("tail", p3);
		robot.addPart("arm", p2);
		robot.addPart("leg", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6529() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("head", p4);
		robot.addPart("tail", p3);
		robot.addPart("arm", p2);
		robot.addPart("leg", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6530() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("head", p4);
		robot.addPart("tail", p3);
		robot.addPart("arm", p2);
		robot.addPart("speaker", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6531() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("head", p4);
		robot.addPart("tail", p3);
		robot.addPart("leg", p2);
		robot.addPart("speaker", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6532() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("head", p4);
		robot.addPart("tail", p3);
		robot.addPart("leg", p2);
		robot.addPart("arm", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6533() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("head", p4);
		robot.addPart("tail", p3);
		robot.addPart("speaker", p2);
		robot.addPart("arm", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6534() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("head", p4);
		robot.addPart("tail", p3);
		robot.addPart("speaker", p2);
		robot.addPart("leg", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6535() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("head", p4);
		robot.addPart("arm", p3);
		robot.addPart("speaker", p2);
		robot.addPart("leg", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6536() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("head", p4);
		robot.addPart("arm", p3);
		robot.addPart("speaker", p2);
		robot.addPart("tail", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6537() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("head", p4);
		robot.addPart("arm", p3);
		robot.addPart("leg", p2);
		robot.addPart("tail", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6538() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("head", p4);
		robot.addPart("arm", p3);
		robot.addPart("leg", p2);
		robot.addPart("speaker", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6539() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("head", p4);
		robot.addPart("arm", p3);
		robot.addPart("tail", p2);
		robot.addPart("speaker", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6540() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("head", p4);
		robot.addPart("arm", p3);
		robot.addPart("tail", p2);
		robot.addPart("leg", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6541() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("head", p4);
		robot.addPart("leg", p3);
		robot.addPart("tail", p2);
		robot.addPart("arm", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6542() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("head", p4);
		robot.addPart("leg", p3);
		robot.addPart("tail", p2);
		robot.addPart("speaker", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6543() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("head", p4);
		robot.addPart("leg", p3);
		robot.addPart("arm", p2);
		robot.addPart("speaker", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6544() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("head", p4);
		robot.addPart("leg", p3);
		robot.addPart("arm", p2);
		robot.addPart("tail", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6545() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("head", p4);
		robot.addPart("leg", p3);
		robot.addPart("speaker", p2);
		robot.addPart("tail", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6546() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("head", p4);
		robot.addPart("leg", p3);
		robot.addPart("speaker", p2);
		robot.addPart("arm", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6547() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("head", p4);
		robot.addPart("speaker", p3);
		robot.addPart("leg", p2);
		robot.addPart("arm", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6548() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("head", p4);
		robot.addPart("speaker", p3);
		robot.addPart("leg", p2);
		robot.addPart("tail", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6549() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("head", p4);
		robot.addPart("speaker", p3);
		robot.addPart("arm", p2);
		robot.addPart("tail", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6550() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("head", p4);
		robot.addPart("speaker", p3);
		robot.addPart("arm", p2);
		robot.addPart("leg", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6551() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("head", p4);
		robot.addPart("speaker", p3);
		robot.addPart("tail", p2);
		robot.addPart("leg", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6552() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("head", p4);
		robot.addPart("speaker", p3);
		robot.addPart("tail", p2);
		robot.addPart("arm", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6553() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("leg", p4);
		robot.addPart("speaker", p3);
		robot.addPart("tail", p2);
		robot.addPart("arm", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6554() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("leg", p4);
		robot.addPart("speaker", p3);
		robot.addPart("tail", p2);
		robot.addPart("head", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6555() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("leg", p4);
		robot.addPart("speaker", p3);
		robot.addPart("arm", p2);
		robot.addPart("head", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6556() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("leg", p4);
		robot.addPart("speaker", p3);
		robot.addPart("arm", p2);
		robot.addPart("tail", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6557() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("leg", p4);
		robot.addPart("speaker", p3);
		robot.addPart("head", p2);
		robot.addPart("tail", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6558() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("leg", p4);
		robot.addPart("speaker", p3);
		robot.addPart("head", p2);
		robot.addPart("arm", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6559() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("leg", p4);
		robot.addPart("tail", p3);
		robot.addPart("head", p2);
		robot.addPart("arm", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6560() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("leg", p4);
		robot.addPart("tail", p3);
		robot.addPart("head", p2);
		robot.addPart("speaker", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6561() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("leg", p4);
		robot.addPart("tail", p3);
		robot.addPart("arm", p2);
		robot.addPart("speaker", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6562() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("leg", p4);
		robot.addPart("tail", p3);
		robot.addPart("arm", p2);
		robot.addPart("head", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6563() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("leg", p4);
		robot.addPart("tail", p3);
		robot.addPart("speaker", p2);
		robot.addPart("head", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6564() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("leg", p4);
		robot.addPart("tail", p3);
		robot.addPart("speaker", p2);
		robot.addPart("arm", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6565() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("leg", p4);
		robot.addPart("arm", p3);
		robot.addPart("speaker", p2);
		robot.addPart("tail", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6566() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("leg", p4);
		robot.addPart("arm", p3);
		robot.addPart("speaker", p2);
		robot.addPart("head", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6567() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("leg", p4);
		robot.addPart("arm", p3);
		robot.addPart("tail", p2);
		robot.addPart("head", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6568() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("leg", p4);
		robot.addPart("arm", p3);
		robot.addPart("tail", p2);
		robot.addPart("speaker", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6569() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("leg", p4);
		robot.addPart("arm", p3);
		robot.addPart("head", p2);
		robot.addPart("speaker", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6570() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("leg", p4);
		robot.addPart("arm", p3);
		robot.addPart("head", p2);
		robot.addPart("tail", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p3, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6571() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("leg", p4);
		robot.addPart("head", p3);
		robot.addPart("arm", p2);
		robot.addPart("tail", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6572() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("leg", p4);
		robot.addPart("head", p3);
		robot.addPart("arm", p2);
		robot.addPart("speaker", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p2, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6573() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("leg", p4);
		robot.addPart("head", p3);
		robot.addPart("tail", p2);
		robot.addPart("speaker", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6574() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("leg", p4);
		robot.addPart("head", p3);
		robot.addPart("tail", p2);
		robot.addPart("arm", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6575() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("leg", p4);
		robot.addPart("head", p3);
		robot.addPart("speaker", p2);
		robot.addPart("arm", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p1, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6576() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("leg", p4);
		robot.addPart("head", p3);
		robot.addPart("speaker", p2);
		robot.addPart("tail", p1);
		robot.addPart("arm", p0);
		robot.setComparator(comp);
		assertSame(p0, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6577() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("arm", p4);
		robot.addPart("head", p3);
		robot.addPart("speaker", p2);
		robot.addPart("tail", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6578() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("arm", p4);
		robot.addPart("head", p3);
		robot.addPart("speaker", p2);
		robot.addPart("leg", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6579() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("arm", p4);
		robot.addPart("head", p3);
		robot.addPart("tail", p2);
		robot.addPart("leg", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6580() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("arm", p4);
		robot.addPart("head", p3);
		robot.addPart("tail", p2);
		robot.addPart("speaker", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6581() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("arm", p4);
		robot.addPart("head", p3);
		robot.addPart("leg", p2);
		robot.addPart("speaker", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6582() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("arm", p4);
		robot.addPart("head", p3);
		robot.addPart("leg", p2);
		robot.addPart("tail", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6583() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("arm", p4);
		robot.addPart("speaker", p3);
		robot.addPart("leg", p2);
		robot.addPart("tail", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6584() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("arm", p4);
		robot.addPart("speaker", p3);
		robot.addPart("leg", p2);
		robot.addPart("head", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6585() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("arm", p4);
		robot.addPart("speaker", p3);
		robot.addPart("tail", p2);
		robot.addPart("head", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6586() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("arm", p4);
		robot.addPart("speaker", p3);
		robot.addPart("tail", p2);
		robot.addPart("leg", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6587() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("arm", p4);
		robot.addPart("speaker", p3);
		robot.addPart("head", p2);
		robot.addPart("leg", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6588() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("arm", p4);
		robot.addPart("speaker", p3);
		robot.addPart("head", p2);
		robot.addPart("tail", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6589() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("arm", p4);
		robot.addPart("tail", p3);
		robot.addPart("head", p2);
		robot.addPart("speaker", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6590() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("arm", p4);
		robot.addPart("tail", p3);
		robot.addPart("head", p2);
		robot.addPart("leg", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6591() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("arm", p4);
		robot.addPart("tail", p3);
		robot.addPart("speaker", p2);
		robot.addPart("leg", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6592() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("arm", p4);
		robot.addPart("tail", p3);
		robot.addPart("speaker", p2);
		robot.addPart("head", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6593() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("arm", p4);
		robot.addPart("tail", p3);
		robot.addPart("leg", p2);
		robot.addPart("head", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6594() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("arm", p4);
		robot.addPart("tail", p3);
		robot.addPart("leg", p2);
		robot.addPart("speaker", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6595() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("arm", p4);
		robot.addPart("leg", p3);
		robot.addPart("tail", p2);
		robot.addPart("speaker", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6596() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("arm", p4);
		robot.addPart("leg", p3);
		robot.addPart("tail", p2);
		robot.addPart("head", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6597() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("arm", p4);
		robot.addPart("leg", p3);
		robot.addPart("speaker", p2);
		robot.addPart("head", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6598() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("arm", p4);
		robot.addPart("leg", p3);
		robot.addPart("speaker", p2);
		robot.addPart("tail", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6599() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("arm", p4);
		robot.addPart("leg", p3);
		robot.addPart("head", p2);
		robot.addPart("tail", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6600() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("screen", p5);
		robot.addPart("arm", p4);
		robot.addPart("leg", p3);
		robot.addPart("head", p2);
		robot.addPart("speaker", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p4, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p5, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6601() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("screen", p4);
		robot.addPart("leg", p3);
		robot.addPart("head", p2);
		robot.addPart("speaker", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6602() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("screen", p4);
		robot.addPart("leg", p3);
		robot.addPart("head", p2);
		robot.addPart("tail", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6603() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("screen", p4);
		robot.addPart("leg", p3);
		robot.addPart("speaker", p2);
		robot.addPart("tail", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6604() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("screen", p4);
		robot.addPart("leg", p3);
		robot.addPart("speaker", p2);
		robot.addPart("head", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6605() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("screen", p4);
		robot.addPart("leg", p3);
		robot.addPart("tail", p2);
		robot.addPart("head", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6606() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("screen", p4);
		robot.addPart("leg", p3);
		robot.addPart("tail", p2);
		robot.addPart("speaker", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6607() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("screen", p4);
		robot.addPart("head", p3);
		robot.addPart("tail", p2);
		robot.addPart("speaker", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6608() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("screen", p4);
		robot.addPart("head", p3);
		robot.addPart("tail", p2);
		robot.addPart("leg", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6609() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("screen", p4);
		robot.addPart("head", p3);
		robot.addPart("speaker", p2);
		robot.addPart("leg", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6610() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("screen", p4);
		robot.addPart("head", p3);
		robot.addPart("speaker", p2);
		robot.addPart("tail", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6611() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("screen", p4);
		robot.addPart("head", p3);
		robot.addPart("leg", p2);
		robot.addPart("tail", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6612() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("screen", p4);
		robot.addPart("head", p3);
		robot.addPart("leg", p2);
		robot.addPart("speaker", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6613() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("screen", p4);
		robot.addPart("speaker", p3);
		robot.addPart("leg", p2);
		robot.addPart("head", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6614() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("screen", p4);
		robot.addPart("speaker", p3);
		robot.addPart("leg", p2);
		robot.addPart("tail", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6615() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("screen", p4);
		robot.addPart("speaker", p3);
		robot.addPart("head", p2);
		robot.addPart("tail", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6616() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("screen", p4);
		robot.addPart("speaker", p3);
		robot.addPart("head", p2);
		robot.addPart("leg", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6617() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("screen", p4);
		robot.addPart("speaker", p3);
		robot.addPart("tail", p2);
		robot.addPart("leg", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6618() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("screen", p4);
		robot.addPart("speaker", p3);
		robot.addPart("tail", p2);
		robot.addPart("head", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6619() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("screen", p4);
		robot.addPart("tail", p3);
		robot.addPart("speaker", p2);
		robot.addPart("head", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6620() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("screen", p4);
		robot.addPart("tail", p3);
		robot.addPart("speaker", p2);
		robot.addPart("leg", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6621() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("screen", p4);
		robot.addPart("tail", p3);
		robot.addPart("head", p2);
		robot.addPart("leg", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6622() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("screen", p4);
		robot.addPart("tail", p3);
		robot.addPart("head", p2);
		robot.addPart("speaker", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6623() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("screen", p4);
		robot.addPart("tail", p3);
		robot.addPart("leg", p2);
		robot.addPart("speaker", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6624() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("screen", p4);
		robot.addPart("tail", p3);
		robot.addPart("leg", p2);
		robot.addPart("head", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p4, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6625() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("speaker", p4);
		robot.addPart("tail", p3);
		robot.addPart("leg", p2);
		robot.addPart("head", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6626() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("speaker", p4);
		robot.addPart("tail", p3);
		robot.addPart("leg", p2);
		robot.addPart("screen", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6627() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("speaker", p4);
		robot.addPart("tail", p3);
		robot.addPart("head", p2);
		robot.addPart("screen", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6628() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("speaker", p4);
		robot.addPart("tail", p3);
		robot.addPart("head", p2);
		robot.addPart("leg", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6629() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("speaker", p4);
		robot.addPart("tail", p3);
		robot.addPart("screen", p2);
		robot.addPart("leg", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6630() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("speaker", p4);
		robot.addPart("tail", p3);
		robot.addPart("screen", p2);
		robot.addPart("head", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6631() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("speaker", p4);
		robot.addPart("leg", p3);
		robot.addPart("screen", p2);
		robot.addPart("head", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6632() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("speaker", p4);
		robot.addPart("leg", p3);
		robot.addPart("screen", p2);
		robot.addPart("tail", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6633() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("speaker", p4);
		robot.addPart("leg", p3);
		robot.addPart("head", p2);
		robot.addPart("tail", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6634() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("speaker", p4);
		robot.addPart("leg", p3);
		robot.addPart("head", p2);
		robot.addPart("screen", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6635() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("speaker", p4);
		robot.addPart("leg", p3);
		robot.addPart("tail", p2);
		robot.addPart("screen", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6636() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("speaker", p4);
		robot.addPart("leg", p3);
		robot.addPart("tail", p2);
		robot.addPart("head", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6637() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("speaker", p4);
		robot.addPart("head", p3);
		robot.addPart("tail", p2);
		robot.addPart("leg", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6638() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("speaker", p4);
		robot.addPart("head", p3);
		robot.addPart("tail", p2);
		robot.addPart("screen", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6639() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("speaker", p4);
		robot.addPart("head", p3);
		robot.addPart("leg", p2);
		robot.addPart("screen", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6640() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("speaker", p4);
		robot.addPart("head", p3);
		robot.addPart("leg", p2);
		robot.addPart("tail", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6641() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("speaker", p4);
		robot.addPart("head", p3);
		robot.addPart("screen", p2);
		robot.addPart("tail", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6642() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("speaker", p4);
		robot.addPart("head", p3);
		robot.addPart("screen", p2);
		robot.addPart("leg", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6643() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("speaker", p4);
		robot.addPart("screen", p3);
		robot.addPart("head", p2);
		robot.addPart("leg", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6644() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("speaker", p4);
		robot.addPart("screen", p3);
		robot.addPart("head", p2);
		robot.addPart("tail", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6645() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("speaker", p4);
		robot.addPart("screen", p3);
		robot.addPart("leg", p2);
		robot.addPart("tail", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6646() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("speaker", p4);
		robot.addPart("screen", p3);
		robot.addPart("leg", p2);
		robot.addPart("head", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6647() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("speaker", p4);
		robot.addPart("screen", p3);
		robot.addPart("tail", p2);
		robot.addPart("head", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6648() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("speaker", p4);
		robot.addPart("screen", p3);
		robot.addPart("tail", p2);
		robot.addPart("leg", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p4, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6649() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("head", p4);
		robot.addPart("screen", p3);
		robot.addPart("tail", p2);
		robot.addPart("leg", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6650() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("head", p4);
		robot.addPart("screen", p3);
		robot.addPart("tail", p2);
		robot.addPart("speaker", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6651() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("head", p4);
		robot.addPart("screen", p3);
		robot.addPart("leg", p2);
		robot.addPart("speaker", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6652() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("head", p4);
		robot.addPart("screen", p3);
		robot.addPart("leg", p2);
		robot.addPart("tail", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6653() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("head", p4);
		robot.addPart("screen", p3);
		robot.addPart("speaker", p2);
		robot.addPart("tail", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6654() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("head", p4);
		robot.addPart("screen", p3);
		robot.addPart("speaker", p2);
		robot.addPart("leg", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6655() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("head", p4);
		robot.addPart("tail", p3);
		robot.addPart("speaker", p2);
		robot.addPart("leg", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6656() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("head", p4);
		robot.addPart("tail", p3);
		robot.addPart("speaker", p2);
		robot.addPart("screen", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6657() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("head", p4);
		robot.addPart("tail", p3);
		robot.addPart("leg", p2);
		robot.addPart("screen", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6658() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("head", p4);
		robot.addPart("tail", p3);
		robot.addPart("leg", p2);
		robot.addPart("speaker", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6659() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("head", p4);
		robot.addPart("tail", p3);
		robot.addPart("screen", p2);
		robot.addPart("speaker", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6660() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("head", p4);
		robot.addPart("tail", p3);
		robot.addPart("screen", p2);
		robot.addPart("leg", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6661() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("head", p4);
		robot.addPart("leg", p3);
		robot.addPart("screen", p2);
		robot.addPart("tail", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6662() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("head", p4);
		robot.addPart("leg", p3);
		robot.addPart("screen", p2);
		robot.addPart("speaker", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6663() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("head", p4);
		robot.addPart("leg", p3);
		robot.addPart("tail", p2);
		robot.addPart("speaker", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6664() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("head", p4);
		robot.addPart("leg", p3);
		robot.addPart("tail", p2);
		robot.addPart("screen", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6665() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("head", p4);
		robot.addPart("leg", p3);
		robot.addPart("speaker", p2);
		robot.addPart("screen", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6666() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("head", p4);
		robot.addPart("leg", p3);
		robot.addPart("speaker", p2);
		robot.addPart("tail", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6667() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("head", p4);
		robot.addPart("speaker", p3);
		robot.addPart("leg", p2);
		robot.addPart("tail", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6668() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("head", p4);
		robot.addPart("speaker", p3);
		robot.addPart("leg", p2);
		robot.addPart("screen", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6669() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("head", p4);
		robot.addPart("speaker", p3);
		robot.addPart("tail", p2);
		robot.addPart("screen", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6670() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("head", p4);
		robot.addPart("speaker", p3);
		robot.addPart("tail", p2);
		robot.addPart("leg", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6671() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("head", p4);
		robot.addPart("speaker", p3);
		robot.addPart("screen", p2);
		robot.addPart("leg", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6672() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("head", p4);
		robot.addPart("speaker", p3);
		robot.addPart("screen", p2);
		robot.addPart("tail", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p4, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6673() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("leg", p4);
		robot.addPart("speaker", p3);
		robot.addPart("screen", p2);
		robot.addPart("tail", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6674() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("leg", p4);
		robot.addPart("speaker", p3);
		robot.addPart("screen", p2);
		robot.addPart("head", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6675() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("leg", p4);
		robot.addPart("speaker", p3);
		robot.addPart("tail", p2);
		robot.addPart("head", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6676() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("leg", p4);
		robot.addPart("speaker", p3);
		robot.addPart("tail", p2);
		robot.addPart("screen", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6677() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("leg", p4);
		robot.addPart("speaker", p3);
		robot.addPart("head", p2);
		robot.addPart("screen", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6678() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("leg", p4);
		robot.addPart("speaker", p3);
		robot.addPart("head", p2);
		robot.addPart("tail", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6679() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("leg", p4);
		robot.addPart("screen", p3);
		robot.addPart("head", p2);
		robot.addPart("tail", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6680() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("leg", p4);
		robot.addPart("screen", p3);
		robot.addPart("head", p2);
		robot.addPart("speaker", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6681() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("leg", p4);
		robot.addPart("screen", p3);
		robot.addPart("tail", p2);
		robot.addPart("speaker", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6682() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("leg", p4);
		robot.addPart("screen", p3);
		robot.addPart("tail", p2);
		robot.addPart("head", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6683() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("leg", p4);
		robot.addPart("screen", p3);
		robot.addPart("speaker", p2);
		robot.addPart("head", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6684() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("leg", p4);
		robot.addPart("screen", p3);
		robot.addPart("speaker", p2);
		robot.addPart("tail", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6685() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("leg", p4);
		robot.addPart("tail", p3);
		robot.addPart("speaker", p2);
		robot.addPart("screen", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6686() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("leg", p4);
		robot.addPart("tail", p3);
		robot.addPart("speaker", p2);
		robot.addPart("head", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6687() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("leg", p4);
		robot.addPart("tail", p3);
		robot.addPart("screen", p2);
		robot.addPart("head", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6688() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("leg", p4);
		robot.addPart("tail", p3);
		robot.addPart("screen", p2);
		robot.addPart("speaker", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6689() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("leg", p4);
		robot.addPart("tail", p3);
		robot.addPart("head", p2);
		robot.addPart("speaker", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6690() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("leg", p4);
		robot.addPart("tail", p3);
		robot.addPart("head", p2);
		robot.addPart("screen", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p3, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6691() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("leg", p4);
		robot.addPart("head", p3);
		robot.addPart("tail", p2);
		robot.addPart("screen", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6692() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("leg", p4);
		robot.addPart("head", p3);
		robot.addPart("tail", p2);
		robot.addPart("speaker", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p2, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6693() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("leg", p4);
		robot.addPart("head", p3);
		robot.addPart("screen", p2);
		robot.addPart("speaker", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6694() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("leg", p4);
		robot.addPart("head", p3);
		robot.addPart("screen", p2);
		robot.addPart("tail", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6695() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("leg", p4);
		robot.addPart("head", p3);
		robot.addPart("speaker", p2);
		robot.addPart("tail", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p1, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6696() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("leg", p4);
		robot.addPart("head", p3);
		robot.addPart("speaker", p2);
		robot.addPart("screen", p1);
		robot.addPart("tail", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p4, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p0, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6697() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("tail", p4);
		robot.addPart("head", p3);
		robot.addPart("speaker", p2);
		robot.addPart("screen", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6698() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("tail", p4);
		robot.addPart("head", p3);
		robot.addPart("speaker", p2);
		robot.addPart("leg", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6699() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("tail", p4);
		robot.addPart("head", p3);
		robot.addPart("screen", p2);
		robot.addPart("leg", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6700() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("tail", p4);
		robot.addPart("head", p3);
		robot.addPart("screen", p2);
		robot.addPart("speaker", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6701() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("tail", p4);
		robot.addPart("head", p3);
		robot.addPart("leg", p2);
		robot.addPart("speaker", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6702() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("tail", p4);
		robot.addPart("head", p3);
		robot.addPart("leg", p2);
		robot.addPart("screen", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p3, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6703() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("tail", p4);
		robot.addPart("speaker", p3);
		robot.addPart("leg", p2);
		robot.addPart("screen", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6704() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("tail", p4);
		robot.addPart("speaker", p3);
		robot.addPart("leg", p2);
		robot.addPart("head", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6705() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("tail", p4);
		robot.addPart("speaker", p3);
		robot.addPart("screen", p2);
		robot.addPart("head", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6706() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("tail", p4);
		robot.addPart("speaker", p3);
		robot.addPart("screen", p2);
		robot.addPart("leg", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6707() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("tail", p4);
		robot.addPart("speaker", p3);
		robot.addPart("head", p2);
		robot.addPart("leg", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6708() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("tail", p4);
		robot.addPart("speaker", p3);
		robot.addPart("head", p2);
		robot.addPart("screen", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p3, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6709() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("tail", p4);
		robot.addPart("screen", p3);
		robot.addPart("head", p2);
		robot.addPart("speaker", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6710() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("tail", p4);
		robot.addPart("screen", p3);
		robot.addPart("head", p2);
		robot.addPart("leg", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6711() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("tail", p4);
		robot.addPart("screen", p3);
		robot.addPart("speaker", p2);
		robot.addPart("leg", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p1, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6712() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("tail", p4);
		robot.addPart("screen", p3);
		robot.addPart("speaker", p2);
		robot.addPart("head", p1);
		robot.addPart("leg", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p0, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6713() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("tail", p4);
		robot.addPart("screen", p3);
		robot.addPart("leg", p2);
		robot.addPart("head", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6714() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("tail", p4);
		robot.addPart("screen", p3);
		robot.addPart("leg", p2);
		robot.addPart("speaker", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p2, robot.getPart(null,2));
		assertSame(p3, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6715() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("tail", p4);
		robot.addPart("leg", p3);
		robot.addPart("screen", p2);
		robot.addPart("speaker", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6716() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("tail", p4);
		robot.addPart("leg", p3);
		robot.addPart("screen", p2);
		robot.addPart("head", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p2, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6717() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("tail", p4);
		robot.addPart("leg", p3);
		robot.addPart("speaker", p2);
		robot.addPart("head", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p1, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6718() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("tail", p4);
		robot.addPart("leg", p3);
		robot.addPart("speaker", p2);
		robot.addPart("screen", p1);
		robot.addPart("head", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p0, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p2, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6719() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("tail", p4);
		robot.addPart("leg", p3);
		robot.addPart("head", p2);
		robot.addPart("screen", p1);
		robot.addPart("speaker", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p1, robot.getPart(null,3));
		assertSame(p0, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

	public void test6720() {
		robot = new WiredRobot();
		FunctionalPart p0 = new FunctionalPart();
		FunctionalPart p1 = new FunctionalPart();
		FunctionalPart p2 = new FunctionalPart();
		FunctionalPart p3 = new FunctionalPart();
		FunctionalPart p4 = new FunctionalPart();
		FunctionalPart p5 = new FunctionalPart();
		robot.addPart("arm", p5);
		robot.addPart("tail", p4);
		robot.addPart("leg", p3);
		robot.addPart("head", p2);
		robot.addPart("speaker", p1);
		robot.addPart("screen", p0);
		robot.setComparator(comp);
		assertSame(p5, robot.getPart(null,0));
		assertSame(p2, robot.getPart(null,1));
		assertSame(p3, robot.getPart(null,2));
		assertSame(p0, robot.getPart(null,3));
		assertSame(p1, robot.getPart(null,4));
		assertSame(p4, robot.getPart(null,5));
		assertNull(robot.getPart(null,6));
	}

}
