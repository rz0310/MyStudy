package ������ϰ;

class Animal extends Creatrue{
	public Animal(String name){
		System.out.println("Animal��һ�������Ĺ�����,"+"�ö����nameΪ:"+name);
	}
	public Animal(String name,int age){
		this("��̫��");
		System.out.println("Animal�����������Ĺ�����,"+"�ö����nameΪ:"+name+",����Ϊ:"+age);
	}
}