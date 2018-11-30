package Interface接口;

public interface Eatable {
//	所有成员变量前默认有public static final
	int MAX_PRESERVE = 100;
//	抽象方法前默认有public abstract
	void taste();
//	java8之后,接口中可以定义static方法,所有接口中可以写main方法
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
//	类方法可以有方法体
	static void test() {
		System.out.println("类方法test");
	}
//	java8之后，default是为了给实例方法添加方法体
//	default是为了区分抽象方法和默认方法,抵消原来的abstract关键字
	default void info() {
		System.out.println("");
	}
}
