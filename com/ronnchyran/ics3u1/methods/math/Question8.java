/*
	File Name:   Question8.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        April 26, 2016
	Description: Outputs the absolute value of a user specified number
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.lang.Math;
import java.util.*;	

public class Question8
{    
    public static void main(String[] args)
    {
		double number;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number: ");
	   number = input.nextDouble();
		System.out.print("Absolute value: " + Math.abs(number));
	 }
}// Question6 class