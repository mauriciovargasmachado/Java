public class Conversiones {
    public static void main(String[] args) {

        double angleInDegrees=45;
        double angleInRadians;

        angleInRadians = Math.toRadians(angleInDegrees);

        System.out.println(angleInDegrees+" degrees are "+angleInRadians+" Radians.");

        angleInDegrees = Math.toDegrees(angleInRadians);

        System.out.println(angleInRadians+" radians are "+angleInDegrees+" Degrees.");

    }

}
