package ��ϰ;
import java.util.*;
//�������10����д�ַ������Ҳ��ظ�
public class demo1 {
	public static void main(String[] args) {
		char[] arr = new char[10];
		Random rnd = new Random();
		boolean flag;
		for(int i=0;i<arr.length;i++){
			flag = true;
//			char ch = (char)('A' + Math.random()*('Z'-'A'+1));
			char ch=(char)(rnd.nextInt(90-65)+65);
			for(int j=0;j<arr.length;j++){
				if(ch==arr[j]){
					flag=false;
					i--;
					break;
				}
			}
			if(flag){
				arr[i]=ch;
				System.out.println(arr[i]);
			}
		}
		
	}
}
