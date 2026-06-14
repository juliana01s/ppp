package questao4;

public class ProxyDeAcessoDocumento implements Documento {
    private DocumentoReal documentoReal;
    private String nomeDocumento;
    private String nivelAcessoUsuario;

    public ProxyDeAcessoDocumento(String nomeDocumento, String nivelAcessoUsuario) {
        this.nomeDocumento = nomeDocumento;
        this.nivelAcessoUsuario = nivelAcessoUsuario;
    }

    @Override
    public void lerConteudo() {

        if ("ADMIN".equalsIgnoreCase(nivelAcessoUsuario)) {
            if (documentoReal == null) {

                documentoReal = new DocumentoReal(nomeDocumento);
            }
            documentoReal.lerConteudo();
        } else {
            System.out.println("ERRO: acesso negado. O usuário não tem permissão para visualizar " + nomeDocumento);
        }
    }
}