package questao4;

public class AcaoBroker {
    public void venderAcao(Acao acao, Investidor investidor) {
        System.out.println("broker: vendendo ação " + acao.getNome() + "para o investidor " + investidor.getNome()
                + "ao preço de R$" + acao.getPreco());
    }

    public void comprarAcao(Acao acao, Investidor investidor) {
        System.out.println("broker: comprando ação " + acao.getNome() + "para o investidor " + investidor.getNome()
                + "ao preço de R$" + acao.getPreco());
    }
}
