/*
	File Name:   TimesTable.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        April 5, 2016
	Description: Generates a times table of 12
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;

public class TimesTable
{    
    public static void main(String[] args)
    {
		Scanner input = new Scanner(System.in);
		
		int[][] timesTable = new int[12][12];
		for (int i = 0; i < timesTable.length; i++)
		{
			for (int j = 0; j < timesTable[i].length; j++)
			{
				timesTable[i][j] = (i + 1) * (j + 1);
			}
		}
		
		for (int col : timesTable[0])
		{
			System.out.print("\t" + col);
		}
		System.out.println();
		
		for (int i = 0; i < timesTable.length; i++)
		{
			System.out.print(timesTable[0][i]);
			for (int j = 0; j < timesTable[i].length; j++)
			{
				System.out.print("\t" + timesTable[i][j]);
			}
			System.out.println();
		}
		
	 } // static void main	  
}