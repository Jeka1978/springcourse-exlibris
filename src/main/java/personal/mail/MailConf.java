package personal.mail;

import org.fluttercode.datafactory.impl.DataFactory;
import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
@EnableScheduling
public class MailConf {

    @Bean
    public DataFactory dataFactory(){
        return new DataFactory();
    }




    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(MailConf.class);
    }


}
