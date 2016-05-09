/*
	File Name:   StringWithoutCapitals.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        May 5, 2016
	Description: Prints out a string without any capital letters.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;


public class StringWithoutCapitals
{    
    public static void main(String[] args)
    {
	 	String str, strNoCaps;
		StringBuilder sb = new StringBuilder();
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Please enter a line: ");
		str = input.nextLine();
		
		for (char character : str.toCharArray())
		{
			if (!Character.isUpperCase(character)) 
				sb.append(character);
		}
		
		strNoCaps = sb.toString();
		
		System.out.println(strNoCaps);
	 }

}// StringWithotuCapitals class