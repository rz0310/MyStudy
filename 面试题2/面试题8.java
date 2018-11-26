package 练习;

public class 面试题8 {
//	非静态方法
	public void info(){
		System.out.println("info方法");
	}
//	静态初始化块
	static {
//		在静态初始化块中调用非静态方法：编译错误
//		info(); 
	}
	
}
