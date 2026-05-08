import java.util.Random;

public class TicTacToe {
    // UC1: Board representation
    static char[][] board = new char[3][3];

    // UC2: Game State Variables
    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;

    public static void main(String[] args) {
        // UC1 logic
        initializeBoard();
        
        // UC2 logic
        tossAndAssignSymbols();
        displayTossResult();
        
        // UC1 logic
        printBoard();
    }

    /**
     * UC2: Performs a random toss to decide the first player and assigns
     * symbols (X or O) to the human and computer accordingly.
     */
    static void tossAndAssignSymbols() {
        Random random = new Random();
        // Generates 0 or 1
        int toss = random.nextInt(2);

        if (toss == 0) {
            isHumanTurn = true;
            humanSymbol = 'X';
            computerSymbol = 'O';
        } else {
            isHumanTurn = false;
            humanSymbol = 'O';
            computerSymbol = 'X';
        }
    }

    /**
     * UC2: Displays the toss result, indicating who plays first and which
     * symbol is assigned to each player.
     */
    static void displayTossResult() {
        System.out.println("Toss result:");
        if (isHumanTurn) {
            System.out.println("Human plays first! Assigned Symbol: " + humanSymbol);
        } else {
            System.out.println("Computer plays first! Assigned Symbol: " + computerSymbol);
        }
        System.out.println("Computer Symbol: " + computerSymbol);
        System.out.println("--------------------------");
    }

    // --- UC1 Methods ---
    static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
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