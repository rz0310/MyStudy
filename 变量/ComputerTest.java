package ��ϰ;

public class ComputerTest {
	public static void main(String[] args) {
		System.out.println(Computer.test);
		//c1��main�����ж��壬�Ǿֲ�����
		Computer c1 = new Computer();
		System.out.println(c1.color);
		System.out.println(c1.price);
		c1.color = "��ɫ";
		c1.price = 4500;
		System.out.println(c1.color);
		System.out.println(c1.price);
		//c2�Ǿֲ�����
		Computer c2 = new Computer();
		System.out.println(c2.color);
		
		System.out.println(c1.test);
		System.out.println(c2.test);
		c2.test = 20;
		System.out.println(c1.test);
		System.out.println(c2.test);
		/*����test�������������������ȼ���
		System.out.println(Computer.test);
		System.out.println(Computer.test);
		Computer.test = 20;
		System.out.println(Computer.test);
		System.out.println(Computer.test);
		*/
	}
}
