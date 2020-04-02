// Curtis Chou
// 4/1/20
// Source Code File: "LinkedListStack.java" and "SetUp.java"
// Stacks Lab 3
// A program that designs and displays the schedule for when a library should
// release a book onto their shelves. The program utilizes a linked list data
// structure and Stack ADT.

public class SetUp
{
  // create a stack:
  static LinkedListStack stack = new LinkedListStack();
  // declare node variables:
  static Node book1;
  static Node book2;
  static Node book3;
  static Node book4;
  static Node book5;
  static Node book6;
  static Node book7;
  static Node book8;
  static Node book9;
  static Node book10;
  static Node book11;
  static Node book12;
  // assigning node variables:
  static void loadBooks()
  {
    book1 = new Node("Percy Jackson & the Olympians: The Lightning Thief", "Rick Riordan", "December", "January");
    book2 = new Node("Percy Jackson & the Olympians: The Sea of Monsters", "Rick Riordan", "November", "December");
    book3 = new Node("Percy Jackson & the Olympians: The Titan’s Curse", "Rick Riordan", "October", "November");
    book4 = new Node("Percy Jackson & the Olympians: The Battle of the Labyrinth", "Rick Riordan", "September", "October");
    book5 = new Node("Percy Jackson & the Olympians: The Last Olympian", "Rick Riordan", "August", "September");
    book6 = new Node("The Heroes of Olympus: The Lost Hero", "Rick Riordan", "July", "August");
    book7 = new Node("The Heroes of Olympus: The Son of Neptune", "Rick Riordan", "June", "July");
    book8 = new Node("The Heroes of Olympus: The Mark of Athena", "Rick Riordan", "May", "June");
    book9 = new Node("The Heroes of Olympus: The House of Hades", "Rick Riordan", "April", "May");
    book10 = new Node("The Heroes of Olympus: The Blood of Olympus", "Rick Riordan", "March", "April");
    book11 = new Node("Front Row at the Trump Show", "Jonathan Karl", "February", "March");
    book12 = new Node("The Intelligent Investor: The Definitive Book on Value Investing.", "Benjamin Graham", "January", "February");
  }
  // pushing on nodes into stack:
  // this method is dependent on loadBooks therefore loadBooks must be called
  // first or else 12 nulls will placed into the stack
  static void pushAll()
  {
    stack.push(book1);
    stack.push(book2);
    stack.push(book3);
    stack.push(book4);
    stack.push(book5);
    stack.push(book6);
    stack.push(book7);
    stack.push(book8);
    stack.push(book9);
    stack.push(book10);
    stack.push(book11);
    stack.push(book12);
  }

  static void popAll()
  {
    while(!stack.isEmpty())
    {
      stack.pop();
    }
  }

}
