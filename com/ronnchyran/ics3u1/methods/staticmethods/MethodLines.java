/*
	File Name:   MethodLines.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        April 26, 2016
	Description: Utility class for lines
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;


public class MethodLines
{
	public static double length (int x1, int y1, int x2, int y2)
	{
		return Math.sqrt(Math.pow(y2-y1, 2) + Math.pow(x2-x1, 2));
	}
	public static double slope (int x1, int y1, int x2, int y2)
	{
		return (y2-y1) / (double)(x2-x1);
	}
	
	public static void main(String[] args)
	{
		int[][][] coord = new int[2][2][2];
	   double lengthLine1, lengthLine2, slopeLine1, slopeLine2;
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 2; i++)
		{
			System.out.println("Please enter the two coordinates of line " + (i+1) + ":");
			for (int j = 0; j < 2; j++)
			{
				System.out.print("Coordinate " + (i+1) + " x-value: ");
				coord[i][j][0] = scanner.nextInt();
				System.out.print("Coordinate " + (i+1) + " y-value: ");
				coord[i][j][0] = scanner.nextInt();	
			}
		}
		lengthLine1 = length(coord[0][0][0], coord[0][0][1], coord[0][1][0], coord[0][1][1]);
		lengthLine2 = length(coord[1][0][0], coord[1][0][1], coord[1][1][0], coord[1][1][1]);
		slopeLine1 = slope(coord[0][0][0], coord[0][0][1], coord[0][1][0], coord[0][1][1]);
		slopeLine2 = slope(coord[1][0][0], coord[1][0][1], coord[1][1][0], coord[1][1][1]);
		System.out.println("Results:");
		System.out.println("The two lines " + ((lengthLine1 != lengthLine2) ? "do not " : "") + "have the same length.");
		if (slopeLine1 == slopeLine2)
		{
			System.out.println("The two lines are parallel.");
		}
		if (slopeLine1 == -1/slopeLine2)
		{
			System.out.println("The two lines are perpendicular.");
		}

	}
 }// MethodLines class