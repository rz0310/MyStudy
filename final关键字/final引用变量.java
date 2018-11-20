package final关键字;

public class final引用变量 {
	public static void main(String[] args) {
		final Pig p = new Pig("白色",23.4);
		System.out.println(p);
//		Pig p1 = new Pig("黑色",65.2);
//		类型为Pig的变量p被final修饰，不能再次被赋值
//		p = p1;
//		但是被final修饰的对象的属性值可以修改
		p.setColor("红色");
		p.setWeight(100.5);
		System.out.println(p);
	}
	
}
