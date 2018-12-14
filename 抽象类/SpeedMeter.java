package 抽象类;
//车速表
public abstract class SpeedMeter {
//	转速
	private double turnRate;
	public SpeedMeter() {
		
	}
	public void setTurnRate(double turnRate) {
		this.turnRate = turnRate;
	}
//	把定义车轮周长的方法定义成抽象方法
	public abstract double calGirth();
//	定义速度的通用算法
	public double getSpeed() {
//	速度等于周长*转速
		return calGirth() * turnRate;
	}
	
}
