public class Main {
    public static void main(String[] args) {

        Hilo_1 h1 = new Hilo_1();
        Hilo_2 h2 = new Hilo_2();
        Hilo_3 h3 = new Hilo_3();
        Hilo_4 h4 = new Hilo_4();

        h1.start();
        try{
            h1.sleep(10);
        }catch (InterruptedException e){
            System.out.println("Error hilo 1: "+e);
        }


        h2.start();
        try{
            h2.sleep(100);
        }catch (InterruptedException e){
            System.out.println("Error hilo 2: "+e);
        }


        h3.start();
        try{
            h3.sleep(100);
        }catch (InterruptedException e){
            System.out.println("Error hilo 3: "+e);
        }



        h4.start();
        try{
            h4.sleep(100);
        }catch (InterruptedException e){
            System.out.println("Error hilo 4: "+e);
        }

    }
}