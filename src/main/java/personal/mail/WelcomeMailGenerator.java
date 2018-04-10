package personal.mail;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class WelcomeMailGenerator implements MailGenerator {
    @Setter
    @Getter
    private boolean enabled = true;
    public String generateBody(MailInfo mailInfo) {
        return "Welcome " + mailInfo.getClientName() + " !!!";
    }

    @Override
    public int getMyCode() {
        return 1;
    }
}
