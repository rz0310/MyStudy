package 练习;

public class instanceofTest {
	public static void main(String[] args) {
//		声明hello时使用Object类,则hello的编译类型时Object
//		Object时所有类的父类,但hello变量的实际类型是String
		Object hello = "Hello";
		System.out.println(hello instanceof Object);
//		String与Object存在继承关系,可以进行instanceof运算,返回true
		System.out.println(hello instanceof String);
//		Math与Object存在继承关系,可以进行instanceof运算,但是String与Math类没有继承关系,返回false
		System.out.println(hello instanceof Math);
//		String实现了Comparable接口，所以返回true
		System.out.println(hello instanceof Comparable);
	}
}
