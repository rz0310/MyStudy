package 单例模式;

import org.junit.Test;

public class Singleton {
//	声明一个静态的类变量用于创建实例
	private static Singleton s;
//	隐藏构造器
	private Singleton(){
		
	}
	public static Singleton instance(){
		if(s == null){
			s = new Singleton();
		}
		return s;
	}
}
