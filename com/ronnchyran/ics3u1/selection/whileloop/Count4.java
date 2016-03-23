/*
	File Name:   Count4.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        March 21, 2016
	Description: Counts from a to b by c, as determined by the user
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;

public class Count4
{    
    public static void main(String[] args)
    {
	 	int start, end, step;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your starting number: ");
		start = input.nextInt();
		
		System.out.print("Please enter your ending number: ");
		end = input.nextInt();
		
		System.out.print("Please enter the steps to count in: ");
		step = input.nextInt();
		
		Count(start, end, step);
	 } // static void main
	 
	 
	 /**
	 * Counts from start to end (inclusive), by steps of step
	 * @param start The starting number to count from
	 * @param end When the count ends
	 * @param step The steps to count in
	 */
	 public static void Count(int start, int end, int step)
	 {
	 	int current = start;
	 	while (current <= end)
		{
			System.out.println(current);
			current += step;
		}
	 } // static void Count
	 
} // Count4 class