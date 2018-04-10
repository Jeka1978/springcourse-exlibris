package more_aop.aop;

import aop_lab_homework.DataBaseWasKilledException;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Aspect
@Component
public class SecurityAspect {
    private Random random = new Random();




    @Around("@annotation(more_aop.annotations.Secured)")
    public Object handleSecuredMethods(ProceedingJoinPoint pjp) throws Throwable {
        if (random.nextBoolean()) {
            return pjp.proceed(new String[]{"sddsfdf",});
        }else {
            throw new SecurityException("not allowed here try again!!");
        }



    }
}
