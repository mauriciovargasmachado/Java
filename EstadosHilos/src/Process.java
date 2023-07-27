public class Process extends Thread{

    @Override
    public void run(){
        for(int i=0;i<=50;i++){
            System.out.println("Hey! I am number: "+i);
            try{
                Process.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }

}
