import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        MailMessage firstMessage = new MailMessage("john", "tom", "msg1");
        MailMessage secondMessage = new MailMessage("tom", "john", "msg2");
        MailMessage thirdMessage = new MailMessage("bill", "lue", "msg3");

        assert firstMessage.getFrom().equals("Robert Howard") : "Wrong firstMessage from address";
        assert firstMessage.getTo().equals("H.P. Lovecraft") : "Wrong firstMessage to address";
        assert firstMessage.getContent().endsWith("Howard!") : "Wrong firstMessage content ending";

        List<MailMessage> messages = Arrays.asList(firstMessage, secondMessage, thirdMessage);

        // Создание почтового сервиса.
        MailService<String> mailService = new MailService<>();

        // Обработка списка писем почтовым сервисом
        messages.stream().forEachOrdered(mailService);
 
    }
}