package ����;

public class ��ά���� {
	public static void main(String[] args){
//		��̬��ʼ����Ԫ����int[]���ͣ��������ͣ�����̬��ʼ��Ϊnull
		int[][] arr = new int[5][];
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		for(int[] it:arr){
			System.out.println(it);
		}
//		arr[0]������Ԫ�أ���int[]���ͣ�20��int����
		arr[0] = new int[]{3,5};//��̬
		arr[1] = new int[4];//��̬
	}
}
