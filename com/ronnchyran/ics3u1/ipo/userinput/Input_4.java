/*
	File Name:   Input_4.java
	Name:        Ronny Chan
	Class:       ICS3U1-01 (B)
	Date:        February 28, 2016
	Description: Asks the user to enter two words, then output them on separate lines,
	             and then output them again on the same line separated by a tab.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.Scanner;

public class Input_4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter word #1: ");
        String word1 = input.nextLine();
        System.out.print("Please enter word #2: ");
        String word2 = input.nextLine();
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word1 + "\t" + word2);
    } // static void main

} // class Input_4
