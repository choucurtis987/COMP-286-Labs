// Curtis Chou
// 4/1/20
// Source Code File: "LinkedListStack.java" and "SetUp.java"
// Stacks Lab 3
// A program that designs and displays the schedule for when a library should
// release a book onto their shelves. The program utilizes a linked list data
// structure and Stack ADT.

public class LinkedListStack
{
  public static Node head;
  // Custom Stack implemenation of a linked list
  public LinkedListStack()
  {
    this.head = null;
  }

  static void push(Node book)
  {
    book.next = head;
    head = book;
    System.out.println(book.title);
    System.out.println(book.author);
    System.out.println();
  }

  static void pop()
  {
    // determines if stack is empty then proceeds with pop functionality
    if (isEmpty())
    {
      System.out.println("Stack is Empty");
    }
    else
    {
      System.out.println(head.title);
      System.out.println("Release Month: " + head.month);
      System.out.println("Alternate Month: " + head.alternateMonth);
      System.out.println();

      head = head.next;
    }
  }

  static void peek()
  {
    System.out.println(head.title);
  }

  static boolean isEmpty()
  {
    return head==null;
  }

  // prints entire linked list:
  static void printList()
  {
    Node current_node = head;

    while (current_node != null)
    {
      System.out.println(current_node.title);
      current_node = current_node.next;
    }
  }

}

// Node Class for Linked List:
class Node
{
  public String title;
  public String author;
  public String month;
  public String alternateMonth;

  public Node next;

  public Node(String title, String author, String month, String alternateMonth)
  {
    // makes sure Release Month (month) and Alternate Month are different:
    if (month== alternateMonth)
    {
      throw new IllegalArgumentException("Month and Alternate Month cannot be the same");
    }

    this.title = title;
    this.author = author;
    this.month = month;
    this.alternateMonth = alternateMonth;
    this.next = null;
  }

}
