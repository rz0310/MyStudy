package ConcurrentContainer;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/*
并发使用的两种队列
（1）并发加锁队列：ConcurrentBlockingQueue
（2）阻塞式队列：BlockingQueue是无界队列
    MyLinkedBlockingQueue、ArrayBlockingQueue
 */
public class MyLinkedBlockingQueue {
    static BlockingQueue blockingQueue = new LinkedBlockingQueue();
    static Random random = new Random();

    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                try {
                    blockingQueue.put("a" + i);//如果阻塞队列满了，就会等待
                    System.out.println("----"+random.nextInt(10));
                    TimeUnit.MICROSECONDS.sleep(random.nextInt(1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "p1").start();
        for (int i = 0; i < 5; i++) {
            new Thread(()->{
                for (;;) {
                    try {
                        System.out.println(Thread.currentThread().getName()+" take - "+blockingQueue.take());//如果阻塞队列满了，就会等待
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            },"c"+i).start();
        }
    }
}
