package ����;

public class ��ά���龲̬��ʼ�� {
	public static void main(String[] args) {
//		int [][]��������int[]����
//		��̬��ʼ��
		int[][] arr = new int[][]{
				new int[2],//Ԫ���ö�̬������ָ�����鳤��
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
		
//		��̬��δָ�����鳤��
		int [][] brr = new int[][]{
				new int[]{1,2,3},//Ԫ���þ�̬����
				new int[]{4,5,6},
				new int[]{7,8,9,10},
		};
		System.out.println(brr.length);
		for(int[] it:brr){
//			it��int[]���ͣ������ֿ��Ա���
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
//			crr��int[][]���ͣ�crr[i]��int[]���ͣ�crr[i]����Ҫ����
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
//			it��int[]���ͣ������ֿ��Ա���
			for(int ix:it){
				System.out.print(ix+"\t");
			}
			System.out.println();
		}
	}
}
