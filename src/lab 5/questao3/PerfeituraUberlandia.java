package questao3;

public class PerfeituraUberlandia implements ObserverCET {

    @Override
    public void atualizar(double temperatura, double umidade, double ventos) {
        if (umidade < 30.0) {
            System.out.println("prefeitura alerta!!!!!!!! defesesa civil informa: umidade baixa (" + umidade + "%).");
        }
    }
}
