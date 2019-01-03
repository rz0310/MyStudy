package �������󷽷���ö����;
/*
 * ����������������5��class�ļ�����ʵOperation��Ӧһ��class�ļ��������ĸ������ڲ�����ֱ��Ӧһ��class�ļ���
 * 
 * ö�����ﶨ����󷽷�ʱ����ʹ��abstract�ؼ��ֽ�ö���ඨ��Ϊ�����ࣨ��Ϊϵͳ���Զ�Ϊ�����abstract�ؼ��֣�������Ϊö����
 * ��Ҫ��ʽ����ö��ֵ����������Ϊ���࣬����ÿ��ö��ֵ����Ϊ���󷽷��ṩ����ʵ�֣�����ͻ���ֱ������
 */
public enum Operation {
	PLUS
	{
		public double eval(double x,double y) {
			return x+y;
		}
	},
	MINUS
	{
		public double eval(double x,double y) {
			return x-y;
		}
	},
	TIMES
	{
		public double eval(double x,double y) {
			return x*y;
		}
	},
	DIVIDE
	{
		public double eval(double x,double y) {
			return x/y;
		}
	};
//	Ϊö���ඨ��һ�����󷽷�
//	������󷽷��ɲ�ͬ��ö�����ṩ��ͬ��ʵ��
	public abstract double eval(double x,double y);
	public static void main(String[] args) {
		System.out.println(Operation.PLUS.eval(3, 4));
		System.out.println(Operation.MINUS.eval(5, 4));
		System.out.println(Operation.TIMES.eval(5, 4));
		System.out.println(Operation.DIVIDE.eval(5, 4));
	}
}
