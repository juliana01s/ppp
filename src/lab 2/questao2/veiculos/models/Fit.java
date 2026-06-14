package questao2.veiculos.models;

import questao2.veiculos.interfaces.*;

public class Fit implements IVehicle {

    public void start() {
        System.out.println("fit ligando");
    }

    public void drive() {
        System.out.println("fit dirigindo");
    }

    public void stop() {
        System.out.println("fit parando");
    }
}