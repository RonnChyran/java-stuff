/*
	File Name:   LeastTwoPowers.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        March 22, 2016
	Description: Finds the least power of two that is greater than or equal to input.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;
import java.lang.Math;

public class LeastTwoPowers

{    
    public static void main(String[] args)
    {
	 	Scanner input = new Scanner(System.in);
		int value, count, power;
		count = 0;
		power = 1;
		
		System.out.print("Enter a value: ");
		value = input.nextInt();
		
		while (value > power)
		{
			power = (int)Math.pow(2, count);
			count++;
		}
		
		System.out.println("The smallest power greater than or equal to your value is 2^" + count +  "=" + power);
	 } // static void main
	 	 
} // LeastTwoPowers class