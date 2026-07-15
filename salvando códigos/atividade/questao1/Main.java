package atividade.questao1;

public class Main {
    public static void main(String[] args) {
        ThreadLetras tl = new ThreadLetras();
        ThreadNumeros tn = new ThreadNumeros();
        tl.start();
        tn.start();
    }

}