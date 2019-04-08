package parctice;
import java.util.Scanner;
public class Test{
    public static void swap(char[] ch,int m){
        int max = 0;
        String tmp = new String(ch);
        for(int i = 0;i < ch.length-m;i++){
            for(int j = i;j < m+i;j++){
                char temp = ch[j];
                ch[j] = ch[j+1];
                ch[j+1] = temp;
                int count = 0;
                String ch2 = new String(ch);
                if(!ch2.equals(tmp)){
                    count = 0;
                    for(int k = 0;k<ch.length;k++){
                        char c = ch[i];
                        if(c == ch[i]){
                            count++;
                        }
                    }
                }
                if(count>max){
                    max = count;
                }
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] c = str.toCharArray();
        int m = sc.nextInt();
        if(c.length>=0&&c.length<=1000){
            if(m>=0&&m<=1000000){
                swap(c,m);
            }else{
                System.out.println("error1");
            }
        }else{
            System.out.println("error2");
        }
    }
    @org.junit.Test
    public void test(){
        int x = 0;
        int i = 0;
        int[] arr = new int[9];
        while(x!=-1){
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            arr[i] = num;
            i++;
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[i]);
        }
    }
}