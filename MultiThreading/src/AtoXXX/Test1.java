package AtoXXX;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/*
解决同样的问题的更高效的方法，使用AutoXX类
AutoXXX类本身方法都是原子性的，但不能保证多个方法连续调用是原子性的。
面试题：写一个程序，证明AtomXXX类比synchronized更高效。
面试题：AtomXXX类可以保证可见性吗，请证明。
 */
public class Test1 {
    AtomicInteger count = new AtomicInteger(0);
    void m(){
        for (int i = 0; i < 10000; i++) {
//            if(count.get()>1000)加上这一句代码，可以证明多个AtomXXX类的多个方法并构不成原子性。
            count.incrementAndGet();//代替count++
        }
    }

    @org.junit.Test
    public void test() {
        Test1 test1 = new Test1();
        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            threads.add(new Thread(test1::m,"thread-"+i));
        }
        threads.forEach((o) -> o.start());
        threads.forEach((o)->{
            try {
                o.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println(test1.count);
    }
}
