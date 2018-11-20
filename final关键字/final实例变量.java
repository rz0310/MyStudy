package final关键字;

public class final实例变量 {
	final int age;
	final String s;
//	final必须显式的指定初始值一次，并且只能在三个位置中的其中之一指定
	final long lg;
//	final double d;
	{
//		变量age由final修饰符修饰，只能赋值一次
//		age = 24;
		s = "fkjava";
	}
	public final实例变量(){
		age = 20;
		lg = 200;
	}
	public final实例变量(String msg){
//		this();
		age = 20;
		lg = 30;
		System.out.println("带String参数的构造器");
	}
//	public void test(){
//	final修饰的变量只能在定义时、初始化块、构造器中进行赋值
//		d = 0.89;
//	}
}
