package 练习;

public class Mid extends Root{
	static {
		System.out.println("Mid的类初始化块");
	}
	{
		System.out.println("Mid的实例初始化块");
	}
	public Mid(){
		System.out.println("Mid的无参构造器");
	}
	public Mid(String name){
		this();
		System.out.println("Mid的String构造器,其参数值为:"+name);
	}
}
