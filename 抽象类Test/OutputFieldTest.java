package 抽象类Test;

public class OutputFieldTest {
	public static void main(String[] args) {
//		访问另一个包中Output接口的Max_Cache_line
		System.out.println(抽象类.OutPut.Max_Cache_Line);
//		下面出现final变量赋值异常 的错误
//		抽象类.OutPut.Max_Cache_Line = 20;
//		使用接口来调用类方法
		System.out.println(抽象类.OutPut.staticTest());
	}
}

