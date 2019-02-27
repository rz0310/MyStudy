package String类;

import org.junit.Test;

public class StringTest {
	public void stringTest() {
		String s1 = "Beijing";
		String s2 = "beijing";
		String s3 = "beijin";
//		字符串长度不相等，直接返回
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.toLowerCase().equals(s2.toLowerCase()));
		System.out.println(s1.toLowerCase().compareTo(s2.toLowerCase()));
		String s8 = "";
//		忽略大小写判断两个字符串是否相等
//		System.out.println(s1.equalsIgnoreCase(s2));
//		判断某个字符串是否为空
//		System.out.println(s8.isEmpty());
	}
	@Test
	public void test() {
		stringTest();
	}
}
