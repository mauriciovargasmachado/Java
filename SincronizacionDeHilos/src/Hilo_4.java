public class Hilo_4 extends Thread {

    @Override
    public void run(){

        for(int i =0; i<11;i++){
            System.out.println("K");
            try{
                Hilo_4.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("Error hilo 4: "+e);
            }
        }

    }
}
