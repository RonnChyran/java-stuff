/*
	File Name:   FoodOrder.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        March 21, 2016
	Description: Displays a menu of breakfast options and provides the user the cost of the the
					 selected item.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;

public class FoodOrder
{    
    public static void main(String[] args)
    {
		Scanner input = new Scanner(System.in);
		int breakfastChoice;
		
		System.out.println("What would you like for breakfast?");
		System.out.println("1) juice, muffin, coffee");
		System.out.println("2) cereal, toast, milk");
		System.out.println("3) egg, toast, coffee");
		System.out.println("4) banana, granola, milk");
		System.out.println("5) grapefruit, bacon, eggs, coffee");
		
		breakfastChoice = input.nextInt();
	 	
	 	switch (breakfastChoice)
		{
			case 1:
			case 2:
				System.out.println("Your breakfast is $2.50");
				break;
			case 3:
				System.out.println("Your breakfast is $3.00");
				break;
			case 4:
				System.out.println("Your breakfast is $3.50");
				break;
			case 5:
				System.out.println("Your breakfast is $5.00");
				break;
			default:
				System.out.println("Invalid order");
		}
		
	 } // static void main
	 
} // FoodOrder class