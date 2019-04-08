package ConcurrentContainer;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CountDownLatch;
/*
总结：
    不要求同步：HashMap，TreeMap，LinkedHashMap
    同步但是并发不是特别高：hashtable，Collections.SynchronizedXxx
    同步并发高：concurrentHashMap，concurrentSkipListMap
 */
public class ConcurrentMap {
    public static void main(String[] args) {
//        Map<String,String> map = new Hashtable();//lock整个容器
//        Map<String,String> map = new HashMap();//
//        Map<String,String> map = new ConcurrentHashMap();//分段锁(Node+CAS+Synchronized)，效率要高于Hashtable和Collections.SynchronizedXxx
        Map<String,String> map = new ConcurrentSkipListMap();//高并发并且排序
//        TreeMap:已排序   SortedMap:已排序，但是插入效率低
        Random random = new Random();
        Thread[] threads = new Thread[100];
        CountDownLatch latch = new CountDownLatch(threads.length);
        long start = System.currentTimeMillis();
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(()->{
                for (int j = 0; j < 10000; j++) {
                    map.put("a"+ random.nextInt(1000000),"a"+random.nextInt(1000000));
                }
                latch.countDown();
            });
        }
        Arrays.asList(threads).forEach(t->t.start());//遍历启动线程
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
