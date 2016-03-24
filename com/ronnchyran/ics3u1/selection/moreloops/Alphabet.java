/*
	File Name:   Alphabet.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        March 22, 2016
	Description: Continuously asks for an alphabet letter and stops when a non-alphabet letter
					 is entered. Outputs the number of upper case letters, lower case letters and
					 vowels.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;
import java.lang.*;

public class Alphabet

{    
    public static void main(String[] args)
    {
		char current;
		int upperCount, lowerCount, vowelCount;
		Scanner input = new Scanner(System.in);
		upperCount = 0;
		lowerCount = 0;
		vowelCount = 0;
		do			
		{
			System.out.print("Enter an alphabet value: ");
			current = input.next().charAt(0);
			if (Character.getType(current) == Character.UPPERCASE_LETTER) upperCount++;
			if (Character.getType(current) == Character.LOWERCASE_LETTER) lowerCount++;
			if (current == 'a' 
				|| current == 'e'
				|| current == 'i'
				|| current == 'o'
				|| current == 'u'
				|| current == 'A' 
				|| current == 'E'    
				|| current == 'I'
				|| current == 'O'
				|| current == 'U') vowelCount ++;
				
		} while (Character.isLetter(current));
		
		System.out.println("You have entered " + upperCount + " upper case letters.");
		System.out.println("You have entered " + lowerCount + " lower case letters.");
		System.out.println("You have entered " + vowelCount + " vowels.");

	 } // static void main
	 	 
} // Alphabet class