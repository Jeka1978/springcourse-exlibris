package chain_of_responsibility;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class NameValidator implements Validator {
    @Override
    public void validate(Human human) {
        if (Character.isLowerCase(human.getName().charAt(0))) {
            System.out.println("Name should start with Upper case");
        }
    }
}
