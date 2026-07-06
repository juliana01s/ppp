package lab6.questao1;

public class Capuccino extends Bebida {
    @Override
    protected void prepararBebida() {
        System.out.println("misturando café expresso com leite vaporizado");
    }

    @Override
    protected void adicionarCondimentos() {
        System.out.println("adicionando canela e chocolate em pó");
    }
}