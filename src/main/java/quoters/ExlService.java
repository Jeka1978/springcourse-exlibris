package quoters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Component
public class ExlService {
    @Autowired
    private ExlService proxy;

    @EventListener(ContextRefreshedEvent.class)
    public void start(){
        System.out.println("bla bla");
        proxy.sayWord();
    }

    public void sayWord() {
        System.out.println("THIS IS A PROBLEM");
    }
}
