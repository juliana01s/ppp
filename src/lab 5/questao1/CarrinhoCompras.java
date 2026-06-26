package questao1;

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
}
