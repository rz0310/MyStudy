package 练习;

public class 面试题9 {
//	非静态内部类
	class A{
		
	}
//	静态初始化块
	static{
//		在静态初始化块中调用非静态内部类：编译错误
//		A a = new A();
	}
}
