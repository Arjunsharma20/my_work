
public class N_Queen {

    public static void main(String[] args) {
        int n = 20;
        boolean[][] board = new boolean[n][n];
        int solutioncount = nqueen(board, 0);
        System.out.println("Total Count = " + solutioncount);

    }

    static int nqueen(boolean[][] board, int rows) {
        if (rows == board.length) {
            // display(board);
            return 1;
        }
        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, rows, col)) {
                board[rows][col] = true;
                count += nqueen(board, rows + 1);
                board[rows][col] = false;
            }
        }
        return count;
    }

    private static void display(boolean[][] board) {
        for (boolean[] rows : board) {
            for (boolean element : rows) {
                if (element) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    private static boolean isSafe(boolean[][] board, int rows, int col) {
        // verticall space
        for (int i = 0; i < board.length; i++) {
            if (board[i][col]) {
                return false;
            }
        }
        for (int i = 1; i <= rows; i++) {
            if (col - i >= 0 && board[rows - i][col - i]) {
                return false;
            }
        }
        for (int i = 1; i <= rows; i++) {
            if (col + i < board.length && board[rows - i][col + i]) {
                return false;
            }
        }
        return true;
    }
}
