public class TrigonometricFuntions {
    public static void main(String[] args) {



      double result;

      double angleInDegrees = 45;
      double angleInRadians;

      angleInRadians = Math.toRadians(angleInDegrees);

      result = Math.sin(angleInRadians);

      System.out.println("Sine: "+result);

      result = Math.cos(angleInRadians);

      System.out.println("Cosine: "+result);

        result = Math.tan(angleInRadians);

        System.out.println("Tangent: "+result);
    }

}
