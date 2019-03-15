package ClassDemo;

public class Dogg {
    private String name;
    private int age;
    private String color;

    public Dogg(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    private String eat(String s) {
        return "I eat "+ s;
    }

    public Dogg() {
    }

    @Override
    public String toString() {
        return "Dogg{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
