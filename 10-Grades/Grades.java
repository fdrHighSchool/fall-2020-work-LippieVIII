import java.util.*;///Import scanner object
class Grades {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);///Scanner input
    System.out.println("how many number do you plan to add");///
    int x = in.nextInt();///Add multiple inputs
    int[] array =  new int[x];//range of the list
    for(int i = 0;i < x; i++) {/// when i = 0, less than x, and it increases one at a time
      try {
        System.out.println("Enter an integer to add to the list");
        array[i] = in.nextInt();//User will enter integer
      }
      catch( Exception e ) {//Stop progarm if input is not integer
        System.out.println("Numbers only, please!");
        System.exit(0);
      }
    }
    in.close();

    int i = 0, n = array.length;
    while (i <= n ) {//sort the list from small to large
      for (int j = 1; j < n - i; j++) {
        if (array[j - 1] > array[j]) {
          int temp = array[j - 1];
          array[j - 1] = array[j];
          array[j] = temp;
        }
      }
      i++;
    }

    System.out.println("Order: " + Arrays.toString(array));
    average(array);
    median(array);
    mode(array);
  }
  public static void average(int[] array){
    double total = 0;
    for(int i = 0;i < array.length; i++) {
       total = total + array[i];
    }
    total = total/array.length;
    System.out.println("Average: "+total);

  }
  public static void median(int[] array){
    if (array.length % 2 == 1){//for odd set
      System.out.print("Median: ");
      System.out.println(array[array.length/2]);
    }
    else if(array.length % 2 == 0){// for even set
      System.out.print("Median: ");
      System.out.println((array[array.length/2-1]+array[array.length/2])/2.0);
    }
    else {
      System.out.println("Invalid");
    }
  }

  public static void mode(int[] array){
    int start = 0;//Each element of array
    int move = 0;//Start counting
    for (int i = 0; i < array.length; i++) {//loop repeats depending on the length of array
      int start2 = array[i];//start2 equals all numbers in the array
      int move2 = 0;//Another counting
      for (int p = 0; p < array.length; p++) {//loop repeats depending on the length of an array again.
        if (array[p] == start2) {//if all numbers of the array equal
          move2++;
        }
      }
      if (move2 > move) {
        start = start2;
        move = move2;
      }
    }
    System.out.println("Mode: " + start);
  }

}
//That's the end of our code!
