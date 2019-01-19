package Collection和Iterator接口;

import java.util.stream.IntStream;

/*
 * 流式API：Stream、IntStream、LongStream、DoubleStream
 * Java8还为每个流式API提供了对应的Builder,例如：Stream.Builder、IntStream.Builder、
 * LongStream.Builder、DoubleStream.Builder，可以通过Builder来创建对应的流。
 * 
 * 独立使用Stream的步骤如下：
 * （1）使用Stream或者XxxStream的builder()类方法创建该Stream对应的Builder。
 * （2）重复调用Builder的add()方法向流中添加多个元素。
 * （3）使用Builder的build()方法获取对应的Stream。
 * （4）调用Stream的聚集方法。
 * 注意：对于大部分聚集方法而言，每个Stream只能调用一次。
 */
public class IntStreamTest {
	public static void main(String[] args) {
		IntStream is = IntStream.builder()
				.add(20)
				.add(13)
				.add(-2)
				.add(18)
				.build();
//		下面调用聚集方法的代码每次只能执行一行，否则会抛出异常java.lang.IllegalStateException
//		System.out.println("is所有元素的最大值 ："+is.max().getAsInt());
//		System.out.println("is所有元素的最小值："+is.min().getAsInt());
//		System.out.println("is所有元素的总和："+is.sum());
//		System.out.println("is所有元素的总数："+is.count());
//		System.out.println("is所有元素的平均值："+is.average());
//		System.out.println("is所有元素的平方是否都大于20:"+is.anyMatch(ele->ele*ele>20));
//		System.out.println("is的平方是否包含某个元素的平方大于20："+is.allMatch(ele->ele*ele>20));
//		is = is.map(ele->ele*ele);
//		使用方法引用的方式来遍历集合()
//		is.forEach(System.out::println);
		
//		将is映射成一个新Stream，新Stream的每个元素是原Stream元素的2倍加1
		IntStream newIs = is.map(ele->ele*2+1);
		newIs.forEach(System.out::println);
	}
}
