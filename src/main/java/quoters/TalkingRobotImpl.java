package quoters;

import lombok.Setter;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class TalkingRobotImpl implements TalkingRobot {
    @Setter
    private List<Quoter> quoters;


//    @Transactional
    @EventListener(ContextRefreshedEvent.class)
    public void initCache(){
        System.out.println("Cache was initialized with transaction");
    }


    @Override
    @PostConstruct
    public void talk() {
        quoters.forEach(Quoter::sayQuote);
        /*for (Quoter quoter : quoters) {
            quoter.sayQuote();
        }*/
    }
}
