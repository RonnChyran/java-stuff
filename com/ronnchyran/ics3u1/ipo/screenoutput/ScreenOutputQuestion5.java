/*
	File Name:   ScreenOutputQuestion5.java
	Name:        Ronny Chan
	Class:       ICS3U1-01 (B)
	Date:        February 23, 2016
	Description: Prints out a box of backslashes 15 characters long and 7 characters wide
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             The rationale behind building the required string in memory rather than hardcoding
	             the literals required to build a 15x7 box of backslashes is so that there are less redundant
	             lines of code when having to print 15 lines of backslashes and spaces. This approach can also be
	             easily modified for other sizes of boxes.
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

public class ScreenOutputQuestion5
{
    public static void main(String args[])
    {
        ScreenOutputQuestion5.printBackslashBox(15, 7);
    } //static void main

    /**
     * Prints a box made of backslashes of a specified length and width
     * @param length The length (horizontal component) of the box
     * @param width The width (vertical component) of the box
     */
    public static void printBackslashBox(int length, int width)
    {
        System.out.println(ScreenOutputQuestion5.getEdgeString(length));
        for(int i = 0; i < (width - 2); i++)
        {
            System.out.println(ScreenOutputQuestion5.getColumnString(length));
        }
        System.out.println(ScreenOutputQuestion5.getEdgeString(length));
    } // void printBackslashBox

    /**
     * Gets a string of backslashes of a specified length
     * @param length The length of the string of backslashes
     * @return A string of backslashes of a specified length
     */
    public static String getEdgeString(int length)
    {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < length; i++)
        {
            stringBuilder.append('\\'); //append the backslash for length amount of times
        }
        return stringBuilder.toString(); //return the built string
    } //static String getEdgeString

    /**
     * Gets a string of a spaces with a backslash at the beginning and end ex. "\  \" for length = 5
     * @param length The length of the string
     * @return A string of spaces with a backslash at the beginning and end of a specified length;
     */
    public static String getColumnString(int length)
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('\\'); //append one backslash at the beginning
        for(int i = 0; i < (length - 2); i++)
        {
            stringBuilder.append(" "); //append a space for length - 2 amount of times
        }
        stringBuilder.append('\\'); //append one backslash at the end
        return stringBuilder.toString(); //return the built string
    } // static String getColumnString
} //class ScreenOutputQuestion5
