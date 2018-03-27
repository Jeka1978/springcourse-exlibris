package quoters;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
//@Service
public class MyService {

    @Scheduled(fixedDelay = 2000)
    public void doWork(){
        System.out.println("Working...");
    }
}
