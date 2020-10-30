import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Enter point 1: ");
    String point1 = s.nextLine();

    System.out.print("Enter point 2: ");
    String point2 = s.nextLine();

    System.out.printf("The distance between " + point1 + " and " + point2 + " is...\n");

    int x1 = getX(point1);
    int x2 = getX(point2);
    int y1 = getY(point1);
    int y2 = getY(point2);

    int xdistance = x1 - x2;
    int ydistance = y1 - y2;

    System.out.println("The distance between the X values is " + xdistance);
    System.out.println("The distance between the Y values is " + ydistance);

  }//end main method

  public static double euclideanDistance() {
    return 0.0;

  }//end cartesianDistance

  public static double taxicabDistance() {
    return 0.0;

  }//end cartesianDistance

  public static int getX(String point) {
    int comma = point.indexOf(",");
    String x = point.substring(1, comma);
    return Integer.parseInt(x);

  }//end getX method

  public static int getY(String point){
    int comma = point.indexOf(",");
    int pss = point.indexOf(")");
    String y = point.substring((comma + 2), pss);
    return Integer.parseInt(y);

  }

}//end class
