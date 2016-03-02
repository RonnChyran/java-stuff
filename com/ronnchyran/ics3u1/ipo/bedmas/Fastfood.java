/*
	File Name:   Flashfast.java
	Name:        Ronny Chan
	Class:       ICS3U1-01 (B)
	Date:        March 3, 2016
	Description: Asks the user for an amount of burgers, fries, and sodas, and calculates
					 the subtotal, tax, total including tax, and then calculates change given
					 amount tendered.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Fastfood
{
	private static final double BURGER_PRICE = 2.69;
	private static final double FRIES_PRICE = 1.09;
	private static final double SODA_PRICE = 0.99;
	private static final double SALES_TAX = 0.13;
	
	public static void main(String[] args)
	{
		int burgersAmount, friesAmount, sodaAmount;
		double burgerTotal, friesTotal, sodaTotal;
		double subTotal, taxTotal, finalTotal;
		double amountTendered, changeRequired;
		DecimalFormat df = new DecimalFormat("#.00");
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many burgers: ");	
		burgersAmount = input.nextInt();
		input.nextLine();
		
		System.out.print("How many fries: ");	
	 	friesAmount = input.nextInt();
		input.nextLine();
		
		System.out.print("How many sodas: ");	
		sodaAmount = input.nextInt();
		input.nextLine();
		
		burgerTotal = burgersAmount * BURGER_PRICE;
		friesTotal = friesAmount * FRIES_PRICE;
		sodaTotal = sodaAmount * SODA_PRICE;
		
		subTotal = burgerTotal + friesTotal + sodaTotal; 
		taxTotal = subTotal * SALES_TAX;
		finalTotal = subTotal + taxTotal;
		
		System.out.println(burgersAmount + " Burgers: $" + df.format(burgerTotal));
		System.out.println(friesAmount + " Fries: $" + df.format(friesTotal));
		System.out.println(sodaAmount + " Soda: $" + df.format(sodaTotal));
		System.out.println(); //print empty line for separation
		System.out.println("Subtotal: $" +  df.format(subTotal));
		System.out.println("13% HST: $" +  df.format(taxTotal));
		System.out.println("Total: $" +  df.format(finalTotal));
		
		System.out.print("Amount tendered: ");	
	 	amountTendered = input.nextInt();
		input.nextLine();
		
		changeRequired = amountTendered - finalTotal;
		
		System.out.println("Change: $" +  df.format(changeRequired));

	} // static void main
} // Fastfood class