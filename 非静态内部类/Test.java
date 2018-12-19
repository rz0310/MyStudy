package 非静态内部类;

public class Test {
	public void test() {
		System.out.println("巴拉巴拉");
	}
	public static void main(String[] args) {
//		创建对象,可以在main(static)方法中使用该类的对象调用该类的非static方法
//		但是不能直接在main(static)方法中直接调用非static方法
		Test t = new Test();
		t.test();
//		test();
	}
}
