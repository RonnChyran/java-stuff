/*
	File Name:   CastingQuestion2.java
	Name:        Ronny Chan
	Class:       ICS3U1-03 (B)
	Date:        March 3, 2016
	Description: Calculates the cost of a pizza given the diameter of the pizza.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class CastingQuestion2
{
   public static void main(String[] args)
   {
     	
		double average;
		int[] grades = new int[5];
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++)
		{
		  	System.out.print("Please enter grade #" + (i+1) +": ");
     		grades[i] = input.nextInt();
			input.nextLine();
		}
		
		average = (grades[0] + grades[1] + grades[2] + grades[3] + grades[4]) / 5.0;
		
      System.out.print("Your average is " + new DecimalFormat("#.00").format(average));
      
   } // static void main
   
} // CastingQuestion2 class