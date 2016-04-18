/*
	File Name:   ShiftDown.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        April 5, 2016
	Description: Asks the user for an integer and then shifts the array down 2 positions
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;

public class ShiftDown
{    
    public static void main(String[] args)
    {
	 	int[] numbers = new int[20];
	 	int[] _numbers = new int[numbers.length];
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < numbers.length; i++)
		{
			System.out.print("Please enter a number: ");
			numbers[i] = input.nextInt();
			_numbers[i] = numbers[i];
		}
		
		int lastElement = numbers[numbers.length - 1];
		int penultimateElement = numbers[numbers.length - 2];
		
		for (int i = 2; i < numbers.length; i++)
		{
			numbers[i] = _numbers[i - 2];
		}
		
		numbers[0] = penultimateElement;
		numbers[1] = lastElement;
		
		for (int number : numbers)
		{
			System.out.println(number);
		}
	
				
	 } // static void main	  
}