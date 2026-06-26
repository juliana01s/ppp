package questao4;

public interface AcaoSubject {
    void registrarInvestidor(InvestidorObserver i);

    void removerInvestidor(InvestidorObserver i);

    void notificarInvestidores();
}
