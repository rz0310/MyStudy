package final¹Ø¼ü×Ö;

public class Pig {
	private String color;
	private double weight;
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
	public Pig(String color,double weight){
		this.color = color;
		this.weight = weight;
	}
	@Override
	public String toString(){
		return "Pig[color="+this.color+",weight="+this.weight+"]";
	}
}
