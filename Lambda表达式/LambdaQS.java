package Lambda���ʽ;
/*
 * Lambda���ʽʵ���ϻᱻ�����������͵Ķ���
 */
interface Eatable {
	void taste();
}
interface Flyable {
	void fly(String weather);
}
interface Addable {
	int add(int a, int b);
}

public class LambdaQS {
//	����taste������ҪEatable����
	public void eat(Eatable e) {
		System.out.println(e);
		e.taste();
	}
//	����drive������ҪFlyable����
	public void drive(Flyable f) {
		System.out.println("�����ڼ�ʻ��"+f);
		f.fly("�̿���ϴ������");
	}
//	����test������ҪAddable����
	public void test(Addable add) {
		System.out.println("5+3="+add.add(5, 3));
	}
	public static void main(String[] args) {
		LambdaQS lq = new LambdaQS();
//		�˴�eat�����Ĳ�������һ��Lambda���ʽ
//		�����ֻ��һ����䣬����ʡ�Ի�����
		lq.eat(()->System.out.println("ƻ����ζ���治��"));
//		�β��б�ֻ��һ���βΣ�����ʡ�Ի�����
		lq.drive(weather->
		{
			System.out.println("����������ǣ�"+weather);
			System.out.println("ֱ��������ƽ��");
		});
//		ֻ��һ����䣬����ʡ�Ի����ţ���ʹ�ñ��ʽ��Ҫ����ֵ��Ҳ����ʡ��return�ؼ���
		lq.test((a,b)->a+b);
	}
}
