package chain_of_responsibility;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan(basePackages = "chain_of_responsibility")
public class Conf {


    public static void main(String[] args) {

        Human yossi = Human.builder().age(138).salary(-20).name("yossi").build();


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Conf.class);
        HumanValidator validator = context.getBean(HumanValidator.class);
        validator.validateAll(yossi);

    }
}
