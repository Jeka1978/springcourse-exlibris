package personal.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */
@Service
public class MailSender {
    @Autowired
    private MailDao mailDao;

    private Map<Integer, MailGenerator> map = new HashMap<>();

    @Autowired
    public MailSender(List<MailGenerator> mailGenerators) {
        for (MailGenerator mailGenerator : mailGenerators) {
            int myCode = mailGenerator.getMyCode();
            if (map.containsKey(myCode)) {
                throw new RuntimeException(myCode + " already in use");
            }
            map.put(myCode, mailGenerator);
        }
    }

    @Scheduled(fixedDelay = 1000)
    public void sendMail() {
        MailInfo mailInfo = mailDao.getMailInfo();
        int mailCode = mailInfo.getMailCode();
        MailGenerator mailGenerator = map.get(mailCode);
        if (mailGenerator == null) {
            throw new RuntimeException(mailCode + " is not supported yet...");
        }
        if (mailGenerator.isEnabled()) {
            String body = mailGenerator.generateBody(mailInfo);
            send(body);
        }


    }

    private void send(String body) {
        System.out.println("sending... +<html>"+body+"<html>");
    }
}
