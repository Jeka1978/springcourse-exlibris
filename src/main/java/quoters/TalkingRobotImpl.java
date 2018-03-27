package quoters;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Component
public class TalkingRobotImpl implements TalkingRobot {
    private final List<Quoter> quoters;

    @Autowired
    public TalkingRobotImpl(List<Quoter> quoters) {
        this.quoters = quoters;
    }


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
