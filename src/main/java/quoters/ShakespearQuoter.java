package quoters;

import lombok.Setter;
import my_spring.InjectRandomInt;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * @author Evgeny Borisov
 */
public class ShakespearQuoter implements Quoter {
    @Setter
    private String message;

    @InjectRandomInt(min = 3, max = 7)
    private int repeat;

    @Override

    @Scheduled(fixedDelay = 60 * 1000)
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println(message);
        }
    }
}



