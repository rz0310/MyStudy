package Map集合;

import java.util.Iterator;
import java.util.TreeMap;

/*
 * TreeMap是一个红黑树数据结构，每个key-value对即作为红黑树的一个节点。
 * TreeMap存储key-value对时，需要根据key对节点进行排序。保证所有key-value对处于有序状态。
 * 两种排序方式：
 * 	自然排序：TreeMap的所有key必须实现comparable接口，而且所有的key应该是同一个类的对象，否则会抛出ClassCastException。
 * 	定制排序：创建TreeMap对象时，需要传入一个comparator对象，由该对象负责对所有的ekey排序。定制排序不要求实现comparable接口。
 * 
 * TreeSet中判断两个元素相等的标准：两个key通过compareTo()方法返回0。
 * 如果使用自定义类作为TreeMap的key，且想让TreeMap良好的工作，则重写该类的equals()方法和compareTo()方法时应保持一致的返回结果。
 * 即两个key通过equals()方法返回true和compareTo()方法返回0。
 */
class R implements Comparable{
	int count;
	public R(int count) {
		this.count = count;
	}
	public String toString() {
		return "R[count:"+count+"]";
	}
//	根据count来判断两个对象是否相等
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj != null && obj.getClass() == R.class) {
			R r = (R)obj;
			return r.count == this.count;
		}
		return false;
	}
//	根据count属性值来判断两个对象的大小
	public int compareTo(Object obj) {
		R r = (R)obj;
		return count > r.count ? 1 : count < r.count ? -1 : 0;
	}
}

public class TreeMapTest {
	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		tm.put(new R(3), "a");
		tm.put(new R(-5), "b");
		tm.put(new R(9), "c");
		System.out.println(tm);
//		返回该TreeMap的第一个Entry对象
		System.out.println(tm.firstEntry());
//		返回该TreeMap的最后一个key值
		System.out.println(tm.lastKey());
//		返回该TreeMap的比new R(2)大的最小key值
		System.out.println(tm.higherKey(new R(2)));
//		返回该TreeMap的比new R(2)小的最大的key-value对	
		System.out.println(tm.lowerEntry(new R(2)));
//		返回该TreeMap的子TreeMap
		System.out.println(tm.subMap(new R(-1), new R(4)));
	}
}
