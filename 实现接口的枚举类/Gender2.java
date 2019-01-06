package 实现接口的枚举类;
/*
 * 通过实现接口中的抽象方法，让每个枚举值调用不同的方法实现不同的方法，从而呈现不同的行为方式。
 */
public enum Gender2 implements GenderDesc {
//	此处的枚举值必须用对应的构造器来创建
//	在这种情况下，当创建"MALE"、"FEMALE"枚举类时，并不是直接创建Gender2枚举类的实例，
//	而是相当于创建Gender2的匿名子类的实例。
	MALE("男")
//	花括号部分实际上是一个类体部分（枚举类的匿名内部子类）
	{
		public void info() {
			System.out.println("这个枚举值代表男性");
		}
	},
	FEMALE("女")
//	（枚举类的匿名内部子类）
	{
		public void info() {
			System.out.println("这个枚举值代表女性");
		}
	};
	private final String name;
	private Gender2(String name) {
		this.name = name;
	}
	public String getName() {
		return this.getName();
	}
}
