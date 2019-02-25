package Map集合;
/*
 * Properties类是Hashtable的子类，该对象在处理属性文件时特别方便（Windows操作平台上的ini文件就是一种属性文件）。
 * Properties类：（1）可以把Map对象和属性文件关联起来，从而把Map对象中的key-value写入属性文件中。
 *				（2）也可以把属性文件中的"属性名=属性值"加载到Map对象中。
 *
 *Properties相当于一个key、value都是String类型的Map。
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesTest {
	public static void main(String[] args)throws Exception {
		 Properties props = new  Properties();
//		 向Properties中添加属性
		 props.setProperty("username", "renjing");
		 props.setProperty("password", "123456");
//		 将Properties的key-value对保存到a.ini文件中###
		 props.store(new FileOutputStream("a.ini"), "comment line");
//		 新建一个Properties对象
		 Properties props2 = new  Properties();
//		 向Properties中添加属性
		 props2.setProperty("gender", "male");
//		 将a.ini文件中的key-value对追加到props2中###
		 props2.load(new FileInputStream("a.ini"));
		 System.out.println(props2);
	}
}
