import java.util.*;

public class Average{

  public static void main(String[] args) {

    System.out.println("Please give me your grades! I can only take 5 though!");
    Scanner in = new Scanner(System.in);
    double num = 0;

    System.out.print("Input first number: ");
    num += in.nextDouble();

    System.out.print("Input second number: ");
    num += in.nextDouble();

    System.out.print("Input third number: ");
    num += in.nextDouble();

    System.out.print("Input fourth number: ");
    num += in.nextDouble();

    System.out.print("Enter fifth number: ");
    num += in.nextDouble();

    double average = num / 5.0;

    System.out.println("Your grade average is: " + average);

  }

}
