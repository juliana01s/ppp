package questao2.veiculos.models;

import questao2.veiculos.interfaces.*;

public class Etios implements IVehicle {

    public void start() {
        System.out.println("etios ligando o motor");
    }

    public void drive() {
        System.out.println("etios dirigindo");
    }

    public void stop() {
        System.out.println("etios parando");
    }
}