import java.util.function.Consumer;

public class MailService<T> implements Consumer<MailMessage> {


    public MailService(){

    }

    @Override
    public void accept(MailMessage t) {
        System.out.println(t.getContent());
    }
}
