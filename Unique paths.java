public class Solution {
    public int uniquePaths(int m, int n) {
        // Create a 2D array to store the number of unique paths for each cell
        int[][] dp = new int[m][n];

        // Initialize the first row and first column to 1 because there's only one way to reach any cell in them
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }

        // Calculate the number of unique paths for each cell in the grid
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        // The result is stored in the bottom-right cell of the grid
        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int m1 = 3, n1 = 7;
        System.out.println("Unique Paths (m = 3, n = 7): " + solution.uniquePaths(m1, n1)); // Output: 28

        int m2 = 3, n2 = 2;
        System.out.println("Unique Paths (m = 3, n = 2): " + solution.uniquePaths(m2, n2)); // Output: 3
    }
}
