package questao4;

public class Main {
    public static void main(String[] args) {
        System.out.println("tentativa com usuario comum:");
        Documento docComum = new ProxyDeAcessoDocumento("Relatorio_Anual.pdf", "ESTAGIARIO");
        docComum.lerConteudo();

        System.out.println("\ntentativa com adm:");
        Documento docAdmin = new ProxyDeAcessoDocumento("Relatorio_Anual.pdf", "ADMIN");
        docAdmin.lerConteudo();
    }
}