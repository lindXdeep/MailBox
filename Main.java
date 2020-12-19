import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        MailMessage one = new MailMessage("john", "tom", "msg1");
        MailMessage two = new MailMessage("tom", "john", "msg2");
        MailMessage thre = new MailMessage("bill", "lue", "msg3");
        MailMessage fore = new MailMessage("karl", "mikl", "msg4");

        assert one.getFrom().equals("Robert Howard") : "Wrong firstMessage from address";
        assert one.getTo().equals("H.P. Lovecraft") : "Wrong firstMessage to address";
        assert one.getContent().endsWith("Howard!") : "Wrong firstMessage content ending";

        messages.stream().forEach(x -> System.out.println(x.getContent()));

 

   
    }
}