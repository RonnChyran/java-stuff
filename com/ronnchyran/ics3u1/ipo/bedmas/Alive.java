/*
	File Name:   Alive.java
	Name:        Ronny Chan
	Class:       ICS3U1-03 (B)
	Date:        March 3, 2016
	Description: Calculates the amount of time someone has been alive in days, and the
					 amount of hours one has slept in that time in hours.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.Scanner;

public class Alive
{
	/**
	* Represents a simplified date with year, month and time.
	* There are always 30 days in a month, and 365 days in a year.
	*/
	public static class SimplifiedDate
	{
		/**
		* The year in the date
		*/
		public int dateYear;
		
		/**
		* The month in the date
		*/
		public int dateMonth;
		
		/**
		* The day of the month in the date
		*/
		public int dateDay;
		
		/**
		* Creates a SimplifiedDate object given the year, the month and the day
		* @param dateYear The year of the daye
		* @param dateMonth The month 
		*/
		public SimplifiedDate(int dateYear, int dateMonth, int dateDay)
		{
			this.dateYear = dateYear;
			this.dateMonth = dateMonth;
			this.dateDay = dateDay;
		} // constructor SimplifiedDate dateYear dateMonth dateDay
		
		/**
		* Converts the date into days past
		* @return The days that have past since January 1st, 0 CE
		*/
		public int getTotalDays()
		{
			int yearsToDays = dateYear * 365;
			int monthsToDays = (dateMonth - 1) * 30;
			return yearsToDays + monthsToDays + (dateDay - 1);
		} // int getTotalDays
		
	} // SimplifiedDate static class
	
	private static final int HOURS_SLEPT_PER_DAY = 8;
	public static void main(String[] args)
	{
	  	SimplifiedDate birthDate, todayDate;
		int daysAlive, hoursSlept;
		
		birthDate = Alive.promptDate("Enter your birthdate: ");
		todayDate = Alive.promptDate("Enter today's date: ");	
		
		daysAlive = todayDate.getTotalDays() - birthDate.getTotalDays();
		hoursSlept = daysAlive * Alive.HOURS_SLEPT_PER_DAY;
		
		System.out.println("You have been alive for " + daysAlive + " days.");
		System.out.println("You have slept " + hoursSlept + " hours.");
	} // static void main
	
	private static SimplifiedDate promptDate(String promptString)
	{
		Scanner input = new Scanner(System.in);
		int dateYear, dateMonth, dateDay;
		
		System.out.println(promptString);
		
		System.out.print("Year: ");
		dateYear = input.nextInt();
		input.nextLine();
		
		System.out.print("Month: ");
		dateMonth = input.nextInt();
		input.nextLine();
		
		System.out.print("Date: ");
		dateDay = input.nextInt();
		input.nextLine();
		
	  	return new SimplifiedDate(dateYear, dateMonth, dateDay);
	} // static SimplifiedDate promptDate 
		
} // Alive class