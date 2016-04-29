/*
	File Name:   FirstLast.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        April 26, 2016
	Description: Prints the first and last letter of the string
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;


public class FirstLast
{    
    public static void main(String[] args)
    {
		String str;
	   Scanner input = new Scanner(System.in);
		System.out.print("Please enter a string: ");	
		str = input.nextLine();
		
		System.out.println("The first letter is " + str.charAt(0));
		System.out.println("The last letter is " + str.charAt(str.length() - 1));
		
	 } // static void main	 	  
}// FirstLast class