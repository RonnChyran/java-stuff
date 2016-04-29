/*
	File Name:   HiddenPassword.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        April 26, 2016
	Description: Replaces all characters that are not spaces as a specified character
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;


public class HiddenPassword
{    
    public static void main(String[] args)
    {
		String password;
		char hiddenChar;
		
	   Scanner input = new Scanner(System.in);
		System.out.print("Please enter a string: ");	
		password = input.nextLine();
		
		System.out.print("Enter a replacement character: ");
		
		hiddenChar = input.nextLine().charAt(0);
		
	/*	System.out.println("Hidden Password: "
								 + password.replaceAll("[^ ]", String.valueOf(hiddenChar));*/
								 
		System.out.println("Hidden Password: "
								 + replaceAllInverse(' ', hiddenChar, password));
	 } // static void main
	 
	 public static String replaceAllInverse(char inverse, char replacement, String target)
	 {
	  	 StringBuilder result = new StringBuilder();
		 for (Character character : target.toCharArray())
		 	result.append(character.equals(inverse) ? character : replacement);
		 return result.toString();
		
	 }
}// HiddenPassword class