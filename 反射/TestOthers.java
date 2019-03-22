package ����;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class TestOthers {
//    7.��ȡ�ڲ���
    @Test
    public void test7(){
        Class clazz = Person.class;
        Class[] classes = clazz.getClasses();//��ȡ����ʱ���Ȩ�����η�Ϊpublic���ڲ���
        for (Class c : classes) {
            System.out.println(c.getName());
        }
    }
//    6.��ȡע��(ֻ������ΪRuntime���ſ��Ա������ȡ)
    @Test
    public void test6(){
        Class clazz = Person.class;
        Annotation[] annotations = clazz.getAnnotations();//��ȡ����ʱ���ע��
        for (Annotation an : annotations) {
            System.out.println(an);
        }
    }
//    5.��ȡ���ڵİ�
    @Test
    public void test5(){
        Class clazz = Person.class;
        Package aPackage = clazz.getPackage();
        System.out.println(aPackage);
    }
//    4.��ȡʵ�ֵĽӿ�
    @Test
    public void test4(){
        Class clazz = Person.class;
        Class[] interfaces = clazz.getInterfaces();//��ȡ����ʱ�౾����ʵ�ֵĽӿ�
        for (Class i : interfaces) {
            System.out.println(i);
        }
    }

//    3.*��ȡ����ķ���
    @Test
    public void test3(){
        Class clazz = Person.class;
        Type type1 = clazz.getGenericSuperclass();//��ȡ�����͵ĸ���
        ParameterizedType param = (ParameterizedType)type1;//ParameterizedType:����������
        Type[] ata = param.getActualTypeArguments();//��ȡ����ķ��Ͳ�����ʵ������
        System.out.println(((Class)ata[0]).getName());
    }
//    2.��ȡ�����͵ĸ���
    @Test
    public void test2(){
        Class clazz = Person.class;
        Type type1 = clazz.getGenericSuperclass();//��ȡ�����͵ĸ���
        System.out.println(type1);

    }
//    1.��ȡ����ʱ�ĸ���
    @Test
    public void test1(){
        Class clazz = Person.class;
        Class superclass = clazz.getSuperclass();//��ȡ����ʱ�ĸ���
        System.out.println(superclass);
    }
}
