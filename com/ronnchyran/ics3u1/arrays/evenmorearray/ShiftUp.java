/*
	File Name:   ShiftUp.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        April 5, 2016
	Description: Asks the user for an array of integers, then shifts the array up 1 position.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;

public class ShiftUp
{    
    public static void main(String[] args)
    {
	 	int[] numbers = new int[20];
	 	
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < numbers.length; i++)
		{
			System.out.print("Please enter a number: ");
			numbers[i] = input.nextInt();
		}
		
		int firstElement = numbers[0];
		for (int i = 0; i < numbers.length - 1; i++)
		{
			numbers[i] = numbers[i + 1];
		}
		numbers[numbers.length - 1] = firstElement;
		
		for (int number : numbers)
		{
			System.out.println(number);
		}		
	 } // static void main	  
}// ShiftUp class