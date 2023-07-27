public class Main {
    public static void main(String[] args) {

        Process p1 = new Process();
        Process p2 = new Process();
        Process p3 = new Process();

        p1.start();
        try{
            p1.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("Error Hilo No. 1: "+e);
        }
        p2.start();
        try{
            p2.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("Error Hilo No. 1: "+e);
        }
        p3.start();
        try{
            p3.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("Error Hilo No. 1: "+e);
        }






    }
}