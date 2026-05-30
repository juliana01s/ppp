package questao1.celulares.modelos;

import questao1.celulares.interfaces.Celular;

public class IPhoneX implements Celular {
    public void fazLigacao() {
        System.out.println("Ligando");
    }

    public void tiraFoto() {
        System.out.println("Fotografando");
    }
}
