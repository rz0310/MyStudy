package Singleton;
/*
普通的单例模式
 */
public class Singleton {
    private static Singleton singleton = new Singleton();//类初始化时就实例化singleton
    public Singleton(){

    }
    public static Singleton getInstance(){
        return singleton;
    }
}
