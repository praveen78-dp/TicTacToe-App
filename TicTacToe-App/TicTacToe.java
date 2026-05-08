public class TicTacToe {

    static char[][] board = new char[3][3];

    public static void main(String[] args) {
        // Entry point to test UC6
        placeMove(0, 0, 'X');
        System.out.println("Board at (0,0): " + board[0][0]);
    }

    /**
     * UC6: Updates the board by placing the given symbol at 
     * the specified row and column.
     * Hint: Assume the move is already validated.
     */
    static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }
}