package Set����;

/*
 * EnumSet�е�����Ԫ�ض�������ָ�����͵�ö��ֵ����ö�������ڴ���ʱ��ʽ����ʽ��ָ����EnumSet����Ԫ��Ҳ������ģ���ö��ֵ��Enum����Ķ���˳������������Ԫ�ص�˳��
 * EnumSet���ڲ���λ��������ʽ�洢�����ִ洢��ʽ���ա���Ч�����EnumSet����ռ���ڴ��С����������Ч�ʺܺá�
 * EnumSet���������nullԪ�أ�������룬���׳�NullPointerException��
 */
import java.util.EnumSet;

enum Season {
	SPRING,SUMMER,FALL,WINTER;
}

public class EnumSetTest {
	public static void main(String[] args) {
//		����һ��EnumSet���ϣ�����Ԫ�ؾ���Seasonö�����ȫ��ö��ֵ��
		EnumSet es1 = EnumSet.allOf(Season.class);
		System.out.println(es1);
//		����һ��EnumSet�ռ��ϣ�ָ������Ԫ����Season���ö��ֵ��
		EnumSet es2 = EnumSet.noneOf(Season.class);
		System.out.println(es2);
//		�ֶ��������Ԫ��
		es2.add(Season.WINTER);
		es2.add(Season.SPRING);
//		��������������ָ���쳣
//		es2.add(null);
//		��ö���࿪ʼ�����˳�����
		System.out.println(es2);
//		��ָ��ö��ֵ����EnumSet����
		EnumSet es3 = EnumSet.of(Season.SPRING,Season.WINTER);
		System.out.println(es3);
//		��ָ����Χ��ö��ֵ����Enumset����
		EnumSet es4 = EnumSet.range(Season.SUMMER, Season.WINTER);
		System.out.println(es4);
//		�´����ļ���Ԫ����es4����ͬ���͵ļ���Ԫ��,��es4����Ԫ��+es5����Ԫ��=Season��ȫ����ö��ֵ
		EnumSet es5 = EnumSet.complementOf(es4);
		System.out.println(es5);
	}
}
