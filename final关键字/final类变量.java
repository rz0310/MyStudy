package final关键字;

public class final类变量 {
//	定义两个final修饰的类变量
//	final类变量必须显式的指定初始值，且只能在两个位置指定
	static final int age = 20;
	final static String s;
	final static double lg = 0.23;
//	类初始化块
	static {
		s = "fkjava";
	}
//	实例初始化块可以访问类变量，但不能在里面给类变量赋值
	{
		System.out.println(s);
	}
	public static void test(){
//		final修饰的类变量不能在普通方法中赋值，但是可以访问该变量
//		lg = 30;
	}
}
