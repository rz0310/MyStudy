package ��������ϰ;

public class Tractors extends Vehicle {
//	���������Գ�ש������
	private int amount;
	
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public Tractors(int amount) {
		super(20.3,"ש��ɫ",200);
		this.amount = amount;
	}
	
	public void myFunction() {
		System.out.println("������������������ש");
	}
	public static void main(String[] args) {
		Tractors t = new Tractors(20);
		t.run();
		t.myFunction();
		System.out.println("�ҵ��ٶ�Ϊ��"+t.getSpeed()+",��ɫΪ��"+t.getColor()+",��СΪ��"+t.getSize());
		System.out.println("�ҿ��Գ���"+t.getAmount()+"��ש");
	}
}
