package lab6.questao1;

public abstract class Bebida {

    public final void prepararReceita() {
        aquecerAgua();
        prepararBebida();
        colocarNaXicara();
        adicionarCondimentos();
    }

    private void aquecerAgua() {
        System.out.println("aquecendo a água");
    }

    private void colocarNaXicara() {
        System.out.println("colocando na xícara");
    }

    protected abstract void prepararBebida();
    protected abstract void adicionarCondimentos();
}