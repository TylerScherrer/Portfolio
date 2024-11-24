import java.util.Iterator;

import junit.framework.TestCase;

import edu.uwm.cs351.Ranking;

public class TestRemove extends TestCase {
	protected static enum Team { T0, T1, T2, T3, T4, T5, T6 }

	protected Ranking<Team> r;
	protected Iterator<Team> it;

	@Override // implementation
	protected void setUp() {
		r = new Ranking<>();
	}

	public void test1000() {
		r.insert(1, Team.T0);
		r.remove(1);
		it = r.values().iterator();
		assertFalse(it.hasNext());
	}

	public void test2000() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test2001() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test2002() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertFalse(it.hasNext());
	}

	public void test2003() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertFalse(it.hasNext());
	}

	public void test2004() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test3000() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test3001() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test3002() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test3003() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test3004() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test3005() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test3006() {
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertFalse(it.hasNext());
	}

	public void test3007() {
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertFalse(it.hasNext());
	}

	public void test3008() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test3009() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test3010() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertFalse(it.hasNext());
	}

	public void test3011() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertFalse(it.hasNext());
	}

	public void test3012() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test3013() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertFalse(it.hasNext());
	}

	public void test3014() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test3015() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test3016() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test3017() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test3018() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test3019() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4000() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4001() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4002() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4003() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4004() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4005() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4006() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4007() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4008() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4009() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4010() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4011() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4012() {
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(4, Team.T6);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4013() {
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4014() {
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(4, Team.T6);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4015() {
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4016() {
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertFalse(it.hasNext());
	}

	public void test4017() {
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertFalse(it.hasNext());
	}

	public void test4018() {
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertFalse(it.hasNext());
	}

	public void test4019() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4020() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4021() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4022() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4023() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T6);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4024() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4025() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertFalse(it.hasNext());
	}

	public void test4026() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertFalse(it.hasNext());
	}

	public void test4027() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4028() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4029() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertFalse(it.hasNext());
	}

	public void test4030() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertFalse(it.hasNext());
	}

	public void test4031() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4032() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertFalse(it.hasNext());
	}

	public void test4033() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T1);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4034() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4035() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4036() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4037() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4038() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4039() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4040() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4041() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertFalse(it.hasNext());
	}

	public void test4042() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertFalse(it.hasNext());
	}

	public void test4043() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4044() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4045() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4046() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4047() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4048() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4049() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4050() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4051() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4052() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4053() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T5);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4054() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4055() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4056() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4057() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4058() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4059() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4060() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4061() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4062() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4063() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T0);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4064() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4065() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4066() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4067() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test4068() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5000() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5001() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5002() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5003() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5004() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5005() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5006() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5007() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5008() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5009() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5010() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5011() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5012() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5013() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5014() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5015() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5016() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5017() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5018() {
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5019() {
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5020() {
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5021() {
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5022() {
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5023() {
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5024() {
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5025() {
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5026() {
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T6);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5027() {
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5028() {
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T6);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5029() {
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5030() {
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T6);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5031() {
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5032() {
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertFalse(it.hasNext());
	}

	public void test5033() {
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertFalse(it.hasNext());
	}

	public void test5034() {
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertFalse(it.hasNext());
	}

	public void test5035() {
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertFalse(it.hasNext());
	}

	public void test5036() {
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertFalse(it.hasNext());
	}

	public void test5037() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5038() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5039() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5040() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5041() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5042() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5043() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5044() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5045() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5046() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5047() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5048() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T6);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5049() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5050() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T6);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5051() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5052() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertFalse(it.hasNext());
	}

	public void test5053() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertFalse(it.hasNext());
	}

	public void test5054() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertFalse(it.hasNext());
	}

	public void test5055() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5056() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5057() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5058() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5059() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T6);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5060() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5061() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertFalse(it.hasNext());
	}

	public void test5062() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertFalse(it.hasNext());
	}

	public void test5063() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T6);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5064() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5065() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertFalse(it.hasNext());
	}

	public void test5066() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertFalse(it.hasNext());
	}

	public void test5067() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5068() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertFalse(it.hasNext());
	}

	public void test5069() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(4, Team.T6);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5070() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5071() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5072() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5073() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5074() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5075() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.insert(5, Team.T6);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5076() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5077() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertFalse(it.hasNext());
	}

	public void test5078() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertFalse(it.hasNext());
	}

	public void test5079() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T6);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5080() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5081() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5082() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5083() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5084() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5085() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5086() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5087() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5088() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5089() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T5);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5090() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5091() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5092() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5093() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5094() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5095() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5096() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5097() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5098() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5099() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T4);
		r.insert(3, Team.T5);
		r.insert(2, Team.T1);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5100() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5101() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5102() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5103() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5104() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5105() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5106() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5107() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5108() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5109() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T6);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5110() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5111() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertFalse(it.hasNext());
	}

	public void test5112() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertFalse(it.hasNext());
	}

	public void test5113() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T6);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5114() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5115() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertFalse(it.hasNext());
	}

	public void test5116() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertFalse(it.hasNext());
	}

	public void test5117() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5118() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertFalse(it.hasNext());
	}

	public void test5119() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T5);
		r.insert(4, Team.T6);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5120() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5121() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5122() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5123() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5124() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5125() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5126() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5127() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5128() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5129() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T4);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5130() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5131() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5132() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5133() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5134() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5135() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5136() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5137() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5138() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5139() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T3);
		r.insert(2, Team.T4);
		r.insert(1, Team.T0);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5140() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5141() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5142() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5143() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5144() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5145() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5146() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5147() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5148() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5149() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5150() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5151() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5152() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5153() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5154() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5155() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5156() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(4, Team.T5);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5157() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5158() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(4, Team.T5);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5159() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5160() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5161() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5162() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5163() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5164() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5165() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5166() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5167() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T5);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5168() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5169() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5170() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5171() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5172() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5173() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5174() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5175() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5176() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5177() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(3, Team.T5);
		r.insert(2, Team.T1);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5178() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5179() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5180() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5181() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5182() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5183() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5184() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5185() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5186() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5187() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5188() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5189() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5190() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5191() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5192() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5193() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5194() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5195() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5196() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5197() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T4);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5198() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5199() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5200() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5201() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5202() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5203() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5204() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5205() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5206() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5207() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T3);
		r.insert(2, Team.T4);
		r.insert(1, Team.T0);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5208() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5209() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5210() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5211() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test5212() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6000() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6001() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6002() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6003() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6004() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6005() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6006() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6007() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6008() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6009() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6010() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6011() {
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6012() {
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6013() {
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6014() {
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6015() {
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6016() {
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6017() {
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6018() {
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6019() {
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6020() {
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6021() {
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6022() {
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6023() {
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6024() {
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6025() {
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6026() {
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6027() {
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6028() {
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T6);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6029() {
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T6);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6030() {
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T6);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6031() {
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T6);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6032() {
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T6);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6033() {
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T6);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6034() {
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T6);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6035() {
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T6);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6036() {
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T6);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6037() {
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T6);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6038() {
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertFalse(it.hasNext());
	}

	public void test6039() {
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertFalse(it.hasNext());
	}

	public void test6040() {
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertFalse(it.hasNext());
	}

	public void test6041() {
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertFalse(it.hasNext());
	}

	public void test6042() {
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertFalse(it.hasNext());
	}

	public void test6043() {
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertFalse(it.hasNext());
	}

	public void test6044() {
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertFalse(it.hasNext());
	}

	public void test6045() {
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertFalse(it.hasNext());
	}

	public void test6046() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6047() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6048() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6049() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6050() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6051() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6052() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6053() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6054() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6055() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6056() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6057() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6058() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6059() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6060() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6061() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T6);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6062() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T6);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6063() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T6);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6064() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T6);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6065() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T6);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6066() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T6);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6067() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertFalse(it.hasNext());
	}

	public void test6068() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertFalse(it.hasNext());
	}

	public void test6069() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertFalse(it.hasNext());
	}

	public void test6070() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertFalse(it.hasNext());
	}

	public void test6071() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertFalse(it.hasNext());
	}

	public void test6072() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6073() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6074() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6075() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6076() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6077() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6078() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6079() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T6);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6080() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T6);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6081() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T6);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6082() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T6);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6083() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertFalse(it.hasNext());
	}

	public void test6084() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertFalse(it.hasNext());
	}

	public void test6085() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertFalse(it.hasNext());
	}

	public void test6086() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6087() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6088() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6089() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.insert(6, Team.T6);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6090() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.insert(6, Team.T6);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6091() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertFalse(it.hasNext());
	}

	public void test6092() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertFalse(it.hasNext());
	}

	public void test6093() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T6);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6094() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T6);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6095() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertFalse(it.hasNext());
	}

	public void test6096() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertFalse(it.hasNext());
	}

	public void test6097() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T6);
		r.insert(5, Team.T4);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6098() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.insert(6, Team.T5);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertFalse(it.hasNext());
	}

	public void test6099() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(5, Team.T6);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6100() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T3);
		r.insert(5, Team.T5);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6101() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T3);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6102() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6103() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6104() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6105() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.insert(6, Team.T6);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6106() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.insert(6, Team.T6);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6107() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertFalse(it.hasNext());
	}

	public void test6108() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertFalse(it.hasNext());
	}

	public void test6109() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T6);
		r.insert(5, Team.T4);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6110() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(4, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6111() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(4, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6112() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(4, Team.T6);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6113() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(4, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6114() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(4, Team.T6);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6115() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6116() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6117() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6118() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T5);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6119() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6120() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6121() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6122() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T5);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6123() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6124() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6125() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6126() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6127() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6128() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T4);
		r.insert(4, Team.T5);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6129() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6130() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6131() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6132() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6133() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6134() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6135() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6136() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6137() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.insert(6, Team.T6);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6138() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.insert(6, Team.T6);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6139() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T5);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertFalse(it.hasNext());
	}

	public void test6140() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T5);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertFalse(it.hasNext());
	}

	public void test6141() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T6);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6142() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T6);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6143() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertFalse(it.hasNext());
	}

	public void test6144() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertFalse(it.hasNext());
	}

	public void test6145() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.insert(5, Team.T6);
		r.insert(5, Team.T4);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6146() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.insert(6, Team.T5);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertFalse(it.hasNext());
	}

	public void test6147() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T5);
		r.insert(5, Team.T6);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6148() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T6);
		r.insert(4, Team.T3);
		r.insert(5, Team.T5);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6149() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T6);
		r.insert(4, Team.T3);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6150() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T6);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6151() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T6);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6152() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6153() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6154() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6155() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6156() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6157() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6158() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6159() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6160() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6161() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6162() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6163() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6164() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6165() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6166() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T3);
		r.insert(3, Team.T4);
		r.insert(2, Team.T1);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6167() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6168() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6169() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T4);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6170() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6171() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6172() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6173() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6174() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6175() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6176() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6177() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6178() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6179() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T5);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6180() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6181() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T5);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6182() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6183() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6184() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6185() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6186() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6187() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6188() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6189() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T5);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6190() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6191() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6192() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6193() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T5);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6194() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6195() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6196() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6197() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6198() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6199() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(4, Team.T5);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6200() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6201() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6202() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6203() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6204() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6205() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.insert(5, Team.T5);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6206() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6207() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6208() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6209() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T5);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6210() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T4);
		r.insert(3, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6211() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T4);
		r.insert(3, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6212() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T4);
		r.insert(3, Team.T5);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6213() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T4);
		r.insert(3, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6214() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T4);
		r.insert(3, Team.T5);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6215() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6216() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6217() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6218() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6219() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6220() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6221() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6222() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6223() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6224() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6225() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6226() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6227() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6228() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T3);
		r.insert(3, Team.T4);
		r.insert(2, Team.T1);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6229() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6230() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6231() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6232() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6233() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6234() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6235() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6236() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6237() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6238() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6239() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6240() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6241() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T6);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6242() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T6);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6243() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T6);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6244() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T6);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6245() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertFalse(it.hasNext());
	}

	public void test6246() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertFalse(it.hasNext());
	}

	public void test6247() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertFalse(it.hasNext());
	}

	public void test6248() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6249() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6250() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6251() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.insert(6, Team.T6);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6252() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.insert(6, Team.T6);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6253() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertFalse(it.hasNext());
	}

	public void test6254() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertFalse(it.hasNext());
	}

	public void test6255() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T6);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6256() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T6);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6257() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertFalse(it.hasNext());
	}

	public void test6258() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertFalse(it.hasNext());
	}

	public void test6259() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T6);
		r.insert(5, Team.T4);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6260() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.insert(6, Team.T5);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertFalse(it.hasNext());
	}

	public void test6261() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(5, Team.T6);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6262() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T3);
		r.insert(5, Team.T5);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6263() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T3);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6264() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6265() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6266() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6267() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.insert(6, Team.T6);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6268() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.insert(6, Team.T6);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6269() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertFalse(it.hasNext());
	}

	public void test6270() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertFalse(it.hasNext());
	}

	public void test6271() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T6);
		r.insert(5, Team.T4);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6272() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T5);
		r.insert(4, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6273() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T5);
		r.insert(4, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6274() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T5);
		r.insert(4, Team.T6);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6275() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T5);
		r.insert(4, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6276() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T5);
		r.insert(4, Team.T6);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6277() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6278() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6279() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6280() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T5);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6281() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6282() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6283() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6284() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T5);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6285() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6286() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6287() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6288() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6289() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6290() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T4);
		r.insert(4, Team.T5);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6291() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6292() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6293() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6294() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6295() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6296() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6297() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6298() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6299() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6300() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6301() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6302() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6303() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6304() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6305() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6306() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6307() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6308() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6309() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6310() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6311() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6312() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6313() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6314() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6315() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6316() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6317() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6318() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6319() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6320() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6321() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6322() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6323() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(3, Team.T4);
		r.insert(2, Team.T1);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6324() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6325() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6326() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6327() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6328() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6329() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6330() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6331() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6332() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6333() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6334() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T3);
		r.insert(2, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6335() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T3);
		r.insert(2, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6336() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T3);
		r.insert(2, Team.T4);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6337() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T3);
		r.insert(2, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6338() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T3);
		r.insert(2, Team.T4);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6339() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6340() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6341() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6342() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T3);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6343() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6344() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6345() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6346() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6347() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6348() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6349() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6350() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6351() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6352() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T2);
		r.insert(2, Team.T3);
		r.insert(1, Team.T0);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6353() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6354() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6355() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T3);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6356() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6357() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T3);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6358() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6359() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6360() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6361() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6362() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6363() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6364() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6365() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6366() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6367() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6368() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6369() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6370() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6371() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6372() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6373() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T5);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6374() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6375() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T5);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6376() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6377() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T5);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6378() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6379() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6380() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6381() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6382() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6383() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6384() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6385() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6386() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6387() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6388() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6389() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6390() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6391() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T5);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6392() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6393() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T5);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6394() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6395() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6396() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6397() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6398() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6399() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6400() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6401() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T5);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6402() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6403() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6404() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6405() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T5);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6406() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6407() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6408() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6409() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6410() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6411() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(4, Team.T5);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6412() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6413() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6414() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6415() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6416() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6417() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.insert(5, Team.T5);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6418() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6419() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6420() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6421() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T5);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6422() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(3, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6423() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(3, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6424() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(3, Team.T5);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6425() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(3, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6426() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(3, Team.T5);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6427() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6428() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6429() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6430() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6431() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6432() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6433() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6434() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6435() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6436() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6437() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6438() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6439() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6440() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T3);
		r.insert(3, Team.T4);
		r.insert(2, Team.T1);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6441() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6442() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6443() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6444() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6445() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6446() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6447() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6448() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6449() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T5);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6450() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6451() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6452() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6453() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T5);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6454() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6455() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6456() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6457() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6458() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6459() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T4);
		r.insert(4, Team.T5);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6460() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6461() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6462() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T5);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6463() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6464() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6465() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6466() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6467() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6468() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T3);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6469() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6470() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6471() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6472() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6473() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6474() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6475() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6476() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6477() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6478() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T2);
		r.insert(2, Team.T3);
		r.insert(1, Team.T0);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6479() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6480() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6481() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T3);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6482() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6483() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T3);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6484() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6485() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6486() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6487() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6488() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6489() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6490() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6491() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6492() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6493() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6494() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6495() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6496() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6497() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6498() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6499() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6500() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6501() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6502() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6503() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6504() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6505() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6506() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6507() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6508() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6509() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6510() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6511() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(3, Team.T4);
		r.insert(2, Team.T1);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6512() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6513() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6514() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6515() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6516() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6517() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6518() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6519() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6520() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6521() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6522() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T3);
		r.insert(2, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6523() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T3);
		r.insert(2, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6524() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T3);
		r.insert(2, Team.T4);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6525() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T3);
		r.insert(2, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6526() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T3);
		r.insert(2, Team.T4);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6527() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6528() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6529() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6530() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T3);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6531() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6532() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6533() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6534() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6535() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6536() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6537() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6538() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6539() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6540() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T2);
		r.insert(2, Team.T3);
		r.insert(1, Team.T0);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6541() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6542() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6543() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T3);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6544() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test6545() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T3);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7000() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7001() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7002() {
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7003() {
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7004() {
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7005() {
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7006() {
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7007() {
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T6);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7008() {
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T6);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7009() {
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T6);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7010() {
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T6);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7011() {
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T6);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7012() {
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(7, Team.T6);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7013() {
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(7, Team.T6);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7014() {
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(7, Team.T6);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7015() {
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(7, Team.T6);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7016() {
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(7, Team.T6);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7017() {
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(7, Team.T6);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7018() {
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(7, Team.T6);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7019() {
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(7, Team.T6);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7020() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7021() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7022() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7023() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7024() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7025() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7026() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7027() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7028() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7029() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7030() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7031() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7032() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7033() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7034() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7035() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7036() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7037() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T6);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7038() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T6);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7039() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T6);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7040() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(7, Team.T6);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7041() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(7, Team.T6);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7042() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(7, Team.T6);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7043() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(7, Team.T6);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7044() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(7, Team.T6);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7045() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7046() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7047() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7048() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7049() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7050() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7051() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7052() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7053() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7054() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7055() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T6);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7056() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T6);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7057() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(7, Team.T6);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7058() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(7, Team.T6);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7059() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(7, Team.T6);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7060() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7061() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7062() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7063() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7064() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7065() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7066() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.insert(6, Team.T6);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7067() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(7, Team.T6);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7068() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(7, Team.T6);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7069() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7070() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7071() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7072() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T6);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7073() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.insert(7, Team.T6);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7074() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T6);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7075() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T6);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7076() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.insert(7, Team.T6);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7077() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T6);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7078() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.insert(7, Team.T6);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7079() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T6);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7080() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7081() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.insert(6, Team.T5);
		r.insert(7, Team.T6);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7082() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.insert(6, Team.T6);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7083() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(5, Team.T6);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7084() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(5, Team.T6);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7085() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T3);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7086() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7087() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7088() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7089() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7090() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T3);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7091() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.insert(6, Team.T5);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7092() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7093() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7094() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.insert(6, Team.T6);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7095() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.insert(7, Team.T6);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7096() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T6);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7097() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T6);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7098() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.insert(7, Team.T6);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7099() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.insert(6, Team.T6);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7100() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.insert(7, Team.T6);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7101() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T6);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7102() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7103() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(4, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7104() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(4, Team.T6);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7105() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(4, Team.T6);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7106() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(4, Team.T6);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7107() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(4, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7108() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(4, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7109() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(4, Team.T6);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7110() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(4, Team.T6);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7111() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(4, Team.T6);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7112() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7113() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7114() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7115() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7116() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7117() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7118() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7119() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7120() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7121() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7122() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7123() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7124() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7125() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.insert(6, Team.T5);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7126() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7127() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7128() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7129() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7130() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T4);
		r.insert(4, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7131() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T4);
		r.insert(4, Team.T5);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7132() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7133() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7134() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7135() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7136() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7137() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7138() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7139() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7140() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7141() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7142() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.insert(6, Team.T6);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7143() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T5);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(7, Team.T6);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7144() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T5);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(7, Team.T6);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7145() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T6);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7146() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T6);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7147() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T6);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7148() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T6);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7149() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.insert(7, Team.T6);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7150() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.insert(5, Team.T6);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7151() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.insert(5, Team.T6);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7152() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.insert(7, Team.T6);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7153() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T6);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7154() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.insert(7, Team.T6);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7155() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.insert(5, Team.T6);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7156() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7157() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.insert(6, Team.T5);
		r.insert(7, Team.T6);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7158() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.insert(6, Team.T6);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7159() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T5);
		r.insert(5, Team.T6);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7160() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T5);
		r.insert(5, Team.T6);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7161() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T6);
		r.insert(4, Team.T3);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7162() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T6);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7163() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7164() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7165() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T6);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7166() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T6);
		r.insert(4, Team.T3);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7167() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T6);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.insert(6, Team.T5);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7168() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7169() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7170() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7171() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7172() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7173() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7174() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7175() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7176() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7177() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7178() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7179() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7180() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7181() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7182() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7183() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7184() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7185() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7186() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7187() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7188() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T3);
		r.insert(3, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7189() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T3);
		r.insert(3, Team.T4);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7190() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7191() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T4);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7192() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7193() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7194() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7195() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7196() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T4);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7197() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7198() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(3, Team.T6);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7199() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7200() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7201() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7202() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7203() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7204() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7205() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7206() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7207() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7208() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7209() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7210() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7211() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7212() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7213() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7214() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7215() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7216() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7217() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7218() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7219() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7220() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7221() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7222() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7223() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7224() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.insert(6, Team.T5);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7225() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7226() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7227() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7228() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7229() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(4, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7230() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(4, Team.T5);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7231() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7232() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7233() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7234() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7235() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7236() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7237() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7238() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7239() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7240() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7241() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7242() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T5);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7243() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T5);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7244() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7245() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7246() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.insert(6, Team.T5);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7247() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T5);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7248() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7249() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T4);
		r.insert(3, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7250() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T4);
		r.insert(3, Team.T5);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7251() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T4);
		r.insert(3, Team.T5);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7252() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T4);
		r.insert(3, Team.T5);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7253() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T4);
		r.insert(3, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7254() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T4);
		r.insert(3, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7255() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T4);
		r.insert(3, Team.T5);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7256() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T4);
		r.insert(3, Team.T5);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7257() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T4);
		r.insert(3, Team.T5);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7258() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7259() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7260() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7261() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7262() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7263() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7264() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7265() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7266() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7267() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7268() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7269() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7270() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7271() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7272() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7273() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7274() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7275() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7276() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T3);
		r.insert(3, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7277() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T3);
		r.insert(3, Team.T4);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7278() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7279() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7280() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7281() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7282() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7283() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7284() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7285() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7286() {
		r.insert(1, Team.T0);
		r.insert(2, Team.T6);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7287() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7288() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7289() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T6);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7290() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T6);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7291() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(7, Team.T6);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7292() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(7, Team.T6);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7293() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(7, Team.T6);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7294() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7295() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7296() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7297() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7298() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7299() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7300() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.insert(6, Team.T6);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7301() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(7, Team.T6);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7302() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(7, Team.T6);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7303() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7304() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7305() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7306() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T6);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7307() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.insert(7, Team.T6);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7308() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T6);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7309() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T6);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7310() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.insert(7, Team.T6);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7311() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T6);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7312() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.insert(7, Team.T6);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7313() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T6);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7314() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7315() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.insert(6, Team.T5);
		r.insert(7, Team.T6);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7316() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.insert(6, Team.T6);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7317() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(5, Team.T6);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7318() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(5, Team.T6);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7319() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T3);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7320() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7321() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7322() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7323() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7324() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T3);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7325() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.insert(6, Team.T5);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7326() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7327() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T6);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7328() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.insert(6, Team.T6);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7329() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.insert(7, Team.T6);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7330() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T6);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7331() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T6);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7332() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.insert(7, Team.T6);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7333() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.insert(6, Team.T6);
		r.insert(6, Team.T5);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7334() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.insert(7, Team.T6);
		r.remove(7);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertFalse(it.hasNext());
	}

	public void test7335() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T6);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7336() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T6);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7337() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T5);
		r.insert(4, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7338() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T5);
		r.insert(4, Team.T6);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7339() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T5);
		r.insert(4, Team.T6);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7340() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T5);
		r.insert(4, Team.T6);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7341() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T5);
		r.insert(4, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7342() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T5);
		r.insert(4, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7343() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T5);
		r.insert(4, Team.T6);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7344() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T5);
		r.insert(4, Team.T6);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7345() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T5);
		r.insert(4, Team.T6);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7346() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7347() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7348() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7349() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7350() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7351() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7352() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7353() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7354() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7355() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7356() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7357() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7358() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7359() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.insert(6, Team.T5);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7360() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7361() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7362() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7363() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7364() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T4);
		r.insert(4, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7365() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T4);
		r.insert(4, Team.T5);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7366() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7367() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7368() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7369() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7370() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7371() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7372() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7373() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7374() {
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T6);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7375() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7376() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7377() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7378() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7379() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7380() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7381() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7382() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7383() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7384() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7385() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7386() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7387() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7388() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7389() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7390() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7391() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7392() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7393() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7394() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7395() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7396() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7397() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7398() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7399() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7400() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7401() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7402() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7403() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7404() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7405() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(3, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7406() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(3, Team.T4);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7407() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7408() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7409() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7410() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7411() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7412() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7413() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7414() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7415() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7416() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7417() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7418() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7419() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7420() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7421() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7422() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7423() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7424() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7425() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T3);
		r.insert(2, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7426() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T3);
		r.insert(2, Team.T4);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7427() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T3);
		r.insert(2, Team.T4);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7428() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T3);
		r.insert(2, Team.T4);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7429() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T3);
		r.insert(2, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7430() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T3);
		r.insert(2, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7431() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T3);
		r.insert(2, Team.T4);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7432() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T3);
		r.insert(2, Team.T4);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7433() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T3);
		r.insert(2, Team.T4);
		r.insert(1, Team.T2);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7434() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7435() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7436() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7437() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7438() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7439() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7440() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7441() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7442() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7443() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7444() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7445() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7446() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7447() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7448() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7449() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7450() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7451() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7452() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T2);
		r.insert(2, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7453() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T2);
		r.insert(2, Team.T3);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7454() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7455() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T3);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7456() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T3);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7457() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T3);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7458() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7459() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7460() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T3);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7461() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T3);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7462() {
		r.insert(1, Team.T5);
		r.insert(2, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T3);
		r.insert(1, Team.T2);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7463() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7464() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7465() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7466() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7467() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7468() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7469() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7470() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7471() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7472() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7473() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7474() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7475() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7476() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7477() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7478() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7479() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7480() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7481() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7482() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7483() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7484() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7485() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7486() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7487() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7488() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7489() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7490() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7491() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7492() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7493() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7494() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7495() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7496() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7497() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7498() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7499() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7500() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7501() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7502() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7503() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7504() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7505() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7506() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7507() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7508() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.insert(6, Team.T5);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7509() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7510() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7511() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7512() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7513() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(4, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7514() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(4, Team.T5);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7515() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7516() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7517() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7518() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7519() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7520() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7521() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7522() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7523() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7524() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7525() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7526() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T5);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7527() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T5);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7528() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7529() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7530() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.insert(6, Team.T5);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7531() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T5);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7532() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7533() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(3, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7534() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(3, Team.T5);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7535() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(3, Team.T5);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7536() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(3, Team.T5);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7537() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(3, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7538() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(3, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7539() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(3, Team.T5);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7540() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(3, Team.T5);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7541() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(3, Team.T5);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7542() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7543() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7544() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7545() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7546() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7547() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7548() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7549() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7550() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7551() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7552() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7553() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7554() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7555() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7556() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7557() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7558() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7559() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7560() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T3);
		r.insert(3, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7561() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T3);
		r.insert(3, Team.T4);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7562() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7563() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7564() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7565() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7566() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7567() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7568() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7569() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7570() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T0);
		r.insert(2, Team.T5);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7571() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7572() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7573() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7574() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7575() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7576() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7577() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7578() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7579() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7580() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7581() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7582() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7583() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7584() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.insert(6, Team.T5);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7585() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7586() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T5);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7587() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.insert(6, Team.T5);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7588() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T5);
		r.insert(5, Team.T4);
		r.remove(6);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7589() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T4);
		r.insert(4, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7590() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T4);
		r.insert(4, Team.T5);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7591() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7592() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T5);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7593() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7594() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7595() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7596() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T5);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7597() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T5);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7598() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7599() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T5);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7600() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7601() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7602() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7603() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7604() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7605() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7606() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7607() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7608() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7609() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7610() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7611() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7612() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7613() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7614() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7615() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7616() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7617() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7618() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T2);
		r.insert(2, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7619() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T2);
		r.insert(2, Team.T3);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7620() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7621() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T3);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7622() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T3);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7623() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T3);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7624() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7625() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7626() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T3);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7627() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T3);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7628() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T4);
		r.insert(2, Team.T5);
		r.insert(1, Team.T3);
		r.insert(1, Team.T2);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7629() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7630() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7631() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7632() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7633() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7634() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7635() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7636() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7637() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7638() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7639() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7640() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7641() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7642() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7643() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7644() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7645() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7646() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7647() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7648() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7649() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7650() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7651() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7652() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7653() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7654() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7655() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7656() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7657() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7658() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7659() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(3, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7660() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(3, Team.T4);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7661() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7662() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7663() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7664() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7665() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7666() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7667() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7668() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7669() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T0);
		r.insert(2, Team.T4);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7670() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7671() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7672() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7673() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7674() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.insert(5, Team.T4);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7675() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T4);
		r.insert(4, Team.T3);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7676() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.insert(5, Team.T4);
		r.remove(5);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7677() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T4);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7678() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T4);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7679() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T3);
		r.insert(2, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7680() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T3);
		r.insert(2, Team.T4);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7681() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T3);
		r.insert(2, Team.T4);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7682() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T3);
		r.insert(2, Team.T4);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7683() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T3);
		r.insert(2, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7684() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T3);
		r.insert(2, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7685() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T3);
		r.insert(2, Team.T4);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7686() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T3);
		r.insert(2, Team.T4);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7687() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T3);
		r.insert(2, Team.T4);
		r.insert(1, Team.T2);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7688() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7689() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7690() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7691() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7692() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7693() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7694() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7695() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7696() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7697() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7698() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7699() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7700() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7701() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.insert(4, Team.T3);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7702() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7703() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T0);
		r.insert(2, Team.T3);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7704() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.insert(4, Team.T3);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7705() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T3);
		r.insert(3, Team.T2);
		r.remove(4);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7706() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T2);
		r.insert(2, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7707() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T2);
		r.insert(2, Team.T3);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7708() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7709() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T3);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7710() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T3);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7711() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T3);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7712() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.insert(3, Team.T2);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7713() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T3);
		r.insert(1, Team.T0);
		r.insert(2, Team.T2);
		r.insert(2, Team.T1);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7714() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T3);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.insert(3, Team.T2);
		r.remove(3);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T1, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7715() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T3);
		r.insert(1, Team.T2);
		r.insert(1, Team.T0);
		r.insert(2, Team.T1);
		r.remove(1);
		it = r.values().iterator();
		assertSame(Team.T1, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}

	public void test7716() {
		r.insert(1, Team.T6);
		r.insert(1, Team.T5);
		r.insert(1, Team.T4);
		r.insert(1, Team.T3);
		r.insert(1, Team.T2);
		r.insert(1, Team.T1);
		r.insert(1, Team.T0);
		r.remove(2);
		it = r.values().iterator();
		assertSame(Team.T0, it.next());
		assertSame(Team.T2, it.next());
		assertSame(Team.T3, it.next());
		assertSame(Team.T4, it.next());
		assertSame(Team.T5, it.next());
		assertSame(Team.T6, it.next());
		assertFalse(it.hasNext());
	}
}


// Total tests: 1571
