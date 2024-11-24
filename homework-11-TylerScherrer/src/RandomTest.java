import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

import edu.uwm.cs.random.AbstractRandomTest;
import edu.uwm.cs.random.Command;
import edu.uwm.cs.util.TriFunction;
import edu.uwm.cs351.Ranking;
import edu.uwm.cs351.test.ReferenceRanking;
import edu.uwm.cs351.util.DefaultEntry;

public class RandomTest extends AbstractRandomTest<ReferenceRanking<String>, Ranking<String>> {
	private static final int DEFAULT_MAX_TEST_LENGTH = 1000;
	private static final int MAX_TESTS = 5_000_000;

	@SuppressWarnings("unchecked")
	private final Class<Set<Entry<Integer,String>>> entrySetClass = (Class<Set<Entry<Integer,String>>>)(Class<?>)Set.class;
	@SuppressWarnings("unchecked")
	private final Class<Collection<String>> valuesClass = (Class<Collection<String>>)(Class<?>)Collection.class;
	private final RegisteredClass<Set<Entry<Integer,String>>, Set<Entry<Integer,String>>> entrySetDesc = super.registerMutableClass(entrySetClass, entrySetClass, "Set<Entry<Integer,String>>", "s");
	private final RegisteredClass<Collection<String>,Collection<String>> valuesDesc = super.registerMutableClass(valuesClass,valuesClass,"Collection<Integer>", "vc");
	private final RegisteredClass<Iterator<Entry<Integer,String>>, Iterator<Entry<Integer,String>>> iteratorClass = super.registerMutableClass(iteratorClass(), iteratorClass(), "Iterator<Entry<Integer,String>>", "i");
	private final RegisteredClass<Iterator<String>,Iterator<String>> valuesIteratorClass = super.registerMutableClass(iteratorClass(),iteratorClass(),"Iterator<String>","vi");

	@SuppressWarnings("unchecked")
	protected RandomTest() {
		super((Class<ReferenceRanking<String>>)(Class<?>)ReferenceRanking.class, (Class<Ranking<String>>)(Class<?>)Ranking.class, "Ranking<String>", "m", MAX_TESTS, DEFAULT_MAX_TEST_LENGTH);
	}

	protected Integer randomInteger(Random r, boolean maybeNull) {
		int n = r.nextInt(32);
		if (maybeNull && n == 31) return null;
		return n-1;
	}
	
	protected String randomString(Random r) {
		int n = r.nextInt(64);
		if (n < 26) return ""+(char)('A'+n);
		n -= 26;
		if (n < 26) return "" + (char)('a'+n);
		n -= 26;
		if (n < 10) return "" + (char)('0' + n);
		n -= 10;
		if (n == 0) return "?";
		return null;
	}
	
	protected Entry<Integer,String> e(Random r) {
		int n = r.nextInt(32);
		if (n < 29) return new DefaultEntry<>(n,randomString(r));
		if (n < 30) return null;
		return new DefaultEntry<Integer,String>(null,randomString(r));
	}
		
	@Override
	public String toString(Object x) {
		if (x instanceof Entry<?,?>) {
			Entry<?,?> e = (Entry<?,?>)x;
			return "new DefaultEntry<>(" + toString(e.getKey()) + "," + toString(e.getValue()) + ")";
		}
		return super.toString(x);
	}

