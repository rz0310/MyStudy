package 练习;
class DataWrap{
	public int a = 6;
	public int b = 9;
}
public class 方法的传参机制_引用类型 {
	public static void swap(DataWrap dw){
		int tmp = dw.a;
		dw.a = dw.b;
		dw.b = tmp;
	}
	public static void main(String[] args) {
		DataWrap dw = new DataWrap();
//		dw.a = 6;
//		dw.b = 9;
		方法的传参机制_引用类型.swap(dw);
		System.out.println("a的值为:"+dw.a);
		System.out.println("b的值为:"+dw.b);
	}
}
