/*
	File Name:   Factors.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        March 29, 2016
	Description: Asks the user for n letters (n provided by the user), and sums up each number
	Notes:       The length of one tab (\t) will treInted as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

   import java.util.*;
   import java.lang.*;

    public class Factors
   
   {    
       public static void main(String[] args)
      {
      
         int value;
         Scanner input = new Scanner(System.in);
      
         System.out.print("Enter a number to factor: ");
         value = input.nextInt();
      
         System.out.println("The factors of " + value + " are:");
      
         for (int i = 1; i <= value; i++)
         {
            if (value % i == 0) System.out.println(i);
         }
      } // static void main
   } // Factors class