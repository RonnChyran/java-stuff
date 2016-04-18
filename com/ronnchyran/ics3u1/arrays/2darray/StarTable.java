/*
	File Name:   StarTable.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        April 5, 2016
	Description: Asks for a dimensions of a table of stars and outputs as a 2D array.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;

public class StarTable
{    
    public static void main(String[] args)
    {
	 	int length, width;
		Scanner input = new Scanner(System.in);
		
		char[][] starTable;
		
		System.out.print("Please enter the length of the table: ");
		length = input.nextInt();
	
		System.out.print("Please enter the width of the table: ");
		width = input.nextInt();			
		
		starTable = new char[length][width];
		
		Arrays.fill(starTable[0], '*');
		Arrays.fill(starTable, starTable[0]);
		
		System.out.println();
		for (char[] starRow : starTable)
		{
			for (char starCol : starRow)
			{
				System.out.print(starCol);
			}
			System.out.println();
		}
		
	 } // static void main	  
}