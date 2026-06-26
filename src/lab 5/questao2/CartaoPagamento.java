package questao2;

public class CartaoPagamento implements PagamentoStrategy {
    @Override
    public void realizaPagamento(double valor) {
        System.out.println("pagamento deR$" + valor + "via cartao de credito [aprovado]");
    }

}
