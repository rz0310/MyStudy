package 不可变类和缓存实例的不可变类;

public class IntergerCacheTest {
	public static void main(String[] args){
		Integer in1 = new Integer(6);
		Integer in2 = Integer.valueOf(6);
		Integer in3 = Integer.valueOf(6);
		System.out.println(in1 == in2);// 输出false
		System.out.println(in2 == in3);// 输出true
		
//		由于integer只缓存-127-128之间的值
		Integer in4 = Integer.valueOf(200);
		Integer in5 = Integer.valueOf(200);
		System.out.println(in4 == in5);// 输出false
	}
}
