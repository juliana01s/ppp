package questao1;

public class BoletoPagamento implements PagamentoStrategy {
    @Override
    public void realizaPagamento(double valor) {
        System.out.println("pagamento de R$" + valor + "via boleto bancario [aguardando pagamento]");
    }
}
