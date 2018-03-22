package strategy;

import lombok.Setter;
import lombok.experimental.Delegate;

/**
 * @author Evgeny Borisov
 */
public class RadioAlarmImpl implements Radio, Alarm {
    @Delegate
    @Setter
    private Alarm alarm = new AlarmImpl();
    @Delegate
    private Radio radio = new RadioImpl();

}
