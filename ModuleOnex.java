/*The following program uses a recursive algorithm to reverse strings until the user types “done” as 
the entry string. 

Done by: Kimberley Trotz
Date: 09/27/2017 */

import java.util.Scanner;

public class ModuleOnex
{
  public static void main(String[] args) 
  {
    int index; //loop control
    int end; //last element position
    String input = " "; 
    
    Scanner sc = new Scanner(System.in); //receives user input
    
    System.out.print("Enter word to print in reverse or 'done' to exit: ");
    input = sc.nextLine();
    
    end = input.length() - 1; //converts string to int
    
    for(index = end; index >= end; index++)
    {
      if(input.equals("done")) //compare fstrings
      {
        break;
      }
      
      else
      {
        System.out.println("The reverse of " + input + " is " + reverse(input));
        System.out.print("\nEnter word to print in reverse or 'done' to exit: ");  
        input = sc.nextLine();
      }
      
    }
  }
  
  
  public static String reverse(String x)
  {
    if (x.length() == 0 || x.length() == 1) 
    {
      return x;
    }
    
    //takes first char of String and then calls itself
    //substring take first letter & charAt add
    return reverse(x.substring(1)) + x.charAt(0); 
  }
}
