package questao3;

public class AdaptadorDePagamento implements PagamentoDolar {
    private GatewayBancoBrasileiroLegado gateway;
    private static final double TAXA_CAMBIO = 5.0; // 1 Dólar = 5 Reais

    public AdaptadorDePagamento(GatewayBancoBrasileiroLegado gateway) {
        this.gateway = gateway;
    }

    public void pagarEmDolares(double valorDolar) {
        double valorConvertidoReal = valorDolar * TAXA_CAMBIO;
        gateway.realizarPagamentoEmReais(valorConvertidoReal);
    }
}