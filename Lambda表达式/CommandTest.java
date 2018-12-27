package Lambda表达式;
/*
 * Lambda表达式支持将代码块作为方法参数,Lambda允许用更简洁的方法来创建只有一个抽象方法的接口
 * （这种接口被称为函数式）的实例。
 */
public class CommandTest {
	public static void main(String[] args) {
		ProcessArray pa = new ProcessArray();
		int[] target = {3,-4,6,4};
//		处理数组，具体行为取决于匿名内部类
		pa.processArray(target, new Command() 
		{
			public void process(int[] target) {
				int sum = 0;
				for(int tmp : target) {
					sum += tmp;
				}
				System.out.println("数组元素的总和是："+sum);
			}
		});
	}
}
