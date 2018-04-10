package personal.mail;

import org.fluttercode.datafactory.impl.DataFactory;

/**
 * @author Evgeny Borisov
 */

public class MailDaoImpl implements MailDao {
    private DataFactory dataFactory = new DataFactory();
    public MailInfo getMailInfo() {
        return new MailInfo(dataFactory.getName(), dataFactory.getNumberBetween(1, 3));
    }
}
