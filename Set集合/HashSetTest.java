package Set集合;

import java.util.HashSet;

//重写其equals()方法，总是返回true，但没有重写hashCode()方法
class A {
	public boolean equals(Object obj) {
		return true;
	}
}

//重写hashCode()方法，总是返回1，但没有重写其equals()方法
class B {
	public int hashCode() {
		return 1;
	}
}

//重写hashCode()方法，总是返回2,重写其equals()方法，总是返回true
class C {
//	该类new出来的对象的hashCode和equals方法的返回值总是相同
	public boolean equals(Object obj) {
		return true;
	}
	public int hashCode() {
		return 2;
	}
}

public class HashSetTest {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
//		分别向集合种添加两个A对象、两个B对象、两个C对象
		hs.add(new A());
		hs.add(new A());
		hs.add(new B());
		hs.add(new B());
		hs.add(new C());
		hs.add(new C());
		System.out.println(hs);
	}
}
