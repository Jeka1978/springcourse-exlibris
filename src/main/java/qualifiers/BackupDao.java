package qualifiers;

import org.springframework.stereotype.Repository;

import static qualifiers.DB.ORACLE;

/**
 * @author Evgeny Borisov
 */
@ExlibrisRepo(ORACLE)
public class BackupDao implements Dao {
    @Override
    public void save() {
        System.out.println("saving to ORACLE db...");
    }
}
