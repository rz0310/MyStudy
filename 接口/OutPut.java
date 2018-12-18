package 接口;

public interface OutPut {
//	接口里定义的成员变量只能是常量
	int Max_Cache_Line = 50;
//	接口里定义的普通方法只能是public的抽象方法
	void out();
	void getData(String msg);
//	在接口中定义的普通方法,需要用default修饰
	default void print(String... msgs) {
		for(String msg : msgs) {
			System.out.println(msg);
		}
	}
//	在接口中定义默认方法,需要用default修饰
	default void test() {
		System.out.println("默认的test方法");
	}
	static String staticTest() {
		return "接口里的类方法";
	}
//	java9支持带方法体的私有方法~~~~~~~
//	定义私有方法
//	private void foo() {
//		System.out.println("foo私有方法");
//	}
////	定义私有静态方法
//	private static void bar() {
//		System.out.println("foo静态私有方法");
//	}
}
