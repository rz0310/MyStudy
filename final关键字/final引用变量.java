package final�ؼ���;

public class final���ñ��� {
	public static void main(String[] args) {
		final Pig p = new Pig("��ɫ",23.4);
		System.out.println(p);
//		Pig p1 = new Pig("��ɫ",65.2);
//		����ΪPig�ı���p��final���Σ������ٴα���ֵ
//		p = p1;
//		���Ǳ�final���εĶ��������ֵ�����޸�
		p.setColor("��ɫ");
		p.setWeight(100.5);
		System.out.println(p);
	}
	
}
