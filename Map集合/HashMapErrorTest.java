package Map集合;
/*
 * 当使用自定义类作为HashMap、Hashtable的key时，如果重写该类的equals(Object obj)方法和HashCode()方法，则应该保证
 * 当两个key通过equals（）比较返回true时，两个key的HashCode()返回值也应该相等。
 */
import java.util.HashMap;
import java.util.Iterator;

class C {
	int count;
	public C(int count) {
		this.count = count;
	}
//	根据count的值来判断两个对象是否相等
	public boolean equals(Object obj) {
		if(obj == this) {
			return true;
		}
		if(obj != null && obj.getClass() == A.class) {
			A a = (A)obj;
			return this.count == a.count;
		}
		return false;
	}
//	根据count来计算hashCode值
	public int hashCode() {
		return this.count;
	}
}

class D {
//	重写equals（）方法，任何对象与B对象相比都返回true
	public boolean equals(Object obj) {
		return true;
	}
}
//????????????????????????????????????????????????/
public class HashMapErrorTest {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(new C(60000), "小仙女");
		hm.put(new C(999), "二狗子");
		hm.put(new C(123), new D());
		System.out.println(hm);
//		获取hashMap中key set集合对应的迭代器
//		Iterator it = hm.keySet().iterator();
//		C first = (C)it.next();
//		System.out.println(first.count);
//		first.count = 666;
//		System.out.println(first.count);
//		System.out.println(hm);
		hm.remove(new C(666));
		System.out.println(hm);
//		System.out.println(hm.get(new C(666)));
//		System.out.println(hm.get(new C(999)));
	}
}
