package polimorfismo;

import java.util.Scanner;

public abstract class Operations_father {

    //attributes
    protected int value_1,value_2,answer;

    Scanner sc = new Scanner(System.in);

    //methods
    public void askData(){
        System.out.println("Please type the first value: ");
        value_1 = sc.nextInt();
        System.out.println("Please type the second value: ");
        value_2 = sc.nextInt();
    }

    public abstract void Operations();

    public void showAnswer(){
        System.out.println(answer);
    }







}
