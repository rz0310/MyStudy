package ��дequals����;

public class OverrideEqualsRight {
	
	public static void main(String[] args) {
//		p1��p2��IdStr��ͬ,����true
		Person p1 = new Person("С��","123123");
		Person p2 = new Person("С��","123123");
		System.out.println(p1.equals(p2));

//		p1��p3��IdStr����ͬ,����false
		Person p3 = new Person("С��","123456");
		System.out.println(p3.equals(p1));
	}
}
