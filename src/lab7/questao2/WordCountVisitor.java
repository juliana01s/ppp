package questao2;

public class WordCountVisitor implements DocumentVisitor {
    private int wordCount = 0;

    @Override
    public void visit(Paragraph paragraph) {
        wordCount += paragraph.getText().split("\\s+").length;
    }

    @Override
    public void visit(Image image) {
    }

    @Override
    public void visit(Table table) {
        wordCount += table.getContent().split("\\s+").length;
    }

    public int getWordCount() {
        return wordCount;
    }
}