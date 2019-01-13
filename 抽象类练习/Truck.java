package 抽象类练习;

public class Truck extends Vehicle {
//	卡车可以承载货物
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
		System.out.println("我是卡车，我可以承载货物");
	}
	public static void main(String[] args) {
		Truck t = new Truck("花花");
		t.myFunction();
		System.out.println("我所承载的货物是："+t.getGoods());
	}
}
