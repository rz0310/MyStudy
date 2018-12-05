package practice;

public class FinalLocalVariableTest {
	public void test(final int a){
//		不能对final修饰的形参赋值,下面错误
//		a = 5;
	}
	public static void main(String[] args){
//		定义final局部变量时,指定初始值，则str变量无法重新赋值
		final String str = "hello";
//		下面的语句非法
//		str = "java";
//		定义final局部变量时,没有指定初始值,则该变量可被赋值一次
		final double d;
		d = 5.6;
//		再次赋值非法
//		d = 5.4;
	}
}
