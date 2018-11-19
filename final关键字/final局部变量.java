package final关键字;

public class final局部变量 {
	public static void main(String[] args) {
		final int age;
		age = 3;
		System.out.println(age);
//		age = 2;如果没有final修饰，这行代码是对的
	}
	
}
