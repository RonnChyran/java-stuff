/*
	File Name:   Taxi.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        April 26, 2016
	Description: Prints out the taxis required for a number of passengers
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.lang.Math;
import java.util.*;	

public class Taxi
{    
	 public static final double TAXI_CAPACITY = 4.0;
    public static void main(String[] args)
    {
		int passengers, cars;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the number of passengers: ");
	   passengers = input.nextInt();
		cars = (int)Math.ceil(passengers / TAXI_CAPACITY);
		System.out.print("Taxis required: " + cars);
	 }
}// Taxi class