/*
	File Name:   ScreenOutputQuestion4.java
	Name:        Ronny Chan
	Class:       ICS3U1-01 (B)
	Date:        February 23, 2016
	Description: Prints out a tic tac toe board with X in the center
	Notes:       The length of one tab (\t) will treated as 5 spaces
	             The rationale behind building the required string in memory rather than hardcoding
	             the literals required to build a tic-tac-toe board with an X in the middle would require a lot more
	             literals inside the code and having to manually type or copy/paste the literals, as well as reducing
	             redundant calls to System.out.print(ln). This approach can be extended to have a class represent a
	             tic-tac-toe board representing a 2 dimensional array of SquareStates but that is beyond the scope of
	             this implementation, which uses only a single static class instance.
	             (c) 2016 Ronny Chan Licensed under the MIT License
*/

public class ScreenOutputQuestion4
{
    /**
     * Represents the state of a square in a tic tac toe row
     */
    private enum SquareState
    {
        /**
         * Filled with a cross
         */
        FILLED_CROSS('X'),
        /**
         * Filled with a circle
         */
        FILLED_CIRCLE('O'),
        /**
         * Empty square
         */
        EMPTY(' ');

        /**
         * The character a state represents
         */
        private char stateCharacter;
        SquareState(char stateCharacter)
        {
            this.stateCharacter = stateCharacter;
        }//constructor SquareState

        /**
         * Override toChar() to return the assigned value of the enum
         * @return The character the state represents
         */
        public char toChar()
        {
            return this.stateCharacter;
        } // char toChar
    } //enum SquareState

    /**
     * A line of padding with all empty space with 6 spaces in each section
     */
    private static final String paddingLine = "      |      |      ";
    /**
     * A border line that separates the row
     */
    private static final String borderLine = "-----------------------";
    /**
     * A line that contains 3 states A, B, and C, which can each be either Crossed, Circled, or Empty
     */
    private static final String playerLine = "   A   |   B   |   C   ";

    public static void main(String args[])
    {
        System.out.println(ScreenOutputQuestion4.getTicTacToeRow(false));
        System.out.println(ScreenOutputQuestion4.getTicTacToeRow(SquareState.EMPTY, SquareState.FILLED_CROSS, SquareState.EMPTY, false));
        System.out.println(ScreenOutputQuestion4.getTicTacToeRow(true));
    }//static void main

    /**
     * Generates an empty tic tac toe row
     * @param finalRow Whether or not this row is a final row
     * @return An empty tic tac toe row
     */
    public static String getTicTacToeRow(boolean finalRow)
    {
        return ScreenOutputQuestion4.getTicTacToeRow(SquareState.EMPTY, SquareState.EMPTY, SquareState.EMPTY, finalRow);
    } // static String getTicTacToeRow(boolean finalRow)

    /**
     * Gets the string for one single row of spaces in a tic tac to game
     * @param leftMost The state of the leftmost square
     * @param center The state of the center square in this row
     * @param rightMost The state of the rightmost square in this row
     * @param finalRow Whether or not this row is a final row
     * @return A string containing the characters for one single row of tic tac toe including linebreaks
     */
    public static String getTicTacToeRow(SquareState leftMost, SquareState center, SquareState rightMost, boolean finalRow)
    {
        StringBuilder stringBuilder = new StringBuilder();

        // append the padding line replacing 'S' with spaces
        stringBuilder.append(ScreenOutputQuestion4.paddingLine.replace('S', ' ') + "\n");

        //append the line with state data
        stringBuilder.append(ScreenOutputQuestion4.playerLine
                .replace('A', leftMost.toChar()) //replace 'A' with the leftmost state
                .replace('B', center.toChar()) //replace 'B' with the center state
                .replace('C', rightMost.toChar()) //replace 'C' with the rightmost state
                + "\n");

        //append one more padding line
        stringBuilder.append(ScreenOutputQuestion4.paddingLine + "\n");

        //append a border line to the bottom only if the row is not the last row and does not require a final border line
        if (!finalRow) stringBuilder.append(ScreenOutputQuestion4.borderLine);
        return stringBuilder.toString();
    } //static String getTicTacToeRow(SquareState leftMost, SquareState center, SquareState rightMost, boolean finalRow)
} // class ScreenOutputQuestion4
