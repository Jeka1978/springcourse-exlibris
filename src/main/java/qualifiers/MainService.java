package qualifiers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class MainService {
    @Autowired
    private Dao backupDao;
    @Autowired
    private Dao mainDao;

    @Scheduled(fixedDelay = 1000)
    public void doWork(){
        System.out.println("Working...");
        mainDao.save();
    }

    @Scheduled(fixedDelay = 3000)
    public void doBackup(){
        System.out.println("backuping...");
        backupDao.save();
    }
}





