package questao2.veiculos.models;

import questao2.veiculos.interfaces.*;

public class Hilux implements IVehicle {

    public void start() {
        System.out.println("hilux ligando o motor");
    }

    public void drive() {
        System.out.println("hilux dirigindo");
    }

    public void stop() {
        System.out.println("hilux parando");
    }
}