package my_spring;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class HobbitTest {

    @Test
    public void testThatInjectRandomIntIsWorking() throws Exception {
        Hobbit hobbit = ObjectFactory.getInstance().createObject(Hobbit.class);
        System.out.println(hobbit);
        Assert.assertFalse(hobbit.getSpeed()==0);
        Assert.assertFalse(hobbit.getPower()==0);
    }
}