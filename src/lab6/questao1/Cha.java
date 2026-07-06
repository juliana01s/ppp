package lab6.questao1;

public class Cha extends Bebida {
    @Override
    protected void prepararBebida() {
        System.out.println("adicionando o sachê de chá na água");
    }

    @Override
    protected void adicionarCondimentos() {
        System.out.println("adicionando limão e mel");
    }
}