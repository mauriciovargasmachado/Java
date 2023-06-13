public class Main {
    public static void main(String[] args) {

        int count=0;
        int sum=0;

        for(int i=1;i<50;i++){

            if((i%3 == 0)&&(i%5==0)){
                count=+1;
                sum += i;
                System.out.println("found a math = "+ i);
            }
        }
        System.out.println("Sum = "+sum);
    }




}