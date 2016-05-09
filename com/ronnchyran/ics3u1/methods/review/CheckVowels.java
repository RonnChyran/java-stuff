/*
	File Name:   CheckVowels.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        May 1, 2016
	Description: Asks the user to enter a line of text, and then outputs the
					 number of vowels in the line.  Also, output a message indicating
					 which word(s) begin with a vowel.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.lang.Math;
import java.util.*;	

public class CheckVowels
{   
	 public static final char[] VOWELS = new char[] {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
    public static void main(String[] args)
    {
	   Scanner input = new Scanner(System.in);
		int vowelCount = 0;
		String line;
		List<String> vowelWords = new ArrayList<String>();
		System.out.print("Please enter a line: ");
	
		line = input.nextLine();	 	
		
		for (char letter : line.toCharArray())
		{
			if (contains(VOWELS, letter))
				vowelCount++;
		}
		
		for (String word : line.split(" "))
		{
			if (word.length() <= 0) continue;
			
			if (contains(VOWELS, word.charAt(0)))
				vowelWords.add(word);
		}
		
	   System.out.println("The line has " + vowelCount + " vowels");
		System.out.println("The following words begin with vowels:");
		
		for (String word : vowelWords)
		{
			System.out.println(word);
		}
	 }
	 
	 public static boolean contains(char[] array, char comparison)
	 {
	 	for (char letter: array)
		{
			if (letter == comparison)
				return true;
		}
		return false;
	 }
	 
}// CheckVowels class