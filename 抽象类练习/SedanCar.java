package ��������ϰ;

public class SedanCar extends Vehicle {
	private int peopleAmount;
	public int getPeopleAmount() {
		return peopleAmount;
	}
	public void setPeopleAmount(int peopleAmount) {
		this.peopleAmount = peopleAmount;
	}
	public void myFunction() {
		System.out.println("���ǽγ����ҿ�������");
	}
	public static void main(String[] args) {
		SedanCar sc = new SedanCar();
		sc.myFunction();
		sc.setPeopleAmount(33);
		System.out.println("�ҿ��Գ���"+sc.getPeopleAmount()+"����");
	}
}
