/*
	File Name:   Count2.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        March 21, 2016
	Description: Counts from 0 to 50 by 5
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;

public class Count2
{    
    public static void main(String[] args)
    {
			Count(0, 50, 5);
		
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
	 
} // Count2 class