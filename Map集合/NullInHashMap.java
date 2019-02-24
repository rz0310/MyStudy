package Map集合;
/*
 * Hashtable出现于JDK1.0。
 * Java8改进了HashMap的实现，使用HashMap存在key冲突时依然有较好的性能。
 * 
 * HashMap和Hashtable的典型区别：
 * Hashtable：线程安全，Hashtable性能因此而低一些。如果有多个线程同时访问同一个Map对象时，使用Hashtable实现类会更好。
 * 					不允许null作为key和value，如果试图放入，会引发NullPointerException。
 * HashMap：线程不安全，因此性能高一些。允许null作为key和value。但是HashMap中的key不能重复，所以最多有一个key-value对的key可以为null，
 * 					但是可以有无数多个key-value对的value可以为null。
 */
import java.util.HashMap;

public class NullInHashMap {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
//		试图将两个key为null值的key-value对放入HashMap
		hm.put(null, null);
		hm.put(null, null);
//		试图将一个value为null的key-value对放入HashMap
		hm.put("a", null);
		System.out.println(hm);
	}
}
