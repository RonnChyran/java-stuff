/*
	File Name:   SumIntegerStrings.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        May 1, 2016
	Description: Sums the integers in a space-delimited string.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.lang.Math;
import java.util.*;	

public class SumIntegerStrings
{    
    public static void main(String[] args)
    {
	   Scanner input = new Scanner(System.in);
		String[] numbers;
		int sum = 0;
		System.out.print("Please enter 10 integers separated by spaces: ");
		numbers = input.nextLine().split(" ");
		
		/*
		sum = Arrays.asStream(input.nextLine().split(" "))
					.map(x -> Integer.parseInt(x))
					.sum();
		*/
	 	
		for (String number : numbers)
		{
			sum += Integer.parseInt(number);
		}
		
		System.out.println("The sum of the numbers is: " + sum);
	 }
}// SumIntegerStrings class