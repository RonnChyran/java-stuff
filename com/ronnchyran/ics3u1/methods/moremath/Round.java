/*
	File Name:   Round.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        April 26, 2016
	Description: Outputs the bigger number of 2
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.lang.Math;
import java.util.*;	

public class Round
{    
    public static void main(String[] args)
    {
		double num;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the number: ");
	  	num = input.nextDouble();
		System.out.println("The rounded value is " + round(num));
	 }
	 
	 public static int round(double value)
	 {
	 	return (int)value + (value % 1 >= 0.5 ? 1 : 0);
	 }
}// Round class