package 抽象类练习;

public class Tractors extends Vehicle {
//	拖拉机可以乘砖，数量
	private int amount;
	
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public Tractors(int amount) {
		super(20.3,"砖红色",200);
		this.amount = amount;
	}
	
	public void myFunction() {
		System.out.println("我是拖拉机，可以拉砖");
	}
	public static void main(String[] args) {
		Tractors t = new Tractors(20);
		t.run();
		t.myFunction();
		System.out.println("我的速度为："+t.getSpeed()+",颜色为："+t.getColor()+",大小为："+t.getSize());
		System.out.println("我可以承载"+t.getAmount()+"块砖");
	}
}
