package 静态内部类;

import 静态内部类.Out;
import 静态内部类.Subclass;

//在外部类以外使用非静态内部类
//非静态内部类的构造器必须通过其外部类的对象来调用
public class Subclass extends Out.In{
	public Subclass(Out out) {
//		通过传入的out对象来显式调用In的构造器
		out.super("该类的父类是In,In类是Out类的非静态内部类,SubClass是In类的子类,故在自定义的构造器中要调用其父类的构造器");
	}
	public static void main(String[] args) {
		Out out = new Out();
		new Subclass(out);
	}
}