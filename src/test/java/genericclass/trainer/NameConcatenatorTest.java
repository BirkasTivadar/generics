package genericclass.trainer;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NameConcatenatorTest {

    @Test
    void testConcat() {
        List<Human> humans = Arrays.asList(new Human("John", 42), new Human("Jack", 33), new Human("Jane", 23));
        String testHumansList = new NameConcatenator().concat(humans);

        assertEquals("John, Jack, Jane", testHumansList);

//        List<String> stringList = Arrays.asList("John", "Jack", "Doe");
//        String testStringsList = new NameConcatenator().concat(stringList);
    }

    @Test
    void testAdd() {
        List<Human> humans = new ArrayList<>();
        new NameConcatenator().add(humans);
        assertEquals("Jack", humans.get(0).getName());

        List<Trainer> trainers = new ArrayList<>();
        new NameConcatenator().add(trainers);
        assertEquals(34, trainers.get(0).getAge());
    }
}