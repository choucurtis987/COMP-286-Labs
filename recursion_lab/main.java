// Curtis Chou
// 4/1/20
// Source Code File: "Palindrome.java"
// Recursion Lab 4
// PROMPT: Write a recursive function that returns true if the input string is a palindrome,
// that is, a word that is the same when reversed. Examples of palindromes are “deed”, ”rotor”.
// A word is a palindrome if the first and last letters match and the rest of the string is a palindrome.

import java.util.Scanner;

public class main
{
  public static void main(String args[])
  {
    Scanner scanIn = new Scanner(System.in);
    Palindrome p = new Palindrome();

    System.out.print("\nEnter word to determine if palindrome: ");
    String str = scanIn.nextLine();

    if (p.isPalindrome(str))
    {
      System.out.println(str + " is a palindrome.\n");
    }
    else
    {
      System.out.println(str + " is not a palindrome.\n");
    }
  }
}
