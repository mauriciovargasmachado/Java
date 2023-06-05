public class Main {
    public static void main(String[] args) {

        System.out.println(getDuration(50000000));

    }

    public static String getDuration(int seconds){

        int minutes = seconds /60;

        int hours = minutes/60;

        System.out.println("Hours: "+hours);

        int remainingMinutes = minutes%60;

        System.out.println("remaining minutes : "+remainingMinutes);

        return hours +" Hour Has: "+ remainingMinutes+" Remaining minutes.";

    }

    public static String getDurationString(int minutes,int seconds){

        return  "The total count is: "+getDuration(566699977);

    }
}