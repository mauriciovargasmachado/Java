package Clases;

public class Proceso_1 extends Thread {

    @Override
    public void run(){
        for(int i=0;i<11;i++){
            System.out.println("process No. 1.");
        }
    }

}
