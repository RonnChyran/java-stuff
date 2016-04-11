/*
	File Name:   TimeTable.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        April 4, 2016
	Description: Outputs a chart with the squares and cubes of all natural numbers between
					 5 and 40.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;

public class TimeTable
{    
    public static void main(String[] args)
    {
	 
	   int multiplicand;
		Scanner input = new Scanner(System.in);
		 
		System.out.print("Please enter a positive integer to generate a times table for: ");
		multiplicand = input.nextInt();

			
		for (int count = 1; count <= multiplicand; count++)
		{
			int result = count * multiplicand;
			System.out.println(multiplicand + "X" + count + "=" + result);
		}
	 } // static void main
} // TimeTable class