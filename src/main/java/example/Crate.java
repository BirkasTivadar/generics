package example;

import java.util.ArrayList;
import java.util.List;

public class Crate<T> {
    private T content;

    public T lookIntoCrate() {
        return content;
    }

    public void packCrate(T content) {
        this.content = content;
    }

    public static void main(String[] args) {

        Crate<Zebra> crateForZebra = new Crate<>();

        crateForZebra.packCrate(new Zebra("Adra", 21));

        Zebra zebra = crateForZebra.lookIntoCrate();

        System.out.println(zebra);

        Crate<Treasure> crateForTreasure = new Crate<>();

        List<Crate<Treasure>> list = new ArrayList<>();
    }
}
