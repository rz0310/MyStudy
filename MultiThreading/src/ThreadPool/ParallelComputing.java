package ThreadPool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
/*并行计算*/
public class ParallelComputing {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        使用主线程来计算
        long start = System.currentTimeMillis();
        List<Integer> results = getPrime(1,20000);
        long end = System.currentTimeMillis();
        System.out.println(end - start);

//        在线程池中启动四个线程（cpu的核数）来计算
        final int cpuCoreNum = 4;
        ExecutorService service = Executors.newFixedThreadPool(cpuCoreNum);

        MyTask t1 = new MyTask(1,8000);
        MyTask t2 = new MyTask(8001,13000);
        MyTask t3 = new MyTask(13001,17000);
        MyTask t4 = new MyTask(17001,20000);

        Future<List<Integer>> f1 = service.submit(t1);
        Future<List<Integer>> f2 = service.submit(t2);
        Future<List<Integer>> f3 = service.submit(t3);
        Future<List<Integer>> f4 = service.submit(t4);

        start = System.currentTimeMillis();
        f1.get();
        f2.get();
        f3.get();
        f4.get();
        end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    static class MyTask implements Callable<List<Integer>> {

        int startPos,endPos;

        MyTask(int s, int e) {
            this.startPos = s;
            this.endPos = e;
        }

        @Override
        public List<Integer> call() throws Exception {
            List<Integer> r = getPrime(startPos,endPos);
            return r;
        }
    }

    static boolean isPrime(int num) {
        for (int i = 2; i < num / 2; i++) {
            if (num / i == 0) {
                return false;
            }
        }
        return true;
    }
    static List<Integer> getPrime(int start ,int end){
        List<Integer> results = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) results.add(i);
        }
        return results;
    }
}
