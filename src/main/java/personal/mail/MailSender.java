package personal.mail;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */
@Service
public class MailSender {
    private MailDao mailDao = new MailDaoImpl();

    private Map<String, MailGenerator> map = new HashMap<>();


    public void sendMail() {
        MailInfo mailInfo = mailDao.getMailInfo();
        int mailCode = mailInfo.getMailCode();



    }

    private void send(String body) {
        System.out.println("sending... +<html>"+body+"<html>");
    }
}
