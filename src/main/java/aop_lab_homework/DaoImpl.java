package aop_lab_homework;

import lombok.SneakyThrows;
import org.springframework.stereotype.Repository;

/**
 * @author Evgeny Borisov
 */
@Repository
public class DaoImpl implements Dao {
    @Override
    public void save() {
        System.out.println("saving...");
        throw new DataBaseWasKilledException("fire all dba");
    }
}
