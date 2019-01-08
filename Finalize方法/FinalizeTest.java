package Finalize����;
/*
 * ����finalize������һ���ᱻִ�У����������ĳ������򿪵���Դ����Ҫ����finalize()�����н�������
 * 
 * finalize()������4���ص㣺
 * (1)��Զ��Ҫ��������ĳ�������finalize�������÷���Ӧ�ý����������ջ��ƽ��е��á�
 * (2)finalize()������ʱ�����ã��Ƿ񱻵��þ��в�ȷ���ԡ�
 * (3)��JVMִ�пɻָ������finalize()����ʱ������ʹ�ö����ϵͳ�е������������±�ɿɴ�״̬��
 * (4)��JVMִ��finalize()���������쳣ʱ���������ջ��Ʋ��ᱨ���쳣���������ִ�С�
 */
public class FinalizeTest {
	private static FinalizeTest ft = null;
	public void info() {
		System.out.println("������Դ�����finalize()����");
	}
	public static void main(String[] args) throws Exception {
//		����finalizeTest������������ɻָ�״̬(������û�а�������󸳸��κ����ñ��������Ըö�����������ɻָ�״̬)
		new FinalizeTest();
		
//		֪ͨϵͳ������Դ����
		System.gc();
		
//		ǿ���������ջ��Ƶ��ÿɻָ������finalize()����
//		Runtime.getRuntime().runFinalization();
//		System.runFinalization();
		
		ft.info();
	}
	public void finalize() {
//		��ft���õ���ͼ���յĿɻָ����󣬼��ɻָ��������±�ɿɴ�
		ft = this;
	}
}
