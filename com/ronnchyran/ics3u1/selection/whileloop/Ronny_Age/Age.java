/*
	File Name:   Age.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        March 21, 2016
	Description: The user guesses age (ex. 16) until they get it right.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;

public class Age
{    
    public static void main(String[] args)
    {
	 	int age, guess;
		Scanner input = new Scanner(System.in);
		
		guess = 0;
		age = 16;
		
		while (guess != age)
		{
			System.out.print("Please enter your guess: ");
			guess = input.nextInt();
			
			if(guess > age)
			{
				System.out.println("Your guess is too high.");
			}
			else if(guess < age) 
			{
				System.out.println("Your guess is too low.");
			}
		}		
		
		System.out.println("Correct! That's my age!");
	 } // static void main
	 	 
} // Age class