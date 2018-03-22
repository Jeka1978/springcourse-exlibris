package my_spring;

import lombok.SneakyThrows;

/**
 * @author Evgeny Borisov
 */
public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        IRobot robot = ObjectFactory.getInstance().createObject(IRobot.class);
        robot.cleanRoom();
    }
}
