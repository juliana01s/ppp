package questao4;

public class Main {
    public static void main(String[] args) {
        AcaoBroker broker = new AcaoBroker();

        Acao petrobras = new Acao("PETR4", 35.00);
        Acao vale = new Acao("VALE3", 65.00);

        Investidor inv1 = new Investidor("Carlos", 30.00, 40.00, broker);
        Investidor inv2 = new Investidor("Ana", 60.00, 70.00, broker);

        petrobras.registrarInvestidor(inv1);
        vale.registrarInvestidor(inv2);

        petrobras.setPreco(36.00);
        vale.setPreco(71.00);
        petrobras.setPreco(41.00);
        vale.setPreco(55.00);
    }
}