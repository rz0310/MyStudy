package ThreadPool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/*自定义线程池*/
public class MyThreadPoolExecutor extends ThreadPoolExecutor {
                                /*核心线程数           最大线程数          最长生存时间         执行的时间单元   阻塞队列，用来放线程池中的任务*/
    public MyThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
    }
}
