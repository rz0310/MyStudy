package 练习;

public class ComputerTest {
	public static void main(String[] args) {
		System.out.println(Computer.test);
		//c1在main方法中定义，是局部变量
		Computer c1 = new Computer();
		System.out.println(c1.color);
		System.out.println(c1.price);
		c1.color = "银色";
		c1.price = 4500;
		System.out.println(c1.color);
		System.out.println(c1.price);
		//c2是局部变量
		Computer c2 = new Computer();
		System.out.println(c2.color);
		
		System.out.println(c1.test);
		System.out.println(c2.test);
		c2.test = 20;
		System.out.println(c1.test);
		System.out.println(c2.test);
		/*由于test是类变量，故上述代码等价于
		System.out.println(Computer.test);
		System.out.println(Computer.test);
		Computer.test = 20;
		System.out.println(Computer.test);
		System.out.println(Computer.test);
		*/
	}
}
