package more_aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @author Evgeny Borisov
 */
@Service
public class BankService {
    @Autowired
    private BankManager bankManager;

    @EventListener(ContextRefreshedEvent.class)
    public void doWork(){
        System.out.println("working...");
        Integer money = bankManager.bringMeMoney();
        System.out.println("money = " + money);
    }


}
