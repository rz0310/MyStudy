package 反射;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class TestReflection {
//    关于类的加载器：ClassLoader
    @Test
    public void  test5() throws ClassNotFoundException, IOException {
        ClassLoader loader1 = ClassLoader.getSystemClassLoader();//获取系统类的加载器
        System.out.println(loader1);

        ClassLoader loader2 = loader1.getParent();//获取系统类的加载器的父类->扩展类加载器
        System.out.println(loader2);

        ClassLoader loader3 = loader2.getParent();//获取系统类的加载器的父类的父类->引导类加载器
        System.out.println(loader3);

        Class clazz1 = Person.class;//获取Person类的Class实例
        ClassLoader loader4 = clazz1.getClassLoader();//获取Person类的Class实例的类加载器
        System.out.println(loader4);

        String className = "java.lang.Object";//定义要获取Class实例的类名（Object、String的类加载器为引导类加载器，无法获取，所以为null）
        Class clazz2 = Class.forName(className);//通过Class的静态方法获取相应类的Class实例
        ClassLoader loader5 = clazz2.getClassLoader();//获取Class实例的类加载器
        System.out.println(loader5);

//        掌握如下：使用类加载器读取配置文件
//        方法一：
//        ClassLoader Loader = this.getClass().getClassLoader();//通过运行时类的对象获取Class的实例，然后再获取相应类的类加载器
//        InputStream is = loader1.getResourceAsStream("反射\\jdbc.properties");//使用类加载器读取配置文件
//        方法二：
        /*
        .\ 表示项目文件所在目录之下的目录。
        ..\ 表示项目文件所在目录向上一级目录下的目录。
        ..\..\表示项目文件所在目录向上二级目录之下的目录。
        都是针对项目文件所在目录而言，用于定位其它文件的路径位置。
         */
//        FileInputStream is = new FileInputStream(new File("../IDEAWorkSpace/src/jdbc1.properties"));
//        FileInputStream is = new FileInputStream(new File("./src/jdbc1.properties"));
        FileInputStream is = new FileInputStream(new File("src/jdbc1.properties"));

//        以下代码相同:
        Properties pros = new Properties();//创建Properties对象
        pros.load(is);//将配置文件加载到创建好的Properties对象中
//        获取Properties对象中对应的属性
        String name = pros.getProperty("user");
        System.out.println(name);
        String password = pros.getProperty("password");
        System.out.println(password);
    }
//    如何获取Class的实例（3种方法）
    @Test
    public void test4() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //1.运行时类本身的.class属性获取Class的实例
        Class clazz1 = Person.class;
        System.out.println(clazz1);

        Class clazz2 = String.class;
        System.out.println(clazz2);

        //2.通过运行时类的对象获取Class的实例
        Person p = new Person();
        Class clazz3 = p.getClass();
        System.out.println(clazz3);

//        3.通过Class的静态方法获取Class的实例
        String className = "反射.Person";
//        体会反射的动态性
        Class clazz4 = Class.forName(className);//根据className的不同，获取不同类的Class实例
        clazz4.newInstance();//进而获取相应的Class实例的对象，可根据className的不同实现对不同对象的操作
        System.out.println(clazz4);

//        4.（了解）通过类的加载器获取Class的实例
        ClassLoader classLoader = this.getClass().getClassLoader();
        Class clazz5 = classLoader.loadClass(className);
        System.out.println(clazz5.getName());

//        获取的是同一个Class的实例
        System.out.println(clazz1 == clazz3);
        System.out.println(clazz1 == clazz4);
        System.out.println(clazz1 == clazz5);
    }
/*
   java.lang.Class:反射的源头。
   创建一个类，通过编译（javac.exe），生成对应的.class文件。然后使用java.exe
   加载（加载：JVM的类加载器完成的）此.class文件文件，此.class文件加载到内存后，就是一个
   运行时类，存在于缓存区。那么这个运行时类就是一个Class的实例。
    1.每一个运行时类只加载一次。
    2.有了Class的实例以后呀，可以进行如下操作：
        （1）*创建对应的运行时类的对象
        （2）获取对应的运行时类的完整结构（属性、方法、构造器、内部类、父类、所在的包、异常、注解等）
        （3）*调用对应的运行时类的指定的结构（属性、方法、构造器）
        （4）反射的应用、动态代理
*/
    @Test
    public void test3(){
        Person p = new Person();
        Class clazz = p.getClass();//通过运行时类的对象，调用其getClass()，返回其运行时类。
        System.out.println(clazz);
    }
//    有了反射，可以通过反射创建一个类的对象，并调用其中的结构
    @Test
    public void test2() throws IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Class<Person> clazz = Person.class;//得到Person的引用
//        1.创建clazz对应的运行时类Person的对象
        Person p = clazz.newInstance();
        System.out.println(p);
//        2.通过反射调用运行时类的指定的属性
        Field f1 = clazz.getField("name");//获取引用对象的属性name（此方法只能获取public属性）
        f1.set(p,"二狗子");//设置对象p的name属性
        System.out.println(p);

        Field f2 = clazz.getDeclaredField("age");//获取该引用对象已经声明的属性（任意访问权限，但是要设置该属性的访问权限）
        f2.setAccessible(true);//不设置会出现非法访问的异常
        f2.set(p,20);
        System.out.println(p);
//        3.通过反射调用运行时类的指定的方法
        Method m1 = clazz.getMethod("show");
        m1.invoke(p);

        Method m2 = clazz.getMethod("display", String.class);
        m2.invoke(p,"CHINA");
    }
//    在有反射之前，如何创建一个类的对象，并调用其中的方法、属性
    @Test
    public void test1()  {
        Person p = new Person();//在第一次创建对象时，需要加载Person类
        p.setAge(10);
        p.setName("RenJing");
        System.out.println(p);
//        p.show();
//        p.display("haha");
    }
//
}
