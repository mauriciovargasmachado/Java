public class Hilo_1  extends Thread{

    @Override
    public void run(){

        for(int i =0; i<11;i++){
            System.out.print(i+": G");
            try{
                Hilo_1.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("Error hilo 1: "+e);
            }
        }

    }
}
