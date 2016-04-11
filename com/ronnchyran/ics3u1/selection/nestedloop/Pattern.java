/*
	File Name:   Pattern.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        April 4, 2016
	Description: Outputs a triangle of numbers from 1 to 5, and then reverse.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;

public class Pattern
{    
    public static void main(String[] args)
    {

		for (int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= i; j++) 
			{
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("Generating reverse iteration..\n");
		
		for (int i = 5; i >= 1; i--)
		{
			for(int j = 1; j <= i; j++) 
			{
				System.out.print(j);
			}
			System.out.println();
		}

	 } // static void main
} // Pattern class