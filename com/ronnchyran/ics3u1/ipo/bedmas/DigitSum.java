/*
	File Name:   DigitSum.java
	Name:        Ronny Chan
	Class:       ICS3U1-01 (B)
	Date:        February 28, 2016
	Description: Asks the user for a 3 digit number and prints out the number
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.Scanner;

public class DigitSum
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int number;
		int digit1, digit2, digit3;
		System.out.println("Please enter a 3 digit number: ");
		number = input.nextInt();
		digit1 = number / 100;
		digit2 = number % 100 / 10;
		digit3 = number % 10;
		
		System.out.print("Digit 1: " + digit1 + " Digit 2: " + digit2 + " Digit 3: " + digit3);
		
	} // static void main
} // DigitSum clas