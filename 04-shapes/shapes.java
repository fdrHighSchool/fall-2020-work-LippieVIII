import java.util.Scanner;

public class shapes {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    ///Triangle
    System.out.println("1. Enter the width of the Triangle:");
    double b = s.nextDouble();
    System.out.println("Enter the height of the Triangle:");
    double h = s.nextDouble();
    double area = triangle(b, h);
    System.out.println("Area of Triangle is: " + area);

    ///Square
    System.out.println("2. Enter the length of the Square:");
    double l = s.nextDouble();
    double area2 = square(l);
    System.out.println("Area of the Square is: " + area2);

    ///Circle
    System.out.println("3. Enter the radius of the Circle:");
    double r = s.nextDouble();
    double area3 = circle(r);
    System.out.println("Area of the Cirlce is: " + area3 + "π");

    ///Rectangle
    System.out.println("4. Enter the length of the Rectangle:");
    double l2 = s.nextDouble();
    System.out.println("Enter the width of the Triangle:");
    double w2 = s.nextDouble();
    double area4 = rectangle(l2, w2);
    System.out.println("Area of the rectangle is: " + area4);

    ///Prism
    System.out.println("5. Enter the length and width of the prism:");
    double l3 = s.nextDouble();
    double w3 = s.nextDouble();
    System.out.println("Enter the height of the prism");
    double height = s.nextDouble();
    double area5 = prism(l3, w3, height);
    System.out.println("Volume of the prism is: " + area5);

    ///Cube
    System.out.println("6. Enter the length of a cube: ");
    double l4 = s.nextDouble();
    double area6 = cube(l4);
    System.out.println("Volume of the cube is: " + area6);

    ///Triangular Prism
    ///((b * w * h) / 2)
    System.out.println("7. Enter the length and width of the prism:");
    double l5 = s.nextDouble();
    double w4 = s.nextDouble();
    System.out.println("Enter the height of the prism:");
    double height2 = s.nextDouble();
    double area7 = triangularPrism(l5, w4, height2);
    System.out.println("Volume of the triangular prism is: " + area7);

    ///Sphere
    ///(4 * pi * r cubed) / 3
    System.out.print("8. Enter the radius of the sphere:");
    double radius = s.nextDouble();
    double area8 = sphere(radius);
    System.out.println("Volume of the sphere is: " + area8 + "π");

  }

  static double triangle(double b, double h) {
    return ((b * h) / 2);
  }

  static double square(double l) {
    return (l * l);
  }

  static double circle(double r) {
    return (r * r);
  }

  static double rectangle(double l2, double w2) {
    return (l2 * w2);
  }

  static double prism(double l3, double w3, double height) {
    return ((l3 * w3) * height);
  }

  static double cube(double l4) {
    return (l4 * l4 * l4);
  }

  static double triangularPrism(double l5, double w4, double height2) {
    return (((l5 * w4) * height2) / 2);
  }

  static double sphere(double radius) {
    return ((4 * (radius * radius * radius)) / 3);
  }
}
