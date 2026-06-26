package questao3;

import java.util.ArrayList;
import java.util.List;

public class CentralEstacaoTempo implements SubjectCET {
    private List<ObserverCET> observers;
    private double temperatura;
    private double umidade;
    private double ventos;

    public CentralEstacaoTempo() {
        observers = new ArrayList<>();
    }

    @Override
    public void registrarObserver(ObserverCET o) {
        observers.add(o);
    }

    @Override
    public void removerObserver(ObserverCET o) {
        observers.remove(o);
    }

    @Override
    public void notificarObsrvers() {
        for (ObserverCET observer : observers) {
            observer.atualizar(temperatura, umidade, ventos);
        }
    }

    public void setMedicoes(double temperatura, double umidade, double ventos) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.ventos = ventos;
        notificarObsrvers();
    }
}
