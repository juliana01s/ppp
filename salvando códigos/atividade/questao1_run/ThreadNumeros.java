package atividade.questao1_run;

public class ThreadNumeros implements Runnable {

    @Override
    public void run(){
        for(int i=0; i<=10; i++){
            System.out.println("Numero: " + (int) i);
        }

        try {
            Thread.sleep(300);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    
}
