package screen.saver;

import org.springframework.context.annotation.*;

import java.awt.*;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
//@ImportResource("classpath:applicationContext.xml")
public class ScreenSaverConfig {
    @Bean
    public Random random(){
        return new Random();
    }

    @Bean
    @Scope(value = "prototype",proxyMode = ScopedProxyMode.TARGET_CLASS)
    public Color color(){
        return new Color(random().nextInt(255), random().nextInt(255), random().nextInt(255));
    }



    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScreenSaverConfig.class);
        while (true) {
            context.getBean(ColorFrame.class).moveToRandomLocation();
            Thread.sleep(70);
        }
    }
}
