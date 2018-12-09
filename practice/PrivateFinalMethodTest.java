package practice;

public class PrivateFinalMethodTest {
//	该方法只属于自己,不能被子类继承
	private final void test(){
		
	}
}
class Test extends PrivateFinalMethodTest{
//	该方法不是重写,没继承父类的test方法
	public void test(){
		
	}
}
