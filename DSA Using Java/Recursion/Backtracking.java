
import java.util.Arrays;


public class Backtracking {

    public static void main(String[] args) {
        boolean[][] board = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };
        int[][] path = new int[board.length][board[0].length];
        allpathprint("", 0, 0, board, path, 1);

    }

    static void allpath(String p, int rows, int col, boolean[][] maze) {
        // Check if you've reached the bottom-right corner of the maze
        if (rows == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        // Return if the current position is out of bounds or blocked
        if (rows >= maze.length || col >= maze[0].length || maze[rows][col] == false) {
            return;
        }
        // here we false the cell we visited
        maze[rows][col] = false;

        // Move Down if possible
        if (rows < maze.length - 1) {
            allpath(p + 'D', rows + 1, col, maze);
        }
        // Move Right if possible
        if (col < maze[0].length - 1) {
            allpath(p + 'R', rows, col + 1, maze);
        }
        if (rows > 0) {
            allpath(p + 'U', rows - 1, col, maze);
        }
        // Move Right if possible
        if (col > 0) {
            allpath(p + 'L', rows, col - 1, maze);
        }
        // This line is where the function will be over
        // so before the function get remove ,also remove the changes that were made by that function
        maze[rows][col] = true;
    }

    static void allpathprint(String p, int rows, int col, boolean[][] maze, int[][] path, int step) {
        // Check if you've reached the bottom-right corner of the maze
        if (rows == maze.length - 1 && col == maze[0].length - 1) {
            
            path[rows][col] = step;
            for(int[] arr:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        // Return if the current position is out of bounds or blocked
        if (rows >= maze.length || col >= maze[0].length || maze[rows][col] == false) {
            return;
        }
        // here we false the cell we visited
        maze[rows][col] = false;
        path[rows][col] = step;

        // Move Down if possible
        if (rows < maze.length - 1) {
            allpathprint(p + 'D', rows + 1, col, maze,path,step+1);
        }
        // Move Right if possible
        if (col < maze[0].length - 1) {
            allpathprint(p + 'R', rows, col + 1, maze,path,step+1);
        }
        if (rows > 0) {
            allpathprint(p + 'U', rows - 1, col, maze,path,step+1);
        }
        // Move Right if possible
        if (col > 0) {
            allpathprint(p + 'L', rows, col - 1, maze,path,step+1);
        }
        // This line is where the function will be over
        // so before the function get remove ,also remove the changes that were made by that function
        maze[rows][col] = true;
        path[rows][col] = 0;

    }
}
