// Curtis Chou
// 4/1/20
// Source Code File: "LinkedListStack.java" and "SetUp.java"
// Stacks Lab 3
// A program that designs and displays the schedule for when a library should
// release a book onto their shelves. The program utilizes a linked list data
// structure and Stack ADT.

public class Main
{
    public static void main(String args[])
    {
      SetUp dependecies = new SetUp();
      dependecies.loadBooks();
      // pushAll depends on loadBooks
      dependecies.pushAll();
      // divider for better visibility:
      System.out.println("\n________________________________________\n");
      dependecies.popAll();
    }
}
