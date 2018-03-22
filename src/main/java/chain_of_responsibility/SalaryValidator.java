package chain_of_responsibility;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class SalaryValidator implements Validator {
    @Override
    public void validate(Human human) {
        if (human.getSalary() < 0) {
            System.out.println("salary can't be negative...");
        }
    }
}
