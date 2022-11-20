package genericinterface.trainer;

import java.util.List;

public class Summarizer {

    public static int sum(List<?> list, ValueExtractor extractor) {
        int sum = 0;
        for (Object object : list) {
            int value = extractor.extract(object);
            sum += value;
        }
        return sum;
    }
}
