/*
	File Name:   Quiz.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        March 21, 2016
	Description: A quiz about decision structures in Java
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;

public class Quiz
{    
    public static void main(String[] args)
    {
		Scanner input = new Scanner(System.in);
		int quizAnswer;
		
		System.out.println("What is 'default' equivalent to in an if structure?");
		System.out.println("1) else");
		System.out.println("2) if");
		System.out.println("3) break");
		System.out.println("4) goto");
		System.out.println("5) unsafe");
		
		quizAnswer = input.nextInt();
	 	
	 	switch (quizAnswer)
		{
			case 1:
				System.out.println("Correct!");
				break;
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("Incorrect.");
			default:
				System.out.println("Invalid answer);
		}
		
	 } // static void main
	 
} // Quiz class