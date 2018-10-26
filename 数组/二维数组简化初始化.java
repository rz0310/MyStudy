package 数组;

public class 二维数组简化初始化 {
	public static void main(String[] args) {
//		动态创建一个长度为4的数组，其中每个元素都是动态初始化的长度为5的数组
		int [][] arr = new int[4][5];
		System.out.println(arr.length);
//		等价于
		int [][] brr = new int[][]{
				new int[5],
				new int[5],
				new int[5],
				new int[5],
		};
		System.out.println(brr.length);
	}
}
