package Volatile;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    volatile int count = 0;
    synchronized void m(){
        for (int i = 0; i < 10000; i++)
            count++;
    }

    @Test
    public void test() {
        Test3 test3 = new Test3();
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            threads.add(new Thread(test3::m,"thread-"+i));
        }
        threads.forEach((o)->o.start());
        threads.forEach((o)->{
            try {
                o.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println(test3.count);
    }
}
