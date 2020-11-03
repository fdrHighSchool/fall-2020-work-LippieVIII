///Project 1
import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    System.out.println("Hi, I'm a fraction calculator! So just type in two mixed numbers, and yer set! Just don't put in decimals... ");
    System.out.println("Enter your fractions (Also enter your numbers as well! I need credit for this and I need to feed the kidnapped orphans in my basement!: ");

    Scanner input = new Scanner(System.in);///Asks user for input
    String i = input.nextLine();///One line of input read
    String a = produceAnswer(i);///The input's been passed to produceAnswer method
    System.out.println(a);///Result's been printed
    // TODO: Read the input from the user and call produceAnswerwith an equation
    // Checkpoint 2: Accept user input multiple times.
  }//end main method

  /**
   * produceAnswer - This function takes a String 'input' and produces the result.
   * @param input - A fraction string that needs to be evaluated. For your program, this will be the user input.
   *      Example: input ==> "1/2 + 3/4"
   * @return the result of the fraction after it has been calculated.
   *      Example: return ==> "1_1/4"
   */
  public static String produceAnswer(String input){
    int place = input.indexOf(" ");///How many in the String?
    int last = input.length();///How many characters are there?
    String op1 = input.substring(0, place);///Basically the first addend
    String op = input.substring(place + 1, place + 2);///arithmetic symbol
    String op2 = input.substring(place + 2, last); ///Will print the second addend
    return op2;///produceAnswer gets puppeted on String op2 as it is a return statement

      // TODO: Implement this function to produce the solution to the input
      // Checkpoint 2: Return the second operand as a string representing each part.
      //               Example "4/5 * 1_2/4" returns "whole:1 numerator:2 denominator:4".
      // Checkpoint 3: Evaluate the formula and return the result as a fraction.
      //               Example "4/5 * 1_2/4" returns "6/5".
      //               Note: Answer does not need to be reduced, but it must be correct.
      // Final project: All answers must be reduced.
      //               Example "4/5 * 1_2/4" returns "1_1/5".
  }//end produceAnswer method

  // TODO: Fill in the space below with helper methods

  /**
   * greatestCommonDivisor - Find the largest integer that evenly divides two integers.
   *      Use this helper method in the Final Checkpoint to reduce fractions.
   * @param a - First integer.
   * @param b - Second integer.
   * @return The GCD.
   */
  public static int greatestCommonDivisor(int a, int b){
    return 0;
  }//end greatestCommonDivisor method

    /**
     * leastCommonMultiple - Find the smallest integer that can be evenly divided by two integers.
     *      Use this helper method in Checkpoint 3 to evaluate expressions.
     * @param a - First integer.
     * @param b - Second integer.
     * @return The LCM.
     */
  public static int leastCommonMultiple(int a, int b){
    return 0;
  }//end leastCommonMultiple

}//end class
