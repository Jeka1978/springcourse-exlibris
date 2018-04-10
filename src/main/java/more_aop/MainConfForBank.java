package more_aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class MainConfForBank {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(MainConfForBank.class);
    }

}
