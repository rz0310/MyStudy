package practice;
//	java�����ڷ����з���final���εĳ�Ա����
public class FinalErrorTest {
	final int age;
	{
//		ageû�г�ʼ��,����������
//		System.out.println(age);
//		����������0
		printAge();
		
		age = 6;
		System.out.println(age);
	}
	public void printAge(){
		System.out.println(age);
	}
}
