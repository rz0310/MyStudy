package ��ϰ;

import java.util.Random;
//�������10����д�ַ�
public class demo2 {
	public static void main(String[] args) {
		char[] arr = new char[10];
		Random rnd = new Random();
		
		for(int i=0;i<arr.length;i++){
//			arr[i] = (char)('A' + Math.random()*('Z'-'A'+1));
			arr[i]=(char)(rnd.nextInt(90-65)+65);
			System.out.println(arr[i]);
		}
	}
}
