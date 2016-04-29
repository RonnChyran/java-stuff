/*
	File Name:   MakeUppercase.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        April 26, 2016
	Description: Adds up the values of all unicode offsets in a string
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;


public class MakeUppercase
{    
    public static void main(String[] args)
    {
	 	String str;
		int sum = 0;
	   Scanner input = new Scanner(System.in);
		System.out.print("Please enter a string: ");	
		str = input.nextLine();
		System.out.println("Uppercase equivalent: " + str.toUpperCase());		
	 }
}// MakeUppercase class