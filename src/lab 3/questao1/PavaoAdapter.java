package questao1;

public class PavaoAdapter implements Ave {
    private PavaoAzul pavao;

    public PavaoAdapter(PavaoAzul pavao) {
        this.pavao = pavao;
    }

    public void voar() {
        System.out.println("pavao nao voa");
    }

    public void emitirSom() {
        pavao.cantar();
    }
}