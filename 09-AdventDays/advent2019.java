///Your goal is to divide each number by 3, round down to the lowest whole value, and subtract it by 2.
import java.net.URI;
import java.util.Scanner;
import java.io.*;
public class advent2019 {
  public static void main(String[] args) {
    int answer = 0;
    try {
      Scanner input = new Scanner(new File("data.txt"));///This line probably
      while(input.hasNext()) {///Also unsure of what this line does
        int number = Integer.parseInt(input.next());/// I'm not sure what this does
        int result = (number / 3) - 2; ///Each number being divided by 3 and then subtracted by two
        answer += result;
      }//end while loop
    }//end try

    catch (FileNotFoundException e) {
      e.printStackTrace();
    }//end catch
    System.out.println(answer);///This prints the answer
  }//end main
}//end class
