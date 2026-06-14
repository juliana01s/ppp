package questao2.veiculos.models;

import questao2.veiculos.interfaces.*;

public class Civic implements IVehicle {

    public void start() {
        System.out.println("civic ligando");
    }

    public void drive() {
        System.out.println("civic dirigindo");
    }

    public void stop() {
        System.out.println("civic parando");
    }
}