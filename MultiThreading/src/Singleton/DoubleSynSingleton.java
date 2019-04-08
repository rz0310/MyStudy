package Singleton;
/*
饿汉且保证线程安全（使用双重同步锁）
 */
public class DoubleSynSingleton {
    private volatile static DoubleSynSingleton doubleSynSingleton;
    private DoubleSynSingleton(){

    }
    public static DoubleSynSingleton getInstance(){
        if(doubleSynSingleton == null){//加锁会导致效率低，在已经生成实例后，没必要再判断锁
            synchronized (DoubleSynSingleton.class){//加锁，防止多线程时，生成多个实例
                doubleSynSingleton = new DoubleSynSingleton();//此处可能出现指令重排序，，先完成赋值，但构造函数还没执行完
            }
        }
        return doubleSynSingleton;
    }
}
