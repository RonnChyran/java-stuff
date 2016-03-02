/*
	File Name:   ScreenOutputQuestion3.java
	Name:        Ronny Chan
	Class:       ICS3U1-01 (B)
	Date:        February 23, 2016
	Description: Prints squares of numbers from one to five
	
	Notes: The length of one tab (\t) will treated as 5 spaces	
*/


public class ScreenOutputQuestion3
{

	public static void main(String[] args)
	{
		System.out.println("Num   Square");
		System.out.println("***   ******");
		for (int i = 1; i <= 5; i++)
		{
			System.out.println(ScreenOutputQuestion3.getSquareOutput(i));
		}	
		System.out.println();
		for (int i = 1; i <= 5; i++)
		{
			System.out.println(ScreenOutputQuestion3.getMultiplyOutput(i));
		}
		
	}//static void main
	
	public static String getSquareOutput(int number)
	{
		int square = number * number;
		if (square < 10)
		{
		  return number + "  " + square;
		}
		else
		{
		  return number + " " + square;
		}
		
	}//static String getSquareOutput
	
	public static String getMultiplyOutput(int number)
	{
		return number + "*" + number + "=" + (number * number);
	}//static String getMultiplyOutput

}//class ScreenOutputQuestion3