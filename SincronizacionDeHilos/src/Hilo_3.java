public class Hilo_3 extends Thread{

    @Override
    public void run(){

        for(int i =0; i<11;i++){
            System.out.print("E");
            try{
                Hilo_3.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("Error hilo 3: "+e);
            }
        }

    }

}
