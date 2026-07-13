package questao2;

public class ExportToHTMLVisitor implements DocumentVisitor {
    @Override
    public void visit(Paragraph paragraph) {
        System.out.println("<p>" + paragraph.getText() + "</p>");
    }

    @Override
    public void visit(Image image) {
        System.out.println("<img src=\"" + image.getSrc() + "\" />");
    }

    @Override
    public void visit(Table table) {
        System.out.println("<table><tr><td>" + table.getContent() + "</td></tr></table>");
    }
}