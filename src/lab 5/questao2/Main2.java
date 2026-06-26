package questao2;

public class Main2 {
    public static void main(String[] args) {

        CarrinhoCompras carrinho = new CarrinhoCompras();
        carrinho.adicionaItem(new Item("teclado", 200.00));
        carrinho.adicionaItem(new Item("mouse", 50.00));

        carrinho.realizaPagamento(new PixPagamento(), new FreteSedex());
    }
}