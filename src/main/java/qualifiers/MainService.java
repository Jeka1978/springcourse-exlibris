package qualifiers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import static qualifiers.DB.MONGO;
import static qualifiers.DB.ORACLE;

/**
 * @author Evgeny Borisov
 */
@Service
public class MainService {
    @ExlibrisRepo(DB.ORACLE)
    private Dao backupDao;
    @ExlibrisRepo(MONGO)
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





