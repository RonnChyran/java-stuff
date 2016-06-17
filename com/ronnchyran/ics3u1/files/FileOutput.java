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

public class FileOutput
{    
    public static void main(String[] args)
    {
		starTable();
		studentFiles();
		words();
		reals();
	 } // static void main

    public static void starTable()
	 {
	 	int height, width;
	  	List<List<Character>> asterisks;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Height of the table? ");
		height = sc.nextInt();
		System.out.print("Width of the table? ");
		width = sc.nextInt();
		asterisks = new ArrayList<List<Character>>
			(Collections.nCopies(height, new ArrayList<Character>
				(Collections.nCopies(width, '*')))); //lmao
	 	writeAllLines2d(asterisks, "startable.txt");
	 }
	 
	 public static void studentFiles()
	 {
	 	int[][] studentMarks = new int[10][5];
	 	List<String> marks = readAllLines("marks.txt");
		Integer[] averages = new Integer[11];
		int highestAvg = 0;
		for (int i = 0; i < marks.size(); i++)
		{
			studentMarks[i / 5][i % 5] = Integer.parseInt(marks.get(i));
		}
		
		for (int i = 0; i < studentMarks.length; i++)
		{
		   int sum = 0;
			for (int mark : studentMarks[i])
			{
				sum += mark;
			}
			averages[i + 1] = (sum / studentMarks[i].length);
			if (highestAvg < averages[i + 1]) highestAvg = i;
		}
		averages[0] = highestAvg;
		writeAllLines(Arrays.asList(averages), "result.txt");
	 }
	 
	 public static void words()
	 {
	    String[] words = readAllLines("words.txt").get(0).split(" ");
		 List<String> vowelWords = new ArrayList<String>();
		 for(String word : words)
		 {
		 	if (isVowel(word.charAt(0))) vowelWords.add(word);
		 }
		 writeAllLines(vowelWords, "vowelWords.txt");
	 }
	 
	 private static boolean isVowel(char c)
	 {
	 	return "AEIOUaeiou".indexOf(c) != -1;
	 }
	 
	 public static void reals()
	 {
	 	List<String> lines = readAllLines("reals.txt");
		List<Double> aboveAverage = new ArrayList<Double>();
		double[] values = new double[lines.size()];
		double sum = 0;
		double average;
		for (int i = 0; i < values.length; i++)
			values[i] = Double.parseDouble(lines.get(i));
		for (double value : values)
			sum += value;
		average = sum / values.length;
		for (double value : values)
			if (value > average) aboveAverage.add(value);
		writeAllLines(aboveAverage, "aboveAverage.txt");
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
	
	public static <T> void writeAllLines(Iterable<T> lines, String file)
	{
		try 
		{
			FileWriter f = new FileWriter(file);
			BufferedWriter writer = new BufferedWriter(f);
			StringBuilder s = new StringBuilder();
			for (T line : lines)
			{
				s.append(line);
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
	
	public static <T extends Iterable<?>> void writeAllLines2d(Iterable<T> lines, String file)
	{
		try 
		{
			FileWriter f = new FileWriter(file);
			BufferedWriter writer = new BufferedWriter(f);
			StringBuilder s = new StringBuilder();
			for (T line : lines)
			{
				for (Object c : line)
				{
					s.append(c);
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
}// FileOutput class