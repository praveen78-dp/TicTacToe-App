import java.util.Scanner;
import java.util.Random;

public class TicTacToe {
    // UC1: Board representation
    static char[][] board = new char[3][3];
    
    // UC2: Game State Variables
    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;

    // UC3: Create Scanner object for input
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        initializeBoard();
        tossAndAssignSymbols();
        displayTossResult();
        
        // UC3: Call method to get input and print it
        int slot = getUserSlot();
        System.out.println("Slot entered: " + slot);

        printBoard();
    }

    /**
     * UC3: Reads an integer slot value (1-9) from the user.
     * Focuses on input handling without validation for now.
     */
    static int getUserSlot() {
        System.out.print("Enter a slot number (1-9): ");
        int slot = sc.nextInt();
        return slot;
    }

    // --- UC1 & UC2 Methods ---
    static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) board[i][j] = '-';
        }
    }

    static void tossAndAssignSymbols() {
        Random random = new Random();
        int toss = random.nextInt(2);
        if (toss == 0) {
            isHumanTurn = true; humanSymbol = 'X'; computerSymbol = 'O';
        } else {
            isHumanTurn = false; humanSymbol = 'O'; computerSymbol = 'X';
        }
    }

    static void displayTossResult() {
        System.out.println("Toss Result: " + (isHumanTurn ? "Human" : "Computer") + " starts.");
    }

    static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) System.out.print(board[i][j] + " | ");
            System.out.println("\n-------------");
        }
    }
}