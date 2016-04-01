/*
	File Name:   SquaresCubes.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        March 29, 2016
	Description: Adds up the squares and adds up the cubes of integers from 1 to N
	Notes:       The length of one tab (\t) will treInted as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;
import java.lang.*;

public class SquaresCubes

{    
    public static void main(String[] args)
    {
		int limit, sumSquares, sumCubes;
		Scanner input = new Scanner(System.in);
		
		sumSquares = 0;
		sumCubes = 0;
		System.out.println("Upper Limit: ");
		limit = input.nextInt();

		for (int i = 1; limit >= i; i++)
		{
			sumSquares += (i * i);
		} 
		
		for (int i = 1; limit >= i; i++)
		{
			sumCubes += (i * i * i);
		} 	
		
		System.out.println("The sum of Squares is: " + sumSquares);
		System.out.println("The sum of Cubes is: " + sumCubes);

	 } // static void main
	 	 
} // SquaresCubes class