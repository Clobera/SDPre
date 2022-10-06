import java.util.Scanner;

public class MethodsLab4 {

  public static void main(String[] args) {
    Scanner kb = new Scanner (System.in);
		double num1, num2;
		boolean keepGoing = true;
		int choice;
		double answer = 0.0;

    // Part 1:
    // prompt the user to provide one number and store their input in num1
    System.out.println("Please enter a number: ")
    num1 = kb.nextDouble();

    // Part 2:
    // Prompt the user for another number and store their input in num2
    System.out.println("Please enter another number: ");
    num2 = kb.nextDouble();

		while (keepGoing) {
			printMenu();
			System.out.print("Which would you like to do? ");
			choice = kb.nextInt();

			switch (choice) {
      // Part 3:
      // Complete this switch, with each case calling one of the methods below,
      // then printing out the result (refer to "Expected Output" below)
			// Don't forget to account for a user accidentally inputting an invalid number!
      if(choice == 1) {
        System.out.println(num1 + " + " + num2 " = " + findsum());
      }
      else if(choice == 2) {
        System.out.println("The average of " + num1 + "and " + num2 + " = " = findAverage());
      }
      else if(choice == 3) {
        System.out.println("The amount in tax to be collected from a purchase of "num1 + "and " + num2 + " = " + calcTax());
      }
      else if(choice == 4) {
        System.out.println("You've chosen to quit.");
        break;
      }
      else {
        System.out.println("Invalid entry.  Please try again");
      }

		}
		kb.close();

	}

	public static void printMenu() {
		System.out.println();
		System.out.println("========= MENU =========");
		System.out.println("|                      |");
		System.out.println("|   1. Add Numbers     |");
		System.out.println("|   2. Find Average    |");
		System.out.println("|   3. Calculate Tax   |");
		System.out.println("|   4. Exit            |");
		System.out.println("|                      |");
		System.out.println("========================");
		System.out.println();
	}

	public static double findSum(double x, double y) {
		double sum = x + y;
		return sum;
	}
  // Part 4:
  // Write a method named "findAverage" that takes two doubles as parameters,
  // and returns a double that represents the average of the two parameters.
  // Use the "findSum" method as an example.
  public static double findAverage(double x, double y) {
    double average = (x + y) / 2;
    return average;
  }

	// Part 5:
  // Write a method named "calcTax" that also takes two doubles as parameters,
  // and returns a double that represents the amount of tax the user would have
  // to pay based on the total of the two parameters. Use a tax rate of 8.31%
  // (Not a grand total, just the total taxes.  Refer to "Expected Output")
  public static double calcTax(double x, double y) {
    double taxes = (x + y) * .0831;
    return taxes;
    }

  }
}
