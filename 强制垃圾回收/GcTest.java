package ǿ����������;
/*
 * ǿ���������յ����ַ�ʽ��
 * ��1������System���gc()��̬������System.gc();
 * ��2������Runtime()�����gc()ʵ��������Runtime.getRuntime().gc();
 */
public class GcTest {
	public static void main(String[] args) {
		for(int i=0;i<4;i++) {
			new GcTest();
//			�������д����������ȫ��ͬ��ǿ��ϵͳ������������
//			System.gc();
			Runtime.getRuntime().gc();
		}
	}
	public void finalize() {
		System.out.println("ϵͳ��������GcTest����Դ");
	}
}
