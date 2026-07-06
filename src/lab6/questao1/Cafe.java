package lab6.questao1;

public class Cafe extends Bebida {
    @Override
    protected void prepararBebida() {
        System.out.println("passando o café no filtro");
    }

    @Override
    protected void adicionarCondimentos() {
        System.out.println("adicionando açúcar");
    }
}