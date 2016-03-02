/*
	File Name:   PizzaCost.java
	Name:        Ronny Chan
	Class:       ICS3U1-01 (B)
	Date:        February 28, 2016
	Description: Calculates the cost of a pizza given the diameter of the pizza.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

   import java.util.Scanner;
   import java.lang.Math;
   import java.text.DecimalFormat;

   public class PizzaCost
   {
      private static final double LABOUR_COST = 0.75;
      private static final double RENT_COST = 1.0;
      private static final double MATERIALS_UNIT_COST = 0.05;
   
      public static void main(String[] args)
      {
         double diameter;
         double totalPizzaCost;
         Scanner input = new Scanner(System.in);

         System.out.print("What is the diameter of your pizza in inches?: ");
         diameter = input.nextDouble();
      
         totalPizzaCost = PizzaCost.LABOUR_COST + PizzaCost.RENT_COST + (PizzaCost.MATERIALS_UNIT_COST * Math.pow(diameter, 2));
      
         System.out.print("The cost of your pizza is $ " + new DecimalFormat("#.00").format(totalPizzaCost));
      
      } // static void main
   
   } // PizzaCost class