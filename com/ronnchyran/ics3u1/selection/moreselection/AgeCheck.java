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

public class AgeCheck
{    
	 private static int VOTING_AGE = 18;
    public static void main(String[] args)
    {
	 		int userAge;
			Scanner input = new Scanner(System.in);
		
			System.out.print("What is your age? ");
		   userAge = input.nextInt();
	
			if (userAge >= VOTING_AGE)
			{
				System.out.println("OLD ENOUGH TO VOTE");
			}
			else
			{
				System.out.println(VOTING_AGE - userAge + " years until you can vote!");
			}
	 } // static void main
	 
} // AgeCheck class