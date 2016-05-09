/*
	File Name:   QuadraticFormula.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        April 26, 2016
	Description: Quadratic formula.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.lang.Math;
import java.util.*;	

public class QuadraticFormula
{    
    public static void main(String[] args)
    {
		double a, b, c, d;
		double[] roots;
		int rootCount;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a: ");
		a = input.nextDouble();
		
		System.out.print("Enter b: ");
		b = input.nextDouble();
		
		System.out.print("Enter c: ");
		c = input.nextDouble();
		
		d = discriminant(a, b, c);

		rootCount = roots(d);	
		roots = quadratic(a, b, c);
		if (rootCount != 0)
		{
			System.out.println("The roots are " + roots[0] + " and " + roots[1]);
			System.out.println("There are 2 " + ((rootCount == 1) ? "identical" : "distinct") + " roots");
		}
		else
		{
			System.out.println("There are no real roots.");
		}
	 }
	 
	 public static int roots(double d)
	 {
	 	return d == 0 ? 1 : d < 0 ? 0 : 2;
	 }
	 
	 public static double discriminant(double a, double b, double c)
	 {
	 	return Math.pow(b, 2) - (4 * a * c);
	 }
	 
	 public static double[] quadratic(double a, double b, double c)
	 {
	 	double d = discriminant(a, b, c);
		double root = Math.sqrt(d);
		if (roots(d) == 0)
			return new double[] { Double.NaN, Double.NaN }; //not a number
		return new double[] { (root - b) / (2 * a),  ((-1 * root) - b) / (2 * a) };
	 }
}// QuadraticFormula class