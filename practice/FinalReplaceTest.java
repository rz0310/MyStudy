package practice;

public class FinalReplaceTest {
	public static void main(String[] args) {
		final int a = 5;
		final double d = 1.2/3;
		final String str = "疯狂" + "java";
		final String book = "疯狂java讲义：" + 99.0;

//		下面book2变量的指因为调用了方法,所以在编译时,无法确定下来
		final String book2 = "疯狂java讲义：" + String.valueOf(99.0);
		System.out.println(book == "疯狂java讲义：99.0;");
		System.out.println(book2 == "疯狂java讲义：99.0;");
	}
}
