package ��ϰ;

import java.util.Scanner;

public class Array1 {
	public static void main(String[] args) {
		int[] arr = new int[20];
		int max = arr[arr.length-1];
		int min = arr[0];
		int sum=0;
		int i;
		Scanner sc = new Scanner(System.in);
		for (i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			sum += arr[i];
			if(arr[i]>max){
				max = arr[i];
			}
			if(arr[i]<min)
			{
				min = arr[i];
			}
			System.out.println(arr[i]);
		}
		System.out.println("��СֵΪ:"+min);
		System.out.println("���ֵΪ:"+max);
		System.out.println("��Ϊ:"+sum);
	}
}
