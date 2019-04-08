package ThreadPool;

import java.util.concurrent.Callable;

/*Callable和Runnable很相似，Callable中的call()方有返回值，
Runnable中的execute()方法没有返回值*/
public class MyCallable implements Callable {

//    call()方法有返回值
    @Override
    public Object call() throws Exception {
        return null;
    }
}
