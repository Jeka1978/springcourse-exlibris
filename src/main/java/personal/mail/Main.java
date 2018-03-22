package personal.mail;

import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j;

/**
 * @author Evgeny Borisov
 */
@Log4j
public class Main {
    @SneakyThrows
    public static void main(String[] args) {
       /* Human person = Human.builder().name("Jeka").age(39).salary(30).beer("Tuborg",2).beer("Leff",4).build();
        log.info(person.toString());
        System.out.println(person);*/

        MailSender mailSender = new MailSender();
        while (true) {
            mailSender.sendMail();
            Thread.sleep(1000);
        }

    }
}

