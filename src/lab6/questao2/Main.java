package questao2;

/*
2b: Qual a diferença entre o padrão de projeto Template e o Decorator?
Template Method: É um padrão comportamental baseado em HERANÇA. O seu propósito é
definir o esqueleto estrutural de um algoritmo em uma classe mãe (abstrata),
permitindo que as classes filhas (subclasses) preencham ou alterem apenas
etapas específicas do processo, sem mudar a ordem de execução geral.
Decorator: É um padrão estrutural baseado em COMPOSIÇÃO. O seu propósito é
adicionar responsabilidades e comportamentos extras a um objeto de forma dinâmica
(em tempo de execução). Ao invés de usar herança estática, ele encapsula o objeto
original em um "decorador" que adiciona o novo comportamento, mantendo a
mesma interface do objeto original.
 */

public class Main {
    public static void main(String[] args) {

        System.out.println("processando pedido online");
        Pedido pedido1 = new PedidoOnline(2, 50.00);
        pedido1.processarPedido();

        System.out.println("\nprocessando pedido na loja");
        Pedido pedido2 = new PedidoLoja(1, 120.00);
        pedido2.processarPedido();

        System.out.println("\nprocessando pedido via criptomoedas");
        Pedido pedido3 = new PedidoCriptomoedas(5, 20.00);
        pedido3.processarPedido();
    }
}