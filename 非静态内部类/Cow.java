package 非静态内部类;
/*
 * 1.内部类的主要作用：
 * （1）内部类成员可以直接访问外部类的私有数据,因为内部类被当成其外部类的成员,
 * 同一个类的成员之间可以互相访问.但外部类不能访问内部类的实现细节,例如内部类的成员变量。
 * （2）内部类成员可以直接访问外部类的私有数据,因为内部类被当成其外部类的成员,同一个类的成员之间 可以互相访问.
 * 但外部类不能直接访问内部类的实现细节,例如内部类的成员变量。
 * （3）匿名内部类适合用于创建那些仅需要一次使用的类。
 * 2.内部类和外部类的区别：（两者语法大致相似,内部类除了需要定义在其他类的里面）
 * （1）内部类比外部类多三个修饰符：private,protected,static——外部类不可以使用这三个修饰符。
 * （2）非静态内部类不能拥有静态成员。
 * 3.大部分时候内部类都被作为成员内部类定义,而不是作为局部内部类。
 * 成员内部类与成员变量,成员方法,构造器和初始化块相似的类成员；局部内部类和匿名内部类则不是类成员。
 * 4.成员内部类分为：非静态内部类和静态内部类,使用static修饰的是静态内部类,没有使用static修饰的成员内部类是非静态内部类。
 * 5.内部类有四个作用域：同一个包（ default）、同一个类（private）、父子类（protected）和任何位置（public）。 
 * 6.编译后会生成两个class文件,一个是外部类类名.class,另一个是外部类类名$内部类类名.class。
 * 即成员内部类（包括静态内部类和非静态内部类）的class文件总是：OuterClass$InnerClass.class。
 * 7.注意：当调用非静态内部类的实例方法时,必须有一个非静态内部类实例,非静态内部类实例必须寄生在外部类的实例里。
 */
public class Cow {
	private double weight;
//	外部类两个重载的构造器
	public Cow() {}
	public Cow(double weight) {
		this.weight = weight;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
//	定义一个非静态内部类
	private class Cowleg {
		private String color;
		private double length;
		public Cowleg() {}
		public Cowleg(String color,double length) {
			this.color = color;
			this.length = length;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public double getLength() {
			return length;
		}
		public void setLength(double length) {
			this.length = length;
		}
//		非静态内部类的实例方法
		public void info() {
			System.out.println("当前牛的颜色为："+color+",高："+length);
			System.out.println("奶牛重为："+weight);
		}
	}
	public void test() {
		Cowleg cl = new Cowleg("黑白色",120);
		cl.info();
	}
	public static void main(String[] args) {
		Cow c = new Cow(80);
		c.test();
	}
}
