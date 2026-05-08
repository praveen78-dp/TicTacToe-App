public class TicTacToe {

    static char[][] board = new char[3][3];

    public static void main(String[] args) {
        // Entry point to test UC9 win-check logic
        // Example: Setting a winning row
        board[0][0] = 'X'; board[0][1] = 'X'; board[0][2] = 'X';
        
        System.out.println("Has 'X' won? " + hasWon('X'));
    }

    /**
     * UC9: Checks all possible winning patterns (rows, columns, diagonals)
     * for the given symbol.
     * Output: true if a win is detected, false otherwise.
     */
    static boolean hasWon(char symbol) {
        // Check Rows and Columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) ||
                (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol)) {
                return true;
            }
        }

        // Check Diagonals
        if ((board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) ||
            (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)) {
            return true;
        }

        return false;
    }
}