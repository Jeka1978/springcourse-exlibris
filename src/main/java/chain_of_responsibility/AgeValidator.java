package chain_of_responsibility;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class AgeValidator implements Validator {
    @Override
    public void validate(Human human) {
        if (human.getAge() >130) {
            System.out.println("you are dead");
        }
    }
}
