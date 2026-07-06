package questao2;

public class PedidoOnline extends Pedido {

    public PedidoOnline(int quantidade, double valorItem) {
        super(quantidade, valorItem);
    }

    @Override
    protected void processarPagamento(double valorTotal) {
        System.out.println("pagamento online processado no valor de R$ " + valorTotal + " via Cartão de Crédito/PIX.");
    }

    @Override
    protected void decidirEntrega() {
        System.out.println("envio via correios/transportadora.");
    }
}