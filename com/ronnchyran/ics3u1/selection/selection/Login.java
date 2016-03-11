/*
	File Name:   Login.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        March 9, 2016
	Description: Displays a login screen and compares values to hardcoded plaintext.
					 Passwords are not stored in a cryptographically secure manner, for
					 excercise purpsoes only.
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

import java.math.BigDecimal;
import java.util.*;

public class Login
{    
	 private static final int PASSWORD = 123;
	 private static final int ID = 1;
    public static void main(String[] args)
    {
	 		int userId, userPassword;
			Scanner input = new Scanner(System.in);
			
			System.out.print("User ID: ");
			userId = input.nextInt();
			System.out.print("Password: " );
			userPassword = input.nextInt();
			
			if (userId == ID && userPassword == PASSWORD)
			{
				System.out.println("Access Granted");
			}
			else
			{
				System.out.println("Access Denied");
			}
	 } // static void main
	 
} // Login class