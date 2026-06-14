package questao4;

public class DocumentoReal implements Documento {
    private String nomeDocumento;

    public DocumentoReal(String nomeDocumento) {
        this.nomeDocumento = nomeDocumento;
        carregarDoServidor();
    }

    private void carregarDoServidor() {
        System.out.println("carregando o documento " + nomeDocumento + " da rede local...");
    }

    @Override
    public void lerConteudo() {
        System.out.println("conteudo do Documento: [DADOS SIGILOSOS FINANCEIROS]");
    }
}