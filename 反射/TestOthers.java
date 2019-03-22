package 反射;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class TestOthers {
//    7.获取内部类
    @Test
    public void test7(){
        Class clazz = Person.class;
        Class[] classes = clazz.getClasses();//获取运行时类的权限修饰符为public的内部类
        for (Class c : classes) {
            System.out.println(c.getName());
        }
    }
//    6.获取注解(只有声明为Runtime，才可以被反射获取)
    @Test
    public void test6(){
        Class clazz = Person.class;
        Annotation[] annotations = clazz.getAnnotations();//获取运行时类的注解
        for (Annotation an : annotations) {
            System.out.println(an);
        }
    }
//    5.获取所在的包
    @Test
    public void test5(){
        Class clazz = Person.class;
        Package aPackage = clazz.getPackage();
        System.out.println(aPackage);
    }
//    4.获取实现的接口
    @Test
    public void test4(){
        Class clazz = Person.class;
        Class[] interfaces = clazz.getInterfaces();//获取运行时类本身所实现的接口
        for (Class i : interfaces) {
            System.out.println(i);
        }
    }

//    3.*获取父类的泛型
    @Test
    public void test3(){
        Class clazz = Person.class;
        Type type1 = clazz.getGenericSuperclass();//获取带泛型的父类
        ParameterizedType param = (ParameterizedType)type1;//ParameterizedType:参数化类型
        Type[] ata = param.getActualTypeArguments();//获取父类的泛型参数的实际类型
        System.out.println(((Class)ata[0]).getName());
    }
//    2.获取带泛型的父类
    @Test
    public void test2(){
        Class clazz = Person.class;
        Type type1 = clazz.getGenericSuperclass();//获取带泛型的父类
        System.out.println(type1);

    }
//    1.获取运行时的父类
    @Test
    public void test1(){
        Class clazz = Person.class;
        Class superclass = clazz.getSuperclass();//获取运行时的父类
        System.out.println(superclass);
    }
}
