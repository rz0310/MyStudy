package �ֲ��ڲ���;
/*
 * �ڷ����ж�����ڲ�������ֲ��ڲ��࣬���ڷ�������Ч����Ϊ�ֲ��ڲ��಻�����ⲿ��ķ�������ĵط�ʹ��
 * ��˾ֲ��ڲ��಻��ʹ�÷��ʿ��Ʒ���static���η����Ρ�
 * ���еľֲ���Ա��������static���Ρ�
 * 
 * �����������������class�ļ���LocalInnerClass.class��LocalInnerClass$1InnerBase.class��
 * LocalInnerClass$1InnerSub.class���ֲ��ڲ����class�ļ���������ʽ��OuterClass$NInnerClass.class��
 * N��Ϊ��������ͬһ����Ĳ�ͬ�����е�ͬ���ľֲ��ڲ��ࡣ
 */
public class LocalInnerClass {
	public static void main(String[] args) {
//		����ֲ��ڲ���
		class InnerBase {
			int a;
		}
//		���Ѿֲ��ڲ��������
		class InnerSub extends InnerBase {
			int b;
		}
//		�����ֲ��ڲ���Ķ���
		InnerSub is = new InnerSub();
		is.a = 5;
		is.b = 8;
		System.out.println("InnerSub�Ķ����a��bʵ�������ǣ�"+is.a+","+is.b);
	}
}
