package 单例模式;

public class SingletonTest {
	public static void main(String[] args) {
//		因为Singleton类的构造器被隐藏，所以不能创建实例：以下两句代码编译错误
//		Singleton s1 = new Singleton();
//		Singleton s2 = new Singleton();
		
		Singleton s1 = Singleton.instance();
		Singleton s2 = Singleton.instance();
		System.err.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}
