/*
	File Name:   YesOrNo.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        March 23, 2016
	Description: Sums the positive integers entered by a user. Enter a negative integer to quit.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;

public class YesOrNo
{    
    public static void main(String[] args)
    {
	 	Scanner input = new Scanner(System.in);
		char response;
	 	do
		{
			System.out.print("Continue?  Respond with y or n: ");
			response = input.next().charAt(0);
		}while (response == 'y');
	 } // static void main
		 
} // YesOrNo class