/*
	File Name:   Count3.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        March 21, 2016
	Description: Counts down from 1000 to 200 by 100
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;

public class Count3
{    
    public static void main(String[] args)
    {
			CountDescending(1000, 200, 100);
		
	 } // static void main
	 
	 
	 /**
	 * Counts down from start to end (inclusive), by steps of step
	 * @param start The starting number to count from
	 * @param end When the count ends
	 * @param step The steps to count in
	 */
	 public static void CountDescending(int start, int end, int step)
	 {
	 	int current = start;
	 	while (current >= end)
		{
			System.out.println(current);
			current -= step;
		}
	 } // static void CountDescending
	 
} // Count3 class