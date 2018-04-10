package java8;

import java.util.Arrays;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 5, 6, 9);
        integers.forEach(integer -> System.out.println(integer));
    }
}
