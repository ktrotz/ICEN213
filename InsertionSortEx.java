/*This is an example of the insertion sort code*/


public class InsertionSortEx
{
 public static void main(String[] args)
 {
  int[] arr =  {5, 10, 0, 4, 2, 8, 18};
  
  System.out.print("Original array: ");
  for(int x: arr) //scans through each element of array
  {
   System.out.print(x + " ");
  }
  System.out.println();
  
  InsertionSortEx.insertionSort(arr); //call
  
  System.out.print("Sorted array: " );
  for(int x: arr)
  {
   System.out.print(x + " "); 
  }
  
  
 }
 
 public static void insertionSort(int [] array)
 {
  int unsortedValue; 
  int scan; //used to scan array
  int comp = 0;
  int swap = 0;
  
  //The first unsorted value is actually the second value therefore index = 1
  for(int index = 1; index < array.length; index++)
  {
   unsortedValue = array[index]; 
   scan = index; //start scan at first unsolved part
   
   //Move the first element to be sorted
   while (scan > 0 && array[scan - 1] > unsortedValue)
   {
     comp++;
     swap++; 
        
     
    array[scan] = array[scan - 1]; //swap values
    scan--; //change below to scan - 1
    
    array[scan] = unsortedValue; //insert into proper position 
   }
   
   comp++;
   
  }
  
  System.out.println("Compararisons: " + comp);
  System.out.println("Swaps: " + swap);
  
 }
 
 private static void swap(int[] a, int x, int y)
 {
  int temp;

  //swap
  temp = a[x];   
  a[x] = a[y];
  a[y] = temp;
 }

}
