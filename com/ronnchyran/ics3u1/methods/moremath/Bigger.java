/*
	File Name:   Bigger.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        April 26, 2016
	Description: Outputs the bigger number of 2
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.lang.Math;
import java.util.*;	

public class Bigger
{    
    public static void main(String[] args)
    {
		double num1, num2;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the first number: ");
	  	num1 = input.nextDouble();
		System.out.print("Please enter the second number: ");
	  	num2 = input.nextDouble();
		
	  	System.out.print(Math.max(num1, num2) + " is the bigger number.");
	 }
}// Bigger class