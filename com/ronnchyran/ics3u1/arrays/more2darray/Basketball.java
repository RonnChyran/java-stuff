/*
	File Name:   Basketball.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        April 5, 2016
	Description: Stores the scores of 2 teams in 5 games
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;

public class Basketball

{    
    public static void main(String[] args)
    {
		Scanner input = new Scanner(System.in);
		
		int[][] scores = new int[2][2];
	
		for (int team = 0; team < scores.length; team++)
		{
			for (int game = 0; game < scores[team].length; game++)
			{
				System.out.print("Input the score for team " + (team + 1) + ", game " + (game + 1) + ": ");
				scores[team][game] = input.nextInt();
			}
		}		
		
		for (int team = 0; team < scores.length; team++)
		{
			int totalScore = 0;
			for (int game : scores[team])
				totalScore += game;
			System.out.println("Team " + (team + 1) + " scored " + totalScore + " points in total.");
		}
		
		for (int game = 0; game < scores[0].length; game++)
		{
			if (scores[0][game] == scores[1][game])
			{
				System.out.println("Game " + (game + 1) + " was tied");
			}
			else
			{
				System.out.println("Team " + (scores[0][game] > scores[1][game] ? 1 : 2) + " won game " + (game + 1));
			}
		}
	 } // static void main	  
}// Basketball class