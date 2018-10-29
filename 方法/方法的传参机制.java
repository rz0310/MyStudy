package 练习;

public class 方法的传参机制 {
	public static void swap(int a,int b){
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println("a的值为:"+a);
		System.out.println("b的值为:"+b);
	}
	public static void main(String[] args) {
		int a = 6;
		int b = 9;
		swap(a,b);
		System.out.println("a的值为:"+a);
		System.out.println("b的值为:"+b);
	}
}
