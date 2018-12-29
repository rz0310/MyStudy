package Lambda���ʽ�������ڲ���;
/*
 * Lambda���ʽ�������ڲ��������֮����
 * ��1�������߷��ʵľֲ��������൱����һ����ʽ��final���Σ��������ٶԸþֲ�������ֵ
 * ��2�����߶����Է���"effectively final"�ľֲ��������������ʵ�������������ߵķ�������ͬ��
 * ����
 * ��1�������ڲ������Ϊ����ӿڴ���ʵ���������ܽӿڰ������ٸ����󷽷���ֻҪȫ��ʵ�ּ��ɣ���Lambda���ʽֻ��Ϊ����ʽ�ӿڴ���ʵ����
 * ��2�������ڲ������Ϊ������������ͨ�ഴ��ʵ������Lambda���ʽֻ��Ϊ����ʽ�ӿڴ���ʵ����
 * ��3�������ڲ���ʵ�ֵĳ��󷽷��ķ�����������ýӿ��ж����Ĭ�Ϸ�������Lambda���ʽ��������Lambda���ʽ�Ĵ�����е��ýӿ��е�Ĭ�Ϸ�����
 */
@FunctionalInterface 
interface Displayable {
	void display();
//	default��Ϊ�����ֳ������еĳ��󷽷���Ĭ�Ϸ��������з�����ķ�����
	default int add(int a,int b) {
		return a+b;
	}
}
public class LambdaAndInnerClass {
	private int age = 20;
	private static String name = "���";
	public void test() {
		String book = "���java����";
		Displayable dis = ()->{
//			����"effectively final"�ľֲ�����
			System.out.println("book�ֲ�������"+book);
//			�����ⲿ���ʵ�������������
			System.out.println("�ⲿ���ageʵ������:"+age);
			System.out.println("�ⲿ���name�����:"+name);
//			��������Lambda���ʽ�Ĵ�����е��ýӿ��е�Ĭ�Ϸ���������һ�д�����뱨��
//			System.out.println(add(3,5));
		};
		dis.display();
//		���ǵ�ʹ��Lambda���ʽ�����˽ӿ�Displayable�Ķ���֮�󣬸ö��󼴿��Ե��ýӿ���Ψһ�ĳ��󷽷���
//		Ҳ���Ե��ýӿ��е�Ĭ�Ϸ���
//		����dis����ӽӿ��м̳е�add����
		dis.add(3, 5);
	}
	public static void main(String[] args) {
		LambdaAndInnerClass lambda = new LambdaAndInnerClass();
		lambda.test();
	}
}
