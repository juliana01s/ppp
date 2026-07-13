package questao1;

public class ImprimirDadosVisitor implements VeiculoVisitor {
    @Override
    public void visit(Carro carro) {
        System.out.println("cor do carro: " + carro.getCor() +
                ", marca: " + carro.getMarca() +
                ", modelo: " + carro.getModelo());
    }

    @Override
    public void visit(Bicicleta bicicleta) {
        System.out.println("cor da bicicleta: " + bicicleta.getCor());
    }

    @Override
    public void visit(Onibus onibus) {
        System.out.println("ônibus - lugares: " + onibus.getQuantidadeLugares() +
                ", ano: " + onibus.getAnoFabricacao());
    }
}