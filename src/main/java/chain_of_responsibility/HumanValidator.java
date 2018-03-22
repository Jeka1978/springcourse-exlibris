package chain_of_responsibility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Component
public class HumanValidator {

    @Autowired
    private List<Validator> validators;

    public void validateAll(Human human) {
        validators.forEach(validator -> validator.validate(human));
    }
}
