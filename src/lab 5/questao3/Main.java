package questao3;

public class Main {
    public static void main(String[] args) {

        CentralEstacaoTempo cet = new CentralEstacaoTempo();
        PerfeituraUberlandia prefeitura = new PerfeituraUberlandia();
        AeroportoUberlandia aeroporto = new AeroportoUberlandia();

        cet.registrarObserver(prefeitura);
        cet.registrarObserver(aeroporto);

        System.out.println("atualizando dados...\n");
        cet.setMedicoes(35.0, 20.0, 60.0);
    }
}