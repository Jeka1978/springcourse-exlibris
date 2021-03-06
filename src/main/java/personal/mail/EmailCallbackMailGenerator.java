package personal.mail;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class EmailCallbackMailGenerator implements MailGenerator {
    @Setter
    @Getter
    private boolean enabled;
    public String generateBody(MailInfo mailInfo) {
        return "don't call us we call you";
    }

    @Override
    public int getMyCode() {
        return 2;
    }
}
