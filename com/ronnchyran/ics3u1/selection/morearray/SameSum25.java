/*
	File Name:   SameSum25.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        April 5, 2016
	Description: User enters values between 0 and 25 into one array, and corresponding values
					 in another array are filled with values that add up to 25.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;


public class SameSum25
{    
    public static void main(String[] args)
    {
	   int[] valA = new int[10];
		int[] valB = new int[10];
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < valA.length; i++)
		{
			System.out.print("Enter a number between 0 and 25: ");
			valA[i] = input.nextInt();
			valB[i] = 25 - valA[i];
		}
			
		for (int i = 0; i < valA.length; i++)
		{
			System.out.println("valA: " + valA[i] + ", valB: " + valB[i]);
		}
	 } // static void main
	 	  
}// SameSum25 class