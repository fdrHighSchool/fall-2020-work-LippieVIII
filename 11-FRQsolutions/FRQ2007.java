//FRQ 2007
//1. Get positive input
//2. Get boolean statement
//3. For loop until all numbers are divided completely
//4. Any number with zero is automatically cancelled
//5. No even division, return false statement
//6.
import java.util.Scanner;
import java.util.*;

public class FRQ2007 {
  public static void main(String[] args) {
    int number;
    int inputs;
    int start;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter your numbers: ");
    number = in.nextInt();
    System.out.println(number + " is: " + isSelfDivisor(number));
    inputs = in.nextInt();
    System.out.println("firstNumSelfDivisor is " + Arrays.toString(firstNumSelfDivisor(number,inputs)));
  }

  public static boolean isSelfDivisor(int number){
    int answers;
    while (number >= 1) {
      answers = number % 10;
      if (number % answers != 0 || answers == 0) {
        return false;
      }
      else {
        number /= 10;
      }
    }
    return true;
  }

  public static int[] firstNumSelfDivisor(int number, int inputs) {
    int[] ofArrays = new int[number];
    int storingNumbers = 0;
    int start = 0;
    int nextNumber = start;
    while (inputs > storingNumbers) {
      if(isSelfDivisor(nextNumber)) {
        ofArrays[storingNumbers] = nextNumber;
        storingNumbers++;
      }
      nextNumber++;
    }
    return ofArrays;
  }

}
