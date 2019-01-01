package 方法引用与构造器引用;

import javax.swing.JFrame;

/*
 * Lambda表达式只有一条代码，就可以在代码块中使用方法引用和构造器引用。
 */
public class Test {
	@FunctionalInterface
	interface Converter {
		Integer convert(String from);
	}
	@FunctionalInterface
	interface MyTest {
		String test(String a,int b,int c);
	}
	@FunctionalInterface
	interface YourTest {
		JFrame win(String title);
	}
	public static void main(String[] args) {
//		1.引用类方法(Lambda表达式中的Integer就是那个类)
//		该程序中的13和17行代码等价
		Converter converter = from->Integer.valueOf(from);//13
		Integer val = converter.convert("99");
		System.out.println(val);
//		下面一行代码引用类方法
		Converter converter1 = Integer::valueOf;//17
		Integer val1 = converter1.convert("99");
		System.out.println(val1);
//		2.引用特定对象的实例方法(Lambda表达式中的字符串"fkit.org"就代表特定对象)
		Converter converter2 = from->"fkit.org".indexOf(from);
		Integer val2 = converter2.convert("it");
		System.out.println(val2);
		Converter converter22 = "fkit.org"::indexOf;
		Integer val22 = converter22.convert("it");
		System.out.println(val22);
//		3.引用某类对象的实例方法(Lambda表达式中的a就代表某一类对象)
		MyTest mt = (a,b,c)->a.substring(b, c);
//		substring(a,b):从a位置开始（不包括a），到b位置（包括b）
		String str = mt.test("Java I love you", 5, 15);
		System.out.println(str);
//		对于下面的实例方法引用，也就是调用某个String对象的substring方法来实现MyTest中唯一的抽象方法
		// 方法引用代替Lambda表达式：引用某类对象的实例方法
		// 函数式接口中被实现的方法的第一个参数作为调用者，后面的参数全部传给该方法作为参数
		MyTest mt1 = String::substring;
		String str1 = mt1.test("Java I love you", 5, 15);
		System.out.println(str1);
//		4.引用构造器
		YourTest yt = (String a)->new JFrame(a);
		JFrame jf = yt.win("我的窗口");
		System.out.println(jf);
		// 构造器引用代替Lambda表达式
		// 函数式接口中被实现方法的全部参数传给该构造器作为参数
		YourTest yt1 = JFrame::new;
		JFrame jf1 = yt1.win("我的窗口1");
		System.out.println(jf1);
	}
}
