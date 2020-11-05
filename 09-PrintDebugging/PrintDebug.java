import java.util.Scanner;
class PrintDebug {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("We're going to add two numbers together, multiply that result by the first number, and divide by the second.");

    double first = input.nextDouble();
    double second = input.nextDouble();

    double third = first + second;

    double fourth = third * second;
    double fifth = fourth / third;

    System.out.println("Third: " + third + "\nFourth: " + fourth + "\nfifth: " + fifth);///The third, fourth, and fifth numbers are not printed
    ///And that's basically it, that's the entire assignment

    input.close();//close Scanner object (good practice)
  }//end main method
}//end class
