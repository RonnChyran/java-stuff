/*
	File Name:   Addition.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        April 26, 2016
	Description: Generates an addition equation.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.lang.*;
import java.util.*;	

public class Addition
{    
    public static void main(String[] args)
    {

	 	int max, min, operand1, operand2, answer;
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Please enter the highest possible number: ");
		max = input.nextInt();
		System.out.print("Please enter the lowest possible number: ");
		min = input.nextInt();
		
		operand1 = random(max, min);
		operand2 = random(max, min);
		answer = operand1 + operand2;
		
		do
		{
			System.out.print(operand1 + " + " + operand2 + " = ? ");
		}
		while(input.nextInt() != answer);
		System.out.println("Correct!");
	 }
	 
	 public static int random(int max, int min)
	 {
	 	int range = (max - min) + 1;
		return (int)(Math.random() * range) + min;
	 }
}// Addition class