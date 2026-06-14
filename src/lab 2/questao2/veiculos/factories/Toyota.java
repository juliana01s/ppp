package questao2.veiculos.factories;

import questao2.veiculos.interfaces.*;
import questao2.veiculos.models.*;

public class Toyota implements IVehicleMaker {

    /*
     * padrão singleton para garantir que exista apenas uma instância da fábrica
     * rodando, o que economiza desperdícios de memória.
     */

    private static Toyota instance;

    private Toyota() {
    } // construtor privado que bloqueia o uso do "new Toyota()"

    public static Toyota getInstance() {
        if (instance == null) {
            instance = new Toyota();
        }
        return instance;
    }

    /*
     * padrão factory para encapsular a lógica de criação (os "news") dentro da
     * fábrica, pois assim a classe Main não precisará conhecer as classes Corolla, Hilux ou Etios.
     */

    public IVehicle makeVehicle(String modelo) {
        if (modelo.equalsIgnoreCase("Corolla")) {
            return new Corolla();
        } else if (modelo.equalsIgnoreCase("Hilux")) {
            return new Hilux();
        } else if (modelo.equalsIgnoreCase("Etios")) {
            return new Etios();
        }
        throw new IllegalArgumentException();
    }
}
