package atividade.questao1_run;

public class Main {
    public static void main(String[] args) {
        Thread threadLetras = new Thread(new ThreadLetras());
        Thread threadNumeros = new Thread(new ThreadNumeros());

        threadLetras.start();
        threadNumeros.start();
    }

}