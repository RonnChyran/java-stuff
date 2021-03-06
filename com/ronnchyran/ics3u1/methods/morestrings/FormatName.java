/*
	File Name:   FormatName.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        April 26, 2016
	Description: Adds up the values of all unicode offsets in a string
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;


public class FormatName
{    
    public static void main(String[] args)
    {
	 	String firstName, lastName, formattedName;
		int sum = 0;
	   Scanner input = new Scanner(System.in);
		System.out.print("Please enter first name: ");	
	   firstName = input.nextLine();
	 	
		System.out.print("Please enter last name: ");	
	   lastName = input.nextLine();

		formattedName = lastName + ", " + Character.toUpperCase(firstName.charAt(0)) + ".";

		System.out.println(formattedName);
	 }
}// FormatName class