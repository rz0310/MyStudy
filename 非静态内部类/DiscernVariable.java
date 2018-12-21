package 非静态内部类;
//***区分外部类的成员变量,内部类的成员变量,以及内部类的局部变量
/*
 * 当在非静态内部类的方法内访问某个变量时,系统优先在该方法内查找是否存在该名字的局部变量,如果存在就是用该变量;
 * 如果不存在,则到该方法所在的内部类中查找是否存在该名字的成员变量，如果存在则使用该成员变量;
 * 如果不存在,则到该内部类所在的外部类中查找是否存在该名字的成员变量,如果存在则使用该成员变量;
 * 如果依然不存在,系统将出现编译错误。
 */
public class DiscernVariable {
	private String prop = "外部类的实例变量";
	private class Inclass {
//		private String prop = "内部类的实例变量";
		public void info() {
//			String prop = "内部类的局部变量";
//			通过外部类的类名.this.varName访问外部类的实例变量
			System.out.println("外部类的实例变量："+DiscernVariable.this.prop);
//			通过this.varName访问内部类的实例变量
//			System.out.println("内部类的实例变量："+this.prop);
//			直接访问局部变量
			System.out.println("内部类的局部变量："+prop);
		}
	}
	public void test() {
		Inclass i = new Inclass();
		i.info();
	}
	public static void main(String[] args) {
		DiscernVariable dv = new DiscernVariable();
		dv.test();
	}
}
