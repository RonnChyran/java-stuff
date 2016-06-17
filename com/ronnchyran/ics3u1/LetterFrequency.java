/*
	File Name:   LetterFrequency.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        June 14th, 2016
	Description: Counts the most common letter(s) from a set of 5 lines
	             in a messages.txt, outputting results into frequency.txt
	Notes:       (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;
import java.io.*;

public class LetterFrequency
{    
    public static void main(String[] args)
    {
		String[] messages = readMessagesUppercase("messages.txt");
		StringBuilder lines = new StringBuilder();
		for (String message : messages)
		{
		   //keep a map of char to occurance
			Map<Character, Integer> characters = new HashMap<Character, Integer>(); 
			
			//the list of unique characters 
			List<Character> greatestUnique = new ArrayList<Character>();
			int greatestCount = Integer.MIN_VALUE;
			
			//count the occurances for each character
			for (Character c : message.toCharArray())
			   if(isLetter(c)) //if the character is a letter
					characters.put(c, countOccurances(message, c));	
		
			//look for the greatest count
			for (int i : characters.values())
				if (greatestCount < i)
					greatestCount = i;
			
			//get characters that occur the most
			for (Map.Entry<Character, Integer> entry : characters.entrySet())
				if (entry.getValue() == greatestCount)
					greatestUnique.add(entry.getKey());
					
			lines.append(getOutputString(greatestUnique, greatestCount));
			lines.append(System.lineSeparator());
		}
		write(lines.toString(), "frequency.txt");
	 } // static void main
	 
	 /**
	  * Checks if a character is a letter
	  *
	  * @param c The character to check
	  */
	 public static boolean isLetter(char c)
	 {
	 	return (c > 64 && c < 91) || (c > 97 && c < 122);
	 }
	 
	 /**
	  * Builds the output for one line string from a list of characters
	  * 
	  * @param characters The unique characters that are the most frequent
	  * @param count The amount of occurances the characters have
	  */
	 public static String getOutputString(List<Character> characters, int count)
	 {
	   Collections.sort(characters); //sort the characters alphabetically
		StringBuilder sb = new StringBuilder(); 
		
		for (char c : characters)
		{
			sb.append(c + " "); //append the characters with space to the message 
		}
		sb.append("occur(s) " + count + " times."); //append the rest of the message
		return sb.toString();
	 } //static string getOutputString
	 
	 /**
	  * Counts the amount of times a character occurs in a string
	  *
	  * @param input The string to look in
	  * @param searchChar The character to search for in the input string
	  */
	 public static int countOccurances(String input, char searchChar)
	 {
	 	int count = 0;
		for (char c : input.toCharArray())
			if (c == searchChar)
				count++;
		return count;
	 } //static int countOccurances
	 
	 /**
	  * Reads a set of 5 lines from a file in upper case
	  * 
	  * @param file The path of the file to read from
	  */
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
	
	/** 
	 * Writes a string to a file
	 * 
	 * @param s The string to write
	 * @param file The file to write to
	 */
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
	}// static void write
	
}// LetterFrequency class