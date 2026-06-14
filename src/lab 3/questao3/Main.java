package questao3;

public class Main {
    public static void main(String[] args) {
        GatewayBancoBrasileiroLegado sistemaLegado = new GatewayBancoBrasileiroLegado();
        PagamentoDolar pagamento = new AdaptadorDePagamento(sistemaLegado);

        System.out.println("processando uma compra de U$ 20.00...");
        pagamento.pagarEmDolares(20.00);
    }
}