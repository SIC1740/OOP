import java.util.Scanner;

public class Main {
    public static final int MOD = 1000000007;
    public int numMusicPlaylists(int n, int goal, int k) {
        long[][] dp = new long[goal + 1][n + 1];
        dp[0][0] = 1;

        for (int i = 0; i < goal; i++) {
            for (int j = 0; j <= n; j++) {

                if (dp[i][j] == 0) continue;

                if (j < n) {
                    dp[i + 1][j + 1] = (dp[i + 1][j + 1] + dp[i][j] * (n - j)) % MOD;

                }
                if (j > k) {
                    dp[i + 1][j] = (dp[i + 1][j] + dp[i][j] * (j - k)) % MOD;
                }
            }
        }
        return (int) dp[goal][n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- >0){
            int k = sc.nextInt();
            int n = sc.nextInt();
            int goal = sc.nextInt();
            Main mp = new Main();
            int result = mp.numMusicPlaylists(n, goal,k);
            System.out.println(result);
        }
        sc.close();
    }
}
