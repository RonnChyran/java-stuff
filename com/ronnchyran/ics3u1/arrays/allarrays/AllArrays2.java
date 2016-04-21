/*
	File Name:   AllArrays2.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        April 5, 2016
	Description: Fills array with values, and reverses them.
					
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;

// 
public class AllArrays2
{    
    public static void main(String[] args)
    {
	   int[] array = new int[14];
		int arrayLength;
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < array.length; i++)
		{
			System.out.print("Enter a number: ");
			array[i] = input.nextInt();
		}
		
		/* Uncomment `array = copyReverseArray(array);` and comment out `inplaceReverseArray(array);`		   for the 'copy' implementation of reverse
		*/ 
		
		//array = copyReverseArray(array);
		inplaceReverseArray(array);
		
		System.out.println("Reversed Array: ");
		for (int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
	 } // static void main
	 	  
	 public static int[] copyReverseArray(int[] array)
	 {
	 	int[] reversed = new int[array.length];
	 	for (int i = 0; i < reversed.length; i++)
		{
			reversed[i] = array[array.length - i - 1];
		}
		return reversed;
	 }
	 
	 public static void inplaceReverseArray(int[] array)
	 {
	 	for (int i = 0; i < array.length / 2; i++)
		{
			int correspondingIndex = array.length - i - 1;
			int currentBottomElement = array[correspondingIndex];
			array[correspondingIndex] = array[i];
			array[i] = currentBottomElement;
		}
	 }
}// AllArrays2 class