package ConcurrentContainer;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/*
写时赋值容器 copy on write
多线程环境下，写时效率低，读时效率高
适合写少读多的情况
 */
public class CopyOnWriteList {
    public static void main(String[] args) {
//        List<String> lists = new ArrayList<>();//出现并发问题
//        List<String> lists = new Vector<>();//186
        List<String> lists = new CopyOnWriteArrayList<>();//读的时候不加锁；监听器

        Random random = new Random();
        Thread[] threads = new Thread[100];
        for (int i = 0; i < threads.length; i++) {
            Runnable task = new Runnable(){

                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        lists.add("a"+random.nextInt(1000000));
                    }
                }
            };
            threads[i] = new Thread(task);
        }
        runAndComputeTime(threads);
        System.out.println(lists.size());
    }
    public static void runAndComputeTime(Thread[] threads){
        long start = System.currentTimeMillis();//获取当前时间
        Arrays.asList(threads).forEach(t->t.start());//遍历线程数组，启动线程
        Arrays.asList(threads).forEach(t->{
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
