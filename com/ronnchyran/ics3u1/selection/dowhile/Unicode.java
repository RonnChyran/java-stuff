/*
	File Name:   Unicode.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        March 23, 2016
	Description: Displays a table of unicode characters from 1 to 212 uisng a do-while loop.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;

public class Unicode
{    
    public static void main(String[] args)
    {
	 	Scanner input = new Scanner(System.in);
		int count = 1;
		int max = 212;
		System.out.println("Unicode\tCharacter");
		System.out.println(":\t\t:");
	 	do
		{
			System.out.println(count + "\t\t" + (char)count);
			count++;
		} while (count <= max);
	 } // static void main
		 
} // Sum class