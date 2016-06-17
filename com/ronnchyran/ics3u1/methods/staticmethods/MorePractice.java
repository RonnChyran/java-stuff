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


public class MorePractice
{    
	public static boolean perfectSquare(int n)
	{
		if (n <= 0) return false;
		return Math.sqrt(n) % 1 == 0;
	}
	
	public static String mySubstring(String s, int start, int end)
	{
		StringBuilder sb =  new StringBuilder();
		for (int i = start; i < s.length() && i < end; i++)
		{
			sb.append(s.charAt(i));
		}	
		return sb.toString();
	}
	
	public static String mySubstring(String s, int start)
	{
		return mySubstring(s, start, s.length());
	}
	
	public static String reverse(String s)
	{
		return new StringBuilder(s).reverse().toString();
	}
	
	public static boolean sameReverse(String s)
	{
		return s.equals(reverse(s));
	}
	public static int numberOfDays(int month)
	{
		switch(month)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				return 31;
			case 4:
			case 6:
			case 9:
			case 11:
				return 30;
			case 2: 
				return 28;
			default:
				return 0;
			
		}
	}
		
	public static boolean leapYear(int year)
	{
		return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
	}
	
	public static int dayNumber(int year, int month, int day) 
	{
		return 0;
	}
	
	public static void pascalTriangle(int n)
	{
		int[][] rows = new int[n][];
		rows[0] = new int[] {1};
		for(int i = 1; i < n; i++)
		{
			rows[i] = pascalTriangleRow(rows[i-1]);
		}
		for (int[] row : rows)
		{
			System.out.print(tab(n - row.length));
			for (int number : row)
			{
				System.out.print("   " + number + "  ");
			}
			System.out.println();
		}
	}
	private static String tab(int tabLength)
	{
		char[] chars = new char[2*tabLength];
		Arrays.fill(chars, ' ');
		return new String(chars);
	}
   private static int[] pascalTriangleRow(int[] n)
	{
		int[] nextRow = new int[n.length + 1];
		for (int i = 0; i <= n.length; i++)
		{
			int leftValue, rightValue;
			leftValue = i == 0 ? 0 : n [i - 1];
			rightValue = i == n.length ? 0 : n[i];
			nextRow[i] = leftValue + rightValue;
		}
		return nextRow;
	}
	public static void square(int n, char c)
	{
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				System.out.print(c);
			}
			System.out.println();
		}
	}
	public static String noVowels(String s)
	{
		return s
			.replace("A", "")	
			.replace("E", "")
			.replace("I", "")
			.replace("O", "")
			.replace("U", "")
			.replace("a", "")
			.replace("e", "")
			.replace("i", "")
			.replace("o", "")
			.replace("u", "");
	}
	
	public static void main(String[] args)
	{
		System.out.println("Test: perfectSquare OK: " + (perfectSquare(4) == true)); 
		System.out.println("Test: mySubstring with end OK: " + 
			(mySubstring("Hello World", 2, 5).equals("Hello World".substring(2, 5))));
		System.out.println("Test: mySubstring OK: " + 
			(mySubstring("Hello World", 2).equals("Hello World".substring(2))));
		System.out.println("Test: numberOfDays 1 OK: " + (numberOfDays(1) == 31));
		System.out.println("Test: numberOfDays 2 OK: " + (numberOfDays(2) == 28));
		System.out.println("Test: numberOfDays 4 OK: " + (numberOfDays(4) == 30));
		System.out.println("Test: leapYear 2000 OK: " + (leapYear(2000) == true));
		System.out.println("Test: leapYear 1900 OK: " + (leapYear(1900) == false));
		System.out.println("Test: leapYear 1904 OK: " + (leapYear(1904) == true));
		pascalTriangle(7);
		System.out.println("Test: Reverse HELLO WORLD: " + reverse("HELLO WORLD"));
		System.out.println("Test: sameReverse HELLO WORLD OK: " + (sameReverse("HELLO WORLD") == false));
		System.out.println("Test: sameReverse RACECAR OK: " + (sameReverse("RACECAR") == true));
		square(5, '@');
		System.out.println("Test: noVowels HELLO WORLD: " + noVowels("HELLO WORLD"));

	}
}// StaticMethods class