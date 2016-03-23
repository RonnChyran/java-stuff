/*
	File Name:   Sum.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        March 23, 2016
	Description: Sums the positive integers entered by a user. Enter a negative integer to quit.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;

public class Sum
{    
    public static void main(String[] args)
    {
	 	Scanner input = new Scanner(System.in);
		int sum, entry;
		sum = 0;
	 	do
		{
			System.out.print("Please enter a number. Enter a negative number to quit: ");
			entry = input.nextInt();
			if (entry >- 0) sum += entry;
		}while (entry >= 0);
		System.out.println("Your total is: " + sum);
	 } // static void main
		 
} // Sum class