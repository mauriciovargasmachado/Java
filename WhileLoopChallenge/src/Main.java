public class Main {
    public static void main(String[] args) {

        int number = 1;
        int finishNumber = 88888;

        while (number<finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
        }
    }

    public static boolean isEvenNumber (int number){

        if ((number%2)==0){
            return true;
        }
        else {
            return false;
        }

    }


}