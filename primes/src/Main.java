public class Main {
    public static void main(String[] args) {

        System.out.println("0 is "+ (isPrime(0)? "":"NOT ")+"a prime number.");
        System.out.println("1 is "+ (isPrime(1)? "":"NOT ")+"a prime number.");
        System.out.println("2 is "+ (isPrime(2)? "":"NOT ")+"a prime number.");
        System.out.println("3 is "+ (isPrime(3)? "":"NOT ")+"a prime number.");
        System.out.println("4 is "+ (isPrime(4)? "":"NOT ")+"a prime number.");
        System.out.println("5 is "+ (isPrime(5)? "":"NOT ")+"a prime number.");
        System.out.println("6 is "+ (isPrime(6)? "":"NOT ")+"a prime number.");
        System.out.println("7 is "+ (isPrime(7)? "":"NOT ")+"a prime number.");
        System.out.println("8 is "+ (isPrime(8)? "":"NOT ")+"a prime number.");
        System.out.println("9 is "+ (isPrime(9)? "":"NOT ")+"a prime number.");
        System.out.println("10 is "+ (isPrime(10)? "":"NOT ")+"a prime number.");


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