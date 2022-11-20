package genericclass.trainer;

public class Subject implements HasName {

    private final String name;

    public Subject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
