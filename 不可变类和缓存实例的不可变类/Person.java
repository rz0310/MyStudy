package 不可变类和缓存实例的不可变类;
//	实现不可变类引用可变类的引用变量实现彻底不可变类
public class Person {
//	private final Name name;
//	public Person() {
//		this.name = name;
//	}
//	public Name getName() {
//		return name;
//	}
//	public static void main(String[] args) {
//		Name n = new Name();
//		Person p = new Person(n);
////		Person对象的name的firstName值为悟空
//		System.out.println(p.getName().getFirstName);
////		改变Person对象的name的FirstName的值
//		n.setFirstName("八戒");
//		System.out.println(p.getName().getFirstName());
//	}
	
//	为了保持Person类的不可变性，修改如下
	private final Name name;
	public Person(Name name) {
//		设置name实例变量为临时创建的Name对象,该对象的firstName和lastName
//		与传入的name参数的firstName和lastName相同
		this.name = new Name(name.getFirstName(),name.getLastName());
	}
	public Name getName() {
		return  new Name(name.getFirstName(),name.getLastName());
	}
	public static void main(String[] args) {
		Name n = new Name("悟空","孙");
		Person p = new Person(n);
//		Person对象的name的firstName值为悟空
		System.out.println(p.getName().getFirstName());
//		改变Person对象的name的FirstName的值
		n.setFirstName("八戒");
		System.out.println(p.getName().getLastName());
	}
}
