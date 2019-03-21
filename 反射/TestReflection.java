package ����;

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
//    ������ļ�������ClassLoader
    @Test
    public void  test5() throws ClassNotFoundException, IOException {
        ClassLoader loader1 = ClassLoader.getSystemClassLoader();//��ȡϵͳ��ļ�����
        System.out.println(loader1);

        ClassLoader loader2 = loader1.getParent();//��ȡϵͳ��ļ������ĸ���->��չ�������
        System.out.println(loader2);

        ClassLoader loader3 = loader2.getParent();//��ȡϵͳ��ļ������ĸ���ĸ���->�����������
        System.out.println(loader3);

        Class clazz1 = Person.class;//��ȡPerson���Classʵ��
        ClassLoader loader4 = clazz1.getClassLoader();//��ȡPerson���Classʵ�����������
        System.out.println(loader4);

        String className = "java.lang.Object";//����Ҫ��ȡClassʵ����������Object��String���������Ϊ��������������޷���ȡ������Ϊnull��
        Class clazz2 = Class.forName(className);//ͨ��Class�ľ�̬������ȡ��Ӧ���Classʵ��
        ClassLoader loader5 = clazz2.getClassLoader();//��ȡClassʵ�����������
        System.out.println(loader5);

//        �������£�ʹ�����������ȡ�����ļ�
//        ����һ��
//        ClassLoader Loader = this.getClass().getClassLoader();//ͨ������ʱ��Ķ����ȡClass��ʵ����Ȼ���ٻ�ȡ��Ӧ����������
//        InputStream is = loader1.getResourceAsStream("����\\jdbc.properties");//ʹ�����������ȡ�����ļ�
//        ��������
        /*
        .\ ��ʾ��Ŀ�ļ�����Ŀ¼֮�µ�Ŀ¼��
        ..\ ��ʾ��Ŀ�ļ�����Ŀ¼����һ��Ŀ¼�µ�Ŀ¼��
        ..\..\��ʾ��Ŀ�ļ�����Ŀ¼���϶���Ŀ¼֮�µ�Ŀ¼��
        ���������Ŀ�ļ�����Ŀ¼���ԣ����ڶ�λ�����ļ���·��λ�á�
         */
//        FileInputStream is = new FileInputStream(new File("../IDEAWorkSpace/src/jdbc1.properties"));
//        FileInputStream is = new FileInputStream(new File("./src/jdbc1.properties"));
        FileInputStream is = new FileInputStream(new File("src/jdbc1.properties"));

//        ���´�����ͬ:
        Properties pros = new Properties();//����Properties����
        pros.load(is);//�������ļ����ص������õ�Properties������
//        ��ȡProperties�����ж�Ӧ������
        String name = pros.getProperty("user");
        System.out.println(name);
        String password = pros.getProperty("password");
        System.out.println(password);
    }
//    ��λ�ȡClass��ʵ����3�ַ�����
    @Test
    public void test4() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //1.����ʱ�౾���.class���Ի�ȡClass��ʵ��
        Class clazz1 = Person.class;
        System.out.println(clazz1);

        Class clazz2 = String.class;
        System.out.println(clazz2);

        //2.ͨ������ʱ��Ķ����ȡClass��ʵ��
        Person p = new Person();
        Class clazz3 = p.getClass();
        System.out.println(clazz3);

//        3.ͨ��Class�ľ�̬������ȡClass��ʵ��
        String className = "����.Person";
//        ��ᷴ��Ķ�̬��
        Class clazz4 = Class.forName(className);//����className�Ĳ�ͬ����ȡ��ͬ���Classʵ��
        clazz4.newInstance();//������ȡ��Ӧ��Classʵ���Ķ��󣬿ɸ���className�Ĳ�ͬʵ�ֶԲ�ͬ����Ĳ���
        System.out.println(clazz4);

//        4.���˽⣩ͨ����ļ�������ȡClass��ʵ��
        ClassLoader classLoader = this.getClass().getClassLoader();
        Class clazz5 = classLoader.loadClass(className);
        System.out.println(clazz5.getName());

//        ��ȡ����ͬһ��Class��ʵ��
        System.out.println(clazz1 == clazz3);
        System.out.println(clazz1 == clazz4);
        System.out.println(clazz1 == clazz5);
    }
/*
   java.lang.Class:�����Դͷ��
   ����һ���࣬ͨ�����루javac.exe�������ɶ�Ӧ��.class�ļ���Ȼ��ʹ��java.exe
   ���أ����أ�JVM�����������ɵģ���.class�ļ��ļ�����.class�ļ����ص��ڴ�󣬾���һ��
   ����ʱ�࣬�����ڻ���������ô�������ʱ�����һ��Class��ʵ����
    1.ÿһ������ʱ��ֻ����һ�Ρ�
    2.����Class��ʵ���Ժ�ѽ�����Խ������²�����
        ��1��*������Ӧ������ʱ��Ķ���
        ��2����ȡ��Ӧ������ʱ��������ṹ�����ԡ����������������ڲ��ࡢ���ࡢ���ڵİ����쳣��ע��ȣ�
        ��3��*���ö�Ӧ������ʱ���ָ���Ľṹ�����ԡ���������������
        ��4�������Ӧ�á���̬����
*/
    @Test
    public void test3(){
        Person p = new Person();
        Class clazz = p.getClass();//ͨ������ʱ��Ķ��󣬵�����getClass()������������ʱ�ࡣ
        System.out.println(clazz);
    }
//    ���˷��䣬����ͨ�����䴴��һ����Ķ��󣬲��������еĽṹ
    @Test
    public void test2() throws IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Class<Person> clazz = Person.class;//�õ�Person������
//        1.����clazz��Ӧ������ʱ��Person�Ķ���
        Person p = clazz.newInstance();
        System.out.println(p);
//        2.ͨ�������������ʱ���ָ��������
        Field f1 = clazz.getField("name");//��ȡ���ö��������name���˷���ֻ�ܻ�ȡpublic���ԣ�
        f1.set(p,"������");//���ö���p��name����
        System.out.println(p);

        Field f2 = clazz.getDeclaredField("age");//��ȡ�����ö����Ѿ����������ԣ��������Ȩ�ޣ�����Ҫ���ø����Եķ���Ȩ�ޣ�
        f2.setAccessible(true);//�����û���ַǷ����ʵ��쳣
        f2.set(p,20);
        System.out.println(p);
//        3.ͨ�������������ʱ���ָ���ķ���
        Method m1 = clazz.getMethod("show");
        m1.invoke(p);

        Method m2 = clazz.getMethod("display", String.class);
        m2.invoke(p,"CHINA");
    }
//    ���з���֮ǰ����δ���һ����Ķ��󣬲��������еķ���������
    @Test
    public void test1()  {
        Person p = new Person();//�ڵ�һ�δ�������ʱ����Ҫ����Person��
        p.setAge(10);
        p.setName("RenJing");
        System.out.println(p);
//        p.show();
//        p.display("haha");
    }
//
}
