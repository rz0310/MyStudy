package Á·Ï°;
import java.util.*;
public class demo3 {
	public static void printTri(){
		int num=0;
		if(num<6){
			Scanner sc = new Scanner(System.in);
			num = sc.nextInt();
			int n = 65;
			int m = 0;
			char[][] ch = new char[num][num];
			for(int i=0;i<ch.length;i++){
				for(int j=0;j<ch[i].length;j++){
					ch[i][j]=(char)(n+m);
					m++;
					System.out.print(ch[i][j]+"\t");
				}
				System.out.println();
			}
		}
		
	}
	public static void main(String[] args) {
		printTri();
	}
}
