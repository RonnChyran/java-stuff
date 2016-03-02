/*
	File Name:   Input_4List.java
	Name:        Ronny Chan
	Class:       ICS3U1-01 (B)
	Date:        February 28, 2016
	Description: Asks the user to enter two words, then output them on separate lines,
	             and then output them again on the same line separated by a tab.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             An implementation of Input_4 using a generalized method for n iterations
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.Scanner;

public class Input_4Array
{
    public static void main(String[] args)
    {
        Input_4Array.printWordLoop(2);
    } // static void main

    /**
     * Asks the user for n number of words, then prints them on seperate lines, and then
     * again on the same line separated by tab characters in between.
     * @param iterations
     */
    public static void printWordLoop(int iterations)
    {
        Scanner input = new Scanner(System.in);
        String[] wordArray = new String[iterations];
        for(int i = 0; i < iterations; i++)
        {
            System.out.print("Please enter word #" + (i + 1) + ": ");
            wordArray[i] = input.nextLine();
        }
        for (String word : wordArray)
        {
            System.out.println(word);
        }
        for (String word : wordArray)
        {
            System.out.print(word + "\t");
        }

    } //static void printWordLoop

} // class Input_4
