package my_junit;

import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author Evgeny Borisov
 */
public class TestRunner {


    @SneakyThrows
    public void createObjectAndRunAllTests(String className) {
        Class<?> clazz = Class.forName(className);
        Object o = clazz.newInstance();
        runAllTests(o);
    }

    @SneakyThrows
    public void runAllTests(Object o) {
        Class<?> clazz = o.getClass();

        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            int modifiers = method.getModifiers();
            if (!Modifier.isStatic(modifiers)) {
                if (method.getName().startsWith("test")) {
                    method.invoke(o);
                }
                RunThisMethod annotation = method.getAnnotation(RunThisMethod.class);
                if (annotation != null) {
                    int repeat = annotation.repeat();
                    for (int i = 0; i < repeat; i++) {
                        method.invoke(o);
                    }
                }
            }
        }

    }
}





