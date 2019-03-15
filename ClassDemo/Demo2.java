package ClassDemo;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Demo2 {
    public static void main(String[] args) {
        Class<Dogg> aClass = Dogg.class;
        // 获取所有公有的属性
        Field[] fields = aClass.getFields();
        System.out.println(fields.length);
        // 获取对象所在的包
        Package aPackage = aClass.getPackage();
        System.out.println(aPackage.getName());
        // 获取所有的属性
        Field[] df = aClass.getDeclaredFields();
        System.out.println(df.length);
        for (int i = 0; i < df.length; i++) {
            int modifiers = df[i].getModifiers();
            System.out.println(Modifier.toString(modifiers) + " " + df[i].getType() + " " + df[i].getName());
        }
    }
}
