package ��ϰ;

public class Goat {
	private String color;
	private double weight;
	public Goat(){
		
	}
	public Goat(String color,double weight){
		this.color = color;
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
//	@Override
//	public boolean equals(Object obj){
////		this��objָ��ͬһ������
//		if(this == obj){
//			return true;
//		}
////		Ҫ��obj��Ϊnull��obj����ΪGoat����
//		if(obj != null && obj.getClass() == Goat.class){
////			��objǿתΪGoat
//			Goat target = (Goat)obj;
////			ҵ��Ҫ�󼸸��ؼ����ԾͱȽϼ���
//			return this.color.equals(target.color)&&this.weight==target.weight;
//		}
//		return false;
//	}
}
