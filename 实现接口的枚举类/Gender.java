package 实现接口的枚举类;

public enum Gender implements GenderDesc {
	MALE("男"),FEMALE("女");
//	上面一行代码等价于
//	public static final Gender3 MALE = new Gender3("男");
//	public static final Gender3 FEMALE = new Gender3("女");
	private final String name;
//	枚举类的构造器只能用private修饰
	private Gender(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
//	实现GenderDesc接口必须实现的方法
	public void info() {
		System.out.println("这是一个用于定义性别的枚举类");
	}
	
}
