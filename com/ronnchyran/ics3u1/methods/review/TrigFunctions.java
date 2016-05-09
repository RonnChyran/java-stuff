/*
	File Name:   TrigFunctions.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        May 5, 2016
	Description: Prints out a string without any capital letters.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;


public class TrigFunctions
{    
    public static void main(String[] args)
    {
		double angle;
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Please enter an angle in radians: ");
	   angle = input.nextDouble();
				
		System.out.println("The sine of this angle is: " + Math.sin(angle));
		System.out.println("The cosine of this angle is: " + Math.cos(angle));
		System.out.println("The tangent of this angle is: " + Math.tan(angle));

	 }

}// TrigFunctions class