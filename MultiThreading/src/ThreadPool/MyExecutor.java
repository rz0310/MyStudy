package ThreadPool;

import java.util.concurrent.Executor;

public class MyExecutor implements Executor {
    public static void main(String[] args) {
        new MyExecutor().execute(()-> System.out.println("hello executor"));
    }

//    execute()方法没有返回值
    @Override
    public void execute(Runnable command) {//定义行为
//        new Thread(command).run();
        command.run();
    }
}
