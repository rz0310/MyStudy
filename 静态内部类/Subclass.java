package ��̬�ڲ���;

import ��̬�ڲ���.Out;
import ��̬�ڲ���.Subclass;

//���ⲿ������ʹ�÷Ǿ�̬�ڲ���
//�Ǿ�̬�ڲ���Ĺ���������ͨ�����ⲿ��Ķ���������
public class Subclass extends Out.In{
	public Subclass(Out out) {
//		ͨ�������out��������ʽ����In�Ĺ�����
		out.super("����ĸ�����In,In����Out��ķǾ�̬�ڲ���,SubClass��In�������,�����Զ���Ĺ�������Ҫ�����丸��Ĺ�����");
	}
	public static void main(String[] args) {
		Out out = new Out();
		new Subclass(out);
	}
}