package ö����ĳ�Ա�����������͹�����;

public class Gender1Test {
	public static void main(String[] args) {
//		ͨ��Enum��valueOf()��������ȡָ��ö�����ö��ֵ
//		��ȡGender1���ö�����ö��ֵFEMALE,��g����FEMALE
		Gender1 g = Enum.valueOf(Gender1.class, "FEMALE");
//		ֱ��Ϊö��ֵ��nameʵ��������ֵ
		g.name = "Ů";
//		ֱ�ӷ���ö��ֵ��nameʵ������
		System.out.println(g+"����"+g.name);
	}
}
