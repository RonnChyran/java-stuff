/*
	File Name:   Half.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        April 26, 2016
	Description: Splits a string in half
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;


public class Half
{    
    public static void main(String[] args)
    {
		String str;
	   Scanner input = new Scanner(System.in);
		System.out.print("Please enter a string: ");	
		str = input.nextLine();

		System.out.println(str.substring(0, str.length() / 2));		
		System.out.println(str.substring(str.length() / 2));
	 } // static void main	 	  
}// Alphabetical class