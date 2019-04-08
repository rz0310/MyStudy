package practice2;
/*
没有同步，不能实现
 */
import java.util.Vector;
import java.util.concurrent.TimeUnit;

public class TicketSeller2 {
    static Vector<String> tickets = new Vector<>();
    static {
        for (int i = 0; i < 10000; i++) {
            tickets.add("票编号"+i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
               while(tickets.size()>0){
                   try {
                       TimeUnit.SECONDS.sleep(1);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   System.out.println("销售了---"+tickets.remove(0));
               }
            }).start();
        }
    }
}
