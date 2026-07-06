package questao2;

public class PedidoLoja extends Pedido {

    public PedidoLoja(int quantidade, double valorItem) {
        super(quantidade, valorItem);
    }

    @Override
    protected void processarPagamento(double valorTotal) {
        System.out.println("pagamento processado no valor de R$ " + valorTotal + " no caixa da loja.");
    }

    @Override
    protected void decidirEntrega() {
        System.out.println("retirada (sem frete).");
    }
}