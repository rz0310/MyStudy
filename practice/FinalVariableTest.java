package practice;
	//final���γ�Ա����
public class FinalVariableTest {
//		�����Ա����ʱ���ƶ���ʼֵ,�Ϸ�
		final int a =6;
//		����������ڹ��������߳�ʼ�����з����ʼֵ
		final String str;
		final int c;
		final static double d;
		
//		��û��ָ��Ĭ��ֵ,Ҳû���ڹ������ͳ�ʼ������ָ����ʼֵ,�����chʵ�������Ƿ�
//		final char ch;
		
//		ʵ����ʼ����,�ɶ�û��ָ��Ĭ�ϳ�ʼֵ��ʵ������ָ����ʼֵ
		{
			str = "hello";
//			����a����ʱ,�Ѿ�ָ���˳�ʼֵ,�����ڶ�a���¸�ֵ
//			a = 5;
			
		}
		
//		���ʼ����,�ɶ�û��ָ��Ĭ�ϳ�ʼֵ�������ָ����ʼֵ		
		static
		{
			d = 2.3;
		}
//		������,�ɶԼ�û��ָ��Ĭ��ֵ,��û���ڳ�ʼ������ָ����ʼֵ��ʵ������ָ����ʼֵ
		public FinalVariableTest(){
//			�ڳ�ʼ�������Ѿ���strʵ����������,�����ٶ�final�������¸�ֵ
//			str = "lala";
			c = 5;
		}
		public void changeFinal(){
//			��������ͨ������Ϊfinal���εĳ�Ա������ֵ
//			ch = "oo";
		}
		public static void main(String[] args){
			FinalVariableTest fvt = new FinalVariableTest();
			System.out.println(fvt.a);
			System.out.println(fvt.c);
			System.out.println(fvt.d);
		}
}
