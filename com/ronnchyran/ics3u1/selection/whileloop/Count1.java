/*
	File Name:   Count1.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        March 21, 2016
	Description: Counts from 50 to 100 by 1
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;

public class Count1
{    
    public static void main(String[] args)
    {
			Count(50, 100, 1);
		
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

} // Count1 class