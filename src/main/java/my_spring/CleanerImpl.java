package my_spring;

/**
 * @author Evgeny Borisov
 */
public class CleanerImpl implements Cleaner {

    @InjectRandomInt(min = 4, max = 9)
    private int repeat;

    @Override
    public void clean() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("VVVVVVVVVVVVVVvvvvvvvvvvvvvvvv");
        }
    }
}
