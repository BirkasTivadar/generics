package genericclass.trainer;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContainerTest {

    @Test
    void testCreate() {
        Container<Human> humanContainer = new Container<>(new Human("John Doe", 25));
        assertEquals(humanContainer.getValue().getClass(), Human.class);
        assertEquals("John Doe", humanContainer.getName());

        Container<Subject> subjectContainer = new Container<>(new Subject("Java"));
        assertEquals(subjectContainer.getValue().getClass(), Subject.class);
        assertEquals("Java", subjectContainer.getName());

        List<Container<Subject>> containerList = new ArrayList<>();
        containerList.add(subjectContainer);
        assertEquals(containerList.get(0).getValue().getClass(), Subject.class);

        List<String> stringList = new ArrayList<>(Arrays.asList("John", "Jack", "Jane"));
        List listWithoutType = stringList;
        System.out.println(listWithoutType.get(0).getClass());

        String john = (String) listWithoutType.get(0); // típuskényszerítés kell, mert a listWithouType-nak nem adtunk meg generikus típust, és így bármilyen odjektumot beletehetünk
        listWithoutType.add(0, 10);
        System.out.println(listWithoutType.get(0).getClass());

        List<String>[] lists = new List[5]; // A tömbök ilyen típusú használata kerülendő
    }

    public void printList(List<String>... stringLists) {
        Object[] array = stringLists; // mivel a metódus fejben átadott értékek tömbként kerülnek átadásra, itt el is vész a típusmegkötés
        array[0] = Arrays.asList(42);
        array[1] = Arrays.asList(new Human("Jane", 23)); // bármilyen elemet bele lehet tenni, metóduson belül
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        ContainerTest test = new ContainerTest();
        test.printList(new ArrayList<>(Arrays.asList("John", "Jack", "Jane")), new ArrayList<>(Arrays.asList("John", "Jack", "Jane")));

    }


}