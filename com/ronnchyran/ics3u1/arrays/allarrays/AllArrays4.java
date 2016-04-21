/*
	File Name:   Students.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        April 5, 2016
	Description: Stores the scores of 5 tests for 10 students
	Notes:       (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;

public class AllArrays4
{    
    public static void main(String[] args)
    {
		Scanner input = new Scanner(System.in);
		
		int noStudents, noTests;
		int[][] scores;
		double[] averages;
		
		System.out.print("How many students will there be?: ");
		noStudents = input.nextInt();
		
		System.out.print("How many tests will there be?: ");
		noTests = input.nextInt();
		
		scores = new int[noStudents][noTests];
		
		for (int student = 0; student < scores.length; student++)
		{
			for (int test = 0; test < scores[student].length; test++)
			{
				System.out.print("Input the score for student " + (student + 1) + ", test " + (test + 1) + ": ");
				scores[student][test] = input.nextInt();
			}
		}		
		
		averages = getAverages(scores);
		for (int student = 0; student < scores.length; student++)
			System.out.println("The average for student " + (student + 1) + 
									 " is " + averages[student] + "%");
			 
	 	int highestAverageStudent = getHighestAverageIndex(averages);
		double highestAverage = averages[highestAverageStudent];
		
		System.out.println("Student " + (highestAverageStudent + 1)  + " has the highest average of " + highestAverage + "%");
		
		for (int test = 0; test < scores[0].length; test++)
			System.out.println("The class average for test " + (test + 1) +
			 " is " + getClassAverageForTest(scores, test) + "%");
	
		double classAverage = getTotalClassAverage(scores);
		for (int student = 0; student < averages.length; student++)
		{
			if (averages[student] > classAverage)
				System.out.println("Student " + (student + 1) + " scored above the class average.");
		}
	} // static void main
	
	public static double[] getAverages(int[][] scores)
	{
		double[] averages = new double[scores.length];
		for (int student = 0; student < scores.length; student++)
		{
			double totalScore = 0;
			for (int test = 0; test < scores[student].length; test++)
				totalScore += scores[student][test];
			averages[student] = (totalScore / scores[student].length);
		}
		return averages;
	}	  
	
	public static int getHighestAverageIndex(double[] averages)
	{
		int highestAverageIndex = 0;
		double highestAverage = averages[0];
		for (int student = 0; student < averages.length; student++)
		{
			if (highestAverage < averages[student])
			{
				highestAverageIndex = student;
			}
		}
		return highestAverageIndex;

	}
	
	public static double getClassAverageForTest(int[][] scores, int test)
	{
		double total = 0;
		for (int student = 0; student < scores.length; student++) 
			total += scores[student][test];
		return (total / scores.length); 
	}
	
	public static double getTotalClassAverage(int[][] scores)
	{
		double total = 0;
		for (int test = 0; test < scores[0].length; test++)
			total += getClassAverageForTest(scores, test);
		return total / scores[0].length;
	}
}// AllArrays4 class