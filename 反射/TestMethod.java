package 反射;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class TestMethod {
//    获取运行时类的方法
    @Test
    public void test1(){
        Class clazz = Person.class;
//        1.getMethods():获取运行时类及其父类中所有声明为public的方法
        Method[] methods = clazz.getMethods();
        for (Method method:methods) {
            System.out.println(method);
        }
        System.out.println();
//        2.getDeclaresdMethods():获取运行时类本身声明的所有方法
        Method[] methods1 = clazz.getDeclaredMethods();
        for (Method m : methods1) {
            System.out.println(m);
        }
    }
//    注解、权限修饰符、返回值类型、方法名、形参列表、异常
    @Test
    public void test2(){
        Class clazz = Person.class;//获取Person类的Class实例
        Annotation[] annotations = clazz.getAnnotations();//获取运行时类中的所有注解
        System.out.println("类中的所有注解：");
        for (Annotation an : annotations) {
            System.out.print(an + " ");
        }
        System.out.println();
        Method[] methods = clazz.getDeclaredMethods();//获取其中所有声明的方法
        for (Method m :methods) {
//            1.注解
            Annotation[] ann = m.getAnnotations();//获取方法中所有的注解
            for (Annotation an : ann) {
                System.out.println(an + " ");
            }
//            2.权限修饰符
            int modifiers = m.getModifiers();//获取方法的权限修饰符，得到的是int类型的正数，public->1,private->2,默认->0
            System.out.print(modifiers);
            String str = Modifier.toString(modifiers);
            System.out.print(str + " ");
//            3.返回值类型
            Class returnType = m.getReturnType();//获取方法的返回值类型
            System.out.print(returnType.getName() + " ");
//            4.方法名
            System.out.print(m.getName() + " ");//获取方法名
//            5.形参列表
            System.out.print("(");
            Class[] parameterTypes = m.getParameterTypes();//获取形参列表的类型
            for (int i = 0;i<parameterTypes.length;i++) {
                System.out.print(parameterTypes[i].getName() + " args-" + i + " ");
            }
            System.out.print(")");
//            6.异常类型
            Class[] exceptionTypes = m.getExceptionTypes();//获取某个方法的异常
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
//        getMethod(String methodName,Class ... params):获取运行时类中声明为public的方法，否则会出现异常
        Method m1 = clazz.getMethod("show");
        Person p = (Person) clazz.newInstance();
//        调用指定的方法：invoke(Object obj,Object  ...obj)，返回值为Object类型的invoke()的返回值即为所调用方法的返回值
        Object returnVal1 = m1.invoke(p);
        System.out.println(returnVal1);//null//show()方法没有返回值，故反射得到的为null

        Method m2 = clazz.getMethod("toString");
        Object returnVal2 = m2.invoke(p);
        System.out.println(returnVal2);//Person{name='null', age=0}

//        运行时类中静态方法的调用:不使用对象，直接用运行时类
        Method m3 = clazz.getMethod("info");
        m3.invoke(Person.class);

//        getDeclaredMethod(String methodName,Class ... params)
        Method m4 = clazz.getDeclaredMethod("display", String.class,Integer.class);
        m4.setAccessible(true);
        Object value = m4.invoke(p,"CHA",10);
        System.out.println(value);
    }
}
