import java.util.function.Consumer;

public class MailService<T> implements Consumer<Sendable> {



    public MailService(){

    }

    @Override
    public void accept(Sendable t) {
        System.out.println(t.get);
    }

   
}
