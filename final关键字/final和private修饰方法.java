package final关键字;

public class final和private修饰方法 {
//	该类的test方法被private修饰，属于该类,不管有没有final修饰,都与子类无关
//	子类无法访问该方法，因此不可能重写，所以final放在此处没有意义
	private final void test() {
		System.out.println("父类的test方法");
	}
}
class Sub extends final和private修饰方法{
	public void test() {
		System.out.println("子类的test方法"); 
	}
}
