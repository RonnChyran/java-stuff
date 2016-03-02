/*
	File Name:   Input_2.java
	Name:        Ronny Chan
	Class:       ICS3U1-01 (B)
	Date:        February 28, 2016
	Description: A program that asks the user for his/her name and then outputs “Hello <name>”.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.Scanner;

public class Input_2
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What's your name? ");
        String name = input.nextLine();
        System.out.println("Hi " + name);
    } // static void main

} // class Input_2
