import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        List<String> messages = new ArrayList<>();
            messages.add("msg1");
            messages.add("msg2");
            messages.add("msg3");
            messages.add("msg4");

        MailBox<String> box =new MailBox<>();
            box.put("john", messages);
            box.put("tom", messages);
            box.put("lue", messages);
            box.put("pet", messages);


        System.out.println(box.get("pet"));

    }
}