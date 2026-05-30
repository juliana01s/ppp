package questao2.veiculos.factories;

import questao2.veiculos.interfaces.*;
import questao2.veiculos.models.*;

public class Honda implements IVehicleMaker {

    // padrao singleton (mesmo código do toyota onde está a justificativa)
    private static Honda instance;

    private Honda() {
    }

    public static Honda getInstance() {
        if (instance == null) {
            instance = new Honda();
        }
        return instance;
    }

    // padrao factory
    public IVehicle makeVehicle(String modelo) {
        if (modelo.equalsIgnoreCase("Civic")) {
            return new Civic();
        } else if (modelo.equalsIgnoreCase("City")) {
            return new City();
        } else if (modelo.equalsIgnoreCase("Fit")) {
            return new Fit();
        }
        throw new IllegalArgumentException();
    }
}