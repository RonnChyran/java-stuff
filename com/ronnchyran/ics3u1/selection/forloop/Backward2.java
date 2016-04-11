/*
	File Name:   Backward2.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        April 4, 2016
	Description: Counts by 5s from 100 down to a user specified number.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;

public class Backward2
{    
    public static void main(String[] args)
    {
	 	 int end;
		 Scanner input = new Scanner(System.in);
		 
		 System.out.print("Please enter a number  between 10 and 50 to end at: ");
		 end = input.nextInt();
		
		 if (end > 50 || end < 10) 
		 {
		 	System.out.println("Invalid number entered.");
			return;
		 }
		 
		 CountDescending(100, end, 5);
	 } // static void main
	 	 
	 /**
	 * Counts down from start to end (inclusive), by steps of step
	 * @param start The starting number to count from
	 * @param end When the count ends
	 * @param step The steps to count in
	 */
	 public static void CountDescending(int start, int end, int step)
	 {
		for (int current = start; current >= end; current -= step) 
		{
			System.out.println(current);
		}
	 }
} // static void CountDescending
// Backward2 class