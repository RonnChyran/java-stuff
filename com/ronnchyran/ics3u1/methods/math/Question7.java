/*
	File Name:   Question7.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        April 26, 2016
	Description: Prints the power of a user specified number b to the user specified
					 exponent e.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.lang.Math;
import java.util.*;	

public class Question7
{    
    public static void main(String[] args)
    {
		double base, exponent;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the base: ");
		base = input.nextDouble();
		System.out.print("Please enter the exponent: ");
		exponent = input.nextDouble();
		System.out.println(Math.pow(base, exponent));
	 }
}// Question6 class