package 课堂练习;

import java.util.Random;

class base{
	public Object info(){
		System.out.println("父类的info");
		return new Random();
	}
}
public class 方法重写 extends base{
	//方法名、形参列表要相同，返回值类型相同或者更小
	@Override
	public String info(){
		System.out.println("子类的info");
		return "fk";
	}
	public static void main(String[] args) {
		方法重写 fc = new 方法重写();
		fc.info();
	}
}
