package genericmethod.example;

public class Crate<T> {
    private T content;

    public T lookIntoCrate() {
        return content;
    }

    public void packCrate(T content) {
        this.content = content;
    }

    public static <T> Crate<T> ship(T t) {
        Crate<T> crate = new Crate();
        crate.packCrate(t);
        return crate;
    }

    public static void main(String[] args) {
        ship(new Zebra("Bugar", 22));
    }

}
