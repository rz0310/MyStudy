package 枚举类的成员变量及方法和构造器;

public enum Gender3 {
	MALE("男"),FEMALE("女");
//	上面一行代码等价于
//	public static final Gender3 MALE = new Gender3("男");
//	public static final Gender3 FEMALE = new Gender3("女");
	private final String name;
//	枚举类的构造器只能用private修饰
	private Gender3(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
}
