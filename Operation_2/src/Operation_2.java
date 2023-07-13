public class Operation_2 {

    // atributes

    int addition;
    int subtraction;
    int multiplication;
    int division;


    // Methods

    // We create a methods to ask the user to input two numbers.

    public void Addition(int number_1,int number_2){

        addition = number_1+number_2;

    }
    public void Substraction(int number_1,int number_2){

        subtraction = number_1-number_2;

    }
    public void Multiplication(int number_1,int number_2){

        multiplication = number_1*number_2;

    }
    public void Division(int number_1,int number_2){

        division = number_1/number_2;

    }
    public void showResults(){
        System.out.println("The addition is: "+addition);
        System.out.println("The addition is: "+subtraction);
        System.out.println("The addition is: "+multiplication);
        System.out.println("The addition is: "+division);

    }

}
