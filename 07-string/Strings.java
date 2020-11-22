///Asignment #7
import java.util.Scanner;
class Strings {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);///User's input
    System.out.println("Hey kiddo! Type in a word! Any word! (You have three seconds, otherwise I'm going to have my McNukes™ to pay you a nice visit...)");
    String input = ""; ///Any word
    while (input.isEmpty() == true) {///If the user just press enter without typing in anything:
      input = in.nextLine();///To the next line!
      if (input.isEmpty() == true) {///The user is still pressing enter without typing in anything:
        System.out.println("OK! YOU CAN STOP PUTTING IN EMPTY SPACES NOW");///Computer's getting a little angry...
      }
    }
    System.out.println("There are " + input.length() + " characters, including spaces, of what you typed!");
    System.out.println("Also I just sent 10,402 McNukes™ to your private property... HAVE FUN! ;)");
  }
}
