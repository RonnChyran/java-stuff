/*
	File Name:   CharToString.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        April 26, 2016
	Description: Prints the first and last letter of the string
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;


public class CharToString
{    
    public static void main(String[] args)
    {
	 	char ch;
	   Scanner input = new Scanner(System.in);
		System.out.print("Please enter a character: ");	
		ch = input.nextLine().charAt(0);

		System.out.println("String: " + String.valueOf(ch));		
		System.out.println("Character: " + ch);
	 } // static void main	 	  
}// CharToString class