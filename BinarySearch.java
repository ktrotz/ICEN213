import java.util.Scanner;

public class BinarySearch
{ 
 public static void main(String[] args)
 {
  int result; 
  int searchValue;
  String input;

  int numbers[] = {536, 289, 296, 429, 319, 142, 394, 101, 388, 147, 
             417, 199, 207, 222,189, 310, 447, 521, 234, 600};

  // Create a Scanner object for keyboard input.
  Scanner keyboard = new Scanner(System.in);

  bubbleSort(numbers); //sort the array in ascending order


  do
  {
   System.out.print("Enter a value to search for: ");
   searchValue = keyboard.nextInt();

   //Search for the value
   result = search(numbers, searchValue);


   if (result == -1)
    System.out.println(searchValue + " was not found.");

   else
    System.out.println(searchValue + " was found at element " + result);


   keyboard.nextLine(); //consume the remaining newline


   System.out.print("Do you want to search again? (Y or N): ");
   input = keyboard.nextLine();
  }

  while (input.charAt(0) == 'y' || input.charAt(0) == 'Y');
 }


 public static int search(int[] array, int value)
 {
  int first = 0;      
  int last = array.length - 1;      
  int middle = (first + last) / 2;    
  int position = -1; //return -1 if search value not found
  boolean found = false; //remains false if "if" condition not true


  // Search for the value.
  while (!found && first <= last)
  { 
   //If value is middle
   if (array[middle] == value)
   {
    found = true;
    position = middle;
   }

   //Value is in lower half
   else if (array[middle] > value)
    last = middle - 1;

   //Value is in upper half
   else
    first = middle + 1;
  }


  return position;
 }


 public static void bubbleSort(int[] array)
 {
  int lastPos; 
  int index; 
  int temp; 

  for(lastPos = array.length - 1; lastPos >= 0; lastPos--)
  {
   for(index = 0; index <= lastPos -1; index++) 
   {                                            
    if(array[index] > array[index + 1]) 
    {
     temp = array[index]; 
     array[index] = array[index + 1]; 
     array[index + 1] = temp;
    }
   }
  }
 }
}


