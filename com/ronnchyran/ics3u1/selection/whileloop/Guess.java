/*
	File Name:   Guess.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        March 21, 2016
	Description: The user guesses a number from 1 to 20 until they guess correctly.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;

public class Guess
{    
    public static void main(String[] args)
    {
	 	int number, guess;
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		guess = 0;
		number = random.nextInt(20) + 1;
		
		while (guess != number)
		{
			System.out.print("Please enter your guess: ");
			guess = input.nextInt();
		}		
		
		System.out.println("Correct!");
	 } // static void main
	 	 
} // Guess class