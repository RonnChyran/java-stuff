/*
	File Name:   Reverse.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        April 5, 2016
	Description: Fills valB with the values of valA in reverse order.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;


public class Reverse
{    
    public static void main(String[] args)
    {
	   int[] valA = new int[10];
		int[] valB = new int[10];
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < valA.length; i++)
		{
			System.out.print("Enter a number: ");
			valA[i] = input.nextInt();
		}
		
		for (int i = 0; i < valB.length; i++)
		{
			valB[i] = valA[valA.length - i - 1];
		}
		
			
		for (int i = 0; i < valA.length; i++)
		{
			System.out.println("valA: " + valA[i] + ", valB: " + valB[i]);
		}
	 } // static void main
	 	  
}// Reverse class