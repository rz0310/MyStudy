package 课堂练习;

class Animal extends Creatrue{
	public Animal(String name){
		System.out.println("Animal带一个参数的构造器,"+"该动物的name为:"+name);
	}
	public Animal(String name,int age){
		this("红太狼");
		System.out.println("Animal带两个参数的构造器,"+"该动物的name为:"+name+",年龄为:"+age);
	}
}