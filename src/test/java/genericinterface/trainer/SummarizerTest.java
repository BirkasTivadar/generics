package genericinterface.trainer;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SummarizerTest {
    @Test
    void testSum() {
        List<Integer> integerList = Arrays.asList(1, 3, 5, 6, 8);

        int sumIntegers = Summarizer.sum(integerList, new ValueExtractor<Integer>() {
            @Override
            public int extract(Integer object) {
                return object;
            }
        });
        assertEquals(23, sumIntegers);


        List<String> stringList = Arrays.asList("John", "Doe");
        int sumStringsLength = Summarizer.sum(stringList, new ValueExtractor<String>() {
            @Override
            public int extract(String object) {
                return object.length();
            }
        });
        assertEquals(7, sumStringsLength);

        int sumFirstCharactersValue = Summarizer.sum(stringList, new ValueExtractor<String>() {
            @Override
            public int extract(String object) {
                return object.charAt(0);
            }
        });
        assertEquals('J'+'D', sumFirstCharactersValue);
    }
}