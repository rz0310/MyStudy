package Lambda表达式;

public class ProcessArray {
//	target为具体对象所要使用的变量，cmd是接口用来封装方法（对象的行为）的
	public void processArray(int[] target,Command cmd) {
		cmd.process(target);
	}
}
