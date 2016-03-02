/*
	File Name:   Drop.java
	Name:        Ronny Chan
	Class:       ICS3U1-01 (B)
	Date:        February 28, 2016
	Description: Asks the user for a time less than 4.5 seconds and calculates the height of 
					 an object.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.Scanner;
import java.lang.Math;

public class Drop
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double time; 
		double height;
		
		do
		{
			System.out.print("Please enter a time less than 4.5 seconds to determine the height of the object: ");
			time = input.nextDouble();
			if (time >= 4.5)
			{
				System.out.println("Error: time given was greater than 4.5");
			}
      } while (time >= 4.5);
				
		height = 100 - 4.9 * Math.pow(time, 2);
		
		System.out.println("The height of the object at " + time + " seconds is " + height + " meters."); 
	} // static void main
} // class Drop