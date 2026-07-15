package atividade.questao1;

public class ThreadLetras extends Thread {
    public void run(){
        for(int i=65; i<=75; i++){
            System.out.println("Letra: " + (char) i);
        }

        try {
            Thread.sleep(300);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    
}
