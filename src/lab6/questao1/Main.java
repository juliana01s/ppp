package lab6.questao1;

public class Main {
    public static void main(String[] args) {
        System.out.println("preparando café");
        Bebida cafe = new Cafe();
        cafe.prepararReceita();

        System.out.println("\npreparando capuccino");
        Bebida capuccino = new Capuccino();
        capuccino.prepararReceita();

        System.out.println("\npreparando chá");
        Bebida cha = new Cha();
        cha.prepararReceita();
    }
}