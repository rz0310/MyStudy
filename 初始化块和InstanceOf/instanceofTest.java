package ��ϰ;

public class instanceofTest {
	public static void main(String[] args) {
//		����helloʱʹ��Object��,��hello�ı�������ʱObject
//		Objectʱ������ĸ���,��hello������ʵ��������String
		Object hello = "Hello";
		System.out.println(hello instanceof Object);
//		String��Object���ڼ̳й�ϵ,���Խ���instanceof����,����true
		System.out.println(hello instanceof String);
//		Math��Object���ڼ̳й�ϵ,���Խ���instanceof����,����String��Math��û�м̳й�ϵ,����false
		System.out.println(hello instanceof Math);
//		Stringʵ����Comparable�ӿڣ����Է���true
		System.out.println(hello instanceof Comparable);
	}
}
