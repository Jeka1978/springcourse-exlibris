package java8;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class ListUtilsTest {
    @Test
    public void countDuplicates() throws Exception {
        List<String> strings = Arrays.asList("java", "scala", "groovy", "JAVA", "JaVa");
        int count = ListUtils.countDuplicates("java", strings, (s, t1) -> s.equalsIgnoreCase(t1));
        Assert.assertEquals(3,count);
    }

}