package qualifiers;

import static qualifiers.DB.MONGO;

/**
 * @author Evgeny Borisov
 */
@ExlibrisRepo(MONGO)
public class DaoImpl implements Dao {
    @Override
    public void save() {
        System.out.println("saving to Mongo");
    }
}
