package ��̬�ڲ���;

class Out {
	class In {
		public In(String msg) {
			System.out.println(msg);
		}
	}
}
class OutTest {
	public static void main(String[] args) {
		Out.In in = new Out().new In("��������");
		/*����Ĵ���ȼ�����������
		 * ʹ��OuttterClass.InnerClass����ʽ�����ڲ������
		 * Out.In in1;
		 * �����ⲿ��ʵ��,�Ǿ�̬�ڲ����ʵ�����Ĵ��ڸ�ʵ����
		 * Out out = new Out();
		 * ͨ���ⲿ��ʵ����new�������ڲ��๹���������Ǿ�̬�ڲ����ʵ��
		 * in1 = out.new In("����");
		 */
		
	}
}
