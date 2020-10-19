import java.util.*;

public class temperature {
  public static void main(String[] args) {
    System.out.println("Hello! Input a temperature of Celsius so I can convert it to Farenheit!");
    celsius();
  }

  public static void celsius() {
    ///Taking double characters
    double input = 0.0;
    Scanner in = new Scanner(System.in);
    double num1 = in.nextDouble();

    ///Convert to Farenheit
    double temp = (num1 * 9);
    double temp2 = (temp / 5);
    double temp3 = (temp2 + 32);
    System.out.println("Farenheit: " + temp3 + "°F");
  }
}
