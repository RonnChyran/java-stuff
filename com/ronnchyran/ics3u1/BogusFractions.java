/*
	File Name:   BogusFractions.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        June 7th, 2016
	Description: Methods for homework fileinput
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;
import java.io.*;

public class BogusFractions
{    
    public static void main(String[] args)
    {
	 	Scanner sc = new Scanner(System.in);
		
	   int[] x = bogusify(112, 616);
		System.out.println(112 + "/" + 616 + " = " + x[0] + "/" + x[1]);
	 } // static void main
	 
	 public String bogusFormat(int d, int n)
	 {
	 	
	 }
	 
    public static int[] bogusify(int d, int n)
	 {
		int[] x = new int[] { stripDigit(d, same(d, n)), stripDigit(n, same(d, n)) };
	 	return x;
	 }
	 
	 public static boolean bogusible(int d, int n)
	 {
	 	int[] x = bogusify(d, n);
	 	return ((double)x[0] / x[1] == (double)d / n );
	 }
	 
	 public static int same(int d, int n)
	 {
	 	String _d = String.valueOf(d);
		String _n = String.valueOf(n);
		for(char c : _n.toCharArray())
			if(_d.indexOf(c) > -1) 
				return Integer.parseInt(""+c);
		return -1;
	 }
	 
	 public static int stripDigit(int number, int digit)
	 {
		return Integer.parseInt(String.valueOf(number).replaceFirst(""+digit, ""));
	 }
}// BogusFractions class