/*
	File Name:   ReviewQuestion5.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        April 6, 2016
	Description: Displays a message depending on how much a person excersises a week.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;

public class ReviewQuestion5
{
	public static void main(String[] args)
	{
		int total ;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many hours do you excersise a week?");
		total = sc.nextInt();	
		if (total >=0 && total < 2)
		{
			System.out.println("Ah!! Your heart is crying for some action!");
		}
		else if (total >= 2 && total <= 5)
		{
			System.out.println("Not bad!");
		} 	
		else if (total >= 6 && total <= 10)
		{
			System.out.println("Superstar!!");
		}
		else if (total > 10)
		{
			System.out.println("You are Olympics bound!!");
		}
		else
		{
			System.out.println("error");
		}
	}
}