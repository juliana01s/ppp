package questao1;

public class Main {
    public static void main(String[] args) {

        CarrinhoCompras carrinho = new CarrinhoCompras();
        carrinho.adicionaItem(new Item("teclado", 200.00));
        carrinho.adicionaItem(new Item("mouse", 50.00));

        carrinho.realizaPagamento(new PixPagamento());
    }
}