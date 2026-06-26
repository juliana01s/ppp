package questao2;

public class PixPagamento implements PagamentoStrategy {
    @Override
    public void realizaPagamento(double valor) {
        System.out.println("pagamento de R$" + valor + "via pix [aprovado].");
    }
}
