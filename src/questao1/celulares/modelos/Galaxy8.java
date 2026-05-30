package questao1.celulares.modelos;

import questao1.celulares.interfaces.Celular;

public class Galaxy8 implements Celular {
    public void fazLigacao() {
        System.out.println("Ligando");
    }

    public void tiraFoto() {
        System.out.println("Fotografando");
    }
}
