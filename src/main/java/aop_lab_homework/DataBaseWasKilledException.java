package aop_lab_homework;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
public class DataBaseWasKilledException extends RuntimeException {
    public DataBaseWasKilledException(String message) {
        super(message);
    }
}
