package 练习;

public class Sub extends Mid{
	static {
		System.out.println("Sub的类初始化块");
	}
	{
		System.out.println("Sub的实例初始化块");
	}
	public Sub(){
		super("balabala");
		System.out.println("Sub的无参构造器");
	}
	public static void main(String[] args) {
		new Sub();
		new Sub();
	}
}