	private Command<?> newMapCommand = create(mainClass, () -> new ReferenceRanking<String>(), () -> new Ranking<String>());
	private Function<Integer,Command<?>> sizeMapCommand = build(lift(ReferenceRanking<String>::size), lift(Ranking<String>::size), "size"); 
	private Function<Integer,Command<?>> entrySetCommand = build(lift(entrySetDesc,ReferenceRanking::entrySet), lift(entrySetDesc,Ranking<String>::entrySet), "entrySet");
	private Function<Integer,Command<?>> valuesCommand = build(lift(valuesDesc,ReferenceRanking::values), lift(valuesDesc,Ranking<String>::values), "values");
	private Function<Integer,Command<?>> clearMapCommand = build(lift(ReferenceRanking<String>::clear), lift(Ranking<String>::clear), "clear"); 
	private BiFunction<Integer, Integer, Command<?>> getCommand = build(lift(ReferenceRanking<String>::get), lift(Ranking<String>::get), "get");
	private BiFunction<Integer, Integer, Command<?>> containsKeyCommand = build(lift(ReferenceRanking<String>::containsKey), lift(Ranking<String>::containsKey), "containsKey");
	private BiFunction<Integer, String, Command<?>> containsValueCommand = build(lift(ReferenceRanking<String>::containsValue), lift(Ranking<String>::containsValue), "containsValue");
	private BiFunction<Integer, Integer, Command<?>> removeKeyCommand = build(lift((ReferenceRanking<String> m, Integer k) -> m.remove(k)), lift((Ranking<String> m, Integer k) -> m.remove(k)), "remove");
	private TriFunction<Integer, Integer, String, Command<?>> putCommand = build(lift(ReferenceRanking<String>::put), lift(Ranking<String>::put), "put");

	private TriFunction<Integer, Integer, String, Command<?>> insertCommand = build(lift(ReferenceRanking<String>::insert), lift(Ranking<String>::insert), "insert");
	
	private Function<Integer,Command<?>> sizeSetCommand = build(entrySetDesc,lift(Set<Entry<Integer,String>>::size), "size");
	private Function<Integer,Command<?>> clearSetCommand = build(entrySetDesc,lift(Set<Entry<Integer,String>>::clear), "clear");
	private Function<Integer,Command<?>> iteratorSetCommand = build(entrySetDesc,lift(iteratorClass, Set<Entry<Integer,String>>::iterator), "iterator");
	private BiFunction<Integer, Entry<Integer,String>, Command<?>> containsEntryCommand = build(entrySetDesc,lift(Set<Entry<Integer,String>>::contains), "contains");
	private BiFunction<Integer, Entry<Integer,String>, Command<?>> removeEntryCommand = build(entrySetDesc,lift(Set<Entry<Integer,String>>::remove), "remove");

	private Function<Integer,Command<?>> hasNextCommand = build(iteratorClass,lift(Iterator<Entry<Integer,String>>::hasNext),"hasNext");
	private Function<Integer,Command<?>> nextCommand = build(iteratorClass,lift(Iterator<Entry<Integer,String>>::next),"next");
	private Function<Integer,Command<?>> removeCommand = build(iteratorClass,lift(Iterator<Entry<Integer,String>>::remove),"remove");

	private Function<Integer,Command<?>> sizeValuesCommand = build(valuesDesc,lift(Collection<String>::size), "size");
	private Function<Integer,Command<?>> clearValuesCommand = build(valuesDesc,lift(Collection<String>::clear), "clear");
	private Function<Integer,Command<?>> iteratorValuesCommand = build(valuesDesc,lift(valuesIteratorClass, Collection<String>::iterator), "iterator");
	private BiFunction<Integer, String, Command<?>> containsStringCommand = build(valuesDesc,lift(Collection<String>::contains), "contains");
	private BiFunction<Integer, String, Command<?>> removeStringCommand = build(valuesDesc,lift(Collection<String>::remove), "remove");

	private Function<Integer,Command<?>> hasNextValuesCommand = build(valuesIteratorClass,lift(Iterator<String>::hasNext),"hasNext");
	private Function<Integer,Command<?>> nextValuesCommand = build(valuesIteratorClass,lift(Iterator<String>::next),"next");
	private Function<Integer,Command<?>> removeValuesCommand = build(valuesIteratorClass,lift(Iterator<String>::remove),"remove");

