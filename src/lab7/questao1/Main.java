package questao1;

package questao1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Veiculo> veiculos = Arrays.asList(
                new Carro("prata", "toyota", "corolla"),
                new Bicicleta("vermelha"),
                new Onibus(40, 2018)
        );

        VeiculoVisitor imprimir = new ImprimirDadosVisitor();
        VeiculoVisitor mensagem = new EnviarMensagemVisitor();

        System.out.println("imprimindo dados...");
        for (Veiculo v : veiculos) {
            v.accept(imprimir);
        }

        System.out.println("\nenviando mensagens...");
        for (Veiculo v : veiculos) {
            v.accept(mensagem);
        }
    }
}