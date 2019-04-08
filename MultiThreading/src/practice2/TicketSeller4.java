package practice2;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class TicketSeller4 {
    static Queue<String> tickets = new ConcurrentLinkedQueue<>();
    static {
        for (int i = 0; i < 10000; i++) {
            tickets.add("票编号---"+i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
               while(true){
//                   poll()底层实现：CompareAndSet
                   String poll = tickets.poll();//如果线程1执行到此处之后，线程2将tickets取空，那么线程1会再执行一遍poll,判断为null后再退出。
                   if(poll == null) break;
                   else System.out.println("销售了---"+poll);
               }
            }).start();
        }
    }
}
