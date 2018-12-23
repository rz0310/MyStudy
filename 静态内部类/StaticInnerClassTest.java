package 静态内部类;
/*
 * 如果用static来修饰一个内部类,那么这个内部类就属于外部类本身,而不属于外部类的某个对象。
 * 因此使用static修饰的内部类称为类内部类,也成静态内部类。
 * 注意：static关键字的作用是把类的成员变成类相关、而不是实例相关。
 * 
 * 静态内部类可以包含静态成员也可以包含非静态成员。根据静态成员不能访问非静态成员的规则,静态内部类不能访问外部类的实例成员,只能访问外部类的类成员。
 * 即使是静态内部类的实例方法也不能访问外部类的静态成员。
 * 
 * 静态内部类的实例方法不能访问外部类的实例属性，原因如下：
 * 	因为静态内部类的是外部类的类相关的,而不是外部类的对象相关的。也就是说，静态内部类对象不是寄生在外部类的实例中，而是寄生在外部类的类本身中。
 * 当静态内部类对象存在时，并不存在一个被他寄生的外部类对象,静态内部类对象只持有外部类的类引用，没有持有外部类对象的引用。
 * 如果允许静态内部类的实例方法访问外部类的实例成员，但找不到被寄生的外部类对象，将引起错误。
 * 
 * 注意：java还允许在接口中定义内部类,在接口中定义内部类默认使用public static修饰,即（接口内部类）只能是静态内部类。
 */
public class StaticInnerClassTest {
	private int prop1 = 5;
	private static int prop2 = 6;
	static class StaticInnerClass {
//		静态内部类中可以包含静态成员
		private static int age;
		public void accessOuterProp() {
//			静态内部类无法访问外部类的实例变量,下面代码错误
//			System.out.println(prop1);
//			静态内部类不能访问外部类的实例成员,只能访问外部类的静态成员
			System.out.println(prop2);
//			可以用外部类的类名访问外部类的静态成员,但是不能用内部类的实例成员访问外部类的静态变量,因为外部类的静态变量不属于内部类
			StaticInnerClass s = new StaticInnerClass();
//			System.out.println(s.prop2);
			System.out.println(StaticInnerClassTest.prop2);
		}
	}
	public static void main(String[] args) {
		StaticInnerClassTest s1 = new StaticInnerClassTest();
		StaticInnerClass s2 = new StaticInnerClass();
		System.out.println(s1.prop2);
		System.out.println(StaticInnerClassTest.prop2);
	}
}







