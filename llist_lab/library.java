// Curtis Chou
// 2/28/20
// Source Code File: "library.java"
// Linked Lists Lab 2
// A program that determines whether or not a patron is in our library system.
// Our library system is a linked list data structure.


import java.util.Scanner;
// Linked List Class:
public class library
{
  // pointer to first node:
  public static patrons head;

  public library()
  {
    this.head = null;
  }

  // Node Class:
  static class patrons
  {
    // define all desired variables:
    public String name;
    public String cardNumber;
    public String street;
    public String city;
    public String zip;
    public patrons next;

    public patrons(String name, String cardNumber, String street, String city, String zip)
    {
      this.name = name;
      this.cardNumber = cardNumber;
      this.street = street;
      this.city = city;
      this.zip = zip;
      this.next = null;
    }
  } // end of patrons class

  // adding a patron to the list
  public static void add(patrons p)
  {
    p.next = head;
    library.head = p;
  }

  // print all names in the linked list
  public void printList()
  {
    patrons current_node = head;

    while (current_node!=null)
    {
      System.out.println(current_node.name);
      current_node = current_node.next;
    }
  }

  // load 8 patrons into the linked list
  public void load()
  {
    patrons p1 = new patrons("Michael", "123", "86 B St", "SSF", "94080");
    add(p1);
    patrons p2 = new patrons("Dwight", "456", "79 A St", "SSF", "94080");
    add(p2);
    patrons p3 = new patrons("Angela", "789", "25 C St", "SSF", "94080");
    add(p3);
    patrons p4 = new patrons("Pam", "342", "27 D St", "SSF", "94080");
    add(p4);
    patrons p5 = new patrons("Jim", "242", "27 D St", "SSF", "94080");
    add(p5);
    patrons p6 = new patrons("Kevin", "169", "45 E St", "SSF", "94080");
    add(p6);
    patrons p7 = new patrons("Andy", "190", "23 F St", "SSF", "94080");
    add(p7);
    patrons p8 = new patrons("Meridth", "175", "28 W St", "SSF", "94080");
    add(p8);
  }

  public void inList(String name)
  {
    // setting current node equal to the first node:
    patrons current_node = head;
    boolean inSystem = false;

    // iterate through linked list
    while (current_node!=null)
    {
      // converting patron names to all lowercase to combat case sensitivity:
      String patronName = current_node.name.toLowerCase();
      // converting inputted name to all lowercase to combat case sensitivity:
      // determines if patron is in the system:
      if (patronName.equals(name.toLowerCase()))
      {
        inSystem = true;
        System.out.println("\nPatron is our system!\n");
        System.out.println("Name: " + current_node.name);
        System.out.println("Card Number: " + current_node.cardNumber);
        System.out.println("Street: " + current_node.street);
        System.out.println("City: " + current_node.city);
        System.out.println("Zipcode: " + current_node.zip);
      }
      current_node = current_node.next;
    }

    if (inSystem==false)
    {
      System.out.println("Sorry, you are not in our system.");
    }

  } // end of inList

  public void userInterface()
  {
    library lib = new library();
    lib.load();
    Scanner scanIn = new Scanner(System.in);
    System.out.print("Hi, what is your name? ");

    String name = scanIn.nextLine();
    lib.inList(name);
  }

}
