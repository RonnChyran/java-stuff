/*
	File Name:   StaticMethods.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        April 26, 2016
	Description: Some methods.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;


public class StaticMethods
{    
	public static String welcomeMessage (String name, int visitorNum)
	{
		return "Welcome " + name + " !  You are visitor number " + visitorNum + ".";
	}
	public static boolean evenlyDivisible (int x, int y)
	{
		return (x == 0 || y == 0) ? false : (x % y == 0);
	}
	public static void alarm(int iter)
	{
		if(iter < 0)
		{
			System.out.println("error");
			return;
		}
		for(int i = 0; i < iter; i++)
		{
			System.out.println("Alarm!");
		}
	}
	public static int sumRange(int x, int y)
	{
		if (y < x) 
		{
			System.out.println("Error: second number smaller than first!");
			return 0;
		}
		int n = y - x + 1;
		return (int)(n/2.0 * (x + y));
	}
	
	public static void main(String[] args)
	{
	}
 }// FormatName class