package ������ϰ;

public class Super {
	public int age = 200;
	public void info(String name){
		System.out.println("ִ�и���info����������Ĳ���Ϊ:"+name);
	}
}
class Ban extends Super{
	public int age = 20;
	@Override
	public void info(String name){
		System.out.println("ִ��������д��info����������Ĳ���Ϊ:"+name);
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
