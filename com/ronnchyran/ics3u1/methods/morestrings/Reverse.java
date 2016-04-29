/*
	File Name:   Reverse.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        April 26, 2016
	Description: Splits a string in half
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;


public class Reverse
{    
    public static void main(String[] args)
    {
		String str;
	   Scanner input = new Scanner(System.in);
		System.out.print("Please enter a string: ");	
		str = new StringBuilder(input.nextLine()).reverse().toString(); 
		
	  //str = reverse(input.nextLine()); /* no need to reimplement a built-in method */
		System.out.println(str);
	 } // static void main	 	 
	 
	 public static String reverse(String string)
	 {
	 	char[] reverseString = new char[string.length()];
	 	for (int i = 0; i < reverseString.length; i++)
		{
			reverseString[reverseString.length - 1 - i] = string.charAt(i);
		}
		return new String(reverseString);
	 } 
}// Reverse class