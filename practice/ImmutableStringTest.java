package practice;

public class ImmutableStringTest {
	public static void main(String[] args) {
		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println(str1 == str2);// false
		System.out.println(str1.equals(str2));// true
//		下面输出的两次hashCode相等
		System.out.println(str1.hashCode());
	}
}
