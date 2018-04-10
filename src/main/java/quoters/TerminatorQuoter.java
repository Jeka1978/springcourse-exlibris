package quoters;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Film
public class TerminatorQuoter implements Quoter {

    private List<String> messages;

    @Value("${terminator}")
    public void setMessages(String text) {
        this.messages = new ArrayList<>(Arrays.asList(text.split(",")));
    }

    @PostConstruct
    public void printListSize(){
        System.out.println("size = "+messages.size());
    }


    @Override
    public void sayQuote() {
        for (String message : messages) {
            System.out.println(message);
        }
    }


    @PreDestroy
    public void killAll() {
        new Thread(() -> System.out.println("You are terminated")).start();

    }










}
