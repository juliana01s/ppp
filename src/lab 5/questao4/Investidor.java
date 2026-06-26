package questao4;

public class Investidor implements InvestidorObserver {
    private String nome;
    private double limiteMinimo;
    private double limiteMaximo;
    private AcaoBroker broker;

    public Investidor(String nome, double limiteMinimo, double limiteMaximo, AcaoBroker broker) {
        this.nome = nome;
        this.limiteMinimo = limiteMinimo;
        this.limiteMaximo = limiteMaximo;
        this.broker = broker;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void atualizar(Acao acao, double precoAtual) {
        if (precoAtual >= limiteMaximo) {
            System.out.println(nome + " notificado: Limite máximo atingido na ação " + acao.getNome());
            broker.venderAcao(acao, this);
        } else if (precoAtual <= limiteMinimo) {
            System.out.println(nome + " notificado: limite mínimo atingido na ação " + acao.getNome());
            broker.comprarAcao(acao, this);
        }
    }
}