package final�ؼ���;

public class final���η��� {
	public final void info() {
		System.out.println("info����");
	}
//	info������final�ؼ�������,��������д�����ǿ�������
	public final void info(String name) {
		System.out.println("��String��info����");
	}
}
class A extends final���η���{
//	�����info������final�ؼ�������,��������д
//	public void info() {
//		System.out.println("�����info����");
//	}
//	�����info������final����,���ܱ�������д�����ǿ��Ա����أ��������
	public void test() {
		info();
	}
}
