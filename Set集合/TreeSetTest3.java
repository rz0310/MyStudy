package Set集合;

import java.util.TreeSet;
/*
 * T类是一个可变类，因此可以修改T对象的count实例变量的值
 */
class T implements Comparable {
	int count;
	public T(int count) {
		this.count = count;
	}
	public String toString() {
		return "T[count:"+count+"]";
	}
//	重写equals()方法
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj != null && obj.getClass() == T.class) {
			T t = (T)obj;
			return this.count == t.count;
		}
		return false;
	}
//	重写compareTo()方法，根据count来比较大小
	public int compareTo(Object obj) {
		T t = (T)obj;
		return count > t.count ? 1 :
			count < t.count? -1 : 0;
	}
}

public class TreeSetTest3 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
//		注意TreeSet集合的add方法的形参必须是同一个类的对象（new 类名()），否则就会抛出ClassCastException异常
		ts.add(new T(5));
		ts.add(new T(-3));
		ts.add(new T(9));
		ts.add(new T(-2));
		System.out.println(ts);
//		取出第一个元素
		T first = (T)ts.first();
//		修改第一个元素的count变量
		first.count = 20;
//		取出最后一个元素
		T last = (T)ts.last();
//		修改最后一个元素的count变量
		last.count = -2;
		System.out.println(ts);
//		删除实例变量被改变的元素，删除失败
		System.out.println(ts.remove(new T(-2)));
		System.out.println(ts);
//		删除实例变量没有被改变的元素，删除成功
//		说明TreeSet可以删除没有被修改实例变量、且不与其他被修改过实例变量的对象重复的对象。
		System.out.println(ts.remove(new T(5)));
//		上一行代码执行完后，TreeSet会对集合中的元素重新索引（不是重新排列），接下来就可以删除TreeSet集合中的所有元素了，
//		包括那些被修改过实例变量的元素。
		System.out.println(ts);
	}
}
