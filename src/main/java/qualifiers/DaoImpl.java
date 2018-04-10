package qualifiers;

import org.springframework.stereotype.Repository;

/**
 * @author Evgeny Borisov
 */
@Repository
public class DaoImpl implements Dao {
    @Override
    public void save() {
        System.out.println("saving to Mongo");
    }
}
