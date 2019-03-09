package �ļ���IO;

import java.io.Serializable;
/*
 * ���һ���ഴ���Ķ�����Ҫ�����л�����ô�������ʵ�ֽӿ�Serializable
 * Serializable��һ����ǽӿڣ�û���κζ��壬Ϊ�˸���JVM��������������Ա����л���
 * 
 * ʲôʱ�������Ҫ���л���
 * 1.�Ѷ��󱣴浽�ļ���(�洢���������)
 * 2.������Ҫ�������ϴ���
 * 
 * �������û�����л���ᷢ����java.io.NotSerializableException:û�����л��쳣
 */
public class Dog implements Serializable{
	/**
	 * 
	 */
//	���л����
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private String sex;
	private transient int id;//�����л��б����ԣ���ԭ��ΪĬ��ֵ�����޸�
	
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
