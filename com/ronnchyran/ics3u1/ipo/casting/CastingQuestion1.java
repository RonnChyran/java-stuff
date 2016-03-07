/*
	File Name:   CastingQuestion1.java
	Name:        Ronny Chan
	Class:       ICS3U1-01 (B)
	Date:        March 3, 2016
	Description: 	For each assignment statement, write a note about what conversions take place and/or what rules are being used 
						For each output statement, write what the output is
						For each error line, take away the // to view the error message and describe why that line causes an error (in your own words)
	
	Notes: The length of one tab (\t) will treated as 5 spaces	
*/

public class CastingQuestion1
{

	public static void main(String[] args)
	{
	 	int i1 = 5;			//ok; default type for non-decimal is int
		//int i2 = 5.2;		//error because float can not implicit cast to int
		
		float f1 = 2;           //ok because int 2 is implicit cast to float 2.0
		float f2 = 3.0f;        //ok; f signifies to interpret as float
		//float f2 = 3.0;		//error because 3.0 is default a double
		//float f3 = 3.5;		//error because 3.5 is by default a double
		
		double d1 = 3.5;		//ok; default type for decimal is double
		double d2 = 2.0;		//ok default type for decimal is double
		double d3 = 4;		//ok default type for decimal is double
		double d4 = 3.5d;		//ok; d signifies to interpret as double
		
		i1 = (int) d1; 		//explicit casting of a double into an int
		System.out.println ("i = " + i1);	//prints i = 3
		
		//i1 = 5.0 / 9.0;	//error because float can’t be automatically   // converted to int
		i1 = 5 / 9;			// division of integers yields integer
		System.out.println ("i = " + i1);	// prints i = 0
		
		f1 = (float) d1;      //ok because explicit cast to float
		System.out.println ("f = " + f1); //prints f = 3.5
		
		
		f1 = 5 / 9;        // 0 because 5/9 is integer division
		System.out.println ("f = " + f1); //prints f = 0.0
		//f1 = 5.0/9.0;		//error because default decimal is double, must explicit cast to float
		f1 = 5.0f / 9.0f; //OK because floating-point division is interpreted with 'f' float numbers
		System.out.println ("f = " + f1); //0.5555556
		
		d1 = 3.5 / 2.6; //OK because both values are floating-point division, default decimal is double
		System.out.println ("d = " + d1); // 1.346153846153846
		
		d1 = (int) 3.5 / 2.6;
		System.out.println ("d = " + d1);
		
		d1 = (int) (3.5) / 2.6;
		System.out.println ("d = " + d1);
		
		d1 = (int) (3.5 / 2.6);
		System.out.println ("d = " + d1);
		
		//d1 = int 3.5 / 2.6;   // error because...
		
		
		d1 = (int) (3.5 / 2.6);
		System.out.println ("d = " + d1);
		
		d1 = 3.5 / (int) 2.6;
		System.out.println ("d = " + d1);
		
		d1 = (float) (int) (3.5 / 2.6);
		System.out.println ("d = " + d1);
		       
		short smallValue = 45;
		//short s = 3.5;                // error because...
		//smallValue = 234251434324324; //error because...
		
		int littleValue = smallValue;
		
		smallValue = (short) littleValue;
		System.out.println ("smallValue = " + smallValue);
		smallValue = (short) 234251434;
		System.out.println ("smallValue = " + smallValue);
		
		//int over = 1111111111111; //error because...
		
		float pay = 42234.45f;
		long bigValue = 45243224L;
		double amount = 345.45d;
	} //static void main
} //CastingQuestion1 class