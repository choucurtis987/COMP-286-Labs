// Curtis Chou
// 4/1/20
// Source Code File: "Palindrome.java"
// Recursion Lab 4
// PROMPT: Write a recursive function that returns true if the input string is a palindrome,
// that is, a word that is the same when reversed. Examples of palindromes are “deed”, ”rotor”.
// A word is a palindrome if the first and last letters match and the rest of the string is a palindrome.

public class Palindrome
{

  static boolean isPalindrome(String str)
  {
    // converting string to all lowercase to battle case sensitivity:
    str = str.toLowerCase();
    // Special Case:
    if (str.length()==0)
    {
      return false;
    }
    // Base Cases:
    else if (str.length()==1)
    {
      return true;
    }

    else if ( str.charAt(0)==(str.charAt(str.length()-1) ) && str.length()==2)
    {
      return true;
    }
    // Recursive Case:
    else if ( str.charAt(0)==(str.charAt(str.length()-1) ) )
    {
      str = str.substring(1,str.length()-1);
      return isPalindrome(str);
    }
    // if none the conditions above are met then str is not a palindrome
    // therefore return false:
    return false;
  }

}
