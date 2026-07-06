package questao2;

public abstract class Pedido {
    protected int quantidade;
    protected double valorItem;

    public Pedido(int quantidade, double valorItem) {
        this.quantidade = quantidade;
        this.valorItem = valorItem;
    }

    public final void processarPedido() {
        double valorTotal = calcularTotal();
        System.out.println("Valor total calculado: R$ " + valorTotal);
        processarPagamento(valorTotal);
        decidirEntrega();
    }

    private double calcularTotal() {
        return this.quantidade * this.valorItem;
    }

    protected abstract void processarPagamento(double valorTotal);
    protected abstract void decidirEntrega();
}