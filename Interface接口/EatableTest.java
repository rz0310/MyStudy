package Interface�ӿ�;

public interface EatableTest {
	public static void main(String[] args) {
//		�ӿڷ��������
		System.out.println(Eatable.MAX_PRESERVE);
//		�ӿڵ����෽��
		Eatable.test();
		
//		�ӿ��ǳ���ģ�����ֱ���������ࡣ
//		Ҫ��ʵ�����ʵ������ֵ(����ת��)
//		Eatable ea = new Eatable();
		
//		�ӿ����͵ı���,ֻ���ýӿڵ�ʵ���ำֵ������ת��
		Eatable ea1 = new Dog();
		ea1.taste();
//		ea1�ı���ʱ������Eatable������������ʱ��Ϊ����Eatable����,����û��move()����
//		ea1.move();
		if(ea1 instanceof Eatable) {
			Dog dg = (Dog)ea1;
			dg.move();
		}
//		PigFootRice��ֻ�̳���Eatable��,��ֻʵ��Eatable���еĳ��󷽷�����
		Eatable ea2 = new PigFootRice();
		ea2.taste();
	}
	
}
