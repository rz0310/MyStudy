package ��ϰ;

import java.util.Random;

public class Array2 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		int sum = 0;
		int average = 0;
		Random rnd = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rnd.nextInt(100);
			sum += arr[i];
		}
		average = sum/arr.length;
		System.out.println("�ܺ�Ϊ:"+sum);
		System.out.println("ƽ��ֵΪ:"+average);
	}
}
