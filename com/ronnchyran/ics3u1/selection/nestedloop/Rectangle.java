/*
	File Name:   Rectangle.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        April 4, 2016
	Description: Outputs a chart with the squares and cubes of all natural numbers between
					 5 and 40.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;

public class Rectangle
{    
    public static void main(String[] args)
    {
		int rows, columns;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of rows: ");
		rows = input.nextInt();
		System.out.print("Enter number of columns: ");
		columns = input.nextInt();
		
		for (int row = 1; row <= rows; row++)
		{
			for (int col = 1; col <= columns; col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	 } // static void main
} // Rectangle class