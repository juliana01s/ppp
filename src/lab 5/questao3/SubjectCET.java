package questao3;

public interface SubjectCET {
    void registrarObserver(ObserverCET o);

    void removerObserver(ObserverCET o);

    void notificarObsrvers();
}
