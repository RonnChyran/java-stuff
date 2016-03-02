/*
	File Name:   Average.java
	Name:        Ronny Chan
	Class:       ICS3U1-01 (B)
	Date:        February 28, 2016
	Description: Asks the user for 3 double values and calculates the average
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.Scanner;

public class Average
{
	public static void main(String[] args)
	{
		double[] numbers = new double[3];
		Scanner input = new Scanner(System.in);
		double average;
		
		for (int i = 0; i < 3; i++)
		{
			System.out.print("Please enter number #" + (i + 1) + ": ");
			numbers[i] = input.nextDouble();
			input.nextLine();
		}
		average = ((numbers[0] + numbers[1] + numbers[2]) / 3);
		
		System.out.println("The average of your 3 numbers is: " + average);
	} // static void main
} // class Average