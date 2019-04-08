package Volatile;

import java.util.ArrayList;
import java.util.List;

/*
volatile并不能保证多个线程共同修改running变量时所带来的不一致性问题，
也就是说volatile不能替代synchronized。
面试题：volatile和synchronized的区别
volatile只能保证可见性，synchronized既可以保证可见性又可以保证原子性。
 */
public class Test2 {
    volatile int count = 0;
    void m(){
        for (int i = 0; i < 10000; i++)
            count++;
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            threads.add(new Thread(test2::m,"thread-"+i));
        }
        threads.forEach((o)->o.start());
        threads.forEach((o)->{
            try {
                o.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println(test2.count);
    }
}
