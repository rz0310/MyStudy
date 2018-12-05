package practice;

public class FinalMethodTest {
	public final void test(){
		
	}
}
class Sub extends FinalMethodTest{
//	编译错误,不能重写test方法
//	public void test(){
//		
//	}
}
