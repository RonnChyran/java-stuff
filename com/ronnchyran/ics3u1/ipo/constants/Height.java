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

public class Height
{
	private static final double CM_IN_INCHES = 2.54;
	
	public static void main(String[] args)
	{
		double heightInches, heightCentimeters;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your height in inches: ");
	   heightInches = input.nextDouble();
		heightCentimeters = heightInches * CM_IN_INCHES;
		
		System.out.println("Your height in centimeters is: " + heightCentimeters + " cm.");
		
	} // static void main
} // Height class