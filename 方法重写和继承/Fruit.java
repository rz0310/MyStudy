package ������ϰ;

public class Fruit {
	double weight;
	public Fruit(double weight){
		this.weight = weight;
	}
}
class Apple extends Fruit{
	public Apple(){
		//���û��super���ã���Ĭ�ϵ��ø����޲εĹ����������Ǹ���û���޲εĹ�����������ͻᱨ��
//		super("apple");//���Ե���(String)������
		super(0);
	}
}
