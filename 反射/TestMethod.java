package ����;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class TestMethod {
//    ��ȡ����ʱ��ķ���
    @Test
    public void test1(){
        Class clazz = Person.class;
//        1.getMethods():��ȡ����ʱ�༰�丸������������Ϊpublic�ķ���
        Method[] methods = clazz.getMethods();
        for (Method method:methods) {
            System.out.println(method);
        }
        System.out.println();
//        2.getDeclaresdMethods():��ȡ����ʱ�౾�����������з���
        Method[] methods1 = clazz.getDeclaredMethods();
        for (Method m : methods1) {
            System.out.println(m);
        }
    }
//    ע�⡢Ȩ�����η�������ֵ���͡����������β��б��쳣
    @Test
    public void test2(){
        Class clazz = Person.class;//��ȡPerson���Classʵ��
        Annotation[] annotations = clazz.getAnnotations();//��ȡ����ʱ���е�����ע��
        System.out.println("���е�����ע�⣺");
        for (Annotation an : annotations) {
            System.out.print(an + " ");
        }
        System.out.println();
        Method[] methods = clazz.getDeclaredMethods();//��ȡ�������������ķ���
        for (Method m :methods) {
//            1.ע��
            Annotation[] ann = m.getAnnotations();//��ȡ���������е�ע��
            for (Annotation an : ann) {
                System.out.println(an + " ");
            }
//            2.Ȩ�����η�
            int modifiers = m.getModifiers();//��ȡ������Ȩ�����η����õ�����int���͵�������public->1,private->2,Ĭ��->0
            System.out.print(modifiers);
            String str = Modifier.toString(modifiers);
            System.out.print(str + " ");
//            3.����ֵ����
            Class returnType = m.getReturnType();//��ȡ�����ķ���ֵ����
            System.out.print(returnType.getName() + " ");
//            4.������
            System.out.print(m.getName() + " ");//��ȡ������
//            5.�β��б�
            System.out.print("(");
            Class[] parameterTypes = m.getParameterTypes();//��ȡ�β��б������
            for (int i = 0;i<parameterTypes.length;i++) {
                System.out.print(parameterTypes[i].getName() + " args-" + i + " ");
            }
            System.out.print(")");
//            6.�쳣����
            Class[] exceptionTypes = m.getExceptionTypes();//��ȡĳ���������쳣
            if(exceptionTypes.length != 0){
                System.out.print("throws ");
            }
            for (int i = 0; i < exceptionTypes.length; i++) {
                System.out.println(exceptionTypes[i].getName() + " ");
            }
            System.out.println();
        }
    }
    @Test
    public void test3() throws Exception {
        Class clazz = Person.class;
//        getMethod(String methodName,Class ... params):��ȡ����ʱ��������Ϊpublic�ķ��������������쳣
        Method m1 = clazz.getMethod("show");
        Person p = (Person) clazz.newInstance();
//        ����ָ���ķ�����invoke(Object obj,Object  ...obj)������ֵΪObject���͵�invoke()�ķ���ֵ��Ϊ�����÷����ķ���ֵ
        Object returnVal1 = m1.invoke(p);
        System.out.println(returnVal1);//null//show()����û�з���ֵ���ʷ���õ���Ϊnull

        Method m2 = clazz.getMethod("toString");
        Object returnVal2 = m2.invoke(p);
        System.out.println(returnVal2);//Person{name='null', age=0}

//        ����ʱ���о�̬�����ĵ���:��ʹ�ö���ֱ��������ʱ��
        Method m3 = clazz.getMethod("info");
        m3.invoke(Person.class);

//        getDeclaredMethod(String methodName,Class ... params)
        Method m4 = clazz.getDeclaredMethod("display", String.class,Integer.class);
        m4.setAccessible(true);
        Object value = m4.invoke(p,"CHA",10);
        System.out.println(value);
    }
}
