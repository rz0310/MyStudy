package ������;
//���ٱ�
public abstract class SpeedMeter {
//	ת��
	private double turnRate;
	public SpeedMeter() {
		
	}
	public void setTurnRate(double turnRate) {
		this.turnRate = turnRate;
	}
//	�Ѷ��峵���ܳ��ķ�������ɳ��󷽷�
	public abstract double calGirth();
//	�����ٶȵ�ͨ���㷨
	public double getSpeed() {
//	�ٶȵ����ܳ�*ת��
		return calGirth() * turnRate;
	}
	
}
