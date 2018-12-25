package 匿名内部类;
/*
 * 匿名内部类适合于创建那些只需要使用一次的类，这个类定义就立即消失，匿名内部类不能重复使用。
 * 定义匿名内部类的格式如下：
 * new 实现接口() | 父类构造器(实参列表)
 * {
 * 		匿名类类体的部分
 * }
 * 
 * 匿名内部类必须实现一个父类，或实现一个接口，但最多只能继承一个父类或一个接口。
 * 
 * 关于匿名内部类还有以下两个规则。
 * （1）匿名内部类不能是抽象类，因为在创建匿名内部类时，会立即创建匿名内部类的对象，因此不允许将匿名内部类定义成抽象类。
 * （2）匿名内部类不能定义构造器。由于匿名内部类没有类名，所以无法定义构造器，但匿名内部类可以定义初始化块，可以通过实例初始化块来完成构造器
 * 所要完成的事情。
 * 
 * 匿名类最常用的是创建某个接口类型的对象。
 */
interface Product {
	public double getPrice();
	public String getName();
}

/*
 * AnonymousTest类中定义了一个test()方法，该方法需要一个product对象作为参数，但product只是一个接口，无法直接创建对象，
 * 因此此处需要考虑创建一个product接口实现类的对象传入该方法——如果这个product接口实现类需要重复使用，则应该将该实现类定义一个独立类，
 * 如果product类只需一次使用，则可以定义成一个匿名内部类。
 * 
 * 由于匿名内部类不能是抽象类，所以匿名内部类必须实现他的抽象父类或者接口中包含的所有抽象方法。
 */

public class AnonymousTest {
	public void test(Product p) {
		System.out.println("购买了一个"+p.getName()+",价格为："+p.getPrice());
	}
	public static void main(String[] args) {
		AnonymousTest at = new AnonymousTest();
//		调用test方法时，需要传入一个product参数
//		此处传入其匿名实现类的实例
		at.test(new Product() {
//			以下为匿名内部类的类体
			public double getPrice() {
				return 567.8;
			}
			public String getName() {
				return "AGP显卡";
			}
		});
	}
}
