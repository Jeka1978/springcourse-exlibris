package my_spring;

import lombok.Getter;
import lombok.ToString;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@ToString
@Getter
public class Hobbit {
    @InjectRandomInt(min = 3, max = 5)
    private int power;
    @InjectRandomInt(min = 10, max = 15)
    private int speed;

}
