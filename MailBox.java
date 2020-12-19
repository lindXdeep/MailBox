import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class MailBox<T> extends LinkedHashMap<String, List<T> > {

    public MailBox() {
        super( new HashMap<String, List<T>>() );
    } 
}
