package Á·Ï°;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.math.*;
public class Main{
	public static void sort(ArrayList<Integer> a,int x){
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < x; i++) {
			int num = sc.nextInt();
			a.add(num);
		}
	}
	public static int seach(ArrayList<Integer> a,int x){
		ArrayList<Integer> t = new ArrayList<>();
		t.add(x);
		int s = Collections.indexOfSubList(a, t);
		if(s>=0){
			return s+1;
		}
		else{
			return s;
		}
	}	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		ArrayList<Integer> test = new ArrayList<>();
		sort(test,num1);
		int num2 = sc.nextInt();
		System.out.println(seach(test,num2));
	}
}
