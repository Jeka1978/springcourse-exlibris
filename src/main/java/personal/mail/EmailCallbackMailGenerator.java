package personal.mail;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component("mail2")
public class EmailCallbackMailGenerator implements MailGenerator {
    public String generateBody(MailInfo mailInfo) {
        return "don't call us we call you";
    }
}
