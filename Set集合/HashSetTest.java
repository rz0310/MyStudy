package Set����;

import java.util.HashSet;

//��д��equals()���������Ƿ���true����û����дhashCode()����
class A {
	public boolean equals(Object obj) {
		return true;
	}
}

//��дhashCode()���������Ƿ���1����û����д��equals()����
class B {
	public int hashCode() {
		return 1;
	}
}

//��дhashCode()���������Ƿ���2,��д��equals()���������Ƿ���true
class C {
//	����new�����Ķ����hashCode��equals�����ķ���ֵ������ͬ
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
//		�ֱ��򼯺����������A��������B��������C����
		hs.add(new A());
		hs.add(new A());
		hs.add(new B());
		hs.add(new B());
		hs.add(new C());
		hs.add(new C());
		System.out.println(hs);
	}
}
