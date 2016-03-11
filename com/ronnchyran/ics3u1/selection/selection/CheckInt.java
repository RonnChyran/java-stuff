/*
	File Name:   CheckInt.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        March 9, 2016
	Description: The user enters and integer, and a variety of checks are done on the entered
					 integer.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.math.BigDecimal;
import java.util.*;

public class CheckInt
{    
    public static void main(String[] args)
    {
	 		boolean isPositive, isEven, isMultipleOf7;
	 		int number;
			Scanner input = new Scanner(System.in);
		
			System.out.print("Please enter a number: ");
		   number = input.nextInt();

			isPositive = (number > 0);
			isEven = (number % 2 == 0);
		   isMultipleOf7 = (number % 7 == 0);
			
			System.out.println(number + (isPositive ? " is" : " is not") + " positive");
			System.out.println(number + (isEven ? " is" :  " is not") + " even");			
			System.out.println(number + (isMultipleOf7 ? " is" : " is not") + " a multiple of 7");		
	 } // static void main
	 
} // CheckInt class