package ��������ϰ;

public class Truck extends Vehicle {
//	�������Գ��ػ���
	private String goods;
	
	public Truck(String goods) {
		super();
		this.goods = goods;
	}
	
	public String getGoods() {
		return goods;
	}

	public void setGoods(String goods) {
		this.goods = goods;
	}
	public void myFunction() {
		System.out.println("���ǿ������ҿ��Գ��ػ���");
	}
	public static void main(String[] args) {
		Truck t = new Truck("����");
		t.myFunction();
		System.out.println("�������صĻ����ǣ�"+t.getGoods());
	}
}
