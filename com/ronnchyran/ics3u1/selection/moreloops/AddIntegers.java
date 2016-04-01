/*
	File Name:   AddIntegers.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        March 29, 2016
	Description: Asks the user for n letters (n provided by the user), and sums up each number
	Notes:       The length of one tab (\t) will treInted as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;
import java.lang.*;

public class AddIntegers

{    
    public static void main(String[] args)
    {

		int sum, count;
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many integers will be added?");
		count = input.nextInt();
		sum = 0;
		
		for (int i = 0; count > i; i++)
		{
			System.out.println("Enter an integer:");
			sum += input.nextInt();
		} 
		System.out.println("The sum is " + sum);

	 } // static void main
	 	 
} // AddIntegers class