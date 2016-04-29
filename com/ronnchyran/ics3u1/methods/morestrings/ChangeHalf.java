/*
	File Name:   ChangeHalf.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        April 26, 2016
	Description: Swaps the first and second halves of a string.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;


public class ChangeHalf
{    
    public static void main(String[] args)
    {
	 	String str;
	   Scanner input = new Scanner(System.in);
		System.out.print("Please enter a string: ");	
	   str = input.nextLine();
		StringBuilder sb =  new StringBuilder();
		sb.append(str.substring(str.length() / 2 + (str.length() % 2)));
		if ((str.length() % 2) == 1)
			sb.append(str.charAt(str.length() / 2));
		sb.append(str.substring(0, str.length() / 2));

		System.out.println(sb.toString());
	 }
}// ChangeHalf class