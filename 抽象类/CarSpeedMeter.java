package ³éÏóÀà;

public class CarSpeedMeter extends SpeedMeter {
	private double radius;
	public CarSpeedMeter(double radius) {
		this.radius = radius;
	}
	@Override
	public double calGirth() {
		return 2*Math.PI*radius;
	}
	public static void main(String[] args) {
		CarSpeedMeter csm = new CarSpeedMeter(0.34);
		csm.setTurnRate(15);
		System.out.println(csm.getSpeed());
	}
	
}
