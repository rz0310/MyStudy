package ö����ĳ�Ա�����������͹�����;

public class Gender2Test {
	public static void main(String[] args) {
		Gender2 g = Enum.valueOf(Gender2.class, "FEMALE");
		g.setName("Ů");
		System.out.println(g+"����"+g.getName());
//		�ٴ�����name��ֵ������ʾ��������
		g.setName("��");
		System.out.println(g+"����"+g.getName());
	}
}
