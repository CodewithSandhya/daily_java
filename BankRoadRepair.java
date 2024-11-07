import java.util.Scanner;
class BankRoadRepair {
    private static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();  // Total number of banks
        int M = scanner.nextInt();  // Number of banks on The Great Lane
        
        // Calculate total roads among N banks (complete graph formula)
        long totalRoads = (long) N * (N - 1) / 2 % MOD;
        
        // Calculate roads among M banks on The Great Lane
        long greatLaneRoads = (long) M * (M - 1) / 2 % MOD;
        
        // Calculate the distinct roads needed to repair
        long distinctRoads = (totalRoads - greatLaneRoads + (M - 1)) % MOD;
        
        // Ensure non-negative result
        if (distinctRoads < 0) {
            distinctRoads += MOD;
        }
        
        System.out.println(distinctRoads);
        
        scanner.close();
    }
}
