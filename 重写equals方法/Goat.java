package 练习;

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
////		this和obj指向同一个对象
//		if(this == obj){
//			return true;
//		}
////		要求obj不为null且obj必须为Goat类型
//		if(obj != null && obj.getClass() == Goat.class){
////			将obj强转为Goat
//			Goat target = (Goat)obj;
////			业务要求几个关键属性就比较几个
//			return this.color.equals(target.color)&&this.weight==target.weight;
//		}
//		return false;
//	}
}
