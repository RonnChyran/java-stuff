/*
	File Name:   Powers.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        March 30, 2016
	Description: Computes X^N, where X is a floating point number, N is a positive integer.
	Notes:       The length of one tab (\t) will treInted as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;

public class Powers
{    
    public static void main(String[] args)
    {
		int exponent;
		double base, result;  
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter X: ");
		base = input.nextDouble();
		
		System.out.print("Enter N: ");
		exponent = input.nextInt(); 
		
		result = 1;
		
		for (int i = 0; i < exponent; i++)
		{
			result *= base;
		}
			
		System.out.println(base + " raised to the power " + exponent + "is: " + result);
		
	 } // static void main
	 	 
} // Powers class