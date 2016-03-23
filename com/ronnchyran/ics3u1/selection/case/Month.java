/*
	File Name:   Month.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        March 21, 2016
	Description: Tells the user the number of days in a month
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;

public class Month
{    
    public static void main(String[] args)
    {
		Scanner input = new Scanner(System.in);
		int month;
		
		System.out.println("Which month (1-12)?");
		
		month = input.nextInt();
	 	
	 	switch (month)
		{
			case 2:
				System.out.println("28 days");
				break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("31 days");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("31 days");
				break;			
			default:
				System.out.println("Invalid month");
		}
		
	 } // static void main
	 
} // Month class