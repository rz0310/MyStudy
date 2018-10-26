package 数组;

public class 二维数组静态初始化 {
	public static void main(String[] args) {
//		int [][]的类型是int[]类型
//		静态初始化
		int[][] arr = new int[][]{
				new int[2],//元素用动态创建：指定数组长度
				new int[3],
				new int[4]
		};
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++){
//			System.out.println(arr[i]);
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
//		静态：未指定数组长度
		int [][] brr = new int[][]{
				new int[]{1,2,3},//元素用静态创建
				new int[]{4,5,6},
				new int[]{7,8,9,10},
		};
		System.out.println(brr.length);
		for(int[] it:brr){
//			it是int[]类型，所以又可以遍历
			for(int i=0;i<it.length;i++){
				System.out.print(it[i]+"\t");
			}
			System.out.println();
		}
		
		int [][] crr = new int[][]{
				new int[4],
				new int[]{4,5,6},
				new int[3],
		};
		System.out.println(crr.length);
		for(int i=0;i<crr.length;i++){
//			crr是int[][]类型，crr[i]是int[]类型，crr[i]又需要遍历
			for(int it:crr[i]){
				System.out.print(it+"\t");
			}
			System.out.println();
		}
		
		int [][] drr = new int[][]{
				new int[4],
				{4,5,6},
				new int[3],
		};
		System.out.println(drr.length);
		for(int[] it:drr){
//			it是int[]类型，所以又可以遍历
			for(int ix:it){
				System.out.print(ix+"\t");
			}
			System.out.println();
		}
	}
}
