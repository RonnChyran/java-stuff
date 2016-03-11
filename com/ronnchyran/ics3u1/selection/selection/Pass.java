/*
	File Name:   Pass.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        March 9, 2016
	Description: Displays a random math addition question and asks the user for an answer, then
					 tells the user whether or not they are correct.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.math.BigDecimal;
import java.util.*;
public class Pass
{    
    public static void main(String[] args)
    {
	 		int a, b, answer;			
			Random random = new Random();
			Scanner input = new Scanner(System.in);
			
			a = random.nextInt(999);
			b = random.nextInt(100);
			
			System.out.print("What is " + a + "+" + b + "? ");
 			answer = input.nextInt();
			
			if (answer == a + b)
			{
				System.out.println("Correct!");
			}
			else
			{
				System.out.println("The correct answer was: " + (a+b));
			}
	 } // static void main
	 
} // Pass class