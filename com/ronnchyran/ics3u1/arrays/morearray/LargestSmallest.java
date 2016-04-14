/*
	File Name:   LargestSmallest.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        April 5, 2016
	Description: Fills an array of 10 integers with random values and outputs the largest
					 and smallest values in the array.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;


public class LargestSmallest
{    
    public static void main(String[] args)
    {
	 	int leastNumber = Integer.MAX_VALUE;
		int greatestNumber = Integer.MIN_VALUE;	
		int[] numbers = new int[10];
		Random random = new Random();
		
		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = random.nextInt(100) + 1; //random is exclusive, so we add 1 to get from 0-99 to 1-100.
		}
		
		for (int number : numbers)
		{
			if (number > greatestNumber) greatestNumber = number;
			if (number < leastNumber) leastNumber = number;
		}
		
		System.out.println("The greatest number is: " + greatestNumber);
		System.out.println("The least number is: " + leastNumber);

	 } // static void main
	 	  
}// LargestSmallest class