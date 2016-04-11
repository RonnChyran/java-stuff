/*
	File Name:   Pythagorean.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        April 5, 2016
	Description: Asks the user for an integer and then finds all pythagorean triplets whose
				    largest member is less than or equal to that integer.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;


public class Pythagorean
{    
    public static void main(String[] args)
    {
	 	int maxC;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the largest member in the pythagorean triplet: ");
	   maxC = input.nextInt();
		for(int c = 1; c <= maxC; c++) 
		{
			for (int b = 1; b < c; b++)
			{
				for (int a = 1; a < b; a++)
				{
					if (a*a + b*b == c*c)
					{
						// \u00B2 is the unicode literal for superscript 2
						System.out.println(a + "\u00B2 + " + b + "\u00B2 = " + c + "\u00B2");
					}
				} 			
			}
		}
	 } // static void main
}