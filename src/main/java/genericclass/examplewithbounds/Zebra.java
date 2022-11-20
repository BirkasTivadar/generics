package genericclass.examplewithbounds;

public record Zebra(String name, int numberOfStripes) implements CanMakeSound {

    @Override
    public String makesound() {
        return "Nyihaha";
    }
}
