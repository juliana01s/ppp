package questao3;

public class AeroportoUberlandia implements ObserverCET {

    @Override
    public void atualizar(double temperatura, double umidade, double ventos) {
        if (ventos > 50.0) {
            System.out.println("aeroporto alerta!!!!!!!! rajadas de vento perigosas (" + ventos + " km/h).");
        }
    }
}
