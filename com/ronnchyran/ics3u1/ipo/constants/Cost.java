/*
	File Name:   Cost.java
	Name:        Ronny Chan
	Class:       ICS3U1-01 (B)
	Date:        March 2, 2016
	Description: Asks the user for the price of an item and then outputs the tax and the total price
					 including tax.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Cost
{
	private static final double SALES_TAX = 0.13;
	
	public static void main(String[] args)
	{
		double itemPrice, itemTax, itemTotal;
		DecimalFormat df = new DecimalFormat("#.00");
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the price of an item: ");
		itemPrice = input.nextDouble();
		
		itemTax = itemPrice * SALES_TAX;
		itemTotal = itemPrice + itemTax; 

		System.out.println("13% HST: " + df.format(itemTax));
		System.out.println("Item total: " + df.format(itemTotal));
		
	} // static void main
} // DigitSum clas