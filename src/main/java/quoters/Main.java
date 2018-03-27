package quoters;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(Conf.class);
//        context.close();
//        context.getBeansWithAnnotation(Service.class)


        /*String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println("name = " + name);
        }*/
    }
}
