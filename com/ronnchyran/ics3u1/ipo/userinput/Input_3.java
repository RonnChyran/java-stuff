/*
	File Name:   Input_3.java
	Name:        Ronny Chan
	Class:       ICS3U1-01 (B)
	Date:        February 28, 2016
	Description: A program that asks the user for his/her name and age and then outputs
	             "So you are <name> and you are <age>"
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.Scanner;

public class Input_3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What's your name? ");
        String name = input.nextLine();
        System.out.print("How old are you? ");
        int age = input.nextInt();
        System.out.println("So you are " + name +" and you are " + age);
    } // static void main

} // class Input_3
