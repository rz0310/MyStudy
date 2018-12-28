package Lambda表达式;
/*
 * Lambda表达式的的组成：
 * 形参列表。形参列表允许省略形参类型。如果形参列表中只有一个参数，甚至连形参列表的圆括号也可以省略。
 * 箭头（->）。必须通过英文中画线和大于符号组成。
 * 代码块。如果 代码块只包含一条语句，Lambda表达式允许省略代码块的花括号。
 * 如果Lambda表达式只有一条return语句，甚至可以省略return语句。Lamabda表达式需要返回值，而它的代码块中仅有一条省略了return的语句，
 * Lambda表达式会自动返回这条语句的值。
 */
public class CommandTest2 {
	public static void main(String[] args) {
		ProcessArray pa = new ProcessArray();
		int[] array = {3,-4,6,4};
//		Lambda表达式相当于一个匿名方法
		pa.processArray(array, (int[] target)->{
			int sum = 0;
			for(int tmp : target) {
				sum += tmp;
			}
			System.out.println("数组元素的和为："+sum);
		});
	}
}
