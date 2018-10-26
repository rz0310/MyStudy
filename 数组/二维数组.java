package 数组;

public class 二维数组 {
	public static void main(String[] args){
//		动态初始化：元素是int[]类型（引用类型），动态初始化为null
		int[][] arr = new int[5][];
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		for(int[] it:arr){
			System.out.println(it);
		}
//		arr[0]是数组元素，是int[]类型，20是int类型
		arr[0] = new int[]{3,5};//静态
		arr[1] = new int[4];//动态
	}
}
