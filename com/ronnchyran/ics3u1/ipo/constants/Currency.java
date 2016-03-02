/*
	File Name:   Height.java
	Name:        Ronny Chan
	Class:       ICS3U1-01 (B)
	Date:        March 2, 2016
	Description: Asks the user for a height in inches and convers to centimeters
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Currency
{
	private static final double CAD_IN_USD = 0.74;
	
	public static void main(String[] args)
	{
		double cadValue, usdValue;
		DecimalFormat df = new DecimalFormat("#.00");
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the price in Canadian Dollars: $");
	   cadValue = input.nextDouble();
		usdValue = cadValue * CAD_IN_USD;
		
		System.out.println("The cost in US dollars is: $" + usdValue);
		
	} // static void main
} // Currency class