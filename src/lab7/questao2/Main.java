package questao2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<DocumentElement> documento = Arrays.asList(
                new Paragraph("testando paragrafo"),
                new Image("diagrama_visitor.png"),
                new Table("Dados Resultados Conclusão")
        );

        DocumentVisitor exportHtml = new ExportToHTMLVisitor();
        DocumentVisitor exportPdf = new ExportToPDFVisitor();
        WordCountVisitor wordCount = new WordCountVisitor();

        System.out.println("exportando para HTML...");
        for (DocumentElement el : documento) {
            el.accept(exportHtml);
        }

        System.out.println("\nexportando para PDF...");
        for (DocumentElement el : documento) {
            el.accept(exportPdf);
        }

        System.out.println("\ncontagem de palavras...");
        for (DocumentElement el : documento) {
            el.accept(wordCount);
        }
        System.out.println("total de palavras no documento: " + wordCount.getWordCount());
    }
}