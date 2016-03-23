/*
	File Name:   Tip.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        March 21, 2016
	Description: A quiz about decision structures in Java
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;

public class Tip
{    
    public static void main(String[] args)
    {
		Scanner input = new Scanner(System.in);
		char icsGrade;
		
		System.out.println("What is your grade?");
		
		icsGrade = input.next().charAt(0);
	 	
	 	switch (icsGrade)
		{
			case 'A':
			case 'a':
				System.out.println("Commit your work to Git! Version control is important!");
				break;
			case 'B':
			case 'b':
				System.out.println("Use loops to reduce the amount of repititive code");
				break;
			case 'C':
			case 'c':
				System.out.println("Study at home, use Java to create programs you want to make");
				break;
			case 'D':
			case 'd':
				System.out.println("Review nightly on Java's syntax.");
			case 'F':
			case 'f':
				System.out.println("Ask guidance for alternative courses.");
			default:
				System.out.println("Invalid grade");
		}
		
	 } // static void main
	 
} // Tip class