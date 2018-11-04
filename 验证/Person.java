package 课堂练习;

public class Person {
	private String name;
	private int age;
	
	public void setName(String name){
		//要求用户名的长度在6-10之间
		if(name.length()>10||name.length()<6){
			System.out.println("您的用户名的长度必须在6-10之间："+name);
			return;
		}
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setAge(int age){
		//要求年龄在14-80之间
		if(age<14||age>80){
			System.out.println("您的年龄必须在14-80之间:"+age);
			return;
		}
		this.age = age;
	}
	public int getAge(){
		return this.age;
	}
}
