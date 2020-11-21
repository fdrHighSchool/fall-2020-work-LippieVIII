///Project 1
import java.util.Scanner;

public class FractionCalculator {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in); //scanner class
    boolean toContinue = true; //varaible that stores

    System.out.println("Hi, I'm a fraction calculator! So just type in two mixed numbers, and yer set! Just don't put in decimals... ");
    System.out.println("Enter your fractions (Also enter your numbers as well! I need credit for this and I need to feed the kidnapped orphans in my basement!): ");
    while(toContinue == true){ //Inputs are infinte until "quit"
      System.out.println("Type an equation:");//You know what this is...
      System.out.println("Or type the 'quit' to leave!");//You want to leave or not?
      String i = s.nextLine(); //store usersinput
      if (i.equalsIgnoreCase("quit")) {//If the user typed in quit:
        toContinue = false; //The loop either stops
        System.out.println("Wow... Way to be a quitter...");
      }
      else { //otherwise print out answer
        System.out.println(produceAnswer(i));//This is where the "Juicy" content gets printed
        //Or it continues on
      } //else statement ends
    } //while loop ends
  }//MAIN method ends
  public static String produceAnswer(String input){ ///String "i" -> String input
    int blank = input.indexOf(" "); ///Returns position number of nothing
    int lastCharacter = input.length();///from the last occurrence of the whole equation
    String op1 = input.substring(0, blank);///basically whole number
    String op = input.substring(blank + 1, blank + 2);///Numerator from frac. 1
    String op2 = input.substring(blank + 3, lastCharacter); //Denominator from frac. 1
    int topFrac1 = findingTop(op1);//First numerator
    int topFrac2 = findingTop(op2);//Second numerator
    int int1 = integer(op1); //First whole
    int int2 = integer(op2); //Second whole
    int bottomFrac1 = findDenominator(op1); //First denominator
    int bottomFrac2 = findDenominator(op2); //Second denominator
    String checkPoint2 = "Whole:" + int1 +"/ " + int2 + " Numerator:" + topFrac1 + "/ " + topFrac2 +  " Denominator:" + bottomFrac1 + "/ " + bottomFrac2;///Print all at one line
    System.out.println("Whole:");
    System.out.println(int1 + " and " + int2);///To print wholes
    System.out.println("Numerator:");
    System.out.println(topFrac1 + " and " + topFrac2);///To print numerators
    System.out.println("Denominator:");
    System.out.println(bottomFrac1 + " and " + bottomFrac2);///To print denominators

    String answer = "";
    String finalAnswer = "";

    ///If the user's input are not acceptable:
    String veryWRONG;
    if(op.equals("/") && op2.equals("0")) {
      ///Error statements will be made
      veryWRONG = "Hey man... don't divide by zero, ok?";
      return veryWRONG;
    }
    if(op.length() > 1) {
      veryWRONG = "What the... I can't comprehend this!";
      return veryWRONG;
    }

    if (op.contains("+") && bottomFrac1 == bottomFrac2) {
      answer = addingDifDen(topFrac1,  topFrac2, int1, int2, bottomFrac1, bottomFrac2, improperFraction(topFrac1, int1, bottomFrac1), improperFraction(topFrac2, int2, bottomFrac2));
      return answer;
    }
    else if (op.contains("+") && bottomFrac1 != bottomFrac2) {
      answer = addingSameDen(topFrac1,  topFrac2, int1, int2, bottomFrac1, bottomFrac2, improperFraction(topFrac1, int1, bottomFrac1), improperFraction(topFrac2, int2, bottomFrac2));
      return answer;
    }

    else if (op.contains("-") && bottomFrac1 == bottomFrac2) {
      answer = subSameDen(topFrac1,  topFrac2, int1, int2, bottomFrac1, bottomFrac2, improperFraction(topFrac1, int1, bottomFrac1), improperFraction(topFrac2, int2, bottomFrac2));
      return answer;
    }

    else if (op.contains("-") && bottomFrac1 != bottomFrac2) {
      answer = subDifDen(topFrac1,  topFrac2, int1, int2, bottomFrac1, bottomFrac2, improperFraction(topFrac1, int1, bottomFrac1), improperFraction(topFrac2, int2, bottomFrac2));
      return answer;
    }

    else if (op.contains("*")) {
      answer = mult(topFrac1,  topFrac2, int1, int2, bottomFrac1, bottomFrac2, improperFraction(topFrac1, int1, bottomFrac1), improperFraction(topFrac2, int2, bottomFrac2));
      return answer;
    }
    else if (op.contains("/")) {
      answer = divide(topFrac1,  topFrac2, int1, int2, bottomFrac1, bottomFrac2, improperFraction(topFrac1, int1, bottomFrac1), improperFraction(topFrac2, int2, bottomFrac2));
      return answer;
    }

    return checkPoint2;///produceAnswer gets puppeted on String op2 as it is a return statement
  } //end of produceAnswer method

  public static int integer(String scout){
    if(scout.contains("_")){ //return everything from beginning until seeing “_”
    ///Also if it's a mixed number
      return Integer.parseInt(scout.substring(0, scout.indexOf("_")));
    //return everything from beginning until seeing “_”
    }
    while (scout.contains("/")){
      return 0;  //if it is a fraction return 0 as whole number
    } //end of if statement
      return 0; //if there is no fraction sign or mixed number, everything else is whole number
  }//end of integer method

  public static int findingTop(String scout){
    if(scout.contains("_")) { //if it is a mixed number
      return Integer.parseInt(scout.substring(scout.indexOf("_") + 1,scout.indexOf("/")));
    }
    else if(scout.contains("/")) {
      return Integer.parseInt(scout.substring(0, scout.indexOf("/")));
    }
    else {
      return Integer.parseInt(scout);
    }
  }//end of findNumerator method

  public static int findDenominator(String scout){
    if(scout.contains("/")){
    return Integer.parseInt(scout.substring(scout.indexOf("/") + 1));
    }
    else {
      return 1;
    }
  }//end of findDenominator method


  public static String mixedFraction(String scout){
    return "0";
  } //end mixedFraction method end class

  // TODO: Implement this function to produce the solution to the input
  // Checkpoint 3: Evaluate the formula and return the result as a fraction.
  //               Example "4/5 * 1_2/4" returns "6/5".
  //               Note: Answer does not need to be reduced, but it must be correct.
  // Final project: All answers must be reduced.
  //               Example "4/5 * 1_2/4" returns "1_1/5".

  public static String addingSameDen(int topFrac1, int topFrac2, int int1, int int2, int bottomFrac1, int bottomFrac2, int improperFraction1, int improperFraction2) {
  //if the denominator are not the same
    int firstTopFrac = 0;
    int firstBottomFrac = 0;
    String answer = "";
    if(int1 != 0 && int2 != 0){//greater than zero
    //System.out.println(improperFraction2);
    //System.out.println(improperFraction1);
    firstTopFrac = (improperFraction1 * bottomFrac2) + (improperFraction2 * bottomFrac2);
    firstBottomFrac = bottomFrac1 * bottomFrac2;
    answer = firstTopFrac + "/" + firstBottomFrac;

    }else
      if(int1 == 0 && int2 == 0){ //if there is no whole numbers
      //just multiply fraction because there is no whole number in this case
      firstTopFrac = (topFrac1 * topFrac2) + (bottomFrac1 * bottomFrac2);
      firstBottomFrac = bottomFrac1 * bottomFrac2;
      answer = firstTopFrac + "/" + firstBottomFrac;

    }else
      if(int2 != 0 && int1 == 0){
      //when fraction2 has a whole numbers but fraction1 doesn't
      //add them after in improper fraction
      firstTopFrac = (topFrac1 * bottomFrac2) + (improperFraction2 * bottomFrac1);
      firstBottomFrac = bottomFrac1 * bottomFrac2;
      answer = firstTopFrac + "/" + firstBottomFrac;

    }else
      if(int1 != 0 && int2 == 0){
      //when fraction1 has a whole numbers but fraction2 doesn't
      //add them after in improper fraction
      firstTopFrac = (bottomFrac1 * topFrac2) + (bottomFrac2 * improperFraction1);
      firstBottomFrac = bottomFrac1 * bottomFrac2;
      answer = firstTopFrac + "/" + firstBottomFrac;
    }
    return answer;
  }//end of additionDifferentNumerator method

  public static String addingDifDen(int topFrac1, int topFrac2, int int1, int int2, int bottomFrac1, int bottomFrac2, int improperFraction1, int improperFraction2) {
    //if the denominator are not the same
    int firstTopFrac = 0;
    int firstBottomFrac = 0;
    String answer = "";
    if(int1 != 0 && int2 != 0){//greater than zero
    //System.out.println(improperFraction2);
    //System.out.println(improperFraction1);
    firstTopFrac = (improperFraction1 * bottomFrac2) + (improperFraction2 * bottomFrac1);
    firstBottomFrac = bottomFrac1 * bottomFrac2;
    answer = firstTopFrac + "/" + firstBottomFrac;

    }else
    if(int1 == 0 && int2 == 0){ //if there is no whole numbers
    //just multiply fraction because there is no whole number in this case
    firstTopFrac = (topFrac1 * bottomFrac2) + (bottomFrac1 * topFrac2);
    firstBottomFrac = bottomFrac1 * bottomFrac2;
    answer = firstTopFrac + "/" + firstBottomFrac;

    }else
    if(int2 != 0 && int1 == 0){
    //when fraction2 has a whole numbers but fraction1 doesn't
    //add them after in improper fraction
    firstTopFrac = (topFrac1 * bottomFrac2) + (improperFraction2 * bottomFrac1);
    firstBottomFrac = bottomFrac1 * bottomFrac2;
    answer = firstTopFrac + "/" + firstBottomFrac;

    }else
    if(int1 != 0 && int2 == 0){
    //when fraction1 has a whole numbers but fraction2 doesn't
    //add them after in improper fraction
    firstTopFrac = (bottomFrac1 * topFrac2) + (bottomFrac2 * improperFraction1);
    firstBottomFrac = bottomFrac1 * bottomFrac2;
    answer = firstTopFrac + "/" + firstBottomFrac;
    }
  return answer;
  }//end of additionDifferentNumerator method

  public static String subDifDen(int topFrac1, int topFrac2, int int1, int int2, int bottomFrac1, int bottomFrac2, int improperFraction1, int improperFraction2) {
    int firstTopFrac = 0;
    int firstBottomFrac = 0;
    String answer = "";
    if(int1 != 0 && int2 != 0){//greater than zero
      //System.out.println(improperFraction2);
      //System.out.println(improperFraction1);
      firstTopFrac = (improperFraction1 * bottomFrac2) - (improperFraction2 * bottomFrac1);
      firstBottomFrac = bottomFrac1 * bottomFrac2;
      answer = firstTopFrac + "/" + firstBottomFrac;

    }else
      if(int1 == 0 && int2 == 0){ //if there is no whole numbers
        //just multiply fraction because there is no whole number in this case
        firstTopFrac = (topFrac1 * bottomFrac2) - (bottomFrac1 * topFrac2);
        firstBottomFrac = bottomFrac1 * bottomFrac2;
        answer = firstTopFrac + "/" + firstBottomFrac;

    }else
      if(int2 != 0 && int1 == 0){
      //when fraction2 has a whole numbers but fraction1 doesn't
      //add them after in improper fraction
        firstTopFrac = (topFrac1 * bottomFrac2) - (improperFraction2 * bottomFrac1);
        firstBottomFrac = bottomFrac1 * bottomFrac2;
        answer = firstTopFrac + "/" + firstBottomFrac;

    }else
      if(int1 != 0 && int2 == 0){
      //when fraction1 has a whole numbers but fraction2 doesn't
      //add them after in improper fraction
        firstTopFrac = (bottomFrac1 * topFrac2) - (bottomFrac2 * improperFraction1);
        firstBottomFrac = bottomFrac1 * bottomFrac2;
        answer = firstTopFrac + "/" + firstBottomFrac;
    }
  return answer;
  }

  public static String subSameDen(int topFrac1, int topFrac2, int int1, int int2, int bottomFrac1, int bottomFrac2, int improperFraction1, int improperFraction2) {
    return "0";
  }

  public static String mult(int topFrac1, int topFrac2, int int1, int int2, int bottomFrac1, int bottomFrac2, int improperFraction1, int improperFraction2){
    int firstTopFrac = 0;
    int firstBottomFrac = 0;
    String answer = "";
    if(int1 == 0 && int2 == 0){ //if there is no whole numbers
    //just multiply fraction because there is no whole number in this case
      firstTopFrac = topFrac1 * topFrac2;
      firstBottomFrac = bottomFrac1 * bottomFrac2;
      answer = firstTopFrac + "/" + firstBottomFrac;
    }else
      if(int1 != 0 && int2 != 0 ){ //most of time there are whole numbers
      //remove the whole numbers
      //you times them after in improper fraction
      firstTopFrac = improperFraction1 * improperFraction2;
      //System.out.println(removeWhole1);
      firstBottomFrac = bottomFrac1 * bottomFrac2;
        //simpily multiply them
      answer = firstTopFrac + "/" + firstBottomFrac;
    }else
      if(int1 != 0 && int2 == 0){ //when fraction1 has a whole numbers but fraction2 doesn't
        //You times them after in improper fraction
        firstTopFrac = improperFraction1 * topFrac2;
        firstBottomFrac = bottomFrac2 * bottomFrac2;
        answer = firstTopFrac + "/" + firstBottomFrac;
    }else
      if(int2 != 0 && int1 == 0){
        //when fraction2 has a whole numbers but fraction1 doesn't
        //You times them after in improper fraction
        firstTopFrac = improperFraction2 * topFrac1;
        firstBottomFrac = bottomFrac1 * bottomFrac2;
        answer = firstTopFrac + "/" + firstBottomFrac;
      }//end if statement
    return answer;
  }//end of multiply method

  public static String divide(int topFrac1, int topFrac2, int int1, int int2, int bottomFrac1, int bottomFrac2, int improperFraction1, int improperFraction2){
    int firstTopFrac = 0;
    int firstBottomFrac = 0;
    String answer = "";
    if(int1 == 0 && int2 == 0){ //if there is no whole numbers
    //just multiply fraction because there is no whole number in this case
      firstTopFrac = topFrac1 * bottomFrac2;
      firstBottomFrac = topFrac2 * bottomFrac1;
      answer = firstTopFrac + "/" + firstBottomFrac;
    }else
      if(int1 != 0 && int2 != 0 ){ //most of time there are whole numbers
      //remove the whole numbers
      //you times them after in improper fraction
      firstTopFrac = improperFraction1 * bottomFrac2;
      //System.out.println(removeWhole1);
      firstBottomFrac = improperFraction2 * bottomFrac1;
        //simpily multiply them
      answer = firstTopFrac + "/" + firstBottomFrac;
    }else
      if(int1 != 0 && int2 == 0){ //when fraction1 has a whole numbers but fraction2 doesn't
        //You times them after in improper fraction
        firstTopFrac = improperFraction1 * bottomFrac2;
        firstBottomFrac = topFrac2 * bottomFrac1;
        answer = firstTopFrac + "/" + firstBottomFrac;
    }else
      if(int2 != 0 && int1 == 0){
        //when fraction2 has a whole numbers but fraction1 doesn't
        //You times them after in improper fraction
        firstTopFrac = topFrac1 * bottomFrac2;
        firstBottomFrac = improperFraction2 * bottomFrac1;
        answer = firstTopFrac + "/" + firstBottomFrac;
      }//end if statement
    return answer;
  }

  public static int improperFraction(int topFrac1, int int1, int bottomFrac1){
    int improperFraction1 = 0;
    if(int1 < 0){
    //if whole nunber is a negative value then numerator is negative as well
      topFrac1 = topFrac1 * -1;
      improperFraction1 = (bottomFrac1 * int1) + topFrac1;
    }
    else {
      if(int1 > 0) {
        improperFraction1 = (bottomFrac1 * int1) + topFrac1;
      }
    }
    return improperFraction1;
  }

  public static int GCF(int topFrac1, int bottomFrac1) {
    //look for the biggest number even if it is negative
    int ifGCF = 2;
    int bigBoyNumber = 0;
    int GCF = 0;

    if (Math.abs(topFrac1) > Math.abs(bottomFrac1)) {
      bigBoyNumber = Math.abs(topFrac1);
    }else
      if (Math.abs(topFrac1) < Math.abs(bottomFrac1)) {
        bigBoyNumber = Math.abs(bottomFrac1);
      }

    while(ifGCF < bigBoyNumber) {
      if (topFrac1 % ifGCF == 0 && bottomFrac1 % ifGCF == 0) {
        GCF = ifGCF;
      }
      ifGCF++;
    }
    return GCF;
  }//end of gcf method

  public static String reduceFrac(String answer) {
    String remainder = "";
    String THEfinal = "";
    int theRemainder = 0;
    ///GCF of two numbers
    int topFrac1 = findingTop(answer) / GCF(findingTop(answer), findDenominator(answer));
    int bottomFrac1 = findDenominator(answer) / GCF(findingTop(answer), findDenominator(answer));
    ///Other numerator
    int Wholy = topFrac1;
    ///When negative numbers occur
    if(Integer.toString(topFrac1).contains("-") && Integer.toString(bottomFrac1).contains("-")) {
      //two negative signs yields a positive integer
      topFrac1 = Math.abs(topFrac1);
      bottomFrac1 = Math.abs(bottomFrac1);
    }//end of if statement

    if(Math.abs(topFrac1) > Math.abs(bottomFrac1)){
      theRemainder = topFrac1 % bottomFrac1;
      Wholy = topFrac1 / bottomFrac1;
      //when remaider isn't zero it means that it can still be reduce
      if(theRemainder != 0){
          //when both numerator and whole number is negative it will be postive
      if(Integer.toString(theRemainder).contains("-") && Integer.toString(Wholy).contains("-")){
        remainder = Integer.toString(theRemainder).replace("-","");
        theRemainder = Integer.parseInt(remainder);
      }//end of if statement about checking whole is negative or not
       THEfinal = (Wholy + "_" + theRemainder + "/" + bottomFrac1);
       return THEfinal;
      }//end of if statmenet about numerator greater than denominator

      if(bottomFrac1 == 1){
        return Integer.toString(Wholy);
      }//end of if statment when denominator shouldn't be print out
     }//end of aboslue value if numerator or denominator or the same
        THEfinal = (topFrac1 + "/" + bottomFrac1);
      //if there are no whole numbers just return fraction instead of mixed number
    return THEfinal;
  }///Never assigned by the teacher

}//end class
