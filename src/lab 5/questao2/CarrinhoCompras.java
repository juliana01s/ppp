package questao2;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Item> itens = new ArrayList<>();

    public void adicionaItem(Item item) {
        itens.add(item);
    }

    public void removeItem(Item item) {
        itens.remove(item);
    }

    public double calculaTotal() {
        double soma = 0;
        for (Item item : itens) {
            soma += item.getPreco();
        }
        return soma;
    }

    public void realizaPagamento(PagamentoStrategy estrategia) {
        double total = calculaTotal();
        System.out.println("total da compra: R$" + total);
        estrategia.realizaPagamento(total);
    }

    public double calculaFrete(FreteStrategy freteStrategy) {
        return freteStrategy.calculaFrete();
    }

    public void realizaPagamento(PagamentoStrategy estrategiaPagamento, FreteStrategy estrategiaFrete) {
        double totalItens = calculaTotal();
        double valorFrete = calculaFrete(estrategiaFrete);
        double totalGeral = totalItens + valorFrete;

        System.out.println("itens: R$" + totalItens + "\nfrete: R$" + valorFrete);
        System.out.println("total a pagar: R$" + totalGeral);

        estrategiaPagamento.realizaPagamento(totalGeral);
    }
}
