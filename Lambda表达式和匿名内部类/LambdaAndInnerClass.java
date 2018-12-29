package Lambda表达式和匿名内部类;
/*
 * Lambda表达式与匿名内部类的相似之处：
 * （1）被两者访问的局部变量，相当于有一个隐式的final修饰，不允许再对该局部变量赋值
 * （2）两者都可以访问"effectively final"的局部变量、类变量、实例变量。即两者的方法体相同。
 * 区别：
 * （1）匿名内部类可以为任意接口创建实例——不管接口包含多少个抽象方法，只要全部实现即可；但Lambda表达式只能为函数式接口创建实例。
 * （2）匿名内部类可以为抽象类甚至普通类创建实例；但Lambda表达式只能为函数式接口创建实例。
 * （3）匿名内部类实现的抽象方法的方法体允许调用接口中定义的默认方法；但Lambda表达式不允许在Lambda表达式的代码块中调用接口中的默认方法。
 */
@FunctionalInterface 
interface Displayable {
	void display();
//	default是为了区分抽象类中的抽象方法和默认方法（带有方法体的方法）
	default int add(int a,int b) {
		return a+b;
	}
}
public class LambdaAndInnerClass {
	private int age = 20;
	private static String name = "疯狂";
	public void test() {
		String book = "疯狂java讲义";
		Displayable dis = ()->{
//			访问"effectively final"的局部变量
			System.out.println("book局部变量："+book);
//			访问外部类的实例变量和类变量
			System.out.println("外部类的age实例变量:"+age);
			System.out.println("外部类的name类变量:"+name);
//			不允许在Lambda表达式的代码块中调用接口中的默认方法，下面一行代码编译报错
//			System.out.println(add(3,5));
		};
		dis.display();
//		但是当使用Lambda表达式创建了接口Displayable的对象之后，该对象即可以调用接口中唯一的抽象方法，
//		也可以调用接口中的默认方法
//		调用dis对象从接口中继承的add方法
		dis.add(3, 5);
	}
	public static void main(String[] args) {
		LambdaAndInnerClass lambda = new LambdaAndInnerClass();
		lambda.test();
	}
}
