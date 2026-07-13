package questao2;

public class Table implements DocumentElement {
    private String content;

    public Table(String content) {
        this.content = content;
    }

    public String getContent() { return content; }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }
}
