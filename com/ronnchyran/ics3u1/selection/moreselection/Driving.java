/*
	File Name:   AgeCheck.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        March 9, 2016
	Description: The user enters their age, and confirms whether or not they are
					 old enough to vote. If not, tells them how many years until they can vote.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.math.BigDecimal;
import java.util.*;

public class Driving
{    
	 private static int DRIVING_MIN_AGE = 18;
	 private static int DRIVING_MAX_AGE = 75;
    public static void main(String[] args)
    {
	 		int userAge;
			Scanner input = new Scanner(System.in);
		
			System.out.print("What is your age? ");
		   userAge = input.nextInt();
	
			if (userAge < DRIVING_MIN_AGE)
			{
				System.out.println("Too young to drive");
			}
			else if (userAge > DRIVING_MAX_AGE)
			{
				System.out.println("Sorry, you are over the legal age limit for driving");
			}
			else
			{
				System.out.println("Age OK.  Have you got a driver's licence");
			}
	 } // static void main
	 
} // Driving class