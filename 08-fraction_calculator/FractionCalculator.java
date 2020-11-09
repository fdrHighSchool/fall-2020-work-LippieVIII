///Project 1
import java.util.Scanner;

public class FractionCalculator{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in); //scanner class
    boolean toContinue = true; //varaible that stores

    System.out.println("Hi, I'm a fraction calculator! So just type in two mixed numbers, and yer set! Just don't put in decimals... ");
    System.out.println("Enter your fractions (Also enter your numbers as well! I need credit for this and I need to feed the kidnapped orphans in my basement!): ");
    while(toContinue == true){ //Inputs are infinte until "quit"
      System.out.println("Type an equation:");
      System.out.println("Or type the 'quit' to leave!");//options
      String i = s.nextLine(); //store usersinput
      if (i.equalsIgnoreCase("quit")) {
        toContinue = false; //if user type quit the while loop stops
        System.out.println("Wow... Way to be a quitter...");
      }
      else { //otherwise print out answer
        System.out.println(produceAnswer(i));//This is where the "Juicy" content gets printed
      } //else statement ends
    } //while loop ends
  }//MAIN method ends

    // TODO:Read the input from the user and call produceAnswer with an equation


    /**
     * produceAnswer - This function takes a String 'input' and produces the result.
     * @param input - A fraction string that needs to be evaluated.  For your program, this will be the user input.
     *      Example: input ==> "1/2 + 3/4"
     * @return the result of the fraction after it has been calculated.
     *      Example: return ==> "1_1/4"
     */

     // Name: produceAnswer()
     // Purpose: identify the operator and fractions of user inputs and printing out the results
     // Input: input of expression from user
     // Return: return the numerator, denominator, and whole as checkpoint2(results)
  public static String produceAnswer(String input){
    int blank = input.indexOf(" "); //when there is a space
    int lastCharacter = input.length();///from the last occurrence of the whole equation
    String op1 = input.substring(0, blank);///basically first addend
    String op = input.substring(blank + 1, blank + 2);///arithmetic symbol or something between two spaces
    String op2 = input.substring(blank + 3, lastCharacter); //second addend
    String topFrac1 = findingTop(op1);//First numerator
    String topFrac2 = findingTop(op2);//Second numerator
    String int1 = integer(op1); //First whole
    String int2 = integer(op2); //Second whole
    String bottomFrac1 = findDenominator(op1); //First denominator
    String bottomFrac2 = findDenominator(op2); //Second denominator
    String checkPoint2 = "Whole:" + int1 +"/ " + int2 + " Numerator:" + topFrac1 + "/ " + topFrac2 +  " Denominator:" + bottomFrac1 + "/ " + bottomFrac2;///Print all at one line
    System.out.println("Whole:");
    System.out.println(int1 + " and " + int2);///To print wholes
    System.out.println("Numerator:");
    System.out.println(topFrac1 + " and " + topFrac2);///To print numerators
    System.out.println("Denominator:");
    System.out.println(bottomFrac1 + " and " + bottomFrac2);///To print denominators
    return checkPoint2;///produceAnswer gets puppeted on String op2 as it is a return statement
    //All of the contains() method checks whether a string contains a sequence of characters
  } //end of produceAnswer method

    // Name: findWhole()
    // Purpose: To look for whole numbers inside a fraction
    // Input: Two fractions strings from the user
    // Return: If the fractions contains whole number and return results back to produceAnswer()
  public static String integer(String scout){
    // 4421_1/3    1234/12     5821
    if(scout.contains("_")){ //return everything from beginning until seeing “_”
    ///Also mixed number
      return scout.substring(0, scout.indexOf("_"));
    //return everything from beginning until seeing “_”
    } //end if statement
    if(scout.contains("/")){
     return "0";  //if it is a fraction return 0 as whole number
    } //end of if statement
    else {
      return scout;
    }
     //if there is no fraction sign or mixed number, everything else is whole number
  }//end of integer method

  // Name: findNumerator()
  // Purpose: To look for numerator inside a fraction
  // Input: Two fractions strings from the user
  // Return: If the fractions contains numerator and return results back to produceAnswer()
  public static String findingTop(String scout){
    //3_5/8   233/1   42821
    if(scout.contains("_")){  //if it is a mixed number
      return scout.substring(scout.indexOf("_") + 1,scout.indexOf("/"));
      //add one because there is a space between two the operator and the sign
      //numerator is everything in front of the "_" sign
    }
    else if(scout.contains("/")){
      return scout.substring(0, scout.indexOf("/")); //get everything before the "/"
    }
    else {
      return "0"; //if there is no fraction or mixed number return 0 as numerator
    } //end of else statement
  }//end of findNumerator method

  // Name: findDenominator
  // Purpose: To look for denomator inside a fraction
  // Input: Two fractions strings from the user
  // Return: If the fractions contains denominator and return results back to produceAnswer()
  public static String findDenominator(String scout){
    //1_7/2   3125/42   41236
    if(scout.contains("/")){
      return scout.substring(scout.indexOf("/") + 1);//the denomator is after the "/" sign
      //add one to get rid of the "/" sign
      //get everything after the "/"
    }
    else {
      return "1"; //You can't have zero as an denominator!
    }//end of else statement
  }//end of findDenominator method


  public static String mixedFraction(String scout){
    return "0";
  } //end mixedFraction method end class


  // TODO: Implement this function to produce the solution to the input
  // Checkpoint 1: Return the second operand.  Example "4/5 * 1_2/4" returns "1_2/4".
  // Checkpoint 2: Return the second operand as a string representing each part.
  //               Example "4/5 * 1_2/4" returns "whole:1 numerator:2 denominator:4".
  // Checkpoint 3: Evaluate the formula and return the result as a fraction.
  //               Example "4/5 * 1_2/4" returns "6/5".
  //               Note: Answer does not need to be reduced, but it must be correct.
  // Final project: All answers must be reduced.
  //               Example "4/5 * 1_2/4" returns "1_1/5".




  // TODO: Fill in the space below with helper methods

  /**
    * greatestCommonDivisor - Find the largest integer that evenly divides two integers.
    *      Use this helper method in the Final Checkpoint to reduce fractions.
    * @param a - First integer.
    * @param b - Second integer.
    * @return The GCD.
    */
  public static int greatestCommonDivisor(int a, int b) {
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
