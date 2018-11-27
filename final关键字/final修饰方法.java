package final关键字;

public class final修饰方法 {
	public final void info() {
		System.out.println("info方法");
	}
//	info方法被final关键字修饰,不允许重写，但是可以重载
	public final void info(String name) {
		System.out.println("带String的info方法");
	}
}
class A extends final修饰方法{
//	父类的info方法被final关键字修饰,不允许被重写
//	public void info() {
//		System.out.println("子类的info方法");
//	}
//	父类的info方法被final修饰,不能被子类重写，但是可以被重载，子类调用
	public void test() {
		info();
	}
}
