package Singleton;
/*
使用同步方法实现：一次锁住一个方法，粒度有点大
 */
public class SynMethodSingleton {
    private static SynMethodSingleton synMethodSingleton;
    private SynMethodSingleton(){

    }
    public static synchronized SynMethodSingleton getInstance(){
        if(synMethodSingleton == null){
            synMethodSingleton = new SynMethodSingleton();
        }
        return synMethodSingleton;
    }
}
