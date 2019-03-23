package ����;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class TestField {
//    ��ȡ��Ӧ������ʱ�������
    @Test
    public void test1(){
        Class clazz1 = Person.class;
        //1.get Fidlds():ֻ�ܻ�ȡ������ʱ�༰�丸��������ΪPublic������
        Field[] fields = clazz1.getFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i]);
        }
        System.out.println();
//        2.getDeclaredFields():���Ի�ȡ��������ʱ���б�����������������
        Field[] fields2 = clazz1.getDeclaredFields();
        for (int i = 0; i < fields2.length; i++) {
            System.out.println(fields2[i]);
        }
    }
//    Ȩ�����η����������͡�������
//    ��ȡ���Եĸ������ֵ�����
    @Test
    public void test2(){
        Class clazz = Person.class;
        Field[] fields = clazz.getDeclaredFields();
        for (Field f:fields) {
//            1.��ȡÿ�����Ե�Ȩ�����η�
//            getField(String FieldName):��ȡ����ʱ��������Ϊpublic��ָ����������ΪfieldName������
            int modifiers = f.getModifiers();
            System.out.print(modifiers);
            String str = Modifier.toString(modifiers);
            System.out.print(str + " ");
//            2.��ȡ���Եı�������
            Class type = f.getType();
            System.out.print(type.getName() + " ");
//            3.��ȡ������
            System.out.println(f.getName());
        }
    }
//    ��������ʱ����ָ��������
    @Test
    public void test3() throws Exception {
        Class clazz = Person.class;
        //1.��ȡָ��������
        Field name = clazz.getField("name");
//        2.��������ʱ��Ķ���
        Person p = (Person)clazz.newInstance();
        System.out.println(p);
//        3.������ʱ��ָ�������Ը���
        name.set(p,"renjing");
        System.out.println(p);

        System.out.println();
//      getDeclaredField(String fieldName):��ȡ����ʱ����������ָ������ΪfieldName������
        Field age = clazz.getDeclaredField("age");
//        ��������Ȩ�����η������ƣ�Ϊ�˱�֤�����Ը�ֵ����Ҫ�ڲ���ǰʹ�ô����Կɱ�����
        age.setAccessible(true);//��˽����������Ϊ�ɷ��ʵģ�����ᱨ��IllegalAccessException
        age.set(p,20);
        System.out.println(p.getAge());

        Field id = clazz.getDeclaredField("age");
        id.setAccessible(true);//��˽����������Ϊ�ɷ��ʵģ�����ᱨ��IllegalAccessException
        id.set(p,10);
        System.out.println(p.getId());
    }
}
