package 练习;

public class Init {
//	 定义第一个初始化块
	{
		int a = 6;
		if(a>4){
			System.out.println("Init初始化块：局部变量a的值大于4");
		}
		System.out.println("Init的初始化块");
	}
	// 定义第二个初始化块
	{
		System.out.println("Init的第二个初始化块");
	}
//	定义无参数的构造器
	public Init(){
		System.out.println("Init无参数的构造器");
	}
	public static void main(String[] args){
		new Init();
	}
}
