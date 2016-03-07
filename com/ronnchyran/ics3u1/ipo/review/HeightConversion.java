/*
	File Name:   HeightConversion.java
	Name:        Ronny Chan
	Class:       ICS3U1-01 (B)
	Date:        March 2, 2016
	Description: Asks the user for a height in inches and convers to centimeters
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class HeightConversion
{
	private static final double INCHES_IN_METRE = 39.37;
	
	public static void main(String[] args)
	{
		double heightInches, heightMetres;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your height in inches: ");
	   heightInches = input.nextDouble();
		heightMetres = heightInches / INCHES_IN_METRE;
		
		System.out.println("Your height in metres is: " + new DecimalFormat("0.00").format(heightMetres) + " m");
		
	} // static void main
} // HeightConversion class