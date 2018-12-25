package 匿名内部类;

interface A {
	void test();
}
/*
 * 在java8之前，java要求被局部内部类、匿名内部类访问的局部变量必须使用final修饰，
 * java8之后，如果局部变量被匿名内部类访问，那么该局部变量相当于自动使用了final修饰。
 */
public class ATest {
	
	public static void main(String[] args) {
		int age = 8;
		A a = new A() {
			public void test() {
	//			在java8以前以下语句将提示错误,age必须使用final修饰
	//			从java8开始,匿名内部类,局部内部类允许访问非final的局部变量
				System.out.println(age);
			}
		};
		a.test();
	}
}
