package do_not_write_singletons;

import lombok.SneakyThrows;

/**
 * @author Evgeny Borisov
 */
public class MaamResolverImpl implements MaamResolver {
    private double maam;

    @SneakyThrows
    public MaamResolverImpl() {
        // go to MAS HAHNASA resolve maam
        Thread.sleep(3500);
        maam = 0.17;
    }



    @Override
    public double getMaam() {
        return maam;
    }
}
