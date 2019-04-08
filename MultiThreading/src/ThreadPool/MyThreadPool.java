package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/*向ExecutorService中扔任务：
execute()【执行的是Runnable任务，没有返回值】、
submit()方法【可以执行有返回值或者没有的】*/
public class MyThreadPool {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(5);//创建一个容量为5的线程池，放到ExecutorService中执行
        for (int i = 0; i < 7; i++) {
            service.execute(()->{
                try {
                    TimeUnit.MICROSECONDS.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
            });
        }

        System.out.println(service);//java.util.concurrent.ThreadPoolExecutor@6d03e736[Running, pool size = 5, active threads = 5, queued tasks = 2, completed tasks = 0]

        service.shutdown();//启动有序关闭，其中先前提交的任务将被执行，但不会接收任何新任务
        System.out.println(service.isTerminated());//所有任务关闭后，返回true
        System.out.println(service.isShutdown());//该service已停止，则返回true
        System.out.println(service);

        TimeUnit.SECONDS.sleep(5);
        System.out.println(service.isTerminated());
        System.out.println(service.isShutdown());
        System.out.println(service);
    }
}
