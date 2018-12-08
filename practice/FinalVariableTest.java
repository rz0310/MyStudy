package practice;
	//final修饰成员变量
public class FinalVariableTest {
//		定义成员变量时，制定初始值,合法
		final int a =6;
//		下面变量将在构造器或者初始化块中分配初始值
		final String str;
		final int c;
		final static double d;
		
//		即没有指定默认值,也没有在构造器和初始化块中指定初始值,下面的ch实例变量非法
//		final char ch;
		
//		实例初始化块,可对没有指定默认初始值的实例变量指定初始值
		{
			str = "hello";
//			定义a变量时,已经指定了初始值,不能在对a重新赋值
//			a = 5;
			
		}
		
//		类初始化块,可对没有指定默认初始值的类变量指定初始值		
		static
		{
			d = 2.3;
		}
//		构造器,可对既没有指定默认值,又没有在初始化块中指定初始值的实例变量指定初始值
		public FinalVariableTest(){
//			在初始化块中已经对str实例变量复制,不能再对final变量重新赋值
//			str = "lala";
			c = 5;
		}
		public void changeFinal(){
//			不能在普通方法中为final修饰的成员变量赋值
//			ch = "oo";
		}
		public static void main(String[] args){
			FinalVariableTest fvt = new FinalVariableTest();
			System.out.println(fvt.a);
			System.out.println(fvt.c);
			System.out.println(fvt.d);
		}
}
