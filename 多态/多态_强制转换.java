package ������ϰ;

public class ��̬_ǿ��ת�� {
	public static void main(String[] args) {
		//s1����������Shape,ʵ��������Rect
		Shape s1 = new Rect();
		s1.draw();
		//���ڱ���������,s1��Shape����,��Shape����û��info()����
//		s1.info();
		
		Shape s2 = new Circle();
		s2.draw();
		//���ڱ���������,s1��Shape����,��Shape����û��info()����
//		s2.info();
		
		//s2����������Shape,cҪ����Circle
		if(s2 instanceof Circle){
			Circle c = (Circle)s2;
			c.info();
		}
		
		//s1����������Shape,rҪ����Rect
		if(s1 instanceof Rect){
			Rect r = (Rect)s1;
			r.info();
			System.out.println(s1 instanceof Rect);
		}
		
	}
}
