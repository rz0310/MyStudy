package ʵ�ֽӿڵ�ö����;
/*
 * ͨ��ʵ�ֽӿ��еĳ��󷽷�����ÿ��ö��ֵ���ò�ͬ�ķ���ʵ�ֲ�ͬ�ķ������Ӷ����ֲ�ͬ����Ϊ��ʽ��
 */
public enum Gender2 implements GenderDesc {
//	�˴���ö��ֵ�����ö�Ӧ�Ĺ�����������
//	����������£�������"MALE"��"FEMALE"ö����ʱ��������ֱ�Ӵ���Gender2ö�����ʵ����
//	�����൱�ڴ���Gender2�����������ʵ����
	MALE("��")
//	�����Ų���ʵ������һ�����岿�֣�ö����������ڲ����ࣩ
	{
		public void info() {
			System.out.println("���ö��ֵ��������");
		}
	},
	FEMALE("Ů")
//	��ö����������ڲ����ࣩ
	{
		public void info() {
			System.out.println("���ö��ֵ����Ů��");
		}
	};
	private final String name;
	private Gender2(String name) {
		this.name = name;
	}
	public String getName() {
		return this.getName();
	}
}
