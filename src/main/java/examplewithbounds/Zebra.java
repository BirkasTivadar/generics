package examplewithbounds;

public class Zebra  implements CanMakeSound {

    private String name;

    private int numberOfStripes;

    public Zebra(String name, int numberOfStripes) {
        this.name = name;
        this.numberOfStripes = numberOfStripes;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    @Override
    public String makesound() {
        return "Nyihaha";
    }
}
