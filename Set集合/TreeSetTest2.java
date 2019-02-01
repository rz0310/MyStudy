package Set集合;
/*
 * 对于TreeSet集合而言，判断两个对象相等的标准是：两个对象通过CompareTo(Object obj)方法比较是否返回0——返回0，TreeSet认为他们相等；
 * 否则认为他们不想等。
 * 
 * 注意：当把一个对象放入TreeSet中，重新该对象对应类的equals()方法时，应保证该方法与compareTo(Object obj)方法有一致的结果，
 * 其规则是：如果两个对象通过equals()方法比较的返回值为true时，这两个对象通过compareTo(Object obj)方法比较应该返回0。
 */
import java.util.TreeSet;

class Z implements Comparable {
	int age;
	public Z(int age) {
		this.age = age;
	}
//	重写equals方法，总是返回true
	public boolean equals(Object obj) {
		return true;
	}
//	重写compareTo(Object obj)方法，总是返回1(总是不相等)
	public int compareTo(Object obj) {
		return 1;
	}
	
}

public class TreeSetTest2 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		Z z1 = new Z(6);
		ts.add(z1);
		System.out.println(ts.add(z1));
		System.out.println(ts);
//		修改TreeSet集合的第一个元素的age变量
		((Z)ts.first()).age = 9;
//		输出TreeSet集合最后一个元素的age变量，也变成了9
		System.out.println(((Z)ts.last()).age);
	}
}
