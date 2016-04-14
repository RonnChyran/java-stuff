/*
	File Name:   Height.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        April 5, 2016
	Description: Asks the user for an integer and then finds all pythagorean triplets whose
				    largest member is less than or equal to that integer.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;


public class Height
{    
    public static void main(String[] args)
    {
	 	double[] heights = new double[20];
		double average;
	 	Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < heights.length; i++)
		{
			System.out.print("Please enter a height: ");
			heights[i] = input.nextDouble();
		}
		
		average = calculateAverage(heights);
		printAboveAverage(average, heights);
		
	 } // static void main
	 
	 public static double calculateAverage(double[] heights)
	 {
	 	double total = 0;
	 	for (double height : heights)
		{
			total += height;
		}
		return total / heights.length;
		/*
			return Arrays.stream(heights).sum() / heights.length;
		*/
	  }
	  
	  public static void printAboveAverage(double average, double[] heights)
	  {
	    System.out.print("The heights above average are: ");
		 for (double height : heights)
		 {
		 	if (height > average) System.out.println(height + "cm, ");
		 } 
		 /*
		 	Arrays.stream(heights)
				.filter(height -> height > average)
				.forEach(height -> System.out.println(height + "cm, "));
				 
		 */
	 }
	  
}