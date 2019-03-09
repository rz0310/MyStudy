package 文件与IO;

import java.io.Serializable;
/*
 * 如果一个类创建的对象，需要被序列化，那么该类必须实现接口Serializable
 * Serializable是一个标记接口，没有任何定义，为了该速JVM虚拟机该类对象可以被序列化。
 * 
 * 什么时候对象需要序列化？
 * 1.把对象保存到文件中(存储到物理介质)
 * 2.对象需要在网络上传输
 * 
 * 如果对象没有序列化则会发生：java.io.NotSerializableException:没有序列化异常
 */
public class Dog implements Serializable{
	/**
	 * 
	 */
//	序列化编号
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private String sex;
	private transient int id;//在序列化中被忽略，还原后为默认值，可修改
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Dog(String name, int age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public Dog() {
		super();
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	
}
