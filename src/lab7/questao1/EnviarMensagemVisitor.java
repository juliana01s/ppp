package questao1;

public class EnviarMensagemVisitor implements VeiculoVisitor {
    @Override
    public void visit(Carro carro) {
        System.out.println("mensagem (carro): favor atualizar dados do IPVA");
    }

    @Override
    public void visit(Bicicleta bicicleta) {
        System.out.println("mensagem (bicicleta): comemore no parque o dia do ciclismo");
    }

    @Override
    public void visit(Onibus onibus) {
        System.out.println("mensagem (ônibus): atenção para atualização das licenças");
    }
}