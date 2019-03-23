package 反射;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class TestField {
//    获取对应的运行时类的属性
    @Test
    public void test1(){
        Class clazz1 = Person.class;
        //1.get Fidlds():只能获取到运行时类及其父类中声明为Public的属性
        Field[] fields = clazz1.getFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i]);
        }
        System.out.println();
//        2.getDeclaredFields():可以获取搭配运行时类中本身所有声明的属性
        Field[] fields2 = clazz1.getDeclaredFields();
        for (int i = 0; i < fields2.length; i++) {
            System.out.println(fields2[i]);
        }
    }
//    权限修饰符、变量类型、变量名
//    获取属性的各个部分的内容
    @Test
    public void test2(){
        Class clazz = Person.class;
        Field[] fields = clazz.getDeclaredFields();
        for (Field f:fields) {
//            1.获取每个属性的权限修饰符
//            getField(String FieldName):获取运行时类中声明为public的指定的属性名为fieldName的属性
            int modifiers = f.getModifiers();
            System.out.print(modifiers);
            String str = Modifier.toString(modifiers);
            System.out.print(str + " ");
//            2.获取属性的变量类型
            Class type = f.getType();
            System.out.print(type.getName() + " ");
//            3.获取属性名
            System.out.println(f.getName());
        }
    }
//    调用运行时类中指定的属性
    @Test
    public void test3() throws Exception {
        Class clazz = Person.class;
        //1.获取指定的属性
        Field name = clazz.getField("name");
//        2.创建运行时类的对象
        Person p = (Person)clazz.newInstance();
        System.out.println(p);
//        3.将运行时类指定的属性复制
        name.set(p,"renjing");
        System.out.println(p);

        System.out.println();
//      getDeclaredField(String fieldName):获取运行时类中声明的指定的名为fieldName的属性
        Field age = clazz.getDeclaredField("age");
//        由于属性权限修饰符的限制，为了保证给属性赋值，需要在操作前使得此属性可被操作
        age.setAccessible(true);//将私有属性设置为可访问的，否则会报错：IllegalAccessException
        age.set(p,20);
        System.out.println(p.getAge());

        Field id = clazz.getDeclaredField("age");
        id.setAccessible(true);//将私有属性设置为可访问的，否则会报错：IllegalAccessException
        id.set(p,10);
        System.out.println(p.getId());
    }
}
