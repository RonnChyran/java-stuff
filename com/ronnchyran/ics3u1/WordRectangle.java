/*
	File Name:   FileInput.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        June 7th, 2016
	Description: Methods for homework fileinput
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;
import java.io.*;

public class WordRectangle
{    
    public static void main(String[] args)
    {
	 	String[][] inputArray = new String[5][];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 5 words:");
		for(int i = 0; i < 5; i++)
		{
			inputArray[i] = getRectangle(sc.nextLine());	
		}
		
		System.out.println();
		for(String[] rects : inputArray)
		{
			for(String rectLine : rects)
			{
				System.out.println(rectLine);
			}
			System.out.println();
		}
		
		writeAllLines2d(inputArray, "wordRect.txt");
	 } // static void main
	 
	 public static String[] getRectangle(String input)
	 {
		List<String> rect = new ArrayList<String>();
	 	rect.add(getPaddedRow(input));
		for(int i = 0; i < input.length(); i++)
			rect.add(getRow(input, i));
		rect.add(getPaddedRow(reverse(input)));
		return rect.toArray(new String[rect.size()]);
	 }
	 
	 public static String reverse(String s)
	 {
	 	return new StringBuilder(s).reverse().toString();
	 }
	 
	 public static String getPaddedRow(String input)
	 {
	 	StringBuilder sb = new StringBuilder();
		sb.append("* ");
		for(char c : input.toCharArray())
			sb.append(c + " ");
      sb.append('*');
		return sb.toString();
	 }
	 
	 public static String getRow(String input, int index)
	 {
	 	int length = input.length();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < input.length(); i++)
			sb.append("* ");
		sb.insert(0, input.charAt(input.length() - index - 1) + " ");
		sb.append(input.charAt(index));
		return sb.toString();
	 }
	 
	public static void writeAllLines2d(String[][] lines, String file)
	{
		try 
		{
			FileWriter f = new FileWriter(file);
			BufferedWriter writer = new BufferedWriter(f);
			StringBuilder s = new StringBuilder();
			for (String[] line : lines)
			{
				for (String c : line)
				{
					s.append(c);
					s.append(System.lineSeparator());
				}
				s.append(System.lineSeparator());
			}
			writer.write(s.toString());
			writer.close();
			f.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}// WordRectangle class