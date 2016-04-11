/*
	File Name:   NumberList.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        April 5, 2016
	Description: Outputs a table of integers with x from 1 to y 
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;

public class NumberList
{    
    public static void main(String[] args)
    {
		int rows, columns;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of x: ");
		rows = input.nextInt();
		System.out.print("Enter number of y: ");
		columns = input.nextInt();
		
		for (int row = 1; row <= rows; row++)
		{
			for (int col = 1; col <= columns; col++)
			{
				System.out.print(col);
			}
			System.out.println();
		}
	 } // static void main
} // NumberList class