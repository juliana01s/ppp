package questao1;

import questao1.celulares.fabricantes.*;
import questao1.celulares.interfaces.*;

public class Main {
    public static void main(String[] args) {

        FabricanteCelular apple = Apple.getInstance();
        FabricanteCelular samsung = Samsung.getInstance();

        Celular myIphoneX = apple.constroiCelular("IPhoneX");
        Celular myIphoneS = apple.constroiCelular("IPhoneS");

        Celular myGalaxy8 = samsung.constroiCelular("Galaxy8");
        Celular myGalaxyS20 = samsung.constroiCelular("GalaxyS20");

        // testes para ver o codigo funcionando
        System.out.println("teste dos aparelhos Apple");
        myIphoneX.fazLigacao();
        myIphoneX.tiraFoto();
        myIphoneS.tiraFoto();
        myIphoneS.fazLigacao();

        System.out.println("\nteste dos aparelhos Samsung");
        myGalaxy8.fazLigacao();
        myGalaxy8.tiraFoto();
        myGalaxyS20.fazLigacao();
        myGalaxyS20.tiraFoto();
    }
}