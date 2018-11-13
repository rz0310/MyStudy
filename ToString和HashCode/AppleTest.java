package 练习;

public class AppleTest {
	public static void main(String[] args) {
		Apple ap = new Apple("黄色",2.33);
		System.out.println(ap);
		System.out.println(ap.toString());
		
//		任何对象+"",就会变成字符串
		String str = ap + "";
		System.out.println(str);
	}
}
