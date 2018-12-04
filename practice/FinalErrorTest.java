package practice;
//	java允许在方法中访问final修饰的成员变量
public class FinalErrorTest {
	final int age;
	{
//		age没有初始化,下面代码错误
//		System.out.println(age);
//		下面代码输出0
		printAge();
		
		age = 6;
		System.out.println(age);
	}
	public void printAge(){
		System.out.println(age);
	}
}
