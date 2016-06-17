/*
	File Name:   LetterFrequencyOld.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        June 14th, 2016
	Description: Counts the most common letter(s) from a set of 5 lines
	             in a messages.txt, outputting results into frequency.txt
	Notes:       Older implementation using multiple arrays.
                     (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;
import java.io.*;

public class LetterFrequencyOld
{    
    public static void main(String[] args)
    {
		String[] messages = readMessagesUppercase("messages.txt");
		StringBuilder lines = new StringBuilder();
		for (String message : messages)
		{
			char[] uniqueChars = getUniqueLetters(message);
         int[] charCount = new int[uniqueChars.length];
			int greatestCount;
			int greatestFrequencyCount = 0;
			char[] frequentChars;
			for (int i = 0; i < uniqueChars.length; i++)
			{
				charCount[i] = countOccurances(message, uniqueChars[i]);
			}
			
			greatestCount = getGreatest(charCount);
			
			for (int i = 0; i < charCount.length; i++)
			{
				if (charCount[i] == greatestCount)
					greatestFrequencyCount++;
			}
			frequentChars = new char[greatestFrequencyCount];
			for (int i = 0, gfCountIndex = 0; i < charCount.length; i++)
			{
				if (charCount[i] == greatestCount)
				{
					frequentChars[gfCountIndex] = uniqueChars[i];
					gfCountIndex++;
				}
			}
			lines.append(getOutputString(frequentChars, greatestCount));	
			lines.append(System.lineSeparator());		
		}
		write(lines.toString(), "frequency.txt");
	 } // static void main
	 
	 public static String getOutputString(char[] characters, int count)
	 {
	 	Arrays.sort(characters); 
		StringBuilder sb = new StringBuilder();
		for (char c : characters)
		{
			sb.append(c + " ");
		}
		sb.append("occur(s) " + count + " times.");
		return sb.toString();
	 }
	 
	 public static boolean isLetter(char c)
	 {
	 	return (c > 64 && c < 91) || (c > 97 && c < 122);
	 }
	 
	 public static int getGreatest(int[] input)
	 {
	 	 int[] sorted = Arrays.copyOf(input, input.length);
		 Arrays.sort(sorted); //sorts least to greatest
		 return sorted[sorted.length - 1]; //get the greatest integer
	 }
	 
	 public static char[] getUniqueLetters(String input)
	 {
	 	Set<Character> uniqueChars = new HashSet<Character>();
		char[] retChars;
		Character[] boxedRetChars;
		for (char c : input.toCharArray())
		{
		   if(isLetter(c))
				uniqueChars.add(c);
		}
		retChars = new char[uniqueChars.size()];
		boxedRetChars = uniqueChars.toArray(new Character[uniqueChars.size()]);
		for (int i = 0; i < retChars.length; i++)
		{
			retChars[i] = boxedRetChars[i];
		}
	 	return retChars;	 
	 }
	 
	 public static int countOccurances(String input, char searchChar)
	 {
	 	int count = 0;
		for (char c : input.toCharArray())
			if (c == searchChar)
				count++;
		return count;
	 }
	 
 	 public static String[] readMessagesUppercase(String file)
	 {
	 	try 
		{
		 	FileReader f = new FileReader(file);
			BufferedReader reader = new BufferedReader(f);
		   String[] lines = new String[5];
			String line;
			for (int i = 0; i < lines.length; i++)
			{
				if ((line = reader.readLine()) != null)
				{
					lines[i] = line.toUpperCase(); //we want upper case
				}
			}
			return lines;
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	public static void write(String s, String file)
	{
		try 
		{
			FileWriter f = new FileWriter(file);
			BufferedWriter writer = new BufferedWriter(f);
			writer.write(s);
			writer.close();
			f.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
}// LetterFrequencyOld class