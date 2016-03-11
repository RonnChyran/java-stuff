/*
	File Name:   Salary.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        March 10, 2016
	Description: The user enters how many sales they have made and calculates their salary.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.text.DecimalFormat;
import java.util.*;

public class Salary
{  
	 private static int BASE_SALARY = 1000;
	 private static int SALES_THRESHOLD = 10;
	 public static void main(String[] args)
    {
	 		int salesAmount;
			double commisionRate;
			Scanner input = new Scanner(System.in);
		
			System.out.print("How many sales have you made? ");
		   salesAmount = input.nextInt();

			if (salesAmount <= SALES_THRESHOLD)
			{
				commisionRate = 0D;
			}
			else
			{
				commisionRate = salesAmount / 100D;
			}
			
			System.out.println("Your commision is " + (BASE_SALARY * (1 + commisionRate)));
			
	 } // static void main
	 
} // Salary class