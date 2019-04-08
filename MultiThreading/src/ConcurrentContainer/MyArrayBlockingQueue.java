package ConcurrentContainer;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class MyArrayBlockingQueue {
    static BlockingQueue blockingQueue = new ArrayBlockingQueue(10);//有限队列
    static Random random = new Random();

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            blockingQueue.put("a"+i);
        }
        System.out.println(blockingQueue);
//        blockingQueue.put("aaa");//满了就会等待，程序阻塞
//        blockingQueue.add("bbb");//队列满了继续添加，Queue Full异常
//        blockingQueue.offer("ccc");//队列满了继续添加，不会报异常
        blockingQueue.offer("ddd",1, TimeUnit.SECONDS);
        System.out.println(blockingQueue);
    }
}
