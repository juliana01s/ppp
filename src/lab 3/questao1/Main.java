package questao1;

public class Main {
    public static void main(String[] args) {
        Ave pato = new PatoAdapter(new PatoDomestico());
        Ave pavao = new PavaoAdapter(new PavaoAzul());

        System.out.println("pato:");
        pato.emitirSom();
        pato.voar();

        System.out.println("\npavao:");
        pavao.emitirSom();
        pavao.voar();
    }
}