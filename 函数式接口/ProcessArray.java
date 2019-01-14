package 函数式接口;

public class ProcessArray {
	public void process(int[] target,Command cmd) {
		cmd.process(target);
	}
}
