package ������ϰ;

public class Person {
	private String name;
	private int age;
	
	public void setName(String name){
		//Ҫ���û����ĳ�����6-10֮��
		if(name.length()>10||name.length()<6){
			System.out.println("�����û����ĳ��ȱ�����6-10֮�䣺"+name);
			return;
		}
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setAge(int age){
		//Ҫ��������14-80֮��
		if(age<14||age>80){
			System.out.println("�������������14-80֮��:"+age);
			return;
		}
		this.age = age;
	}
	public int getAge(){
		return this.age;
	}
}
