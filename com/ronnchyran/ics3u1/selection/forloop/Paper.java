/*
	File Name:   Paper.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        April 4, 2016
	Description: Describes the thickness and area of a folded sheet of  paper of 1.0m^2.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;

public class Paper
{    
    public static void main(String[] args)
    {
	 	double area, thickness;
		
		area = 1.0;
		thickness = 0.090;
		
		for (int count = 1; count <= 40; count++)
		{
			area /= 2;
			thickness *= 2; 
			System.out.println("The thickness of a sheet of paper 0.09mm thick folded over " + count + " times is " + thickness + "mm  thick.");
			System.out.println("The area of this pile is " + area + " square metres large.");

		}
	 } // static void main
} // Paper class