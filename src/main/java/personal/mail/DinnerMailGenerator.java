package personal.mail;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class DinnerMailGenerator implements MailGenerator {
    @Setter
    @Getter
    private boolean enabled;
    @Override
    public String generateBody(MailInfo mailInfo) {
        return "Dinner is planned to 12:30";
    }

    @Override
    public int getMyCode() {
        return 3;
    }
}
