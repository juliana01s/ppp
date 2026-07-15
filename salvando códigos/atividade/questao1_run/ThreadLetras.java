package atividade.questao1_run;

public class ThreadLetras implements Runnable {
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
