package 反射;

@MyAnnotation(value = "renjing")
public class Person extends Creature<String> implements Comparable,MyInterface{
    public String name;
    private int age;
    int id;
    /*
    保留空参数的构造器的好处：（1）使用反射的时候，利用new Instance()
    （2）子类会默认调用父类的空参数的构造器
     */
    public Person() {
        super();
        System.out.println("Person空参数构造器");
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
        System.out.println("我是一个人");
    }
    private Integer display(String str,Integer i) throws Exception{
        System.out.println("我的国籍是"+str);
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
        System.out.println("静态方法");
    }
    public class Bird {

    }
}
