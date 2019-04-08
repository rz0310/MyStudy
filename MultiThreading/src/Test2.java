import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2 {
    public static String check(String str){
        List list = new ArrayList();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            String s  = String.valueOf(chars[i]);
            list.add(s);
        }
        int count = 0;
        int index = 0;
        int count2 = 1;
        for (int i = 0; i < list.size()-1; i++) {
            String s = (String) list.get(i);
            if(list.get(i+1).equals(s)){
                count++;
                index = i;
                if(count == 2){
                    count2++;
                    if(count2 == 2){
                        index = i;
                        for (int j = index; j < index+1; j++) {
                            list.remove(j);
                        }
                    }
                    continue;
                }
                if(count > 3){
                    while(count!=2){
                        list.remove(index);
                        index++;
                        count--;
                    }
                }

            }
        }
        str = String.join("",list);
        return str;
    }
    public static void main(String[] args) {
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
