package my_junit;

/**
 * @author Evgeny Borisov
 */
public class MyTest {

    public void test1(){
        System.out.println("1111111");
    }

    public void test2(){
        System.out.println("2222222");
    }

    public static void test3(){
        System.out.println("3333333");
    }

    @RunThisMethod(repeat = 7)
    public void stam(){
        System.out.println("STAM!!!");
    }


}
