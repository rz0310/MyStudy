package 局部内部类;
/*
 * 在方法中定义的内部类叫做局部内部类，仅在方法中有效。因为局部内部类不能在外部类的方法意外的地方使用
 * 因此局部内部类不能使用访问控制符和static修饰符修饰。
 * 所有的局部成员都不能用static修饰。
 * 
 * 下面程序生成了三个class文件：LocalInnerClass.class、LocalInnerClass$1InnerBase.class和
 * LocalInnerClass$1InnerSub.class，局部内部类的class文件的命名格式：OuterClass$NInnerClass.class，
 * N是为了区分在同一个类的不同方法中的同名的局部内部类。
 */
public class LocalInnerClass {
	public static void main(String[] args) {
//		定义局部内部类
		class InnerBase {
			int a;
		}
//		定已局部内部类的子类
		class InnerSub extends InnerBase {
			int b;
		}
//		创建局部内部类的对象
		InnerSub is = new InnerSub();
		is.a = 5;
		is.b = 8;
		System.out.println("InnerSub的对象的a和b实例变量是："+is.a+","+is.b);
	}
}
