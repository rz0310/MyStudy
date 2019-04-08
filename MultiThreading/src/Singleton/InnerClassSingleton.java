package Singleton;
/*
使用内部类实现单例模式，即不用加锁，也能实现懒加载
 */
public class InnerClassSingleton {
    public InnerClassSingleton(){

    }
    private static class Inner{
        public static InnerClassSingleton  s = new InnerClassSingleton();
    }
    public static InnerClassSingleton getInstance(){
        return Inner.s;
    }
}
