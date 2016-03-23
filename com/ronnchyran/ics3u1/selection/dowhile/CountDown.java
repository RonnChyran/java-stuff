/*
	File Name:   CountDown.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        March 21, 2016
	Description: Counts down from 100 to 1 by 2s implemented with a do-while
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;

public class CountDown
{    
    public static void main(String[] args)
    {
			CountDescending(100, 1, 2);
		
	 } // static void main
	 
	 
	 /**
	 * Counts down from start to end (inclusive if possible), by steps of step
	 * @param start The starting number to count from
	 * @param end When the count ends
	 * @param step The steps to count in
	 */
	 public static void CountDescending(int start, int end, int step)
	 {
	 	int current = start;
	 	do
		{
			System.out.println(current);
			current -= step;
		}while (current >= end);
	 } // static void CountDescending
	 
} // CountDown class