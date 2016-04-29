/*
	File Name:   Encrypt.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        April 26, 2016
	Description: 'Encrypts' a string using a simple substitution cipher.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.util.*;

public class Encrypt
{    
    public static void main(String[] args)
    {
		String str;
	   Scanner input = new Scanner(System.in);
		System.out.print("Please enter a string: ");	
		str = input.nextLine();
		System.out.println(encrypt(str));
	 } // static void main
	 
	 public static String encrypt(String plaintext)
	 {
	 	StringBuilder ciphertext = new StringBuilder();	
		for (String word : plaintext.split(" "))
		{
			if (word.length() <= 1)
			{
				ciphertext.append(word + " ");
				continue;
			}
			
			ciphertext.append(word.charAt(word.length() - 1));
			for (char character : word.substring(1, word.length() - 1).toCharArray())
			{
				ciphertext.append((char)(character + 2));
			}
			ciphertext.append(word.charAt(0) + " ");
		}
		return ciphertext.toString();
	 }	 	  
}// Encrypt class