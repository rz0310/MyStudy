package 包含抽象方法的枚举类;
/*
 * 编译下面程序会生成5个class文件，其实Operation对应一个class文件，他的四个匿名内部子类分别对应一个class文件。
 * 
 * 枚举类里定义抽象方法时不能使用abstract关键字将枚举类定义为抽象类（因为系统会自动为他添加abstract关键字），但因为枚举类
 * 需要显式创建枚举值，而不是作为父类，所以每个枚举值必须为抽象方法提供方法实现，否则就会出现编译错误。
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
//	为枚举类定义一个抽象方法
//	这个抽象方法由不同的枚举类提供不同的实现
	public abstract double eval(double x,double y);
	public static void main(String[] args) {
		System.out.println(Operation.PLUS.eval(3, 4));
		System.out.println(Operation.MINUS.eval(5, 4));
		System.out.println(Operation.TIMES.eval(5, 4));
		System.out.println(Operation.DIVIDE.eval(5, 4));
	}
}
