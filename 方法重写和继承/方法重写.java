package ������ϰ;

import java.util.Random;

class base{
	public Object info(){
		System.out.println("�����info");
		return new Random();
	}
}
public class ������д extends base{
	//���������β��б�Ҫ��ͬ������ֵ������ͬ���߸�С
	@Override
	public String info(){
		System.out.println("�����info");
		return "fk";
	}
	public static void main(String[] args) {
		������д fc = new ������д();
		fc.info();
	}
}
