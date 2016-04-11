/*
	File Name:   Chart.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        April 4, 2016
	Description: Outputs a chart with the squares and cubes of all natural numbers between
					 5 and 40.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;

public class Chart
{    
    public static void main(String[] args)
    {
		System.out.println("Number\t\tSqaures\t\tCubes\n");

		for (int count = 5; count <= 40; count++)
		{
			System.out.print(count + "\t\t\t");
			System.out.print(count * count + "\t\t");
			System.out.print(count * count * count + "\n");
		}
		
	 } // static void main
} // Chart class