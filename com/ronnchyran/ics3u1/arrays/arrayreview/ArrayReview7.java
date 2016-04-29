/*
	File Name:   ArrayReview7.java
	Name:        Ronny Chan
	Class:       ICS3U1-31 (B)
	Date:        April 15, 2016
	Description: Asks the user for 10 integers, then indicates whether or not 
					 all integers were odd or even
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

   import java.util.*;


    public class ArrayReview7
   {    
      public static final int ARRAY_LENGTH = 10;
      
       public static void main(String[] args)
      {
         boolean[] oddity = new boolean[ARRAY_LENGTH];
         int[] array = new int[ARRAY_LENGTH];
         boolean isSame = true;
         Scanner input = new Scanner(System.in);
      
         for (int i = 0; i < array.length; i++)
         {
            System.out.print("Enter an integer: ");
            array [i] = input.nextInt();
         }
      
         for (int i = 0; i < array.length; i++)
         {
            oddity [i] = (array[i] % 2 == 1);
         }
      
         for (boolean b : oddity)
         {
            if (b != oddity[0]) isSame = false;
         }
      
         if(!isSame) 
         {
            System.out.println("Not all integers were odd or even.");
         }
         else
         {
            System.out.println("All integers were " + (oddity[0] ? "odd" : "even") + ".");
         }
      
      } // static void main
    	  
   }// ArrayReview7 class