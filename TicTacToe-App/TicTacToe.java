import java.util.Random;

public class TicTacToe {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };
    static char computerSymbol = 'O';

    public static void main(String[] args) {
        // Entry point to test the computer move
        computerMove();
        printBoard();
    }

    /**
     * UC7: Generates random slot values until a valid move is found,
     * then places the computer symbol on the board.
     */
    static void computerMove() {
        Random random = new Random();
        int slot;
        int row, col;

        do {
            // Generate random slot between 1 and 9
            slot = random.nextInt(9) + 1;
            row = getRowFromSlot(slot);
            col = getColFromSlot(slot);
            
            // Loop until isValidMove returns true
        } while (!isValidMove(row, col));

        System.out.println("Computer chose slot: " + slot);
        placeMove(row, col, computerSymbol);
    }

    // --- Reusable Methods from Previous UCs ---

    static int getRowFromSlot(int slot) {
        return (slot - 1) / 3;
    }

    static int getColFromSlot(int slot) {
        return (slot - 1) % 3;
    }

    static boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-';
    }

    static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }
}