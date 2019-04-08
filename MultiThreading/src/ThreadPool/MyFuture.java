package ThreadPool;


import java.util.concurrent.*;

public class MyFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer> task = new FutureTask(()->{//里面放了一个Callable，call()方法返回值为Integer类型
            TimeUnit.MICROSECONDS.sleep(500);
            return 1000;
        });

        new Thread(task).start();

        System.out.println(task.get());//等待计算结果完成，然后检索其结果，会阻塞

        ExecutorService service = Executors.newFixedThreadPool(5);
        Future<Integer> future = service.submit(()->{
            TimeUnit.MICROSECONDS.sleep(500);
            return 1;
        });
        System.out.println(future.get());//等待计算结果，然后检索其结果
        System.out.println(future.isDone());//判断任务是否完成
        service.shutdown();//停止这个service
    }
}
