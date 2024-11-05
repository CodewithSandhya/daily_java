import java.util.Scanner;

public class WordSearch {
    
    // Helper method to perform DFS (Depth-First Search)
    public static boolean dfs(char[][] board, String word, int i, int j, int index) {
        // If we've matched the whole word
        if (index == word.length()) {
            return true;
        }
        
        // Check if out of bounds or current cell does not match the word's character
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(index)) {
            return false;
        }

        // Temporarily mark the cell as visited by changing its value
        char temp = board[i][j];
        board[i][j] = '#';  // Mark the cell as visited
        
        // Explore the four possible directions (down, up, right, left)
        boolean found = dfs(board, word, i + 1, j, index + 1) ||   // down
                        dfs(board, word, i - 1, j, index + 1) ||   // up
                        dfs(board, word, i, j + 1, index + 1) ||   // right
                        dfs(board, word, i, j - 1, index + 1);     // left
        
        // Restore the cell back to its original state
        board[i][j] = temp;
        
        return found;
    }

    // Main function to check if the word exists in the board
    public static boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        
        // Try starting the search from every cell in the board
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {  // If the first character matches
                    if (dfs(board, word, i, j, 0)) {  // Start DFS from (i, j)
                        return true;
                    }
                }
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the dimensions of the board
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        // Initialize the board
        char[][] board = new char[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.next().charAt(0);
            }
        }
        
        // Read the word to search for
        String word = sc.next();
        
        // Output the result
        if (exist(board, word)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        
        sc.close();
    }
}
