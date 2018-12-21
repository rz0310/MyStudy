package 非静态内部类;
/*
 * 不允许在外部类的静态成员中直接使用非静态内部类。
 * 如：外部类的静态方法、静态代码块不能访问非静态内部类,包括不能使用非静态内部类定义变量、创建实例等。
 */
public class StaticTest {
//	定义一个非静态内部类是一个空类
	private class inner {}
//	外部类的静态方法
	public static void main(String[] args) {
//		下面代码将编译错误,静态成员(main方法)无法访问非静态成员(inner类)
//		new inner();
	}
}
