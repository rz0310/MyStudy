import java.util.Scanner;
public class Test{
    public static String check(String str){
        char[] ch = str.toCharArray();
        int count = 1;
        int index = 0;
        int num = 0;
        int count2 = 1;
        boolean flag = false;
        for(int i = 0;i< ch.length-1;i++){
            char c = ch[i];
            if(c == ch[i+1]){
                int index2 = i+1;
                count2++;
                index2 = i-1;
                while(count2>3){
                    for(int j = index2;j<ch.length-1;j++){
                        ch[j] = ch[j+1];
                    }
                    for (int j = index2+1; j < index2+3; j++) {
                        ch[j] = ' ';
                    }
                    count2--;
                    if(count2<3){
                        str = new String(ch);
                        return str;
                    }
                }
            }
            if(c == ch[i+1]&&count<=3){
                count++;
                index = i-1;
                if(count == 2){
                    num++;
                    if(num == 2){
                        for(int j = index;j<ch.length-1;j++){
                            ch[j] = ch[j+1];
                        }
                    }else{
                        num = 0;
                    }
                }else if(count==3&&flag==true){
                    for(int j = index;j<ch.length-1;j++){
                        ch[j] = ch[j+1];
                    }
                    flag = false;
                    break;
                }
            }else{
                count = 1;
            }
        }
        ch[ch.length-1] = ' ';
        str = new String(ch);
        return str;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] str = new String[num];
        for(int i = 0;i<str.length;i++){
            String next = sc.next();
            str[i] = next;
        }
        for (int i = 0; i < str.length; i++) {
            String result = check(str[i]);
            System.out.println(result);
        }
    }
}
