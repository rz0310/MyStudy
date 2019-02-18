package Map集合;
import java.util.HashMap;
/*
 * 为了成功的在HashMap和Hashtable中存储、获取对象，用作key的对象必须实现HashCode()方法和equals()方法。
 * 
 * 类似于HashSet,HashMap和Hashtable也不能保证其中key-value对顺序。
 * HashMap和Hashtable判断两个key相等的标准是：两个key通过equals()比较返回true，两个key的HashCode()也相等。
 * 两个value相等的标准：只要两个对象通过equals()方法比较返回true即可。
 */
import java.util.Hashtable;

class A {
	int count;
	public A(int count) {
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

class B {
//	重写equals（）方法，任何对象与B对象相比都返回true
	public boolean equals(Object obj) {
		return true;
	}
}

public class HashtableTest {
	public static void main(String[] args) {
		HashMap ht = new HashMap();
//		Hashtable ht = new Hashtable();
		ht.put(new A(60000), "小仙女");
		ht.put(new A(999), "二狗子");
		ht.put(new A(123), new B());
		System.out.println(ht);
//		只要两个对象通过equals()方法比较返回true,Hashtable就认为他们是相等的value
//		HashTbable中有一个B对象，equals()方法始终返回true
//		System.out.println(ht.containsValue("测试字符串"));
//		只要两个对象的count相等equals返回true,且hashCode相等。Hashtable就认为他们是相同的key
//		System.out.println(ht.containsKey(new A(999)));
//		删除最后一个key-value对
		ht.remove(new A(123));
		System.out.println(ht);
	}
}
