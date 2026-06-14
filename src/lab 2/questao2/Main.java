package questao2; //

import questao2.veiculos.interfaces.*;
import questao2.veiculos.factories.*;

public class Main {
    public static void main(String[] args) {

        // obtendo as fábricas pelo Singleton
        IVehicleMaker toyota = Toyota.getInstance();
        IVehicleMaker honda = Honda.getInstance();

        // criando os carros usando o factory method
        IVehicle myCorolla = toyota.makeVehicle("Corolla");
        IVehicle myHilux = toyota.makeVehicle("Hilux");
        IVehicle myEtios = toyota.makeVehicle("Etios");

        IVehicle myCivic = honda.makeVehicle("Civic");
        IVehicle myFit = honda.makeVehicle("Fit");
        IVehicle myCity = honda.makeVehicle("City");

        // testando codigo
        System.out.println("toyota teste:");
        myCorolla.start();
        myCorolla.drive();
        myCorolla.stop();
        System.out.println();
        myHilux.start();
        myHilux.drive();
        myHilux.stop();
        System.out.println();
        myEtios.start();
        myEtios.drive();
        myEtios.stop();

        System.out.println("\nhonda teste:");
        myCivic.start();
        myCivic.drive();
        myCivic.stop();
        System.out.println();
        myFit.start();
        myFit.drive();
        myFit.stop();
        System.out.println();
        myCity.start();
        myCity.drive();
        myCity.stop();
    }
}