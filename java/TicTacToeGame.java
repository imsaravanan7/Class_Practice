import java.util.*;

public class TicTacToeGame {
    public static Scanner scan = new Scanner(System.in);
    public static char board[][] = {{'_', '_', '_'}, {'_', '_', '_'}, {'_', '_', '_'}};
    public static char player = 'X';
    public static char computer = 'O';

    public static void main(String[] args) {
        display();
        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0) {
                // Player's turn
                int playerMove = getPlayerMove();
                placeMark(playerMove, player);
            } else {
                // Computer's turn
                int computerMove = getComputerMove();
                placeMark(computerMove, computer);
            }
            display();
            if (checkWin(player)) {
                System.out.println("Congratulations! You won!");
                break;
            } else if (checkWin(computer)) {
                System.out.println("Computer wins! Better luck next time.");
                break;
            } else if (isBoardFull()) {
                System.out.println("It's a draw!");
                break;
            }
        }
    }

    public static int getPlayerMove() {
        System.out.print("Your turn (1-9): ");
        int num = scan.nextInt();
        while (!isValidMove(num)) {
            System.out.print("Invalid move. Try again: ");
            num = scan.nextInt();
        }
        return num;
    }

    public static int getComputerMove() {
        System.out.print("Computer Move Is O");
        // Check for winning moves
        for (int i = 1; i <= 9; i++) {
            if (isValidMove(i)) {
                placeMark(i, computer);
                if (checkWin(computer)) {
                    return i;
                }
                // Undo the move
                placeMark(i, '_');
            }
        }

        // Check for blocking moves
        for (int i = 1; i <= 9; i++) {
            if (isValidMove(i)) {
                placeMark(i, player);
                if (checkWin(player)) {
                    // Block the player's winning move
                    return i;
                }
                // Undo the move
                placeMark(i, '_');
            }
        }

        // If no winning or blocking move, make a random move
        Random random = new Random();
        int num;
        do {
            num = random.nextInt(9) + 1;
        } while (!isValidMove(num));
        return num;
    }

    public static boolean isValidMove(int num) {
        if (num < 1 || num > 9) {
            return false;
        }
        int row = (num - 1) / 3;
        int col = (num - 1) % 3;
        return board[row][col] == '_';
    }

    public static void placeMark(int num, char player) {
        int row = (num - 1) / 3;
        int col = (num - 1) % 3;
        board[row][col] = player;
    }

    public static boolean checkWin(char player) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true; // Check rows
            }
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true; // Check columns
            }
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true; // Check diagonal from top-left to bottom-right
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true; // Check diagonal from top-right to bottom-left
        }
        return false;
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == '_') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void display() {
        System.out.println("-------------");
        for (int i = 0; i < board.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
}