package quoters;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.close();


        /*String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println("name = " + name);
        }*/
    }
}
