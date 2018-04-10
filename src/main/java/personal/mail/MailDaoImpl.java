package personal.mail;

import org.fluttercode.datafactory.impl.DataFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;

/**
 * @author Evgeny Borisov
 */

@Repository
public class MailDaoImpl implements MailDao {
    @Autowired
    private DataFactory dataFactory;

    public MailInfo getMailInfo() {
        return new MailInfo(dataFactory.getName(), dataFactory.getNumberBetween(1, 4));
    }
}
