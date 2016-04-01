/*
	File Name:   CountEven.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        March 22, 2016
	Description: Continuously asks for an integer, stops when a non positive integer
					 is entered.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;
import java.lang.*;

public class CountEven

{    
    public static void main(String[] args)
    {

		int current, evenCount;
		Scanner input = new Scanner(System.in);
		evenCount = 0;
		do			
		{
			System.out.print("Enter an integer: ");
			current = input.nextInt();
			if (current > 0 && (current % 2) == 0) evenCount++;
				
		} while (current > 0);
		
		System.out.println("You have entered " + evenCount + " even numbers");

	 } // static void main
	 	 
} // CountEven class