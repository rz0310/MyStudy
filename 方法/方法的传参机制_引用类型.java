package ��ϰ;
class DataWrap{
	public int a = 6;
	public int b = 9;
}
public class �����Ĵ��λ���_�������� {
	public static void swap(DataWrap dw){
		int tmp = dw.a;
		dw.a = dw.b;
		dw.b = tmp;
	}
	public static void main(String[] args) {
		DataWrap dw = new DataWrap();
//		dw.a = 6;
//		dw.b = 9;
		�����Ĵ��λ���_��������.swap(dw);
		System.out.println("a��ֵΪ:"+dw.a);
		System.out.println("b��ֵΪ:"+dw.b);
	}
}
