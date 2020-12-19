public class MailMessage extends AbstractSendable {

    private final String content;

    public MailMessage(String from, String to, String content) {
        super(from, to);
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
