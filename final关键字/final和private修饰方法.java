package final�ؼ���;

public class final��private���η��� {
//	�����test������private���Σ����ڸ���,������û��final����,���������޹�
//	�����޷����ʸ÷�������˲�������д������final���ڴ˴�û������
	private final void test() {
		System.out.println("�����test����");
	}
}
class Sub extends final��private���η���{
	public void test() {
		System.out.println("�����test����"); 
	}
}
