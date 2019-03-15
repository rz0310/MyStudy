package ClassDemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionDemo {
    public static void main(String[] args) {
        // 通过对象获取class对象
        Dogg dogg = new Dogg("小明", 4, "白色");
        Class aClass = dogg.getClass();

        // 通过类获得class对象
        Class<Dogg> doggClass1 = Dogg.class;
        Class doggClass = doggClass1;

        // 通过类名获取Class对象
        try {
            Class aClass1 = Class.forName("ClassDemo.Dogg");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 通过类实例话对象构造对象
        try {
            // 获取对象的无参构造方法
            Dogg dogg1 = doggClass1.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        // 获取所有的构造方法
        Constructor[] constructors = doggClass.getConstructors();
        for (int i = 0; i < constructors.length; i++) {
            System.out.println(constructors[i].getName());
            System.out.println(constructors[i].getParameterCount());
        }

        // 获取一个指定参数列表的构造器
        try {
            Constructor ct = aClass.getConstructor(String.class, int.class, String.class);
            Dogg dog = (Dogg) ct.newInstance("小明", 12, "white");
            System.out.println(dog.toString());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }




    }
}
