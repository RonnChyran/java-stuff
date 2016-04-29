/*
	File Name:   Question6.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        April 26, 2016
	Description: Prints a random number between 0 and 100
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.lang.Math;
import java.util.*;	

public class Question6
{    
    public static void main(String[] args)
    {
	 	System.out.println((int)(Math.random() * 100) + 1);
	 }
}// Question6 class