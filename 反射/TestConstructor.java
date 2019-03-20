package ����;

import org.junit.Test;

import java.lang.reflect.Constructor;

//��������󲢻�ȡ��������ṹ
public class TestConstructor {
    @Test
    public void test1() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String className = "����.Person";
        Class clazz1 = Class.forName(className);//��������ʱ��
//        ������Ӧ��������Ķ���ʹ��new Instance()��ʵ���ϵ���������ʱ��Ŀղ����Ĺ�����
//        �����ɹ�����������1������ʱ�����Ҫ�пղ���������
//        ��2����������Ȩ�����η���Ȩ��Ҫ�㹻��
        Person p = (Person) clazz1.newInstance();//��������ʱ��Ķ��󣨵���Person��public�ղ�����������
        System.out.println(p);
    }
    @Test
    public void test2() throws ClassNotFoundException {
        String className = "����.Person";
        Class clazz = Class.forName(className);//ʹ��Class�ľ�̬������ȡ����ʱ��
        Constructor[] constructors = clazz.getDeclaredConstructors();//��ȡ����ʱ�����������й�����
        for (Constructor con : constructors) {
            System.out.println(con + " ");
        }
    }
//    ����ָ���Ĺ���������������ʱ��Ķ���
    @Test
    public void test3() throws Exception {
        String className = "����.Person";
        Class clazz = Class.forName(className);
//        ��������ʱ��ָ���Ĺ�����
        Constructor cons = clazz.getDeclaredConstructor(String.class,int.class);
        cons.setAccessible(true);
        Person p = (Person) cons.newInstance("�Ŵϴ�",20);
        System.out.println(p);
    }
}
