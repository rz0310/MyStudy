package Collection��Iterator�ӿ�;

import java.util.stream.IntStream;

/*
 * ��ʽAPI��Stream��IntStream��LongStream��DoubleStream
 * Java8��Ϊÿ����ʽAPI�ṩ�˶�Ӧ��Builder,���磺Stream.Builder��IntStream.Builder��
 * LongStream.Builder��DoubleStream.Builder������ͨ��Builder��������Ӧ������
 * 
 * ����ʹ��Stream�Ĳ������£�
 * ��1��ʹ��Stream����XxxStream��builder()�෽��������Stream��Ӧ��Builder��
 * ��2���ظ�����Builder��add()������������Ӷ��Ԫ�ء�
 * ��3��ʹ��Builder��build()������ȡ��Ӧ��Stream��
 * ��4������Stream�ľۼ�������
 * ע�⣺���ڴ󲿷־ۼ��������ԣ�ÿ��Streamֻ�ܵ���һ�Ρ�
 */
public class IntStreamTest {
	public static void main(String[] args) {
		IntStream is = IntStream.builder()
				.add(20)
				.add(13)
				.add(-2)
				.add(18)
				.build();
//		������þۼ������Ĵ���ÿ��ֻ��ִ��һ�У�������׳��쳣java.lang.IllegalStateException
//		System.out.println("is����Ԫ�ص����ֵ ��"+is.max().getAsInt());
//		System.out.println("is����Ԫ�ص���Сֵ��"+is.min().getAsInt());
//		System.out.println("is����Ԫ�ص��ܺͣ�"+is.sum());
//		System.out.println("is����Ԫ�ص�������"+is.count());
//		System.out.println("is����Ԫ�ص�ƽ��ֵ��"+is.average());
//		System.out.println("is����Ԫ�ص�ƽ���Ƿ񶼴���20:"+is.anyMatch(ele->ele*ele>20));
//		System.out.println("is��ƽ���Ƿ����ĳ��Ԫ�ص�ƽ������20��"+is.allMatch(ele->ele*ele>20));
//		is = is.map(ele->ele*ele);
//		ʹ�÷������õķ�ʽ����������()
//		is.forEach(System.out::println);
		
//		��isӳ���һ����Stream����Stream��ÿ��Ԫ����ԭStreamԪ�ص�2����1
		IntStream newIs = is.map(ele->ele*2+1);
		newIs.forEach(System.out::println);
	}
}
