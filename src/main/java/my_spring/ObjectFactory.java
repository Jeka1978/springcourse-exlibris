package my_spring;

import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * @author Evgeny Borisov
 */
public class ObjectFactory {
    private static ObjectFactory ourInstance = new ObjectFactory();
    private Config config = new JavaConfig();
    private Reflections scanner = new Reflections("my_spring");
    private List<ObjectConfigurator> configurators = new ArrayList<>();

    public static ObjectFactory getInstance() {
        return ourInstance;
    }

    @SneakyThrows
    private ObjectFactory() {
        Set<Class<? extends ObjectConfigurator>> classes = scanner.getSubTypesOf(ObjectConfigurator.class);
        for (Class<? extends ObjectConfigurator> aClass : classes) {
            if (!Modifier.isAbstract(aClass.getModifiers())) {
                configurators.add(aClass.newInstance());
            }
        }
    }


    @SneakyThrows
    public <T> T createObject(Class<T> type) {
        type = resolveImpl(type);
        T t = type.newInstance();
        configure(t);
        //todo add logic which will invoke all methods of t object
        return t;

    }

    private <T> void configure(T t) {
        for (ObjectConfigurator configurator : configurators) {
            configurator.configure(t);
        }
//        configurators.forEach(configurator -> configurator.configure(t));
        // the same with Java 8
    }

    private <T> Class<T> resolveImpl(Class<T> type) {
        if (type.isInterface()) {
            Class<T> implClass = config.getImplClass(type);
            if (implClass == null) {
                Set<Class<? extends T>> classes = scanner.getSubTypesOf(type);
                if (classes.size() != 1) {
                    throw new RuntimeException("0 or more than one impl of " + type + " was found. Please update your config");
                }
                implClass = (Class<T>) classes.iterator().next();
            }
            type = implClass;
        }
        return type;
    }


}
