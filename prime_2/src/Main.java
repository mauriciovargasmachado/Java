public class Main {
    public static void main(String[] args) {

        int count = 0;

        for (int i =1; i <51; i++){
            if (isPrime(i)){
                System.out.println("The number "+i+ " is a prime number");
                count++;
            }
        }
        System.out.println("The total amount of prime number is: "+count);

        int count_2 = 0;

        for (int i =1; i <51; i++){
            if (!isPrime(i)){
                System.out.println("The number "+i+ " is NOT a prime number");
                count_2++;
            }
        }
        System.out.println("The total amount of Not prime numbers is: "+count_2);
    }

    public static boolean isPrime(int number){

        if (number <=2) {
            return (number ==2);
        }

        for (int divisor = 2; divisor <number; divisor++){

            if (number%divisor==0){
                return false;
            }

        }

        return true;
    }

}