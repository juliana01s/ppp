package questao2.veiculos.models;

import questao2.veiculos.interfaces.*;

public class City implements IVehicle {

    public void start() {
        System.out.println("city ligando");
    }

    public void drive() {
        System.out.println("city dirigindo");
    }

    public void stop() {
        System.out.println("city parando");
    }
}