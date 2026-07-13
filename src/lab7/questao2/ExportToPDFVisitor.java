package questao2;

public class ExportToPDFVisitor implements DocumentVisitor {
    @Override
    public void visit(Paragraph paragraph) {
        System.out.println("[PDF: ajustando parágrafo...] " + paragraph.getText());
    }

    @Override
    public void visit(Image image) {
        System.out.println("[PDF: desenhando imagem...] " + image.getSrc());
    }

    @Override
    public void visit(Table table) {
        System.out.println("[PDF: desenhando tabela...] " + table.getContent());
    }
}