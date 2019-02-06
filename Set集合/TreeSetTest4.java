package Set集合;
/*
 * Comparator是一个函数式接口，其中包含一个int compare(T o1,T o2)方法。
 * 要实现定制排序， 提供一个Comparator对象与该TreeSet集合关联，由该对象实现集合元素的排序逻辑。
 * 该方法同样也不可向TreeSet集合添加不同类型的对象，否则抛出ClassCastException。
 *
 */
import java.util.TreeSet;

class M {
	int age;
	public M(int age) {
		this.age = age;
	}
	public String toString() {
		return "M[age:"+age+"]";
	}
}

public class TreeSetTest4 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet((o1,o2)->
		{
			M m1 = (M)o1;
			M m2 = (M)o2;
//			根据M对象的age属性来决定大小，age越大，M对象反而越小
			return m1.age > m2.age ? -1 :
				m1.age < m2.age ? 1 : 0;
		});
		ts.add(new M(5));
		ts.add(new M(-3));
		ts.add(new M(9));
		System.out.println(ts);
	}
}
