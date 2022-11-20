package examplewithbounds;

public class Crate<T extends CanMakeSound> {
    private T content;

    public T lookIntoCrate() {
        return content;
    }

    public void packCrate(T content) {
        this.content = content;
    }

    public String listenIntoCrate() {
        return content.makesound();
    }

    public static void main(String[] args) {

        Crate<Zebra> crateForZebra = new Crate<>();

        crateForZebra.packCrate(new Zebra("Adra", 21));

        Zebra zebra = crateForZebra.lookIntoCrate();

        System.out.println(zebra);
        System.out.println(crateForZebra.listenIntoCrate());
        System.out.println(zebra.makesound());
//
//        Crate<Treasure> crateForTreasure = new Crate<>();
//
//        List<Crate<Treasure>> list = new ArrayList<>();
    }
}
