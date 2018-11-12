package 练习;

public class Sub extends Base{
	private String name;
	public void test(){
		System.out.println("子类重写父类的方法,其name字符串的长度"+name.length());
	}
	public static void main(String[] args) {
		Sub s = new Sub();
//		s.test();
	}
	
}
