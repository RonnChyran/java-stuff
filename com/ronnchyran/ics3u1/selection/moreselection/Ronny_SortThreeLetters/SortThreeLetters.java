/*
	File Name:   SortThreeLetters.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        March 9, 2016
	Description: Prompts 3 lowercase letters and sorts them in alphabetical order.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;

public class SortThreeLetters
{    
	 public static void main(String[] args)
    {
			char[] letters = new char[3];
			char[] sortedLetters = new char[3];
			Scanner input = new Scanner(System.in);
			
			for (int i = 0; i < 3; i++)
			{
				do
				{
					System.out.print("Please enter letter #" + (i + 1) + ": ");
					letters[i] = input.nextLine().charAt(0);
					if(!(letters[i] >= 'a' && letters[i] <= 'z' )) 
					{
						System.out.println("Invalid letter: Lower-case letters only");
					}
				}  while (!(letters[i] >= 'a' && letters[i] <= 'z' )); 
			}//end for
			
			if (letters[0] < letters[1] && letters[0] < letters[2])
			{
				sortedLetters[0] = letters[0];
				if (letters[1] < letters[2])
				{
					sortedLetters[1] = letters[1];
					sortedLetters[2] = letters[2];
				}
				else 
				{
					sortedLetters[1] = letters[2];
					sortedLetters[2] = letters[1];
				}
			}//end if
			else if (letters[1] < letters[0] && letters[1] < letters[2])
			{
				sortedLetters[0] = letters[1];
				if (letters[0] < letters[2])
				{
					sortedLetters[1] = letters[0];
					sortedLetters[2] = letters[2];
				}
				else 
				{
					sortedLetters[1] = letters[2];
					sortedLetters[2] = letters[0];
				}
			}//end elseif
			else
			{
				sortedLetters[0] = letters[2];
				if (letters[0] < letters[1])
				{
					sortedLetters[1] = letters[1];
					sortedLetters[2] = letters[0];
				}
				else 
				{
					sortedLetters[1] = letters[0];
					sortedLetters[2] = letters[1];
				}
			}//end else
			System.out.println(sortedLetters[0] + ", " + sortedLetters[1] + ", " + sortedLetters[2]);
	 } // static void main
	 
} // SortThreeLetters class