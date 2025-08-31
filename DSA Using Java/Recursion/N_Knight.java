// public class N_Knight {
//     public static void main(String[] args) {
//         int n =2;
//         boolean[][] board = new boolean[n][n];
//         int totalcount =n_knight(board, 0);
//         System.out.println("Total Cases" +totalcount);
//     }

//     static int n_knight(boolean[][] board,int rows){
//         if(rows==board.length){
//             display(board);
//             return 1;
//         }
//         int count = 0;
//         for(int col = 0;col<board.length;col++){
//             if(isSafe(board,rows,col)){
//                 board[rows][col]=true;
//                 count+=n_knight(board, rows+1);
//                 board[rows][col]=false;
//             }
//         }
//         return count;
//     }
//     private static void display(boolean[][] board) {
//         for(boolean[] rows : board){
//             for(boolean element : rows){
//                 if(element){
//                     System.out.print("K ");
//                 }
//                 else{
//                     System.out.print("X ");
//                 }
//             }
//             System.out.println();
//         }
//         System.out.println();
//     }
//     static boolean isValid(boolean[][] board,int rows,int col){
//         if(rows>=0 && rows<board.length &&col>=0 && col<board.length ){
//             return true;
//         }
//         return false;
//     }
//     private static boolean isSafe(boolean[][] board, int rows, int col) {
//         if(isValid(board, rows, col)){
//             if(board[rows][col]){
//                 return false;
//             }
//         }
//         if(isValid(board, rows-2, col-1)){
//             if(board[rows-2][col-1]){
//                 return false;
//             }
//         }
//         if(isValid(board, rows-2, col+1)){
//             if(board[rows-2][col+1]){
//                 return false;
//             }
//         }
//         if(isValid(board, rows+1, col-2)){
//             if(board[rows+1][col-2]){
//                 return false;
//             }
//         }
//         if(isValid(board, rows-1, col-2)){
//             if(board[rows-1][col-2]){
//                 return false;
//             }    
//         }
//         return true;
//     }
// }
public class N_Knight {

    public static void main(String[] args) {
        int n = 2;
        boolean[][] board = new boolean[n][n];
        n_knight(board, 0, 0, 2);
    }

    static void n_knight(boolean[][] board, int rows, int col, int knight) {
        if (knight == 0) {
            display(board);
            System.out.println();
            return;
        }
        if (rows == board.length - 1 && col == board.length) {
            return;
        }
        if (col == board.length) {
            n_knight(board, rows + 1, 0, knight);
            return;
        }
        if (isSafe(board, rows, col)) {
            board[rows][col] = true;
            n_knight(board, rows, col + 1, knight - 1);
            board[rows][col] = false;
        }
        n_knight(board, rows, col + 1, knight);
    }

    private static void display(boolean[][] board) {
        for (boolean[] rows : board) {
            for (boolean element : rows) {
                if (element) {
                    System.out.print("K ");

                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    static boolean isValid(boolean[][] board, int rows, int col) {
        if (rows >= 0 && rows < board.length && col >= 0 && col < board.length) {
            return true;
        }
        return false;
    }

    private static boolean isSafe(boolean[][] board, int rows, int col) {
        if (isValid(board, rows, col)) {
            if (board[rows][col]) {
                return false;
            }
        }
        if (isValid(board, rows - 2, col - 1)) {
            if (board[rows - 2][col - 1]) {
                return false;
            }
        }
        if (isValid(board, rows - 2, col + 1)) {
            if (board[rows - 2][col + 1]) {
                return false;
            }
        }
        if (isValid(board, rows + 1, col - 2)) {
            if (board[rows + 1][col - 2]) {
                return false;
            }
        }
        if (isValid(board, rows - 1, col - 2)) {
            if (board[rows - 1][col - 2]) {
                return false;
            }
        }
        return true;
    }
}
