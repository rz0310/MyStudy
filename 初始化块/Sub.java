package ��ϰ;

public class Sub extends Mid{
	static {
		System.out.println("Sub�����ʼ����");
	}
	{
		System.out.println("Sub��ʵ����ʼ����");
	}
	public Sub(){
		super("balabala");
		System.out.println("Sub���޲ι�����");
	}
	public static void main(String[] args) {
		new Sub();
		new Sub();
	}
}
