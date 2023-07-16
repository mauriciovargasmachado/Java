public class Static {

    private static String frase = "This is a frase.";

    public static void main(String[] args) {

        Static s1 = new Static();
        Static s2 = new Static();

        s2.frase = "This is a second frase.";

        System.out.println(s1.frase);
        System.out.println(s2.frase);

    }
}
