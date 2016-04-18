/*
	File Name:   Fibbonaci.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        April 5, 2016
	Description: Outputs the fibonacci sequence from a given starting point for a given amount 
					 of terms.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;

public class Fibbonaci
{    
    public static void main(String[] args)
    {
	 	int[] fibonacci;
		int a, b;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter 'a': ");
		a = input.nextInt();
		
		System.out.print("Please enter 'b': ");
		b = input.nextInt();

		System.out.print("Please enter number of terms: ");
		fibonacci = new int[input.nextInt()];
		
		fibonacci[0] = a;
		fibonacci[1] = b;
		
		for (int i = 2; i < fibonacci.length; i++)
		{
			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
		}
		
		System.out.print("Fibonacci Sequence: ");
		
		for (int number : fibonacci)
		{
			System.out.print(number + //don't print a comma for the last number
			(number != fibonacci[fibonacci.length - 1] ? "," : ""));
		}
	
				
	 } // static void main	  
}