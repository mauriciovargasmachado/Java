public class Main {
    public static void main(String[] args) {

        public static void printMegaBytesAndKiloBytes(int kilobytes){

            if (kilobytes<0){

                System.out.println("Invalid Value");
            }
            else{
                //Calculate megabytes in kilobytes
                int megabites = (int)(kilobytes / 1024);

                //Calculate remaining
                int remainingKilobites = kilobytes % 1024;

                String result = kilobytes + " KB = " + megabites + " MB and " + remainingKilobites + " KB";

                System.out.println(result);
            }
        }

    }
}