package �ӿ�;


interface Product{
	int getProduceTime();
}
public class Printer implements OutPut,Product{
	
	private String[] printData = new String[Max_Cache_Line];
//	������¼��ǰ���ӡ����ҵ��
	private int dataNum = 0;
//	��ӡ���
	public void out() {
		while(dataNum > 0) {
			System.out.println(printData[0]);
//			����ҵ����������ǰ��һλ,����ʣ�µ���ҵ����һ
			System.arraycopy(printData, 1, printData, 0, --dataNum);
		}
	}
//	��ȡ����
	public void getData(String msg) {
		if(dataNum >= Max_Cache_Line) {
			System.out.println("�����������");
		}
		else {
			printData[dataNum++] = msg;
		}
	}
//	��ȡ��ӡʱ��
	public int getProduceTime() {
		return 45;
	}
	public static void main(String[] args) {
		OutPut o = new Printer();
		o.getData("���java");
		o.getData("����");
		o.out();
		o.getData("������");
		o.getData("Сħ��");
		o.out();
//		����outPut�ӿ��е�Ĭ�Ϸ���
		o.test();
		System.out.println(OutPut.staticTest());
		
		Product p = new Printer();
		System.out.println(p.getProduceTime());
		Object obj = p;
	}
}
