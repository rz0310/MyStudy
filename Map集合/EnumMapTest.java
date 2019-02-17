package Map����;
/*
 * EnumMap��һ����ö����һ��ʹ�õ�Mapʵ�֣�EnumMap�е�����key�������ǵ���ö�����ö��ֵ��
 * ����EnumMap������ʽ������ʽָ������Ӧ��ö���ࡣ
 * EnumMap������������
 * ��1�����ڲ����������ʽ���棬������ʵ����ʽ�ǳ����ա���Ч��
 * ��2��EnumMap����key����Ȼ˳�򣨼���ö��ֵ��ö�����еĶ���˳����ά��key-value�Ե�˳��
 * ��3��EnumMap������ʹ��null����Ϊkey�����ʹ���˽��׳�NullPointerException�쳣��������null��Ϊvalue��
 * ע�⣺����һ��EnumMapʱ����ָ��һ��ö���࣬�Ӷ�����EnumMap��ָ��ö������ϵ������
*/
import java.util.EnumMap;

enum Season {
	SPRING,SUMMER,FALL,WINTER;
}
class EnumMapTest {
	
	public static void main(String[] args) {
//		����EnumMap���󣬸�EnumMap���������key����seasonö�����ö��ֵ
		EnumMap em = new EnumMap(Season.class);
		em.put(Season.SUMMER, "��������");
		em.put(Season.SPRING, "��ů����");
		System.out.println(em);
	}
}
