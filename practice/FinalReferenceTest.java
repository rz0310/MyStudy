package practice;

import java.util.Arrays;

import ���ɱ���ͻ���ʵ���Ĳ��ɱ���.Name;

class Person{
	private int age;
	public Person(int age){
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
public class FinalReferenceTest {
	public static void main(String[] args) {
//		final�����������,iArr��һ�����ñ���
		final int[] iArr = {5,6,12,9};
		System.out.println(Arrays.toString(iArr));
//		������Ԫ�ؽ�������,�Ϸ�
		Arrays.sort(iArr);
		System.out.println(Arrays.toString(iArr));

//		������Ԫ�ظ�ֵ,�Ϸ�
		iArr[2] = 8;
		System.out.println(Arrays.toString(iArr));
//		��iArr���¸�ֵ,�Ƿ�
//		iArr = null;
//		final����Person����,p��һ�����ñ���
		final Person p = new Person(20);
		p.setAge(52);
		System.out.println(p.getAge());
		
//		��������p���¸�ֵ,�Ƿ�
//		p = null;
	}
}
