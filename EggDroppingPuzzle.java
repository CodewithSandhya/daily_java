import java.util.Scanner;

public class EggDroppingPuzzle {

    public static int eggDrop(int eggs, int floors) {
        // dp[i][j] will represent minimum number of trials for i eggs and j floors
        int[][] dp = new int[eggs + 1][floors + 1];
        
        // Base cases:
        // 1. If we have 0 or 1 floor, we need 0 or 1 trial
        // 2. If we have 1 egg, we need to try each floor one by one
        for (int i = 1; i <= eggs; i++) {
            dp[i][1] = 1;  // Only one trial needed if we have 1 floor
            dp[i][0] = 0;  // No trials needed if we have 0 floors
        }
        
        for (int j = 1; j <= floors; j++) {
            dp[1][j] = j;  // If we have 1 egg, we need j trials for j floors
        }

        // Fill the dp table for all other cases
        for (int i = 2; i <= eggs; i++) {
            for (int j = 2; j <= floors; j++) {
                dp[i][j] = Integer.MAX_VALUE;
                for (int x = 1; x <= j; x++) {
                    int res = 1 + Math.max(dp[i - 1][x - 1], dp[i][j - x]);
                    dp[i][j] = Math.min(dp[i][j], res);
                }
            }
        }
        
        return dp[eggs][floors];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  // number of eggs
        int k = scanner.nextInt();  // number of floors
        scanner.close();
        
        int result = eggDrop(n, k);
        System.out.println(result);
    }
}
