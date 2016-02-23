/* 
	File Name:   ScreenOutputQuestion2.java
	Name:        Ronny Chan
	Class:       ICS3U1-01 (B)
	Date:        February 32, 2016
	Description: Prints out the following output: 
					 5
					 ^^^3
					 5*2=10
					 My name is^^^^^^^^George!!!!
					 3.0^^^10.563^^harry
					 >
					 >
					 >
					 I^think^I^got^it!
	
	Notes: The length of one tab (\t) will treated as 5 spaces	
*/


public class ScreenOutputQuestion2
{

	public static void main(String[] args)
	{
		System.out.println(5);
		System.out.println("   " + 3); //3 spaces
		System.out.println("5*2=" + 10);
		System.out.println("My name is\t   George!!!!"); //\t and 3 spaces
		System.out.println(3.0 + "   " + 10.563 + "  harry");
		System.out.println("\n\n\nI think I got it!");
	}//static void main
	
}//class ScreenOutputQuestion2