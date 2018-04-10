package quoters.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
@Aspect
public class QuoterAspect {

    @Before("execution(* quoters..*.say*(..))")
    public void handleSayMethods(JoinPoint jp) {
        System.out.println(jp.getThis().getClass().getName());
        System.out.print("this is quote: "+jp.getTarget().getClass().getSimpleName());
    }

}
