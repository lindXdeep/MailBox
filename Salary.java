public class Salary extends AbstractSendable {

    private final Integer content;

    public Salary(String from, String to, Integer content) {
        super(from, to);
        this.content = content;
    }

    public Integer getContent() {
        return content;
    }
}
