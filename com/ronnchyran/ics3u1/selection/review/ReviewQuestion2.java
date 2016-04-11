/*
	File Name:   ReviewQuestion2.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        April 6, 2016
	Description: Rewrites the q. 2 example in review to use if/else
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;

public class ReviewQuestion2
{
	public static void main(String[] args)
	{
	int total ;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter answer:");
	total = sc.nextInt();
	
	if (total <= 0 ) 
	{
		System.out.println("Invalid mark: error");
	}
	
	if (total == 5 || total == 6)
	{
		System.out.println("way off");
	}
	else if (total == 2)
	{
		System.out.println("correct"); 
	}
	else if (total == 3)
	{
		System.out.println("congrats");
	}
	else if (total == 1 || (total >= 7 && total <= 12))
	{
		System.out.println("satisfactory");
	}
	else 
	{
				System.out.println("great mark");
	}
	}
}