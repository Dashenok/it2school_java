package lesson_2;

import lesson_2.daria.Task2_1;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@DisplayName("Task2_1 Class Tests")
public class Task2_1Test {

    @Test
    public void testMainNegative() throws IOException {
        final InputStream original = System.in;
        final FileInputStream fips = new FileInputStream(new File("/Users/dstruts/Documents/It2School_Java/it2school_java/src/main/resources/Task2_1_Negative.txt"));
        System.setIn(fips);
        Task2_1.main(null);
        System.setIn(original);
    }

    @Test
    public void testMainPositive() throws IOException {
        final InputStream original = System.in;
        final FileInputStream fips = new FileInputStream(new File("/Users/dstruts/Documents/It2School_Java/it2school_java/src/main/resources/Task2_1_Positive.txt"));
        System.setIn(fips);
        Task2_1.main(null);
        System.setIn(original);
    }
}
