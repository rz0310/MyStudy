package ��ϰ;

public class �����Ĵ��λ��� {
	public static void swap(int a,int b){
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println("a��ֵΪ:"+a);
		System.out.println("b��ֵΪ:"+b);
	}
	public static void main(String[] args) {
		int a = 6;
		int b = 9;
		swap(a,b);
		System.out.println("a��ֵΪ:"+a);
		System.out.println("b��ֵΪ:"+b);
	}
}
