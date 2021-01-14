//FRQ 2009
import java.util.*;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int tossing = 0;
    System.out.println("How many rolls?");
    tossing = in.nextInt();
    int[] result = new int[getCubeTosses(tossing).length];
    result = getCubeTosses(tossing);
    System.out.println("results: " + Arrays.toString(result));
    System.out.println("Longest run: " + getLongestRun(result));
  }
  public static int[] getCubeTosses(int toss) {
    int array[] = new int [toss];
    Random in = new Random();
    int i = 0;
    while (toss > 0) {
      int coins = in.nextInt(7);
      array[i] = coins;
      while (coins == 0) {
        coins = in.nextInt(7);
        array[i] = coins;
      }
      i++;
      toss--;
      System.out.println("Number: " + coins);
    }
    return array;
  }
  public static int getLongestRun(int[] array) {
    int count = 0;
    int index = 0;
    int majority = 0;
    int i = 0;
    while (i < array.length - 1) {
      if (array[i] == array[i + 1]) {
        count++;
        System.out.println("Count: " + count);
        if (count > majority) {
          majority = count;
          index = i;
          System.out.println("Current index: " + index);
        }
      }
      i++;
    }
    if (count == 0) {
      return -1;
    }
    return index;
  }
}
