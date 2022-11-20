package genericclass.trainer;

import java.util.List;

public class NameConcatenator {

//    public String concat(List<Object> list) { // Ez azért nem jó, mert ugyan az Object-nek leszármazottja a Human, a List<Object>-nek nem leszármazottja a List<Human>, így egy Human-okat tartalmazó listát nem tudok átadni a függvénynek.
//    public String concat(List<?> list) { // Ez sem jó, mert ha pl. egy String listát adunk át, lefordul ugyan, de futás közben egy classCastException-t kapunk, mert a Stringet nem tudja HasName-nek castolni


    public String concat(List<? extends HasName> list) {
        StringBuilder sb = new StringBuilder();
        for (Object o : list) {
            sb.append(((HasName) o).getName()).append(", ");
        }
        int index = sb.toString().length();
        return sb.substring(0, index - 2);
    }

    public void add(List<? super Trainer> list) {   // Így Human listát is át tudok adni paraméterként
        list.add(new Trainer("Jack", 34));
    }
}