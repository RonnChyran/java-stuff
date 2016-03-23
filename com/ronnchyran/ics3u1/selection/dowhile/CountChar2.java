/*
	File Name:   CountChar2.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        March 23, 2016
	Description: The user enters numbers, and enters a negative number to quit. Tells the user how many numbers
					 were entered, including the last one used to quit.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;

public class CountChar2
{    
    public static void main(String[] args)
    {
	 	Scanner input = new Scanner(System.in);
		int entry, count;
		count = 0;
	 	do
		{
			System.out.print("Please enter a number. Enter a negative number to quit: ");
			entry = input.nextInt();
			count++;
		} while (entry > 0);
		System.out.println("You entered " + count + " numbers");
	 } // static void main
		 
} // Sum class