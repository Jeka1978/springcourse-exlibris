package my_spring;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
public class IRobot {
    @InjectByType
    private Speaker speaker;
    @InjectByType
    private Cleaner cleaner;


    @PostConstruct
    public void init() {
        System.out.println(cleaner.getClass().getName());
    }

    public void cleanRoom() {
        speaker.speak("I started my work");
        cleaner.clean();
        speaker.speak("I finished my work");
    }
}
