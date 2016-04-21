/*
	File Name:   AllArrays1.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        April 5, 2016
	Description: a.	Ask the user to enter an integer n, then declare an array 
					      of integers of size n
			  	    b.	Initialize all elements of the array to 1
					 c.	Ask the user to enter n integers, and put them in the
					 	   array in the order of input
					 d.	Switch the values at either end of the array
					 e.	Change any negative values to positive values of the same magnitude
					 f.	Set the variable sampleSum to the sum of the values of all the elements
					 g.	Print all the even numbers in the array
	Notes:       (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;

public class AllArrays1
{    
    public static void main(String[] args)
    {
	 	 int[] array;
		 int n;
		 int sampleSum = 0;
		 Scanner input = new Scanner(System.in);
		 
		 System.out.print("Please enter the size of the array of numbers: ");
		 n = input.nextInt();
		 
		 array = new int[n];
		 Arrays.fill(array, 1);
		 array[0] *= -1;
		 
		 for (int i = 0; i < array.length; i++)
		 {
		 	System.out.print("Please enter the number at index " + i + " : ");
			array[i] = input.nextInt();
		 }
		 
		 int arrayStart = array[0];
		 int arrayEnd = array[array.length - 1];
		 
		 array[0] = arrayEnd;
		 array[array.length - 1] = arrayStart;
		 
		 for (int i = 0; i < array.length; i++)
		 {
		 	if(array[i] < 0) array[i] *= -1;
		 }
		 
		 for (int i : array)
		 {
		 	sampleSum += i;
		 }
		 
		 System.out.println("The sum of all the values in the array is " + sampleSum);
		 
		 for (int i : array)
		 {
		 	if (i % 2 == 0) System.out.println(i);
		 }
		 
	 }	// static void main	  
}// AllArrays1 class