package questao1.celulares.fabricantes;

import questao1.celulares.interfaces.Celular;
import questao1.celulares.interfaces.FabricanteCelular;
import questao1.celulares.modelos.Galaxy8;
import questao1.celulares.modelos.GalaxyS20;

public class Samsung implements FabricanteCelular {
    private static Samsung instancia;

    private Samsung() {
    }

    public static Samsung getInstance() {
        if (instancia == null) {
            instancia = new Samsung();
        }
        return instancia;
    }

    public Celular constroiCelular(String modelo) {
        if (modelo.equalsIgnoreCase("Galaxy8")) {
            return new Galaxy8();
        } else if (modelo.equalsIgnoreCase("GalaxyS20")) {
            return new GalaxyS20();
        }
        throw new IllegalArgumentException();
    }
}