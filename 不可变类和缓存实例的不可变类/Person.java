package ���ɱ���ͻ���ʵ���Ĳ��ɱ���;
//	ʵ�ֲ��ɱ������ÿɱ�������ñ���ʵ�ֳ��ײ��ɱ���
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
////		Person�����name��firstNameֵΪ���
//		System.out.println(p.getName().getFirstName);
////		�ı�Person�����name��FirstName��ֵ
//		n.setFirstName("�˽�");
//		System.out.println(p.getName().getFirstName());
//	}
	
//	Ϊ�˱���Person��Ĳ��ɱ��ԣ��޸�����
	private final Name name;
	public Person(Name name) {
//		����nameʵ������Ϊ��ʱ������Name����,�ö����firstName��lastName
//		�봫���name������firstName��lastName��ͬ
		this.name = new Name(name.getFirstName(),name.getLastName());
	}
	public Name getName() {
		return  new Name(name.getFirstName(),name.getLastName());
	}
	public static void main(String[] args) {
		Name n = new Name("���","��");
		Person p = new Person(n);
//		Person�����name��firstNameֵΪ���
		System.out.println(p.getName().getFirstName());
//		�ı�Person�����name��FirstName��ֵ
		n.setFirstName("�˽�");
		System.out.println(p.getName().getLastName());
	}
}
