public class Main {
    public static void main(String[] args) {

        Process p1 = new Process();
        Process p2 = new Process();

        p1.Value(50);
        p2.Value(28);

        p1.start();
        p2.start();


    }
}