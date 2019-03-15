package ClassDemo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Demo3 {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Class<Dogg> aClass = Dogg.class;
        Dogg dogg = new Dogg("小明", 12, "white");
        // 获取公共的方法，包括继承的公有方法
        Method[] methods = aClass.getMethods();
 /*       for (Method method : methods) {
            System.out.println(Modifier.toString(method.getModifiers())+" "+method.getName());

            // 反射调用toString方法
            if (method.getName().equals("toString")) {
                try {
                    String s = (String) method.invoke(dogg);
                    System.out.println(s);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
*/
        // 访问本类中定义的所有方法
        Method[] d = aClass.getDeclaredMethods();
        for (Method method : d) {
            System.out.println(Modifier.toString(method.getModifiers()) + " " + method.getName());
            if (method.getName().equals("eat")) {
                // 设置此方法可以被访问(去除访问修饰符的检查)
                method.setAccessible(true);
                String s = (String) method.invoke(dogg,"SSS");
                System.out.println(s);
            }
        }
    }
}
