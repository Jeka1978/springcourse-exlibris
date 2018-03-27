package quoters;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class TerminatorQuoter implements Quoter {
    @Setter
    private List<String> messages;

    public TerminatorQuoter(int x, int y) {
        System.out.println("x = " + x);
    }

    @Override
    public void sayQuote() {
        for (String message : messages) {
            System.out.println(message);
        }
    }


    public void killAll() {
        new Thread(() -> System.out.println("You are terminated")).start();

    }










}
