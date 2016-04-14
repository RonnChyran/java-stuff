/*
	File Name:   SelfReverse.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        April 5, 2016
	Description: Fills valB with the values of valA in reverse order,
				    the user specifies the length of the array.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;


public class SelfReverse
{    
    public static void main(String[] args)
    {
	   int[] valA;
		int arrayLength;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the length of the array: ");
		arrayLength = input.nextInt();
		
		valA = new int[arrayLength];
		for (int i = 0; i < valA.length; i++)
		{
			System.out.print("Enter a number: ");
			valA[i] = input.nextInt();
		}
		
		//valA = copyReverseArray(valA);
		inplaceReverseArray(valA);
		
		System.out.println("Reversed Array: ");
		for (int i = 0; i < valA.length; i++)
		{
			System.out.println(valA[i]);
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
}// SelfReverse class