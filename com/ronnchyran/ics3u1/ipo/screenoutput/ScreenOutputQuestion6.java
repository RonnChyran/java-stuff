/*
	File Name:   ScreenOutputQuestion6.java
	Name:        Ronny Chan
	Class:       ICS3U1-01 (B)
	Date:        February 23, 2016
	Description: Prints out a box of backslashes 15 characters long and 7 characters wide using only a single call to
	             System.out.print
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/
public class ScreenOutputQuestion6
{
    public static void main(String args[])
    {
        ScreenOutputQuestion6.printBackslashBox(15, 7);
    } //static void main

    /**
     * Prints a box made of backslashes of a specified length and width
     * @param length The length (horizontal component) of the box
     * @param width The width (vertical component) of the box
     */
    public static void printBackslashBox(int length, int width)
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ScreenOutputQuestion6.getEdgeString(length) + "\n");
        for(int i = 0; i < (width - 2); i++)
        {
            stringBuilder.append(ScreenOutputQuestion6.getColumnString(length) + "\n");
        }
        stringBuilder.append(ScreenOutputQuestion6.getEdgeString(length));
        System.out.print(stringBuilder);
    } // void printBackslashBox

    /**
     * Gets a string of backslashes of a specified length
     * @param length The length of the string of backslashes
     * @return A StringBuilder with backslashes of a specified length
     */
    public static StringBuilder getEdgeString(int length)
    {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < length; i++)
        {
            stringBuilder.append('\\'); //append the backslash for length amount of times
        }
        return stringBuilder; //return the built stringbuilder
    } //static String getEdgeString

    /**
     * Gets a string of a spaces with a backslash at the beginning and end ex. "\  \" for length = 5
     * @param length The length of the string
     * @return A StringBuilder with spaces with a backslash at the beginning and end of a specified length;
     */
    public static StringBuilder getColumnString(int length)
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('\\'); //append one backslash at the beginning
        for(int i = 0; i < (length - 2); i++)
        {
            stringBuilder.append(" "); //append a space for length - 2 amount of times
        }
        stringBuilder.append('\\'); //append one backslash at the end
        return stringBuilder; //return the built string
    } // static String getColumnString
} //class ScreenOutputQuestion5
