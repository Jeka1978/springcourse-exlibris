package quoters;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Evgeny Borisov
 */

@Configuration
@EnableScheduling
@PropertySource("classpath:quotes.properties")
@ComponentScan
public class Conf {
}
