package more_aop;

import more_aop.annotations.Secured;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class BankManagerImpl implements BankManager {
    @Override
    @Secured
    public int bringMeMoney() {
        return 200;
    }
}
