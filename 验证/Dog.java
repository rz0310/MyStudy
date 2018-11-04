package ¿ÎÌÃÁ·Ï°;

public class Dog {
	private String name;
	private String color;
	private int age;
	
	public Dog(String name,String color){
		this.name =  "fk:"+name;
		this.color = color;
	}
	public Dog(String name,String color,int age){
		this("fkit","»ÆÉ«");
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
