/*
	File Name:   Temperature.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        March 10, 2016
	Description: The user enters a temperature and a message is displayed accordingly.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.Scanner;

public class Temperature
{  
	 enum TemperatureCase 
	 {
	 
	 	VERY_COLD("very cold", Integer.MIN_VALUE, -19),
		COLD("cold", -18, -1),
		FREEZING_POINT("freezing point of water", 0, 0),
		VERY_COOL("very cool", 1, 10),
		MODERATE("moderate", 11, 20),
		WARM("warm", 21, 30),
		HOT("hot", 31, 40),
		EXTREMELY_HOT("extremely hot", 41, 99),
		BOILING_POINT("boiling point", 100, 100);
		
	 	private final String message;
		private final int min;
		private final int max;
		
		TemperatureCase(String message, int min, int max)
		{
			this.message = message;
			this.min = min;
			this.max = max;
		}
		
		public String getMessage()
		{
			return this.message;
		}
		
		public int getMax()
		{
			return this.max;
		}
		
		public int getMin()
		{
			return this.min;
		}
	 }

	 public static void main(String[] args)
    {
	     int temperature;
	 	  Scanner scanner = new Scanner(System.in);
		  System.out.print("Please enter a temperature in degrees Celsius: ");
		  temperature = scanner.nextInt();
		  
		  for (TemperatureCase temperatureCase : TemperatureCase.values())
		  {
		  		if (temperature >= temperatureCase.getMin() && temperature <= temperatureCase.getMax())
				{
					System.out.println(temperatureCase.getMessage());
					break;
				}
		  }
		 
	 } // static void main
	 
} // Temperature class