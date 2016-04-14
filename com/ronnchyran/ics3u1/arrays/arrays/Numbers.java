/*
	File Name:   Numbers.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        April 5, 2016
	Description: Asks the user for 6 numbers, prints them in reverse order,
					 adds 10% to the number and prints the values over 50
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;


public class Numbers
{    
    public static void main(String[] args)
    {
	 	double[] numbers = new double[6];
	 	Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < numbers.length; i++)
		{
			System.out.print("Please enter a number: ");
		   numbers[i] = input.nextDouble();
		}
				
		for (int i = (numbers.length - 1); i >= 0; i--)
		{
		   System.out.println(numbers[i]);			
		}
		
		for (int i = 0; i < numbers.length; i++)
		{
		   numbers[i] = numbers[i] * 1.1;
		}
		 
		System.out.println("The numbers that are greater than 50 are: ");
		for (int i = 0; i < numbers.length; i++)
		{
		   if(numbers[i] > 50) System.out.println(numbers[i]);
		}
	 } // static void main
	 	  
}// Numbers class