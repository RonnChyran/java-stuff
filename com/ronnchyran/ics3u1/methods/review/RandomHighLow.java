/*
	File Name:   RandomHighLow.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        May 5, 2016
	Description: Outputs a random number in the range
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;


public class RandomHighLow
{    
    public static void main(String[] args)
    {
	 	int high, low;
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Please enter the highest possible number: ");
		high = input.nextInt();
		System.out.print("Please enter the lowest possible number: ");
	   low = input.nextInt();	 
		
		System.out.println(random(high, low));
	}
	 
	 public static int random(int max, int min)
	 {
	 	int range = (max - min) + 1;
		return (int)(Math.random() * range) + min;
	 }

}// RandomHighLow class