package 枚举类的成员变量及方法和构造器;

public class Gender2Test {
	public static void main(String[] args) {
		Gender2 g = Enum.valueOf(Gender2.class, "FEMALE");
		g.setName("女");
		System.out.println(g+"代表："+g.getName());
//		再次设置name的值将会提示参数错误
		g.setName("男");
		System.out.println(g+"代表："+g.getName());
	}
}
