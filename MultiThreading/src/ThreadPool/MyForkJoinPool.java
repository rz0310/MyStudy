package ThreadPool;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;

public class MyForkJoinPool {
    static int[] nums = new int[10000];
    static final int MAX_NUM = 500;
    static Random r = new Random();
    static {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = r.nextInt(100);
        }
        System.out.println(Arrays.stream(nums).sum());
    }
//    static class AddTask extends RecursiveAction{//这里的compute()方法没有返回值
//
//        int start,end;
//
//        AddTask(int s,int e){
//            this.start =s;
//            this.end = e;
//        }
//
//        @Override
//        protected void compute() {
//            if (end - start <= MAX_NUM) {
//                long sum = 0L;
//                for (int i = start; i < end; i++) {
//                    sum += nums[i];
//                }
//                System.out.println("from:" + start + " to:" + end + " = " + sum);
//            } else {
//                int middle = start + (end - start) / 2;//将任务数大于500的再分割为两个子任务
//
//                AddTask subTask1 = new AddTask(start, middle);
//                AddTask subTask2 = new AddTask(middle, end);
//
//                subTask1.fork();//执行分割后的子任务
//                subTask2.fork();
//            }
//        }
//    }

    static class AddTask extends RecursiveTask<Long>{//compute方法有返回值

        int start,end;

        AddTask(int s,int e){
            this.start =s;
            this.end = e;
        }

        @Override
        protected Long compute() {
            if (end - start <= MAX_NUM) {
                Long sum = 0L;
                for (int i = start; i < end; i++) {
                    sum += nums[i];
                }
                return sum;
            }

            int middle = start + (end - start) / 2;

            AddTask subTask1 = new AddTask(start,middle);
            AddTask subTask2 = new AddTask(middle,end);
            subTask1.fork();
            subTask2.fork();

            return subTask1.join()+subTask2.join();
        }
    }

    public static void main(String[] args) throws IOException {
        ForkJoinPool fjp = new ForkJoinPool();
        AddTask task = new AddTask(0,nums.length);
        fjp.execute(task);
        Long result = task.join();
        System.out.println(result);

//        System.in.read();
    }
}
