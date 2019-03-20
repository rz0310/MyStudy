package 反射;

import org.junit.Test;

import java.lang.reflect.Constructor;

//创建类对象并获取类的完整结构
public class TestConstructor {
    @Test
    public void test1() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String className = "反射.Person";
        Class clazz1 = Class.forName(className);//加载运行时类
//        创建对应的运行类的对象，使用new Instance()：实际上调用了运行时类的空参数的构造器
//        创建成功的条件：（1）运行时类必须要有空参数构造器
//        （2）构造器的权限修饰符的权限要足够。
        Person p = (Person) clazz1.newInstance();//创建运行时类的对象（调用Person的public空参数构造器）
        System.out.println(p);
    }
    @Test
    public void test2() throws ClassNotFoundException {
        String className = "反射.Person";
        Class clazz = Class.forName(className);//使用Class的静态方法获取运行时类
        Constructor[] constructors = clazz.getDeclaredConstructors();//获取运行时类声明的所有构造器
        for (Constructor con : constructors) {
            System.out.println(con + " ");
        }
    }
//    调用指定的构造器，创建运行时类的对象
    @Test
    public void test3() throws Exception {
        String className = "反射.Person";
        Class clazz = Class.forName(className);
//        调用运行时类指定的构造器
        Constructor cons = clazz.getDeclaredConstructor(String.class,int.class);
        cons.setAccessible(true);
        Person p = (Person) cons.newInstance("张聪聪",20);
        System.out.println(p);
    }
}
