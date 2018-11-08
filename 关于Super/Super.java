package 课堂练习;

public class Super {
	public int age = 200;
	public void info(String name){
		System.out.println("执行父类info方法，传入的参数为:"+name);
	}
}
class Ban extends Super{
	public int age = 20;
	@Override
	public void info(String name){
		System.out.println("执行子类重写的info方法，传入的参数为:"+name);
	}
	public void test(){
		int age =2;
		System.out.println(age);
		System.out.println(this.age);
		System.out.println(super.age);
		info("fkit");
		super.info("fkit");
	}
}
