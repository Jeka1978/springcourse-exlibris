package personal.mail;

/**
 * @author Evgeny Borisov
 */
public interface MailGenerator {
    String generateBody(MailInfo mailInfo);
    int getMyCode();
    boolean isEnabled();

    void setEnabled(boolean enabled);
}
