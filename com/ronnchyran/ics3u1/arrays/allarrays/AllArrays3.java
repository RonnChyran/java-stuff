/*
	File Name:   AllArrays3.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        April 5, 2016
	Description: Fills array with values, and reverses them.
					
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;

// 
public class AllArrays3
{    
    public static void main(String[] args)
    {
	 	int[][] data = 
		{{3, 2, 5},
		{1, 4, 4, 8, 13},
		{9, 1, 0, 2},
		{0, 2, 6, 4, -1, -8}};
		
		int sum = 0;
		
		for (int[] row : data)
		{
			for (int value : row)
			{
				sum += value;
			}
		}
		System.out.println("The sum of all values in the data is " + sum);
	 } //static void main
}// AllArrays3 class