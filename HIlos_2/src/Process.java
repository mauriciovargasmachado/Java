public class Process extends Thread{

    int number;

    @Override
    public void run(){

        for(int i=0;i<=number;i++){
            System.out.println((1)+" "+getName());
        }

    }

    //Constructor
    public void Value(int value){
        this.number = value;
    }
}
