package questao2.veiculos.models;

import questao2.veiculos.interfaces.*;

public class Corolla implements IVehicle {

    public void start() {
        System.out.println("corolla ligando o motor");
    }

    public void drive() {
        System.out.println("corolla dirigindo");
    }

    public void stop() {
        System.out.println("corolla parando");
    }
}