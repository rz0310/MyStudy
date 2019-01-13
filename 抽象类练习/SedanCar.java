package 抽象类练习;

public class SedanCar extends Vehicle {
	private int peopleAmount;
	public int getPeopleAmount() {
		return peopleAmount;
	}
	public void setPeopleAmount(int peopleAmount) {
		this.peopleAmount = peopleAmount;
	}
	public void myFunction() {
		System.out.println("我是轿车，我可以载人");
	}
	public static void main(String[] args) {
		SedanCar sc = new SedanCar();
		sc.myFunction();
		sc.setPeopleAmount(33);
		System.out.println("我可以承载"+sc.getPeopleAmount()+"个人");
	}
}
