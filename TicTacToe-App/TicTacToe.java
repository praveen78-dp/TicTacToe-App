public class TicTacToe {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    public static void main(String[] args) {
        // Test UC5 validation logic with a sample move
        System.out.println("Is move (1, 1) valid? " + isValidMove(1, 1));
    }

    /**
     * UC5: Checks if the given row and column are within bounds (0-2)
     * and if the target cell is empty ('-').
     * Output: true if valid, false otherwise.
     */
    static boolean isValidMove(int row, int col) {
        // Boundary check: row and col must be between 0 and 2
        if (row >= 0 && row < 3 && col >= 0 && col < 3) {
            // Cell empty check: target must contain '-'
            return board[row][col] == '-';
        }
        return false;
    }
}