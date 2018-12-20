package 非静态内部类;
/*
 * 非静态内部类的成员只在非晶态内部类的范围内是可知的,并不能被外部类直接使用。
 * 如果外部类需要访问非静态内部类的成员,则必须显式创建非静态内部类对象来调用访问非静态内部类的成员变量。
 */
public class Outer {
	private int outProp = 9;
//	内部类
	private class inner {
		private int inProp = 9;
		public void accessOuterProp() {
//		非静态内部类可以直接访问外部类的private成员变量,通过类名.this.成员变量
			System.out.println(Outer.this.outProp);
		}
	}
	
	public void accessInnerProp() {
//		在外部类不能直接访问非静态内部类的private成员变量
//		System.out.println(inProp);
//		如果需要访问,必须显式的创建内部类的对象
		System.out.println("内部类的inProp值："+new inner().inProp);
	}
	public static void main(String[] args) {
//		创建对象,可以在main(static)方法中使用该类的对象调用该类的非静态方法~~~~~~~~~~~~
		Outer o = new Outer();
//		上面代码只创建了外部类的对象,还未创建内部类的对象
		o.accessInnerProp();
	}
}
