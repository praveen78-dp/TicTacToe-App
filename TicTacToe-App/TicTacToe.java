public class TicTacToe {

    static char[][] board = new char[3][3];

    public static void main(String[] args) {
        // Entry point to test UC10 draw logic
        // Example: Fill board without a winner
        fillBoardForDraw();
        
        System.out.println("Is it a draw? " + isDraw());
    }

    /**
     * UC10: Traverses the board to check for any remaining empty cells.
     * Output: true if draw (no empty cells), false otherwise.
     */
    static boolean isDraw() {
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (board[r][c] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    // Helper for testing
    static void fillBoardForDraw() {
        board[0][0] = 'X'; board[0][1] = 'O'; board[0][2] = 'X';
        board[1][0] = 'X'; board[1][1] = 'O'; board[1][2] = 'O';
        board[2][0] = 'O'; board[2][1] = 'X'; board[2][2] = 'X';
    }
}