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

public class FileInput
{    
    public static void main(String[] args)
    {
	 	printLines();
		addNumbers();
		printAllChar();
		reverseLines();
	 } // static void main

	 public static void printLines()
	 {
	 	for (String line : readAllLines("line.txt"))
		{
			System.out.println(line);
		}
	 }
	 
	 public static void addNumbers()
	 {
	 	double sum = 0;
	 	for (String line : readAllLines("AddNumbers.txt"))
		{
		   sum += Double.parseDouble(line);
		}
		System.out.println(sum);
	 }
	 
	 public static void printAllChar()
	 {
	 	for (String line : readAllLines("PrintAllChar.txt"))
		{
			for (char c : line.toCharArray())
			{
				if (!Character.isWhitespace(c))
					System.out.println(c);
			}
		}
	 }
	 
	 public static void reverseLines()
	 {
	 	List<String> lines = readAllLines("reverse.txt");
		Collections.reverse(lines);
		lines.remove(lines.size() - 1);
	 	for (String line : lines)
		{
			System.out.println(line);
		}
	 }
	 
	 public static List<String> readAllLines(String file)
	 {
	 	try 
		{
		 	FileReader f = new FileReader(file);
			BufferedReader reader = new BufferedReader(f);
			List<String> lines = new ArrayList<>();
			String line;
			while((line = reader.readLine()) != null)
			{
				lines.add(line);
			}
			return lines;
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return null;
	}
}// FileInput class