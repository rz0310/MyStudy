package 课堂练习;

public class Fruit {
	double weight;
	public Fruit(double weight){
		this.weight = weight;
	}
}
class Apple extends Fruit{
	public Apple(){
		//如果没有super调用，会默认调用父类无参的构造器，但是父类没有无参的构造器，编译就会报错
//		super("apple");//尝试调用(String)构造器
		super(0);
	}
}
