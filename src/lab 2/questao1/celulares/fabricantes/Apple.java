package questao1.celulares.fabricantes;

import questao1.celulares.interfaces.Celular;
import questao1.celulares.interfaces.FabricanteCelular;
import questao1.celulares.modelos.IPhoneX;
import questao1.celulares.modelos.IPhoneS;

public class Apple implements FabricanteCelular {
    private static Apple instancia;

    private Apple() {
    }

    public static Apple getInstance() {
        if (instancia == null) {
            instancia = new Apple();
        }
        return instancia;
    }

    public Celular constroiCelular(String modelo) {
        if (modelo.equalsIgnoreCase("IPhoneX")) {
            return new IPhoneX();
        } else if (modelo.equalsIgnoreCase("IPhoneS")) {
            return new IPhoneS();
        }
        throw new IllegalArgumentException();
    }
}