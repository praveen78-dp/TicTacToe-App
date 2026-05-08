public class TicTacToe {

    static boolean isHumanTurn = true;
    static boolean gameOver = false;

    public static void main(String[] args) {
        // UC8: Continuous Turn-Based Game Loop
        while (!gameOver) {
            if (isHumanTurn) {
                System.out.println("--- Human's Turn ---");
                // In a full game, you'd call getUserSlot, validate, and placeMove here
                isHumanTurn = false; // Switch turn
            } else {
                System.out.println("--- Computer's Turn ---");
                // In a full game, you'd call computerMove here
                isHumanTurn = true; // Switch turn
            }

            // For demonstration purposes, we stop after a few turns
            // In UC9/10, this will be replaced by win/draw detection logic
            checkGameOverManual(); 
        }
        System.out.println("Game Over!");
    }

    static int turnCount = 0;
    static void checkGameOverManual() {
        turnCount++;
        if (turnCount >= 4) { // Dummy condition to prevent infinite loop for now
            gameOver = true;
        }
    }
}