package 练习;

public class 方法重载 {
	public void test(){
		System.out.println("无参数的test方法");
	}
	public void test(int a){
		System.out.println("带一个int参数的方法");
	}
	public void test(int a,String name){
		System.out.println("带int和String参数的方法");
	}
}
