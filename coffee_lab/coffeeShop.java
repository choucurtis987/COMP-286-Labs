// Curtis Chou
// 2/3/20
// Source Code File: "coffeeShop.java"
// Coffee Shop Lab 1
// A program that calculates a customer's total cost in the coffee shop

import java.util.Scanner;
import java.text.DecimalFormat;

public class coffeeShop
{
  // basic variables
  private static String coffeeOptions[] = {"Black Coffee", "Latte", "Espresso"};
  private static double cupPrice[] = {2.45, 3.15, 4.50};
  private static double taxRate = 0.09;
  static int coffeeType;
  static int desiredCups = 1;
  // coffee shop menu:
  // coffeeOptions array has corresponding price in cupPrice array:
  // coffee numbers in menu correspond with array index of coffeeOption and cupPrice:
  static String menu = "\nCOFFEE SHOP MENU\n\n(0) Black Coffee\n(1) Latte\n(2) Espresso\n";

  // use this method to begin interaction
  public static void start()
  {
    // if desiredCups is less than 0, while loop will break
    while (desiredCups > 0)
    {
      customerService();
      // if desiredCup is not less than 0, calculate total
      if (desiredCups > 0)
      {
        calculate(desiredCups);
      }
    }
  }

  // greets customer and asks them to input desired number of cups:
  public static void customerService()
  {
    // scans in desired number of cups:
    Scanner scanIn = new Scanner(System.in);
    System.out.println(menu);
    // figures out how many cups of coffee:
    System.out.println("Hi, how many cups of coffee would you like?");
    desiredCups = scanIn.nextInt();
    // method will continue as long as desiredCups is greater than 0
    if (desiredCups > 0)
    {
      // figures out coffee type:
      System.out.println("Which coffee number would you like?");
      coffeeType = scanIn.nextInt();
    }
  }

  public static void calculate(int cups)
  {
    // importing this class to format double to 2 sigfigs:
    DecimalFormat df = new DecimalFormat("#.##");

    double subtotal = cups * cupPrice[coffeeType];
    // subtotal*taxRate is the sales tax on purchase:
    double total = subtotal + (subtotal*taxRate);

    // beginning of bill:
    System.out.println("\nCoffee Type: " + coffeeOptions[coffeeType]);
    System.out.println("Coffee Price: " + cupPrice[coffeeType]);
    System.out.println("Quantity: " + desiredCups);
    System.out.println("Tax: " + (taxRate*100) + "%");
    // prints total formatted to 2 decimals:
    System.out.println("Total: $" + df.format(total) + "\n");
    // end of bill
  }

}
