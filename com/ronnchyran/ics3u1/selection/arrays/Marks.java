/*
	File Name:   Marks.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        April 5, 2016
	Description: Asks the user for 6 marks with names, then a mark they want to find.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;


public class Marks
{    
    public static void main(String[] args)
    {
		boolean markFound = false;
		int markSearch;
		int[] marks = new int[4];
		String[] names = new String[4];
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < marks.length; i++)
		{
			System.out.print("Enter the name: ");
			names[i] = input.nextLine();
			System.out.print("Enter the mark: ");
			marks[i] = input.nextInt();
			input.nextLine();
		}
		
		System.out.print("Which mark do you want to find?: ");
		markSearch = input.nextInt();
		
		for (int i = 0; i < marks.length; i++)
		{
			if (marks[i] == markSearch)
			{
			 System.out.println(names[i] + " has a mark of " + marks[i]);
			 markFound = true;
			}
		}
		
		if(!markFound) System.out.println("No mark found.");
	 } // static void main
	 	  
}// Numbers class