package 静态内部类;
/*
 * 静态内部类是外部类的一个静态成员,因此外部类的所有方法、所有初始化块中可以使用静态内部类来定义对象、创建变量等。
 * 
 * 外部类依然不能直接访问静态内部类的成员，但可以使用静态内部类的类名作为调用者来访问静态内部类的类成员，
 * 也可以使用静态内部类对象（即静态内部类的实例成员）作为调用者来访问静态内部类的实例成员。
 */
public class AccessStaticInnerClass {
	static class StaticInnerClass {
		private static int prop1 = 5;
		private int prop2 = 9;
	}
	public void accessInnerProp() {
//		下面代码错误,外部类不能直接访问静态内部类的成员,应该通过类名访问或者以静态内部类的对象作为调用者
//		System.out.println(prop1);
		StaticInnerClass s = new StaticInnerClass();
//		类名访问
		System.out.println(StaticInnerClass.prop1);
//		对象访问
		System.out.println(s.prop1);
	}
}
