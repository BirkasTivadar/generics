package genericinterface.example;

import genericmethod.example.Crate;

public class OderedPair<K, V> implements Pair<K, V> {
    private final K key;
    private final V value;

    public OderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    Pair<String, Integer> stringIntegerPair = new OderedPair<>("Even", 8);

    Pair<String, String> stringStringPair = new OderedPair<>("hello", "world");
}
