package questao1;

public class PatoAdapter implements Ave {
    private PatoDomestico pato;

    public PatoAdapter(PatoDomestico pato) {
        this.pato = pato;
    }

    public void voar() {
        pato.voarCurto();
    }

    public void emitirSom() {
        pato.grasnar();
    }
}
