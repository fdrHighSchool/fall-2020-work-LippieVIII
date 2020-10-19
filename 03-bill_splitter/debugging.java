import java.util.*;

public class debugging {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Bill-Splitter");
		System.out.print("Enter the total, pre-tax: ");

		double total = input.nextInt();
		System.out.print("How many people? ");

		int numPeople = input.nextInt();
		double perPerson = numPeople / total;

		System.out.println("Each person must pay $" + perPerson + ", plus tip");
	}//end main method
}//end class
