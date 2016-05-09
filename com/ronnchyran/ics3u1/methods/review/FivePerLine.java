/*
	File Name:   RandomHighLow.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        May 5, 2016
	Description: Outputs a random number in the range
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;


public class FivePerLine
{    
    public static void main(String[] args)
    {
	 	String value;
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Please enter a line: ");
		value = input.nextLine();
		
		for (int count = 0; count < value.length(); count++)
		{
			if (count % 5 == 0) 
				System.out.println();
			System.out.print(value.charAt(count));
		}
	}

}// RandomHighLow class