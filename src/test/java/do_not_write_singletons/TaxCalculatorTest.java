package do_not_write_singletons;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class TaxCalculatorTest {
    @Test
    public void withMaam() throws Exception {
        TaxCalculator taxCalculator = new TaxCalculator();
        MaamResolver maamResolver = Mockito.mock(MaamResolver.class);
        Mockito.when(maamResolver.getMaam()).thenReturn(0.17);
        taxCalculator.setMaamResolver(maamResolver);
        double withMaam = taxCalculator.withMaam(100);
        Assert.assertEquals(117,withMaam,0.00001);
    }



}