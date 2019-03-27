package Annotation;

import java.util.ArrayList;
import java.util.List;

public class AnnotationDemo {
//    注解
//    1.JDK提供的常用的注解
//        @Override:限定重写父类方法，该注释只能用于方法
//        @Deprecated：用于表示某个程序元素（类，方法等）已过时
//        @SuppressWarnings:抑制编译器警告
//    2.如何自定义一个注解
//    3.元注解
    public static void main(String[] args) {
        Person p = new Student();
        p.walk();
        @SuppressWarnings({"rawtypes","unused"})
        List list = new ArrayList();
    }
}
@MyAnnotation(value = "ha")
class Student extends Person{
    @Override
    public void walk(){
        System.out.println("学生走路");
    }
    @Override
    public void eat(){
        System.out.println("学生吃饭");
    }
}
@Deprecated
class Person{
    String name;
    int age;

    public Person() {
        super();
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void walk(){
        System.out.println("走路");
    }
    @Deprecated
    public void eat(){
        System.out.println("吃饭");
    }
}