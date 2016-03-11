/*
	File Name:   Capital.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        March 10, 2016
	Description: The user enters the capital of Canada and checks if they got it correct.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.math.BigDecimal;
import java.util.*;

public class Capital
{    
	 private static String CAPITAL = "Ottawa";
	 public static void main(String[] args)
    {
			String capital;
			Scanner input = new Scanner(System.in);
		
			System.out.print("What is the capital of Canada? ");
		   capital = input.nextLine();
	
			if (capital.equalsIgnoreCase(CAPITAL)) //capital == CAPITAL will not work, as capital and CAPITAL are different objects
			{
				System.out.println("Correct!");
			}
			else
			{
				System.out.println("Incorrect!");
			}
	 } // static void main
	 
} // Capital