package my_junit;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        double a = 1.1;
        double b = 1.3;
        System.out.println(a+b);
        TestRunner testRunner = new TestRunner();
        testRunner.createObjectAndRunAllTests("my_junit.MyTest");
    }

}
