package genericinterface.trainer;

import java.util.List;

public class Summarizer {

    public static <T> int sum(List<T> list, ValueExtractor<T> extractor) {
        int sum = 0;
        for (T object : list) {
            int value = extractor.extract(object);
            sum += value;
        }
        return sum;
    }
}
