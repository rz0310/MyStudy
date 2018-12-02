package 类成员;

public class NullAccessStatic {
	public int age;
	public static String name;
	public static void main(String[] args) {
//		null对象访问实例成员,将会引发NullPointerException异常
//		NullAccessStatic n = null;
//		System.out.println(n.age);
		
//		但是可以通过null对象调用所属类的静态方法
		NullAccessStatic n2 = null;
		System.out.println(n2.name);
	}
}