	private BiFunction<Integer,String,Command<?>> getRankCommand = build(lift(ReferenceRanking<String>::getRank), lift(Ranking<String>::getRank), "getRank");
	@Override
	protected Command<?> randomCommand(Random r) {
		int n = mainClass.size();
		if (n == 0) return newMapCommand;
		int ni = iteratorClass.size();
		int nvi = valuesIteratorClass.size();
		int ns = entrySetDesc.size();
		int nc = valuesDesc.size();
		int index = r.nextInt(n);
		switch (r.nextInt(56)) {
		default:
		case 0: return newMapCommand;
		case 1: return clearMapCommand.apply(index);
		case 2:
		case 3: return sizeMapCommand.apply(index);
		// case 4:
		case 5:
		case 6: return putCommand.apply(index, randomInteger(r, true), randomString(r));
		case 7:
		case 8:
		case 9: return getCommand.apply(index, randomInteger(r, true));
		case 10:
		case 11: return valuesCommand.apply(index);
		case 12: return entrySetCommand.apply(index);
		case 13:
		case 14:
		case 15: return containsValueCommand.apply(index, randomString(r));
		case 16: return containsKeyCommand.apply(index, randomInteger(r, true));
		case 17: 
		case 18: return removeKeyCommand.apply(index, randomInteger(r, true));
		// the next cases all fall through to create an iterator
		case 19: if (nvi > 0) return removeValuesCommand.apply(r.nextInt(nvi));
		case 20: if (ni > 0) return removeCommand.apply(r.nextInt(ni));
		case 21: case 22: 
		case 23: if (nvi > 0) return hasNextValuesCommand.apply(r.nextInt(nvi));
		case 24:
		case 25: if (ni > 0) return hasNextCommand.apply(r.nextInt(ni));
		case 26: case 27: 
		case 28: if (nvi > 0) return nextValuesCommand.apply(r.nextInt(nvi));
		case 29: if (ni > 0) return nextCommand.apply(r.nextInt(ni));
		case 30: if (ns > 0) return iteratorSetCommand.apply(r.nextInt(ns));
		// the next cases all fall through to create an entry set
		case 31: if (nc > 0) return iteratorValuesCommand.apply(r.nextInt(nc));
		case 32: if (ns > 0) return clearSetCommand.apply(r.nextInt(ns));
		case 33: if (nc > 0) return clearValuesCommand.apply(r.nextInt(nc));
		case 34: if (ns > 0) return sizeSetCommand.apply(r.nextInt(ns));
		case 35: if (nc > 0) return sizeValuesCommand.apply(r.nextInt(nc));
		case 36:
		case 37: if (ns > 0) return containsEntryCommand.apply(r.nextInt(ns), e(r));
		case 38:
		case 39:
		case 40: if (nc > 0) return containsStringCommand.apply(r.nextInt(nc), randomString(r));
		case 41:
		case 42:
		case 43: if (ns > 0) return removeEntryCommand.apply(r.nextInt(ns), e(r));		
		case 44:
		case 45:
		case 46: if (nc > 0) return removeStringCommand.apply(r.nextInt(nc), randomString(r));
		case 47: if (nc <= ns) return valuesCommand.apply(index);
		case 48: return entrySetCommand.apply(index);
		case 49:
		case 50: 
		case 51: return insertCommand.apply(index, randomInteger(r, false), randomString(r));
		case 52:
		case 53:
		case 54:
		case 55: return getRankCommand.apply(index, randomString(r));	
		}
	}

	@Override
	protected void printImports() {
		super.printImports();
		System.out.println("import java.util.Collection;");
		System.out.println("import java.util.Iterator;");
		System.out.println("import java.util.Map.Entry;");
		System.out.println("import java.util.Set;\n");
		System.out.println("import edu.uwm.cs351.util.DefaultEntry;");
		System.out.println("import edu.uwm.cs351.Ranking;");
	}
	
	public static void main(String[] args) {
		RandomTest test = new RandomTest();
		test.run();
	}
}
