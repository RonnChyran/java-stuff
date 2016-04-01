/*
	File Name:   SumOfPattern.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        March 29, 2016
	Description: Asks the user for n letters (n provided by the user), and sums up each number
	Notes:       The length of one tab (\t) will treInted as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;
import java.lang.*;

public class SumOfPattern

{    
    public static void main(String[] args)
    {

		int count;
		double sum;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter N");
		count = input.nextInt();
		sum = 0;

		for (int i = 1; count >= i; i++)
		{
			sum += (1D / i);
		} 
		
		System.out.println("Sum is: " + sum);

	 } // static void main
	 	 
} // SumOfPattern class