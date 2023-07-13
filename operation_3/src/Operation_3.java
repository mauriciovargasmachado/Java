public class Operation_3 {

    // atributes

    int addition;
    int subtraction;
    int multiplication;
    int division;


    // Methods

    public int Addition(int number_1,int number_2){

        addition = number_1+number_2;

        return addition;

    }
    public int Substraction(int number_1,int number_2){

        subtraction = number_1-number_2;

        return subtraction;

    }
    public int Multiplication(int number_1,int number_2){

        multiplication = number_1*number_2;

        return multiplication;

    }
    public int Division(int number_1,int number_2){

        division = number_1/number_2;

        return division;

    }
    public void showResults(int addition,int subtraction, int multiplication, int division){
        System.out.println("The addition is: "+addition);
        System.out.println("The addition is: "+subtraction);
        System.out.println("The addition is: "+multiplication);
        System.out.println("The addition is: "+division);

    }

}
