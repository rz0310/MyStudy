package ����;

@MyAnnotation(value = "renjing")
public class Person extends Creature<String> implements Comparable,MyInterface{
    public String name;
    private int age;
    int id;
    /*
    �����ղ����Ĺ������ĺô�����1��ʹ�÷����ʱ������new Instance()
    ��2�������Ĭ�ϵ��ø���Ŀղ����Ĺ�����
     */
    public Person() {
        super();
        System.out.println("Person�ղ���������");
    }

    public Person(String name) {
        this.name = name;
    }

    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @MyAnnotation(value = "abc123")
    public void show(){
        System.out.println("����һ����");
    }
    private Integer display(String str,Integer i) throws Exception{
        System.out.println("�ҵĹ�����"+str);
        return i;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public static void info(){
        System.out.println("��̬����");
    }
    public class Bird {

    }
}
