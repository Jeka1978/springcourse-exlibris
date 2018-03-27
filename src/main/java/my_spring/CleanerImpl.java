package my_spring;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Benchmark
public class CleanerImpl implements Cleaner {

    @InjectRandomInt(min = 4, max = 9)
    private int repeat;

    @PostConstruct
    public void init() {
        System.out.println("repeat = " + repeat);
    }

    @Override
    public void clean() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("VVVVVVVVVVVVVVvvvvvvvvvvvvvvvv");
        }
    }
}
