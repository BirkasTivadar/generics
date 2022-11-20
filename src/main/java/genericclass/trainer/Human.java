package genericclass.trainer;

public class Human implements HasName {
    private final String name;
    private final int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String name() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
