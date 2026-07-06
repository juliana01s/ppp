package questao2;

public class PedidoCriptomoedas extends Pedido {

    public PedidoCriptomoedas(int quantidade, double valorItem) {
        super(quantidade, valorItem);
    }

    @Override
    protected void processarPagamento(double valorTotal) {
        System.out.println("pagamento processado no valor de R$ " + valorTotal + " em BTC/ETH.");
    }

    @Override
    protected void decidirEntrega() {
        System.out.println("envio liberado após a confirmação da transação na rede.");
    }
}