public class Maze_problem {
    public static void main(String[] args) {
        // Create a maze where true represents free space, and false represents obstacles
        boolean[][] board = {
            {true, true, true},
            {true, false, true},
            {true, true, true}
        };
        path("", 3, 3);

        // Finding and printing all possible paths with restrictions
        // pathrestriction("", 0, 0, board);
        // pathrestriction("", 0, 0, board);
    }

    // Method to count the number of unique paths to the destination (bottom-right corner)
    static int count(int rows, int col) {
        if (rows == 1 || col == 1) {
            return 1;
        }
        // Recursive calls to move down (left) and right (right)
        int left = count(rows - 1, col);
        int right = count(rows, col - 1);
        return left + right;
    }

    // Method to print all possible paths (down 'D' and right 'R')
    static void path(String p, int rows, int col) {
        if (rows == 1 || col == 1) {
            System.out.println(p);
            return;
        }

        // Move Down
        if (rows > 1) {
            path(p + 'D', rows - 1, col);
        }

        // Move Right
        if (col > 1) {
            path(p + 'R', rows, col - 1);
        }
    }

    // Method to print all possible paths considering obstacles in the maze
    static void pathrestriction(String p, int rows, int col, boolean[][] maze) {
        // Check if you've reached the bottom-right corner of the maze
        if (rows == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        
        // Return if the current position is out of bounds or blocked
        if (rows >= maze.length || col >= maze[0].length || maze[rows][col] == false) {
            return;
        }

        // Move Down if possible
        if (rows < maze.length - 1) {
            pathrestriction(p + 'D', rows + 1, col, maze);
        }

        // Move Right if possible
        if (col < maze[0].length - 1) {
            pathrestriction(p + 'R', rows, col + 1, maze);
        }
    }
    static void pathdiagnol(String p, int rows, int col) {
        if (rows == 1 || col == 1) {
            System.out.println(p);
            return;
        }
    
        // Move Down
        if (rows > 1) {
            pathdiagnol(p + 'D', rows - 1, col);
        }
    
        // Move Right
        if (col > 1) {
            pathdiagnol(p + 'R', rows, col - 1);
        }
    
        // Move Diagonally (Down-Left)
        if (rows > 1 && col > 1) {
            pathdiagnol(p + "D", rows - 1, col - 1);  // Changed to 'DL' for diagonal left
        }
    }
    
}
