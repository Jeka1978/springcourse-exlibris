package aop_lab_homework;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class MainService {
    @Autowired
    private Dao dao;

    @EventListener(ContextRefreshedEvent.class)
    public void doWork(){
        System.out.println("Working...");
        try {
            dao.save();
        } catch (Exception e) {
            System.out.println("please don't fail we will try once more");
        }
    }
}
