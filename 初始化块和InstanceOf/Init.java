package ��ϰ;

public class Init {
//	 �����һ����ʼ����
	{
		int a = 6;
		if(a>4){
			System.out.println("Init��ʼ���飺�ֲ�����a��ֵ����4");
		}
		System.out.println("Init�ĳ�ʼ����");
	}
	// ����ڶ�����ʼ����
	{
		System.out.println("Init�ĵڶ�����ʼ����");
	}
//	�����޲����Ĺ�����
	public Init(){
		System.out.println("Init�޲����Ĺ�����");
	}
	public static void main(String[] args){
		new Init();
	}
}
