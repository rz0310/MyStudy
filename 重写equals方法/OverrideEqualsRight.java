package 重写equals方法;

public class OverrideEqualsRight {
	
	public static void main(String[] args) {
//		p1和p2的IdStr相同,返回true
		Person p1 = new Person("小猪","123123");
		Person p2 = new Person("小花","123123");
		System.out.println(p1.equals(p2));

//		p1和p3的IdStr不相同,返回false
		Person p3 = new Person("小明","123456");
		System.out.println(p3.equals(p1));
	}
}
