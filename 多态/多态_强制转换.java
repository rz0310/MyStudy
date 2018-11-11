package 课堂练习;

public class 多态_强制转换 {
	public static void main(String[] args) {
		//s1编译类型是Shape,实际类型是Rect
		Shape s1 = new Rect();
		s1.draw();
		//对于编译器而言,s1是Shape类型,而Shape类型没有info()方法
//		s1.info();
		
		Shape s2 = new Circle();
		s2.draw();
		//对于编译器而言,s1是Shape类型,而Shape类型没有info()方法
//		s2.info();
		
		//s2编译类型是Shape,c要求是Circle
		if(s2 instanceof Circle){
			Circle c = (Circle)s2;
			c.info();
		}
		
		//s1编译类型是Shape,r要求是Rect
		if(s1 instanceof Rect){
			Rect r = (Rect)s1;
			r.info();
			System.out.println(s1 instanceof Rect);
		}
		
	}
}
