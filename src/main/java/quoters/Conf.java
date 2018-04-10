package quoters;

import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Evgeny Borisov
 */

@Configuration
@EnableScheduling
@PropertySource("classpath:quotes.properties")
@ComponentScan
@EnableAspectJAutoProxy
public class Conf {
}
