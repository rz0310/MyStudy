package 非静态内部类;
/*
 * 非静态内部类中不能有静态方法、静态成员变量、静态初始化块，都会引发编译错误。
 * 非静态内部类中不能有静态初始化块，但是可以有普通初始化块。
 */
public class InnetNoStatic {
	private class InnerClass {
//		下面三行代码全部编译错误,非静态内部类不能有静态声明
//		static {
//			
//		}
//		private static int prop;
//		private static void test() {
//			
//		}
	}
}
