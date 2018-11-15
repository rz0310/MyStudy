package 练习;

public class Root {
	static {
		System.out.println("Root的类初始化块");
	}
	{
		System.out.println("Root的实例初始化块");
	}
	public Root(){
		System.out.println("Root的无参构造器");
	}
}
