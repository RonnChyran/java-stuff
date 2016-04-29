/*
	File Name:   Alphabetic.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        April 26, 2016
	Description: Prints the first and last letter of the string
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;


public class Alphabetical
{    
    public static void main(String[] args)
    {
		String str, str2;
	   Scanner input = new Scanner(System.in);
		System.out.print("Please enter the first string: ");	
		str = input.nextLine();
		
		System.out.print("Please enter the second string: ");	
		str2 = input.nextLine();
		
		System.out.println("The first string is alphabetically " 
								+ (str.compareTo(str2) == 0 ? "even" 
								: str.compareTo(str2) > 0 ? "last" : "first")
								+ " compared to the second one.");
	 } // static void main	 	  
}// Alphabetical class